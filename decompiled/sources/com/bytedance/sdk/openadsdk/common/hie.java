package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class hie extends RelativeLayout {
    public hie(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        Context context = getContext();
        int kg = wc.kg(context, 12.0f);
        setLayoutParams(new ViewGroup.LayoutParams(-1, wc.kg(context, 44.0f)));
        setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar.setId(520093720);
        hmVar.setClickable(true);
        hmVar.setFocusable(true);
        hmVar.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_leftbackicon_selector"));
        int kg2 = wc.kg(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(kg2, kg2);
        layoutParams.leftMargin = kg;
        layoutParams.addRule(15);
        addView(hmVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar2 = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar2.setId(520093716);
        hmVar2.setClickable(true);
        hmVar2.setFocusable(true);
        hmVar2.setImageDrawable(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_titlebar_close_seletor"));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(kg2, kg2);
        layoutParams2.leftMargin = kg;
        layoutParams2.addRule(15);
        layoutParams2.addRule(1, 520093720);
        addView(hmVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar3 = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar3.setId(com.bytedance.sdk.openadsdk.utils.xdg.fa);
        hmVar3.setImageDrawable(jz.gff(context, "tt_ad_feedback_new"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(kg2, kg2);
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = kg;
        addView(hmVar3, layoutParams3);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setId(com.bytedance.sdk.openadsdk.utils.xdg.ibh);
        twVar.setSingleLine(true);
        twVar.setEllipsize(TextUtils.TruncateAt.END);
        twVar.setGravity(17);
        twVar.setTextColor(-16777216);
        twVar.setTextSize(1, 16.0f);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(wc.kg(context, 240.0f), -2);
        layoutParams4.addRule(15);
        layoutParams4.addRule(1, 520093716);
        layoutParams4.addRule(0, com.bytedance.sdk.openadsdk.utils.xdg.fa);
        int kg3 = wc.kg(context, 25.0f);
        layoutParams4.rightMargin = kg3;
        layoutParams4.leftMargin = kg3;
        addView(twVar, layoutParams4);
    }
}
