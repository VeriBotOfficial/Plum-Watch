package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class h42 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15656a;
    private final boolean b;
    private k42 c;
    private long d;

    public abstract long e();

    public /* synthetic */ h42(String str) {
        this(str, true);
    }

    public h42(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f15656a = name;
        this.b = z;
        this.d = -1L;
    }

    public final String b() {
        return this.f15656a;
    }

    public final boolean a() {
        return this.b;
    }

    public final void a(k42 queue) {
        Intrinsics.checkNotNullParameter(queue, "queue");
        k42 k42Var = this.c;
        if (k42Var == queue) {
            return;
        }
        if (k42Var == null) {
            this.c = queue;
            return;
        }
        throw new IllegalStateException("task is in multiple queues".toString());
    }

    public final k42 d() {
        return this.c;
    }

    public final long c() {
        return this.d;
    }

    public final String toString() {
        return this.f15656a;
    }

    public final void a(long j) {
        this.d = j;
    }
}
