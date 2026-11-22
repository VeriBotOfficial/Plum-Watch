package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes17.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public static final Handler f12862a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        if (!a()) {
            f12862a.post(runnable);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void a(Runnable runnable, long j) {
        f12862a.postDelayed(runnable, j);
    }

    public static boolean a() {
        return f12862a.getLooper() == Looper.myLooper();
    }
}
