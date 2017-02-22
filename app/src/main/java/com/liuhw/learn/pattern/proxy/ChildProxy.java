package com.liuhw.learn.pattern.proxy;

/**
 * Created by liuhw on 2017/2/21.
 */

public class ChildProxy implements Person {

    private Child child;

    public ChildProxy() {
        this.child = new Child();
    }

    @Override
    public void eat() {
        System.out.println("clean my hand");
        this.child.eat();
    }
}
