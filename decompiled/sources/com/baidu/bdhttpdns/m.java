package com.baidu.bdhttpdns;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes12.dex */
final class m {

    /* renamed from: a, reason: collision with root package name */
    private static volatile m f7465a;
    private final Executor b = new ThreadPoolExecutor(5, 25, 20, TimeUnit.SECONDS, new LinkedBlockingDeque(50));

    private m() {
    }

    static m a() {
        if (f7465a == null) {
            synchronized (m.class) {
                if (f7465a == null) {
                    f7465a = new m();
                }
            }
        }
        return f7465a;
    }

    Executor b() {
        return this.b;
    }
}
