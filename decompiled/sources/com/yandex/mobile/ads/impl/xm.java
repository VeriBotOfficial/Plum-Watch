package com.yandex.mobile.ads.impl;

import java.util.concurrent.BlockingQueue;

/* loaded from: classes5.dex */
final class xm implements Runnable {
    final /* synthetic */ up1 b;
    final /* synthetic */ ym c;

    xm(ym ymVar, up1 up1Var) {
        this.c = ymVar;
        this.b = up1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlockingQueue blockingQueue;
        try {
            blockingQueue = this.c.c;
            blockingQueue.put(this.b);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
