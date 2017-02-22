package com.liuhw.learn.pattern.adapter;

/**
 * Created by liuhw on 2017/2/20.
 * 对象适配器模式
 */

public class StudentAdapter2 implements People {

    private Student mStudent;

    public StudentAdapter2(Student student) {
        mStudent = student;
    }

    @Override
    public void born() {
        mStudent.born();
    }

    @Override
    public void dead() {
        System.out.print("I dead!");
    }
}
