package com.whd.design_patterns.nettydemo;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * Created by whd on 2017/10/29.
 */
public class DiscardServer {

    private int port;

    public DiscardServer(int port) {
        this.port = port;
    }

    public void run() throws Exception {

        /**
         * 1.NioEventLoopGroup是处理I/O操作的多线程事件循环。 Netty为不同类型的传输提供了各种EventLoopGroup实现；
         * 2.在此实例中编写的是服务端的程序，所以我们要使用两个NioEventLoopGroup.第一个通常为“boss”，主要用于接受传入连接，
         * 第二个通常为“worker”，当boss接受连接并且向worker注册接受连接，则worker处理所接受的连接流量
         * 3.使用多少个线程以及如何将他们映射到创建的通道取决于NioEventLoopGroup实现，甚至可以通过构造函数继续配置。
         */
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        try {
            /**
             * serverBootstrap是一个用于设置服务器的助手类，你也可以直接使用通道设置服务器，但是请注意，这是一个冗长的过程，在大多数情况下，不需要这么做。
             */
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            //在这里，我们指定使用NioServerSocketChannel类，该类用于实例化新的通道以接受传入连接
            serverBootstrap.group(bossGroup, workerGroup).channel(NioServerSocketChannel.class).childHandler(
                    new ChannelInitializer<SocketChannel>() {
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            socketChannel.pipeline().addLast(new DiscardServerHandler());
                        }
                    }).option(ChannelOption.SO_BACKLOG, 128).childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture sync = serverBootstrap.bind(port).sync();
            sync.channel().closeFuture().sync();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }

    }


    public static void main(String[] args) throws Exception {
        int port;
        if (args.length > 0){
            port = Integer.parseInt(args[0]);
        }else{
            port = 8080;
        }
        new DiscardServer(port).run();
    }
}
