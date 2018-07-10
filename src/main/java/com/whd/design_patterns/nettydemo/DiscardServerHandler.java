package com.whd.design_patterns.nettydemo;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.ReferenceCountUtil;

/**
 * 处理服务器端的通道
 * Created by whd on 2017/10/29.
 */
public class DiscardServerHandler extends ChannelInboundHandlerAdapter{


    /**
     * 1.覆盖channelRead方法，每当从客户端接收到新的数据时，使用该方法来接受客户端的消息，在次实例中，接收到的消息类型为ByteBuf
     * 2.要实现DISCARD协议，处理程序必须忽略接收到的消息，ByteBuf是引用计数的对象，必须通过release()方法显式释放。
     * @param channelHandlerContext
     * @param o
     * @throws Exception
     */
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {

        //以静默的方式丢弃掉数据
        //请记住，处理程序负责释放传递给处理程序的引用计数对象

        ByteBuf byteBuf = (ByteBuf) o;
        try {
            while(byteBuf.isReadable()){
                System.out.print((char) byteBuf.readByte());
                System.out.flush();
            }
        } finally {
            ReferenceCountUtil.release(o);
        }

    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {

        //出现异常的时候关闭链接
        throwable.printStackTrace();
        channelHandlerContext.close();

    }
}
