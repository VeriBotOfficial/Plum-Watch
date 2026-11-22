package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.yandex.mobile.ads.impl.yh2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class q70 {

    /* renamed from: a, reason: collision with root package name */
    private final yh2 f16635a;

    public final <T extends View & yh2.a> p70 a(T view) {
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f16635a.getClass();
        RectF rectF = null;
        if (yh2.a(view)) {
            i = wh2.a(view);
            Rect rect = new Rect();
            if (view.getLocalVisibleRect(rect)) {
                rect.offset(view.getLeft(), view.getTop());
            } else {
                rect = null;
            }
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (rect != null) {
                float a2 = wh2.a(context, rect.left);
                float a3 = wh2.a(context, rect.top);
                float a4 = wh2.a(context, rect.right);
                float a5 = wh2.a(context, rect.bottom);
                float f = a5 - a3;
                if (a4 - a2 > 0.0f && f > 0.0f) {
                    rectF = new RectF(a2, a3, a4, a5);
                }
            }
        } else {
            i = 0;
        }
        return new p70(i, rectF);
    }

    public /* synthetic */ q70() {
        this(new yh2());
    }

    public q70(yh2 viewableChecker) {
        Intrinsics.checkNotNullParameter(viewableChecker, "viewableChecker");
        this.f16635a = viewableChecker;
    }
}
