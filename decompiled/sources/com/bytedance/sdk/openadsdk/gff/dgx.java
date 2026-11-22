package com.bytedance.sdk.openadsdk.gff;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class dgx extends View {
    private final int fxn;

    public dgx(Context context) {
        this(context, Color.parseColor("#25000000"));
    }

    public dgx(Context context, int i) {
        super(context);
        setBackgroundColor(i);
        this.fxn = wc.kg(getContext(), 0.66f);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(getMeasuredWidth(), this.fxn);
    }
}
