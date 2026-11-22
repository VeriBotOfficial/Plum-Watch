package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d3 {

    /* renamed from: a, reason: collision with root package name */
    private final p2 f15241a;
    private final kg2 b;

    public d3(Context context, p2 adBreak) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adBreak, "adBreak");
        this.f15241a = adBreak;
        this.b = new kg2(context);
    }

    public final void c() {
        this.b.a(this.f15241a, "breakStart");
    }

    public final void a() {
        this.b.a(this.f15241a, "breakEnd");
    }

    public final void b() {
        this.b.a(this.f15241a, "error");
    }
}
