package com.liuhw.learn.pattern.decorator;

/**
 * Created by liuhw on 2017/2/21.
 * 被装饰类
 */

public class Child implements Person {

    @Override
    public void eat() {
        System.out.println("eat foods");
    }
}
