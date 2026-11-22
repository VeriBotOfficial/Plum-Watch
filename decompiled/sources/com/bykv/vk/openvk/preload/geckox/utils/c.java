package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: IOSerialExecutor.java */
/* loaded from: classes13.dex */
public class c implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile c f9217a;

    public static c a() {
        if (f9217a == null) {
            synchronized (c.class) {
                if (f9217a == null) {
                    f9217a = new c();
                }
            }
        }
        return f9217a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
