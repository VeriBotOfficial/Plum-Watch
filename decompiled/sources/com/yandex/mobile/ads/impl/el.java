package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class el {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f15394a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f15394a.get();
    }

    public final void b() {
        this.f15394a.set(true);
    }
}
