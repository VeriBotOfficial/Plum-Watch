package com.huawei.hms.opendevice;

import android.util.Log;

/* compiled from: TaskWrapper.java */
/* loaded from: classes14.dex */
public class q implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final Runnable f10460a;

    public q(Runnable runnable) {
        this.f10460a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        Runnable runnable = this.f10460a;
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable unused) {
                Log.e("HmsPushThreads", "exception in task run");
            }
        }
    }
}
