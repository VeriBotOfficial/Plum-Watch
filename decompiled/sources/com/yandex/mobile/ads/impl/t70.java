package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class t70 extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private ob2 f16939a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final ob2 getAdUiElements() {
        return this.f16939a;
    }

    public final void setAdUiElements(ob2 ob2Var) {
        this.f16939a = ob2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
