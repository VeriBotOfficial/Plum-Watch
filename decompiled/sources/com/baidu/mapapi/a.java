package com.baidu.mapapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* compiled from: BDMapSDKThreadPoolHelper.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ExecutorService f7812a;

    public static ExecutorService a() {
        if (f7812a == null) {
            b();
        }
        return f7812a;
    }

    public static synchronized void b() {
        synchronized (a.class) {
            if (f7812a == null) {
                f7812a = Executors.newCachedThreadPool();
            }
        }
    }
}
