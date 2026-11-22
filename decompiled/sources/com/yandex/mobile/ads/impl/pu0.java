package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.impl.su0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pu0 implements su0 {

    /* renamed from: a, reason: collision with root package name */
    private final View f16598a;
    private final float b;
    private final Context c;
    private final su0.a d;

    public /* synthetic */ pu0(View view, float f, Context context) {
        this(view, f, context, new su0.a());
    }

    public pu0(View view, float f, Context context, su0.a measureSpecHolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(measureSpecHolder, "measureSpecHolder");
        this.f16598a = view;
        this.b = f;
        this.c = context;
        this.d = measureSpecHolder;
    }

    @Override // com.yandex.mobile.ads.impl.su0
    public final su0.a a(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        Context context = this.c;
        int i3 = wh2.b;
        int round = Math.round(eb0.a(context, "context").heightPixels * this.b);
        ViewGroup.LayoutParams layoutParams = this.f16598a.getLayoutParams();
        Intrinsics.checkNotNullExpressionValue(layoutParams, "getLayoutParams(...)");
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            round = (round - marginLayoutParams.topMargin) - marginLayoutParams.bottomMargin;
        }
        int max = (int) Math.max(Math.min(size, round), 0.0d);
        su0.a aVar = this.d;
        aVar.f16895a = i;
        aVar.b = View.MeasureSpec.makeMeasureSpec(max, mode);
        return this.d;
    }
}
