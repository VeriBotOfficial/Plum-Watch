package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class f41 implements ThreadFactory {
    private static final String b = "YandexAds.UrlTracker";
    public static final String c = "YandexAds.BaseController";
    public static final String d = "YandexAds.AdvertisingId";

    /* renamed from: a, reason: collision with root package name */
    private final String f15454a;

    public f41(String threadName) {
        Intrinsics.checkNotNullParameter(threadName, "threadName");
        this.f15454a = threadName;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        return new Thread(runnable, this.f15454a);
    }
}
