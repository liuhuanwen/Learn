package com.liuhw.learn.pattern.singleton;

/**
 * Created by liuhw on 2017/2/20.
 * 饿汉单例模式,非线程安全
 */

public class Singleton1 {

    private static Singleton1 instance;

    private Singleton1() {

    }

    public Singleton1 getInstance() {
        if (instance == null) {
            return new Singleton1();
        }
        return instance;
    }
}
