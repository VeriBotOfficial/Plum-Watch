package com.apm.insight.j;

import android.os.Handler;

/* JADX INFO: compiled from: BaseTask.java */
/* JADX INFO: loaded from: classes16.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Handler f6040a;
    private final long b = 0;
    private final long c;

    a(Handler handler, long j) {
        this.f6040a = handler;
        this.c = j;
    }

    final void a() {
        this.f6040a.post(this);
    }

    final void a(long j) {
        if (j > 0) {
            this.f6040a.postDelayed(this, j);
        } else {
            this.f6040a.post(this);
        }
    }

    final long b() {
        return this.c;
    }
}
