package com.liuhw.learn.pattern.proxy;

/**
 * Created by liuhw on 2017/2/21.
 */

public class ProxyTest {

    public static void main(String[] args) {
        ChildProxy proxy = new ChildProxy();
        proxy.eat();
    }
}
