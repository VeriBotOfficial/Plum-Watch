package com.yandex.mobile.ads.impl;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes5.dex */
public class ih2 {

    /* renamed from: a, reason: collision with root package name */
    private final CoroutineScope f15817a = ru.a();

    protected final CoroutineScope b() {
        return this.f15817a;
    }

    public final void a() {
        CoroutineScopeKt.cancel$default(this.f15817a, null, 1, null);
    }
}
