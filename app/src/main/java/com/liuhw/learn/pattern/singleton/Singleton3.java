package com.liuhw.learn.pattern.singleton;

/**
 * Created by liuhw on 2017/2/20.
 * 单例模式，线程安全，性能良好
 */

public class Singleton3 {

    private static Singleton3 instance;

    private Singleton3() {

    }

    public Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
