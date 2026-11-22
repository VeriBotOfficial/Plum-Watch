package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.m2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    private final l2 f15976a;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2(Context context) {
        this(context, m2.a.a(context).c());
        int i = m2.d;
    }

    public k2(Context context, l2 adBlockerStateStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBlockerStateStorage, "adBlockerStateStorage");
        this.f15976a = adBlockerStateStorage;
    }

    public final i2 a() {
        return this.f15976a.b();
    }
}
