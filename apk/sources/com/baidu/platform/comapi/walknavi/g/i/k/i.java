package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: compiled from: UiThreadUtil.java */
/* JADX INFO: loaded from: classes15.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Handler f8747a;

    public static void a(Runnable runnable) {
        synchronized (i.class) {
            if (f8747a == null) {
                f8747a = new Handler(Looper.getMainLooper());
            }
        }
        f8747a.post(runnable);
    }
}
