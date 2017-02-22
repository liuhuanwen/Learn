package com.liuhw.learn.pattern.adapter;

/**
 * Created by liuhw on 2017/2/20.
 */

public class Adapter1 extends AbstractPeople {

    @Override
    public void born() {
        super.born();
        System.out.print("I born");
    }
}
