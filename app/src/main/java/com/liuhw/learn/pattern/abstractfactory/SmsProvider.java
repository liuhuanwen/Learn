package com.liuhw.learn.pattern.abstractfactory;

import com.liuhw.learn.pattern.factorymethod.Sender;
import com.liuhw.learn.pattern.factorymethod.Sms;

/**
 * Created by liuhw on 2017/2/20.
 */

public class SmsProvider implements Provider {

    @Override
    public Sender create() {
        return new Sms();
    }
}
