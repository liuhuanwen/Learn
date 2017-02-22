package com.liuhw.learn.pattern.abstractfactory;

import com.liuhw.learn.pattern.factorymethod.Sender;

/**
 * Created by liuhw on 2017/2/20.
 */

public interface Provider {

    Sender create();
}
