package com.anythink.core.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes16.dex */
public class MarqueeTextView extends TextView {
    @Override // android.view.View
    public boolean isFocused() {
        return true;
    }

    public MarqueeTextView(Context context) {
        super(context);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarqueeTextView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }
}
