package com.yandex.mobile.ads.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r52 extends CheckBox {

    /* renamed from: a, reason: collision with root package name */
    private Drawable f16731a;
    private Drawable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setCheckedIcon(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.f16731a = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f16731a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    public final void setUncheckedIcon(Drawable drawable) {
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        this.b = drawable;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f16731a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setButtonDrawable((Drawable) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r52(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        super.setChecked(z);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, this.f16731a);
        stateListDrawable.addState(new int[0], this.b);
        setBackground(stateListDrawable);
    }
}
