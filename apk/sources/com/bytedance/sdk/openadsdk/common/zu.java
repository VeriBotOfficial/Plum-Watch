package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes11.dex */
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
    public void setVisibility(int r2) {
        View view = this.kg;
        if (view != null) {
            view.setVisibility(r2);
            return;
        }
        super.setVisibility(r2);
        if (r2 == 0 || r2 == 4) {
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
        int r0 = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, r0, layoutParams);
        } else {
            viewGroup.addView(view, r0);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int r1, int r2) {
        setMeasuredDimension(0, 0);
    }
}
