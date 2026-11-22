package com.yandex.mobile.ads.impl;

import java.util.Queue;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ut0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Queue<T> f17084a;

    public ut0(Queue<T> queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        this.f17084a = queue;
    }

    public final int a() {
        return this.f17084a.size();
    }

    public final T b() {
        return this.f17084a.poll();
    }
}
