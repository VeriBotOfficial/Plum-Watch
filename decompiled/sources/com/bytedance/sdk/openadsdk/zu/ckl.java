package com.bytedance.sdk.openadsdk.zu;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;
import com.bytedance.sdk.openadsdk.utils.xdg;

/* loaded from: classes14.dex */
public class ckl extends com.bytedance.sdk.openadsdk.core.bh.sg {
    public ckl(Context context) {
        this(context, null);
    }

    public ckl(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ckl(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxn(context);
    }

    private void fxn(Context context) {
        setId(xdg.xga);
        setBackgroundColor(Color.parseColor("#00000000"));
        setGravity(16);
        setVisibility(8);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setId(xdg.unf);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        twVar.setLayoutParams(layoutParams);
        twVar.setIncludeFontPadding(false);
        twVar.setText(jz.fxn(context, "tt_video_without_wifi_tips"));
        twVar.setTextColor(Color.parseColor("#cacaca"));
        twVar.setTextSize(2, 14.0f);
        addView(twVar);
        com.bytedance.sdk.openadsdk.core.bh.sg sgVar = new com.bytedance.sdk.openadsdk.core.bh.sg(context);
        sgVar.setId(xdg.bz);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(3, xdg.unf);
        layoutParams2.addRule(13);
        sgVar.setLayoutParams(layoutParams2);
        addView(sgVar);
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar.setId(xdg.vd);
        int kg = wc.kg(context, 44.0f);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(kg, kg);
        layoutParams3.addRule(15);
        hmVar.setLayoutParams(layoutParams3);
        hmVar.setImageDrawable(jz.gff(context, "tt_new_play_video"));
        hmVar.setScaleType(ImageView.ScaleType.FIT_XY);
        sgVar.addView(hmVar);
    }
}
