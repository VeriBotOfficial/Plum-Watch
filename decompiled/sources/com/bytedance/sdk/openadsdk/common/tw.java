package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class tw extends LinearLayout {
    public tw(Context context) {
        super(context);
        fxn();
    }

    private static ImageView fxn(Context context, float f, float f2, float f3, float f4) {
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar.setClickable(true);
        hmVar.setFocusable(true);
        hmVar.setPadding(wc.kg(context, f3), wc.kg(context, f4), wc.kg(context, f3), wc.kg(context, f4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wc.kg(context, 40.0f), wc.kg(context, 44.0f));
        if (f > 0.0f) {
            layoutParams.leftMargin = wc.kg(context, f);
        }
        if (f2 > 0.0f) {
            layoutParams.rightMargin = wc.kg(context, f2);
        }
        hmVar.setLayoutParams(layoutParams);
        return hmVar;
    }

    private void fxn() {
        Context context = getContext();
        setId(com.bytedance.sdk.openadsdk.utils.xdg.ncz);
        setLayoutParams(new ViewGroup.LayoutParams(-1, wc.kg(context, 44.5f)));
        setBackgroundColor(-1);
        setClickable(true);
        setFocusable(true);
        setOrientation(1);
        View view = new View(context);
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        addView(view, new LinearLayout.LayoutParams(-1, wc.kg(context, 0.5f)));
        com.bytedance.sdk.openadsdk.core.bh.rb rbVar = new com.bytedance.sdk.openadsdk.core.bh.rb(context);
        rbVar.setOrientation(0);
        addView(rbVar, new LinearLayout.LayoutParams(-1, wc.kg(context, 44.0f)));
        ImageView fxn = fxn(context, 16.0f, 0.0f, 14.75f, 12.5f);
        fxn.setId(com.bytedance.sdk.openadsdk.utils.xdg.bfa);
        fxn.setImageResource(jz.hm(context, "tt_ad_arrow_backward"));
        rbVar.addView(fxn);
        View view2 = new View(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        rbVar.addView(view2, layoutParams);
        ImageView fxn2 = fxn(context, 8.0f, 0.0f, 14.75f, 12.5f);
        fxn2.setId(com.bytedance.sdk.openadsdk.utils.xdg.bgy);
        fxn2.setImageResource(jz.hm(context, "tt_ad_arrow_forward"));
        rbVar.addView(fxn2);
        View view3 = new View(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, 0);
        layoutParams2.weight = 1.0f;
        rbVar.addView(view3, layoutParams2);
        ImageView fxn3 = fxn(context, 8.0f, 0.0f, 10.0f, 12.0f);
        fxn3.setId(com.bytedance.sdk.openadsdk.utils.xdg.ig);
        fxn3.setImageResource(jz.hm(context, "tt_ad_refresh"));
        rbVar.addView(fxn3);
        View view4 = new View(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, 0);
        layoutParams3.weight = 1.0f;
        rbVar.addView(view4, layoutParams3);
        ImageView fxn4 = fxn(context, 0.0f, 16.0f, 9.0f, 11.0f);
        fxn4.setId(com.bytedance.sdk.openadsdk.utils.xdg.mcr);
        fxn4.setImageResource(jz.hm(context, "tt_ad_link"));
        rbVar.addView(fxn4);
    }
}
