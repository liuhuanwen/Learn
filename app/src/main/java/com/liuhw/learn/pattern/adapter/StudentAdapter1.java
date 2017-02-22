package com.liuhw.learn.pattern.adapter;

/**
 * Created by liuhw on 2017/2/20.
 * 类的适配器模式
 */

public class StudentAdapter1 extends Student implements People{

    @Override
    public void dead() {
        System.out.print("I dead!");
    }
}
