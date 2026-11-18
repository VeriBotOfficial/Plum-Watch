package com.baidu.mapapi;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: BDMapSDKThreadPoolHelper.java */
/* JADX INFO: loaded from: classes15.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ExecutorService f7812a;

    public static ExecutorService a() {
        if (f7812a == null) {
            b();
        }
        return f7812a;
    }

    public static synchronized void b() {
        if (f7812a == null) {
            f7812a = Executors.newCachedThreadPool();
        }
    }
}
