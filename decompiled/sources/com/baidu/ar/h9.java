package com.baidu.ar;

import com.xiaomi.mipush.sdk.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes12.dex */
public class h9 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadFactory f6964a = Executors.defaultThreadFactory();
    public final AtomicInteger b = new AtomicInteger(1);
    public final String c;

    public h9(String str) {
        this.c = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread newThread = this.f6964a.newThread(runnable);
        newThread.setName(this.c + Constants.ACCEPT_TIME_SEPARATOR_SERVER + this.b);
        return newThread;
    }
}
