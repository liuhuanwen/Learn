package com.liuhw.learn.foundation;

/**
 * Created by liuhw on 2017/2/28.
 * 位运算符操作
 */

public class operator {

    public static void main(String[] args) {
        test1();
    }

    /*位运算符*/
    private static void test1() {
        int a = 123;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(a >> 1);
        int b = ~a;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(b);
        System.out.println(b >> 1);
        System.out.println(1 << 3);
    }
}
