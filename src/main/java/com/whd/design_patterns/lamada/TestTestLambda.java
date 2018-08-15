package com.whd.design_patterns.lamada;

/**
 * @author whd
 * @class TestTestLambda
 * @date 2018/7/16 21:28
 * @description Describe the function of this class in one sentence
 **/
public class TestTestLambda {

    public static void main(String[] args) {

        MyInterface ds = i -> i * i;
        int add = ds.add(1, 6);
        int dsName = ds.getName(10);
        System.out.println(add);
        System.out.println(dsName);
    }
}

@FunctionalInterface
interface MyInterface {

    int getName(int i);


    default int add(int x, int y){
        return x + y;
    }

}
