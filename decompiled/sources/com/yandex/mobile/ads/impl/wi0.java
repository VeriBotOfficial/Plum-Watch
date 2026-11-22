package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.JvmStatic;

/* loaded from: classes5.dex */
public final class wi0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f17255a = new AtomicLong();

    @JvmStatic
    public static final long a() {
        return f17255a.getAndIncrement();
    }
}
