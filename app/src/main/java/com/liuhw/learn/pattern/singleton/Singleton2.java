package com.liuhw.learn.pattern.singleton;

/**
 * Created by liuhw on 2017/2/20.
 * 饱汉单例，线程安全，性能低下
 */

public class Singleton2 {

    private static Singleton2 instance;

    private Singleton2() {

    }

    public synchronized Singleton2 getInstance() {
        if (instance == null) {
            return new Singleton2();
        }
        return instance;
    }
}
