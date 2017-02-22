package com.liuhw.learn.activity;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.widget.RemoteViews;

import com.liuhw.learn.R;

public class NotificationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void run() {
//                sendNotification();
                sendCustomNotification();
            }
        }, 2000);
    }

    /**
     * 系统默认样式的通知
     * */
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void sendNotification() {
        Notification.Builder builder = new Notification.Builder(this);
        Notification notification = builder.setSmallIcon(R.mipmap.me_img_logo)
                .setContentText("hello world!")
                .setContentTitle("motherfucker")
                .setContentIntent(getPendingIntent())
                .setAutoCancel(true)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);
    }

    /**
     * 自定义样式的通知
     * */
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    private void sendCustomNotification() {
        Notification.Builder builder = new Notification.Builder(this);
        Notification notification = builder.setSmallIcon(R.mipmap.me_img_logo)
                .setContent(getRemoteViews())
                .setContentIntent(getPendingIntent())
                .setAutoCancel(true)
                .build();
        NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        notificationManager.notify(0, notification);
    }

    private PendingIntent getPendingIntent() {
        Intent intent = new Intent(this, GifActivity.class);
        return PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_ONE_SHOT);
    }

    private RemoteViews getRemoteViews() {
        RemoteViews remoteViews = new RemoteViews(this.getPackageName(), R.layout.layout_notification);
        remoteViews.setTextViewText(R.id.tv_title, "world!");
        remoteViews.setTextViewText(R.id.tv_content, "mother");
        return remoteViews;
    }
}
