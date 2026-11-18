package com.baidu.location;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes15.dex */
public interface LLSInterface {
    double getVersion();

    IBinder onBind(Intent intent);

    void onCreate(Context context);

    void onDestroy();

    int onStartCommand(Intent intent, int r2, int r3);

    void onTaskRemoved(Intent intent);

    boolean onUnBind(Intent intent);
}
