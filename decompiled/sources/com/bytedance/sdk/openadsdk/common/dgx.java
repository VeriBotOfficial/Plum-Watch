package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class dgx {
    protected View fxn = rb();
    private com.bytedance.sdk.openadsdk.core.widget.tw gff;
    private com.bytedance.sdk.openadsdk.core.widget.rmu hm;
    protected Context kg;
    private com.bytedance.sdk.openadsdk.core.bh.tw rb;

    public dgx(Context context) {
        this.kg = context;
    }

    public View fxn() {
        return this.fxn;
    }

    public com.bytedance.sdk.openadsdk.core.widget.rmu kg() {
        return this.hm;
    }

    public com.bytedance.sdk.openadsdk.core.bh.tw gff() {
        return this.rb;
    }

    private View rb() {
        com.bytedance.sdk.openadsdk.core.bh.rb rbVar = new com.bytedance.sdk.openadsdk.core.bh.rb(this.kg);
        rbVar.setGravity(1);
        rbVar.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.widget.rmu rmuVar = new com.bytedance.sdk.openadsdk.core.widget.rmu(this.kg);
        this.hm = rmuVar;
        rmuVar.setId(520093745);
        int kg = wc.kg(this.kg, 64.0f);
        rbVar.addView(this.hm, new LinearLayout.LayoutParams(kg, kg));
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(this.kg);
        this.rb = twVar;
        twVar.setId(520093746);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wc.kg(this.kg, 219.0f), -2);
        layoutParams.topMargin = wc.kg(this.kg, 16.0f);
        this.rb.setLayoutParams(layoutParams);
        this.rb.setEllipsize(TextUtils.TruncateAt.END);
        this.rb.setGravity(17);
        this.rb.setMaxWidth(wc.kg(this.kg, 150.0f));
        this.rb.setMaxLines(2);
        this.rb.setTextColor(-1);
        this.rb.setTextSize(1, 16.0f);
        rbVar.addView(this.rb);
        this.gff = new com.bytedance.sdk.openadsdk.core.widget.tw(this.kg);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(wc.kg(this.kg, 219.0f), wc.kg(this.kg, 6.0f));
        layoutParams2.topMargin = wc.kg(this.kg, 32.0f);
        rbVar.addView(this.gff, layoutParams2);
        return rbVar;
    }

    public void fxn(int i) {
        this.gff.setProgress(i);
    }

    public void hm() {
        this.fxn = null;
        this.kg = null;
    }
}
