package com.liuhw.learn.pattern.facade;

/**
 * Created by liuhw on 2017/2/21.
 */

public class FacadeTest {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}
