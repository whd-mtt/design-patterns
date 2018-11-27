package com.whd.designpatterns.clone;

import java.util.ArrayList;
import java.util.List;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 23:36
 * @apiNote Describe the function of this class in one sentence
 **/
public class Prototype implements Cloneable {

    public String name;

    public List<String> list = new ArrayList();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
