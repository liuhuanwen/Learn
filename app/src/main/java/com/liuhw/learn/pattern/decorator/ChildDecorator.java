package com.liuhw.learn.pattern.decorator;

/**
 * Created by liuhw on 2017/2/21.
 * 装饰模式中的装饰类
 */

public class ChildDecorator implements Person {

    private Child mChild;

    public ChildDecorator(Child child) {
        mChild = child;
    }

    @Override
    public void eat() {
        System.out.println("clean my hand");
        this.mChild.eat();
    }
}
