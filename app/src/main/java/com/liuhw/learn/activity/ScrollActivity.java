package com.liuhw.learn.activity;

import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.liuhw.learn.R;

/**
 * scroller测试页面
 *
 * */
public class ScrollActivity extends AppCompatActivity {

    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scroll);
        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);
    }

    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                constraintLayout.scrollTo(-100, -100);
                break;
            case R.id.btn2:
                constraintLayout.scrollBy(-100, -100);
                break;
        }
    }
}
