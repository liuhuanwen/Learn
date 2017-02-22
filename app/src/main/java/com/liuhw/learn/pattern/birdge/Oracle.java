package com.liuhw.learn.pattern.birdge;

/**
 * Created by liuhw on 2017/2/21.
 */

public class Oracle implements Database {

    @Override
    public void insert() {
        System.out.println("insert some data into oracle");
    }
}
