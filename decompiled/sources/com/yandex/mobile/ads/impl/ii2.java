package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ii2 {

    /* renamed from: a, reason: collision with root package name */
    private final jk2 f15821a;

    public final Rect a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Rect rect = new Rect();
        if (!view.getGlobalVisibleRect(rect)) {
            return null;
        }
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        if (a2 == null || !a2.u0()) {
            return rect;
        }
        this.f15821a.getClass();
        Rect a3 = jk2.a(view);
        Rect rect2 = new Rect(rect);
        if (rect2.intersect(a3)) {
            return rect2;
        }
        return null;
    }

    public /* synthetic */ ii2() {
        this(new jk2());
    }

    public ii2(jk2 windowVisibleRectProvider) {
        Intrinsics.checkNotNullParameter(windowVisibleRectProvider, "windowVisibleRectProvider");
        this.f15821a = windowVisibleRectProvider;
    }
}
