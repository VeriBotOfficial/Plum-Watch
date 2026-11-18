package com.baidu.mshield.utility;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: compiled from: HandlerHelper.java */
/* JADX INFO: loaded from: classes15.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f8439a = new e();
    public HandlerThread b = new HandlerThread("rp_th", 10);
    public Handler c;

    public e() {
        b();
        this.c = new Handler(this.b.getLooper());
    }

    public static Looper a() {
        return f8439a.c.getLooper();
    }

    public final void b() {
        this.b.start();
    }
}
