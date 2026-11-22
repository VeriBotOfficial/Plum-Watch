package com.bytedance.sdk.openadsdk.common;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class jq extends RelativeLayout {
    public jq(Context context) {
        super(context);
        fxn();
    }

    private void fxn() {
        setId(com.bytedance.sdk.openadsdk.utils.xdg.qn);
        setBackgroundColor(-1);
        Context context = getContext();
        setLayoutParams(new ViewGroup.LayoutParams(-1, wc.kg(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar.setId(com.bytedance.sdk.openadsdk.utils.xdg.gaw);
        hmVar.setClickable(true);
        hmVar.setFocusable(true);
        hmVar.setPadding(wc.kg(context, 12.0f), wc.kg(context, 14.0f), wc.kg(context, 12.0f), wc.kg(context, 14.0f));
        hmVar.setImageResource(jz.hm(context, "tt_ad_xmark"));
        addView(hmVar, new RelativeLayout.LayoutParams(wc.kg(context, 40.0f), wc.kg(context, 44.0f)));
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar2 = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar2.setId(com.bytedance.sdk.openadsdk.utils.xdg.afz);
        hmVar2.setPadding(wc.kg(context, 8.0f), wc.kg(context, 10.0f), wc.kg(context, 8.0f), wc.kg(context, 10.0f));
        hmVar2.setImageResource(jz.hm(context, "tt_ad_feedback"));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(wc.kg(context, 40.0f), wc.kg(context, 44.0f));
        layoutParams.addRule(11);
        addView(hmVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setId(com.bytedance.sdk.openadsdk.utils.xdg.vts);
        twVar.setSingleLine(true);
        twVar.setEllipsize(TextUtils.TruncateAt.END);
        twVar.setGravity(17);
        twVar.setTextColor(Color.parseColor("#222222"));
        twVar.setTextSize(2, 17.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(wc.kg(context, 191.0f), wc.kg(context, 24.0f));
        layoutParams2.addRule(15);
        layoutParams2.addRule(0, com.bytedance.sdk.openadsdk.utils.xdg.afz);
        layoutParams2.addRule(1, com.bytedance.sdk.openadsdk.utils.xdg.gaw);
        int kg = wc.kg(context, 10.0f);
        layoutParams2.leftMargin = kg;
        layoutParams2.rightMargin = kg;
        addView(twVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.bh.bh bhVar = new com.bytedance.sdk.openadsdk.core.bh.bh(context, null, R.style.Widget.ProgressBar.Horizontal);
        bhVar.setId(com.bytedance.sdk.openadsdk.utils.xdg.rns);
        bhVar.setProgress(1);
        bhVar.setProgressDrawable(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_privacy_progress_style"));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, wc.kg(context, 2.0f));
        layoutParams3.addRule(12);
        addView(bhVar, layoutParams3);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, wc.kg(context, 0.5f));
        layoutParams4.addRule(12);
        addView(view, layoutParams4);
    }
}
