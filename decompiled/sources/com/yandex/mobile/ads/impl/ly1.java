package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;

/* loaded from: classes5.dex */
final class ly1 extends Thread {
    final /* synthetic */ ConditionVariable b;
    final /* synthetic */ my1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ly1(my1 my1Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.c = my1Var;
        this.b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        zm zmVar;
        synchronized (this.c) {
            this.b.open();
            this.c.b();
            zmVar = this.c.b;
            zmVar.getClass();
        }
    }
}
