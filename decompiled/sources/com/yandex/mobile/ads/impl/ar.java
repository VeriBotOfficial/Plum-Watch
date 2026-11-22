package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ar<V extends ViewGroup> implements b10<V> {

    /* renamed from: a, reason: collision with root package name */
    private final b10<V>[] f15034a;

    @SafeVarargs
    public ar(b10<V>... designComponentBinders) {
        Intrinsics.checkNotNullParameter(designComponentBinders, "designComponentBinders");
        this.f15034a = designComponentBinders;
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void a(V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        for (b10<V> b10Var : this.f15034a) {
            b10Var.a(container);
        }
    }

    @Override // com.yandex.mobile.ads.impl.b10
    public final void c() {
        for (b10<V> b10Var : this.f15034a) {
            b10Var.c();
        }
    }
}
