package com.whd.designpatterns.factory.simple;

import com.whd.designpatterns.factory.Mengniu;
import com.whd.designpatterns.factory.Milk;
import com.whd.designpatterns.factory.Telunsu;
import com.whd.designpatterns.factory.Yili;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/26 20:52
 * @apiNote Describe the function of this class in one sentence
 **/
public class SimpleFactory {

    public Milk getMilk(String name){
        if ("特仑苏".equals(name)){
            return new Telunsu();
        }else if ("伊利".equals(name)){
            return new Yili();
        }else if("蒙牛".equals(name)){
            return new Mengniu();
        } else {
            System.out.println("不能胜场你所需要的牛奶");
            return null;
        }
    }
}
