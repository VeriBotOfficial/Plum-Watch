package com.baidu.platform.comjni.jninative.time;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes15.dex */
public class SysTimeGetter {
    public static long getSysTime() {
        return SystemClock.elapsedRealtime() / 1000;
    }
}
