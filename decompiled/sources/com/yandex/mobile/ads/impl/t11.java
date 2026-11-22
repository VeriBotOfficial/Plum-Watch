package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.JvmStatic;

/* loaded from: classes5.dex */
public final class t11 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f16922a = new AtomicBoolean(false);

    @JvmStatic
    public static final void a() {
        if (f16922a.compareAndSet(false, true)) {
            hp0.b("Yandex Mobile Ads 7.12.2 initialized successfully", new Object[0]);
        }
    }
}
