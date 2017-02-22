package com.liuhw.learn.pattern.proxy;

/**
 * Created by liuhw on 2017/2/21.
 */

public class Child implements Person {

    @Override
    public void eat() {
        System.out.println("eat foods");
    }
}
