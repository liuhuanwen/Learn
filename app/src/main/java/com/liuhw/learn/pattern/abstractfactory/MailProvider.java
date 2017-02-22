package com.liuhw.learn.pattern.abstractfactory;

import com.liuhw.learn.pattern.factorymethod.Mail;
import com.liuhw.learn.pattern.factorymethod.Sender;

/**
 * Created by liuhw on 2017/2/20.
 */

public class MailProvider implements Provider {
    @Override
    public Sender create() {
        return new Mail();
    }
}
