package com.liuhw.learn.pattern.abstractfactory;

/**
 * Created by liuhw on 2017/2/20.
 * 抽象工厂模式
 */

public class ProviderTest {

    public static void main(String[] args) {
        Provider provider = new MailProvider();
        provider.create().send();
        provider = new SmsProvider();
        provider.create().send();
    }
}
