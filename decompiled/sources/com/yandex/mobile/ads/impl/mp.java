package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.op1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mp implements z<x> {

    /* renamed from: a, reason: collision with root package name */
    private final tp1 f16269a;
    private final p51 b;

    public mp(tp1 reporter, p51 nativeAdEventController) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        this.f16269a = reporter;
        this.b = nativeAdEventController;
    }

    @Override // com.yandex.mobile.ads.impl.z
    public final gf0 a(View view, x action) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(action, "action");
        this.b.a();
        this.f16269a.a(op1.b.D);
        return new gf0(false);
    }
}
