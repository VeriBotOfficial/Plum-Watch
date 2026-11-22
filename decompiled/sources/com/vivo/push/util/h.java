package com.vivo.push.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: ConcurrentUtils.java */
/* loaded from: classes2.dex */
final class h implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14158a;

    h(String str) {
        this.f14158a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName(this.f14158a);
        thread.setDaemon(true);
        return thread;
    }
}
