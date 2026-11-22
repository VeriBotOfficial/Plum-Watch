package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j92 {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f15891a;

    public final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ju1 a2 = this.f15891a.a(context);
        return a2 != null && a2.M();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j92() {
        this(pw1.a.a());
        int i = pw1.l;
    }

    public j92(pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f15891a = sdkSettings;
    }
}
