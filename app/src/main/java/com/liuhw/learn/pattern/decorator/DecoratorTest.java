package com.liuhw.learn.pattern.decorator;

/**
 * Created by liuhw on 2017/2/21.
 */

public class DecoratorTest {

    public static void main(String[] args) {
        Child child = new Child();
        ChildDecorator childDecorator = new ChildDecorator(child);
        childDecorator.eat();
    }
}
