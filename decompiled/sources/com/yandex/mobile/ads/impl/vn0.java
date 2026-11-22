package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vn0 {

    /* renamed from: a, reason: collision with root package name */
    private final l0 f17179a;

    private static final class a implements n0 {
        @Override // com.yandex.mobile.ads.impl.n0
        public final void onReturnedToApplication() {
        }
    }

    public vn0(Context context, bv1 sdkEnvironmentModule, uu creative, o3 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(creative, "creative");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        a aVar = new a();
        xu d = creative.d();
        this.f17179a = new l0(context, adConfiguration, null, aVar, d != null ? d.a() : null);
    }

    public final void a() {
        this.f17179a.e();
    }
}
