package com.liuhw.learn.widget;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by liuhw on 2017/2/18.
 */

public class DragView extends LinearLayout {

    private float lastX, lastY;
    private int screenWidth, screenHeight;
    private Context mContext;

    public DragView(Context context) {
        super(context);
        mContext = context;
    }

    public DragView(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    public DragView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        mContext = context;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    public DragView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        mContext = context;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        float x = event.getX();
        float y = event.getY();
        int left = getLeft();
        int right = getRight();
        int top = getTop();
        int bottom = getBottom();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                break;
            case MotionEvent.ACTION_MOVE:
                if (getLeft() + (x - lastX) >= 0 && (getRight() + (x - lastX)) < getScreenWidth()) {
                    left = (int) (getLeft() + (x - lastX));
                    right = (int) (getRight() + (x -lastX));
                }
                if (getTop() + (y -lastY) >= 0 && (getBottom() + (y - lastY)) <getScreenHeight()) {
                    top = (int) (getTop() + y - lastY);
                    bottom = (int) (getBottom() + y - lastY);
                }
                this.layout(left, top, right, bottom);
                invalidate();
                break;
            case MotionEvent.ACTION_UP:
                break;
            default:
                break;
        }
        lastX = x;
        lastY = y;
        return true;
    }

    private int getScreenWidth() {
        return mContext.getResources().getDisplayMetrics().widthPixels;
    }

    private int getScreenHeight() {
        return mContext.getResources().getDisplayMetrics().heightPixels;
    }


}
