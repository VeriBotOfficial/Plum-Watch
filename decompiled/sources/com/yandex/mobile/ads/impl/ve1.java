package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ve1 {

    /* renamed from: a, reason: collision with root package name */
    private final pw1 f17155a;

    public final boolean a(Context context) {
        ju1 a2;
        Intrinsics.checkNotNullParameter(context, "context");
        return (!oa.a(context) || (a2 = this.f17155a.a(context)) == null || a2.s0()) ? false : true;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve1() {
        this(pw1.a.a());
        int i = pw1.l;
    }

    public ve1(pw1 sdkSettings) {
        Intrinsics.checkNotNullParameter(sdkSettings, "sdkSettings");
        this.f17155a = sdkSettings;
    }
}
