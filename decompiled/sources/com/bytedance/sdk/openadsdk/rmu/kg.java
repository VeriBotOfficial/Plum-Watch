package com.bytedance.sdk.openadsdk.rmu;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.List;

/* loaded from: classes14.dex */
public interface kg {
    Context getContext();

    Handler getHandler();

    int getOnceLogCount();

    int getOnceLogInterval();

    HandlerThread getSafeHandlerThread(String str, int i);

    int getUploadIntervalTime();

    boolean isMonitorOpen();

    void onMonitorUpload(List<com.bytedance.sdk.openadsdk.rmu.kg.fxn> list);
}
