package com.whd.designpatterns.clone;

/**
 * @author whd.java@gmail.com
 * @date 2018/11/27 23:38
 * @apiNote Describe the function of this class in one sentence
 **/
public class Test {

    public static void main(String[] args) {
        Prototype p = new Prototype();
        p.name = "whd";
        p.list.add("whd");


        try {
            Prototype clone = (Prototype) p.clone();
            System.out.println(clone.name);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
