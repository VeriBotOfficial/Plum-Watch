package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ln2 implements db2 {

    /* renamed from: a, reason: collision with root package name */
    private final ve1 f16152a;

    public ln2(ve1 omSdkUsageValidator) {
        Intrinsics.checkNotNullParameter(omSdkUsageValidator, "omSdkUsageValidator");
        this.f16152a = omSdkUsageValidator;
    }

    @Override // com.yandex.mobile.ads.impl.db2
    public final kn2 a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (this.f16152a.a(context)) {
            return new kn2(context);
        }
        return null;
    }
}
