package com.yandex.mobile.ads.impl;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hi2 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f15695a;
    private final ii2 b;

    public hi2(sf1 overlappingAreaProvider, ii2 visibleRectProvider) {
        Intrinsics.checkNotNullParameter(overlappingAreaProvider, "overlappingAreaProvider");
        Intrinsics.checkNotNullParameter(visibleRectProvider, "visibleRectProvider");
        this.f15695a = overlappingAreaProvider;
        this.b = visibleRectProvider;
    }

    public final int a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        boolean d = wh2.d(view);
        Rect a2 = this.b.a(view);
        if (d || a2 == null) {
            return 0;
        }
        return (a2.width() * a2.height()) - this.f15695a.a(view, a2);
    }
}
