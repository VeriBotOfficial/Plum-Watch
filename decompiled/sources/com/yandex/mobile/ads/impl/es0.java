package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
public final class es0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f15418a = new AtomicLong();

    public static long a() {
        return f15418a.getAndIncrement();
    }
}
