package com.anythink.core.common.s.a;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: classes12.dex */
public final class h {
    static volatile Executor b;

    /* renamed from: a, reason: collision with root package name */
    static com.anythink.core.common.s.a.a.c f4318a = new d();
    static int c = 4096;

    private h() {
    }

    private static void a(int i) {
        if (i < 2048 || i > 65535) {
            return;
        }
        c = i;
    }

    public static void a(com.anythink.core.common.s.a.a.c cVar) {
        f4318a = cVar;
    }

    public static void a(Executor executor) {
        if (executor != null) {
            b = executor;
        }
    }

    static Executor a() {
        if (b == null) {
            synchronized (h.class) {
                if (b == null) {
                    b = Executors.newCachedThreadPool();
                }
            }
        }
        return b;
    }
}
