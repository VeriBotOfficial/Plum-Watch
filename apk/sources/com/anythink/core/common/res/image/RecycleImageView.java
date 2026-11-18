package com.anythink.core.common.res.image;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes16.dex */
public class RecycleImageView extends ImageView {
    public RecycleImageView(Context context) {
        super(context);
    }

    public RecycleImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RecycleImageView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
        try {
            super.dispatchDraw(canvas);
        } catch (Throwable unused) {
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable unused) {
        }
    }
}
