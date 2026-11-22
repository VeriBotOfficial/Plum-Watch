package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lo2;
import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class po2 implements lo2.a {
    private final ArrayDeque<lo2> b = new ArrayDeque<>();
    private lo2 c = null;

    /* renamed from: a, reason: collision with root package name */
    private final ThreadPoolExecutor f16592a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    private void b() {
        lo2 poll = this.b.poll();
        this.c = poll;
        if (poll != null) {
            poll.a(this.f16592a);
        }
    }

    public final void a() {
        this.c = null;
        b();
    }

    public final void a(lo2 lo2Var) {
        lo2Var.a(this);
        this.b.add(lo2Var);
        if (this.c == null) {
            b();
        }
    }
}
