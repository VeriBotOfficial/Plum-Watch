package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RatingBar;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public class pn1 extends RatingBar implements mn1 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        return isClickable() && event.getAction() == 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.RatingBar, com.yandex.mobile.ads.impl.mn1
    public void setRating(float f) {
        super.setRating(f);
    }

    @Override // android.widget.RatingBar
    public final float getRating() {
        return super.getRating();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pn1(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
