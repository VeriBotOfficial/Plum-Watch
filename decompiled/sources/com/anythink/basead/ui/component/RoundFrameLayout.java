package com.anythink.basead.ui.component;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.anythink.core.common.v.am;

/* loaded from: classes11.dex */
public class RoundFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    int f3225a;

    public RoundFrameLayout(Context context) {
        super(context);
        this.f3225a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3225a = dip2px(getContext(), 10.0f);
    }

    public RoundFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3225a = dip2px(getContext(), 10.0f);
    }

    public void setRadius(int i) {
        this.f3225a = dip2px(getContext(), i);
        postInvalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        int saveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        super.dispatchDraw(canvas);
        am.a(canvas, getWidth(), getHeight(), this.f3225a);
        canvas.restoreToCount(saveLayer);
    }

    public static int dip2px(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
