package com.hihonor.push.sdk;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes7.dex */
public class k0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f10141a;

    public k0(Handler handler) {
        this.f10141a = handler;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f10141a.post(runnable);
    }
}
