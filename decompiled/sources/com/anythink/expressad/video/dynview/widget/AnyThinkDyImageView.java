package com.anythink.expressad.video.dynview.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;

/* loaded from: classes12.dex */
public class AnyThinkDyImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5276a = "AnyThinkDyImageView";

    public AnyThinkDyImageView(Context context) {
        super(context);
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnyThinkDyImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (Throwable th) {
            th.getMessage();
        }
    }
}
