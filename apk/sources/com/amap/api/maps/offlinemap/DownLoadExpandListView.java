package com.amap.api.maps.offlinemap;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes7.dex */
public class DownLoadExpandListView extends ExpandableListView {
    public DownLoadExpandListView(Context context) {
        super(context);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int r2, int r3) {
        super.onMeasure(r2, View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
    }

    public DownLoadExpandListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
    }
}
