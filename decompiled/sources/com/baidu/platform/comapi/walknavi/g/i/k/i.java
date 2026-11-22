package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Handler;
import android.os.Looper;

/* compiled from: UiThreadUtil.java */
/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
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
