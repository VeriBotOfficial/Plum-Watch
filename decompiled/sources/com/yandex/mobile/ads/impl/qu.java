package com.yandex.mobile.ads.impl;

import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;

/* loaded from: classes5.dex */
public final class qu {

    /* renamed from: a, reason: collision with root package name */
    private static final CoroutineDispatcher f16700a = Dispatchers.getIO();
    private static final MainCoroutineDispatcher b = Dispatchers.getMain().getImmediate();

    static {
        Dispatchers.getDefault();
    }

    public static CoroutineDispatcher a() {
        return f16700a;
    }

    public static MainCoroutineDispatcher b() {
        return b;
    }
}
