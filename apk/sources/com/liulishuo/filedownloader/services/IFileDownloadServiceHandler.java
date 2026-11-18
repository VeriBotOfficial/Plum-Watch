package com.liulishuo.filedownloader.services;

import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
interface IFileDownloadServiceHandler {
    IBinder onBind(Intent intent);

    void onDestroy();

    void onStartCommand(Intent intent, int r2, int r3);
}
