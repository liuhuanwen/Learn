package com.liuhw.learn.pattern.factorymethod;

/**
 * Created by liuhw on 2017/2/20.
 *
 */

public class Factory {

    public Sender createMail() {
        return new Mail();
    }

    public Sender createSms() {
        return new Sms();
    }
}
