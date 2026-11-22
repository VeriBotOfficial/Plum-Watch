package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.internal.view.SupportMenu;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes5.dex */
public final class fl0 extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final o10 f15508a;
    private final om b;
    private final TextView c;
    private final View.OnClickListener d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl0(Context context, o10 dimensionConverter) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f15508a = dimensionConverter;
        this.b = new om(context, dimensionConverter);
        this.c = new TextView(context);
        this.d = new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.fl0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                fl0.a(fl0.this, view);
            }
        };
        a(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(fl0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean isSelected = this$0.b.isSelected();
        this$0.b.setSelected(!isSelected);
        this$0.c.setVisibility(!isSelected ? 0 : 8);
    }

    public final void setDescription(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.c.setText(description);
    }

    private final void a(Context context) {
        setOrientation(0);
        this.f15508a.getClass();
        int a2 = o10.a(context, 4.0f);
        setPadding(a2, a2, a2, a2);
        this.b.setOnClickListener(this.d);
        addView(this.b);
        this.f15508a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int roundToInt = MathKt.roundToInt(TypedValue.applyDimension(1, 3.0f, context.getResources().getDisplayMetrics()));
        this.c.setPadding(roundToInt, roundToInt, roundToInt, roundToInt);
        this.f15508a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int roundToInt2 = MathKt.roundToInt(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setStroke(roundToInt2, SupportMenu.CATEGORY_MASK);
        this.c.setBackgroundDrawable(gradientDrawable);
        addView(this.c);
        this.f15508a.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        int roundToInt3 = MathKt.roundToInt(TypedValue.applyDimension(1, 2.0f, context.getResources().getDisplayMetrics()));
        ViewGroup.LayoutParams layoutParams = this.c.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.setMargins(roundToInt3, 0, roundToInt3, roundToInt3);
        this.c.setLayoutParams(layoutParams2);
        this.c.setVisibility(8);
    }
}
