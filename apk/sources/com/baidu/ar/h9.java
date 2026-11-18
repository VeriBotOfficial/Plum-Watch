package com.baidu.ar;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes16.dex */
public class h9 implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f6964a = Executors.defaultThreadFactory();
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    public h9(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f6964a.newThread(runnable);
        threadNewThread.setName(this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b);
        return threadNewThread;
    }
}
