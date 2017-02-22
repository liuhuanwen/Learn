package com.liuhw.learn.pattern.builder;

/**
 * Created by liuhw on 2017/2/20.
 */

public class BuilderTest {

    public static void main(String[] args) {
        User.Builder builder = new User.Builder();
        User user = builder.setId(101).setName("liuhw1").setAge(29).builder();
        System.out.println(user);
    }
}
