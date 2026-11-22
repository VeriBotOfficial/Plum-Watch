package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h92 {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f15670a;

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ju1 a2 = this.f15670a.a(context);
        return a2 != null && a2.L();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h92() {
        this(pw1.a.a());
        int i = pw1.l;
    }

    public h92(pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15670a = sdkSettings;
    }
}
