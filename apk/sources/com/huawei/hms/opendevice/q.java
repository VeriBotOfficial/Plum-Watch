package com.huawei.hms.opendevice;

import android.util.Log;

/* JADX INFO: compiled from: TaskWrapper.java */
/* JADX INFO: loaded from: classes11.dex */
public class q implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
