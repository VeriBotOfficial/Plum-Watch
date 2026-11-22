package com.bytedance.sdk.openadsdk.zu;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.bytedance.sdk.openadsdk.utils.wc;
import com.bytedance.sdk.openadsdk.utils.xdg;

/* loaded from: classes14.dex */
public class mvp extends com.bytedance.sdk.openadsdk.core.bh.sg {
    public mvp(Context context) {
        this(context, null);
    }

    public mvp(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public mvp(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxn(context);
    }

    private void fxn(Context context) {
        setId(xdg.op);
        setVisibility(8);
        setBackgroundColor(Color.parseColor("#7f000000"));
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(getContext());
        hmVar.setId(xdg.qx);
        hmVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
        hmVar.setImageTintMode(PorterDuff.Mode.SRC_OVER);
        hmVar.setImageTintList(ColorStateList.valueOf(Color.parseColor("#7f000000")));
        hmVar.setBackgroundColor(Color.parseColor("#7f000000"));
        hmVar.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(hmVar);
        com.bytedance.sdk.openadsdk.core.bh.sg sgVar = new com.bytedance.sdk.openadsdk.core.bh.sg(context);
        sgVar.setId(xdg.zc);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        sgVar.setLayoutParams(layoutParams);
        addView(sgVar);
        int kg = wc.kg(context, 44.0f);
        com.bytedance.sdk.openadsdk.core.widget.fxn fxnVar = new com.bytedance.sdk.openadsdk.core.widget.fxn(context);
        fxnVar.setId(xdg.wc);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(kg, kg);
        layoutParams2.addRule(14);
        fxnVar.setLayoutParams(layoutParams2);
        fxnVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        sgVar.addView(fxnVar);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setId(xdg.zk);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(kg, kg);
        layoutParams3.addRule(8, xdg.wc);
        layoutParams3.addRule(19, xdg.wc);
        layoutParams3.addRule(5, xdg.wc);
        layoutParams3.addRule(7, xdg.wc);
        layoutParams3.addRule(18, xdg.wc);
        layoutParams3.addRule(6, xdg.wc);
        layoutParams3.addRule(14);
        twVar.setLayoutParams(layoutParams3);
        twVar.setBackground(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_circle_solid_mian"));
        twVar.setGravity(17);
        twVar.setTextColor(-1);
        twVar.setTextSize(2, 19.0f);
        twVar.setTypeface(Typeface.defaultFromStyle(1));
        twVar.setVisibility(8);
        sgVar.addView(twVar);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar2 = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar2.setId(xdg.ei);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, xdg.wc);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = wc.kg(context, 6.0f);
        twVar2.setLayoutParams(layoutParams4);
        twVar2.setEllipsize(TextUtils.TruncateAt.END);
        twVar2.setMaxLines(1);
        twVar2.setTextColor(-1);
        twVar2.setTextSize(2, 12.0f);
        sgVar.addView(twVar2);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar3 = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar3.setId(xdg.kee);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(wc.kg(context, 100.0f), wc.kg(context, 28.0f));
        layoutParams5.addRule(14);
        layoutParams5.addRule(3, xdg.ei);
        layoutParams5.topMargin = wc.kg(context, 20.0f);
        twVar3.setLayoutParams(layoutParams5);
        twVar3.setMinWidth(wc.kg(context, 72.0f));
        twVar3.setMaxLines(1);
        twVar3.setEllipsize(TextUtils.TruncateAt.END);
        twVar3.setTextColor(-1);
        twVar3.setTextSize(2, 14.0f);
        twVar3.setBackground(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_ad_cover_btn_begin_bg"));
        twVar3.setGravity(17);
        int kg2 = wc.kg(context, 10.0f);
        int kg3 = wc.kg(context, 2.0f);
        twVar3.setPadding(kg2, kg3, kg2, kg3);
        twVar3.setVisibility(8);
        sgVar.addView(twVar3);
    }
}
