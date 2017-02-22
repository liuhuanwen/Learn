package com.liuhw.learn.pattern.adapter;

/**
 * Created by liuhw on 2017/2/20.
 */

public class Adapter2 extends AbstractPeople {

    @Override
    public void dead() {
        super.dead();
        System.out.print("I dead!");
    }
}
