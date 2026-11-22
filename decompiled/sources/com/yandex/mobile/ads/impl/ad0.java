package com.yandex.mobile.ads.impl;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ad0 implements t62, a92 {

    /* renamed from: a, reason: collision with root package name */
    private final gs f14996a;
    private Map<String, String> b;
    private boolean c;

    public ad0(gs contentPresenter) {
        Intrinsics.checkNotNullParameter(contentPresenter, "contentPresenter");
        this.f14996a = contentPresenter;
    }

    @Override // com.yandex.mobile.ads.impl.t62
    public final void a(Map<String, String> map) {
        this.b = map;
    }

    @Override // com.yandex.mobile.ads.impl.a92
    public final void a(boolean z) {
        this.c = z;
        this.f14996a.a(z);
    }

    public final zc0 a() {
        return new zc0(this.c, this.b);
    }
}
