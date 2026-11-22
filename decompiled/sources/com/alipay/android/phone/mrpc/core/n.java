package com.alipay.android.phone.mrpc.core;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes11.dex */
final class n implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f1285a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f1285a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
