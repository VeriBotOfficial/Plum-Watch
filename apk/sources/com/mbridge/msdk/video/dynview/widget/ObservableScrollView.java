package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

/* JADX INFO: loaded from: classes2.dex */
public class ObservableScrollView extends HorizontalScrollView {
    public ObservableScrollView(Context context) {
        super(context);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int r1) {
        super.fling(r1 / 4);
    }

    @Override // android.view.View
    protected void onScrollChanged(int r1, int r2, int r3, int r4) {
        super.onScrollChanged(r1, r2, r3, r4);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet, int r3) {
        super(context, attributeSet, r3);
    }

    public ObservableScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
