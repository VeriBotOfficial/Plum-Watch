package com.huawei.secure.android.common.util;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static Handler f10849a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        f10849a.post(runnable);
    }
}
