package com.liuhw.learn.boardcastreceiver;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by liuhw on 2017/2/22.
 */

public class MyAppWidgetProvider extends AppWidgetProvider {

    public static final String TAG = MyAppWidgetProvider.class.getSimpleName();

    public static final String ACTION_SERVICE_UPDATE = "com.liuhw.learn.service.update";

    public static final String ACTION_RECEIVER_UPDATE = "com.liuhw.deeplearn.receiver.update";

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }

    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int
            appWidgetId, Bundle newOptions) {
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onDisabled(Context context) {
        context.stopService(getIntent(context));
        super.onDisabled(context);
    }

    @Override
    public void onEnabled(Context context) {
        context.startService(getIntent(context));
        super.onEnabled(context);
    }

    @Override
    public void onRestored(Context context, int[] oldWidgetIds, int[] newWidgetIds) {
        Log.i(TAG, "onRestored: " + context);
        super.onRestored(context, oldWidgetIds, newWidgetIds);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        super.onUpdate(context, appWidgetManager, appWidgetIds);
    }

    private Intent getIntent(Context context) {
        Intent intent = new Intent(ACTION_SERVICE_UPDATE);
        intent.setPackage(context.getPackageName());
        return intent;
    }
}
