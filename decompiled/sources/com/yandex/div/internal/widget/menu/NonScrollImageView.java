package com.yandex.div.internal.widget.menu;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;

/* loaded from: classes5.dex */
class NonScrollImageView extends AppCompatImageView {
    @Override // android.view.View
    public boolean requestRectangleOnScreen(Rect rect, boolean z) {
        return false;
    }

    public NonScrollImageView(Context context) {
        super(context);
    }

    public NonScrollImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
