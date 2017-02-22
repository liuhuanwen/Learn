package com.liuhw.learn.pattern.factorymethod;

/**
 * Created by liuhw on 2017/2/20.
 */

public class Mail implements Sender {

    @Override
    public void send() {
        System.out.println("send mail!");
    }
}
