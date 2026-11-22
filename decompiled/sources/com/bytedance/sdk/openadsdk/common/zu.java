package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes14.dex */
public class zu extends View {
    private final fxn fxn;
    private View kg;

    public interface fxn {
        View fxn(Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public zu(Context context, fxn fxnVar) {
        super(context);
        this.fxn = fxnVar;
        fxn();
    }

    private void fxn() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.kg;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            kg();
        }
    }

    private View kg() {
        fxn fxnVar;
        if (this.kg == null && (fxnVar = this.fxn) != null) {
            this.kg = fxnVar.fxn(getContext());
            fxn(this.kg, (ViewGroup) getParent());
        }
        return this.kg;
    }

    private void fxn(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
