package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class bh extends com.bytedance.sdk.openadsdk.core.bh.hm {
    private float fxn;
    private int kg;

    public bh(Context context) {
        super(context);
        this.fxn = 2.25f;
        this.kg = 12;
        fxn();
    }

    public bh(Context context, int i, float f) {
        super(context);
        this.fxn = f;
        this.kg = i;
        fxn();
    }

    private void fxn() {
        setBackground(hm.fxn());
        setImageResource(jz.hm(getContext(), "tt_close_btn"));
        int kg = wc.kg(getContext(), this.fxn);
        setPadding(kg, kg, kg, kg);
        setScaleType(ImageView.ScaleType.FIT_XY);
    }

    @Override // com.bytedance.sdk.openadsdk.core.bh.hm, android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            int kg = wc.kg(getContext(), this.kg);
            layoutParams.width = kg;
            layoutParams.height = kg;
        }
        super.setLayoutParams(layoutParams);
    }

    public static com.bytedance.sdk.openadsdk.core.bh.hm fxn(Context context) {
        return new bh(context);
    }

    public static com.bytedance.sdk.openadsdk.core.bh.hm kg(Context context) {
        return new bh(context, 28, 5.0f);
    }
}
