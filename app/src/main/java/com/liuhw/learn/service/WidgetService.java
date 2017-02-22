package com.liuhw.learn.service;

import android.app.Service;
import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;
import android.widget.RemoteViews;

import com.liuhw.learn.R;
import com.liuhw.learn.boardcastreceiver.MyAppWidgetProvider;

import java.util.Random;

/**
 * Created by liuhw on 2017/2/22.
 */

public class WidgetService extends Service {

    public static final String TAG = WidgetService.class.getSimpleName();

    private Context mContext;
    private Thread mThread;

    private int[] mImageRes = {
            R.mipmap.me_icon_noevaluate,
            R.mipmap.me_icon_nogoods,
            R.mipmap.me_icon_nopay
    };

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this.getApplicationContext();
        mThread = new SendThread();
        mThread.start();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        super.onStartCommand(intent, flags, startId);
        return START_STICKY;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mThread != null) mThread.interrupt();
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    class SendThread extends Thread {

        @Override
        public void run() {
            super.run();
            try {
                while (true) {
                    updateAllWidget();
                    Log.i(TAG, "run: " + "=============");
                    Thread.sleep(6000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void updateAllWidget() {
        AppWidgetManager manager = AppWidgetManager.getInstance(mContext);
        RemoteViews remoteViews = new RemoteViews(mContext.getPackageName(), R.layout.widget_1);
        int index = getRandomImageRes();
        remoteViews.setImageViewResource(R.id.iv_image, mImageRes[index]);
        ComponentName componentName = new ComponentName(mContext, MyAppWidgetProvider.class);
        manager.updateAppWidget(componentName, remoteViews);
    }

    private int getRandomImageRes() {
        return new Random().nextInt(mImageRes.length);
    }

}
