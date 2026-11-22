package com.yandex.mobile.ads.impl;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class mg {

    /* renamed from: a, reason: collision with root package name */
    private final zb2<go0> f16236a;
    private final ff1 b;
    private final mg2 c;
    private final no0 d;

    public mg(zb2<go0> videoAdInfo, ff1 adClickHandler, mg2 videoTracker) {
        Intrinsics.checkNotNullParameter(videoAdInfo, "videoAdInfo");
        Intrinsics.checkNotNullParameter(adClickHandler, "adClickHandler");
        Intrinsics.checkNotNullParameter(videoTracker, "videoTracker");
        this.f16236a = videoAdInfo;
        this.b = adClickHandler;
        this.c = videoTracker;
        this.d = new no0(new vu());
    }

    public final void a(View view, ig<?> igVar) {
        String a2;
        Intrinsics.checkNotNullParameter(view, "view");
        if (igVar == null || !igVar.e() || (a2 = this.d.a(this.f16236a.b(), igVar.b()).a()) == null) {
            return;
        }
        view.setOnClickListener(new yg(this.b, a2, igVar.b(), this.c));
    }
}
