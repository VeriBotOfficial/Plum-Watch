package com.baidu.platform.comapi.util;

import java.util.concurrent.ThreadFactory;

/* compiled from: DefaultThreadPool.java */
/* loaded from: classes13.dex */
class b implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    private String f8677a;

    public b(String str) {
        this.f8677a = "BaiduMapSDK-" + str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        return new Thread(runnable, this.f8677a);
    }
}
