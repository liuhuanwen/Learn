package com.liuhw.learn.pattern.factorymethod;

/**
 * Created by liuhw on 2017/2/20.
 * 工厂方法模式
 */

public class FactoryTest {

    public static void main(String[] args) {
        Factory factory = new Factory();
        factory.createMail().send();
        factory.createSms().send();
    }
}
