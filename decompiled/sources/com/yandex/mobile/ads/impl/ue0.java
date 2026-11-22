package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ue0 implements qc {

    /* renamed from: a, reason: collision with root package name */
    private final xe0 f17045a;
    private final ze0 b;

    public /* synthetic */ ue0(Context context) {
        this(context, new xe0(context), new ze0(context));
    }

    public ue0(Context context, xe0 gmsClientAdvertisingInfoProvider, ze0 gmsServiceAdvertisingInfoProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(gmsClientAdvertisingInfoProvider, "gmsClientAdvertisingInfoProvider");
        Intrinsics.checkNotNullParameter(gmsServiceAdvertisingInfoProvider, "gmsServiceAdvertisingInfoProvider");
        this.f17045a = gmsClientAdvertisingInfoProvider;
        this.b = gmsServiceAdvertisingInfoProvider;
    }

    @Override // com.yandex.mobile.ads.impl.qc
    public final lc a() {
        lc a2 = this.f17045a.a();
        return a2 == null ? this.b.a() : a2;
    }
}
