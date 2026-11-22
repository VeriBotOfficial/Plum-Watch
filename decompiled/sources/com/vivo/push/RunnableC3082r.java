package com.vivo.push;

import com.vivo.push.m;

/* compiled from: PushClientManager.java */
/* renamed from: com.vivo.push.r, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class RunnableC3082r implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14113a;
    final /* synthetic */ m b;

    RunnableC3082r(m mVar, String str) {
        this.b = mVar;
        this.f14113a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m.a b;
        b = this.b.b(this.f14113a);
        if (b != null) {
            b.a(1003, new Object[0]);
        }
    }
}
