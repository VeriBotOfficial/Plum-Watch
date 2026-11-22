package com.bykv.vk.openvk.preload.geckox.utils;

import java.util.concurrent.Executor;

/* compiled from: PiecemealSerialExecutor.java */
/* loaded from: classes13.dex */
public class f implements Executor {

    /* renamed from: a, reason: collision with root package name */
    private static volatile f f9219a;

    public static f a() {
        if (f9219a == null) {
            synchronized (f.class) {
                if (f9219a == null) {
                    f9219a = new f();
                }
            }
        }
        return f9219a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        com.bykv.vk.openvk.preload.geckox.b.t().execute(runnable);
    }
}
