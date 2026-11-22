package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;

/* loaded from: classes12.dex */
public class y4 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final y9 f7344a;
    public final int b;
    public final c c;
    public boolean d;

    public y4(c cVar, Looper looper, int i) {
        super(looper);
        this.d = false;
        this.c = cVar;
        this.b = i;
        this.f7344a = new y9();
    }

    public void a() {
        this.d = true;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        SystemClock.uptimeMillis();
        if (this.d) {
            return;
        }
        this.f7344a.a();
        synchronized (this) {
            this.f7344a.a();
        }
    }
}
