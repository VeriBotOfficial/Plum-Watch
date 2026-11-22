package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class PAGLogoView extends LinearLayout {
    protected int containerHeight;
    private com.bytedance.sdk.openadsdk.core.bh.hm mAdLogo;
    private com.bytedance.sdk.openadsdk.core.bh.tw mAdText;

    public PAGLogoView(Context context) {
        this(context, null);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView(context);
    }

    public PAGLogoView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        initView(context);
    }

    private void initView(Context context) {
        int kg = wc.kg(context, 2.0f);
        this.containerHeight = wc.kg(getContext(), 12.0f);
        this.mAdLogo = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(wc.kg(context, 14.0f), wc.kg(context, 6.0f));
        layoutParams.leftMargin = kg;
        this.mAdLogo.setLayoutParams(layoutParams);
        this.mAdLogo.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.mAdText = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, this.containerHeight);
        layoutParams2.leftMargin = kg;
        layoutParams2.rightMargin = kg;
        this.mAdText.setLayoutParams(layoutParams2);
        this.mAdText.setTextSize(1, 8.0f);
        this.mAdText.setGravity(17);
        this.mAdText.setTextColor(Color.parseColor("#BFFFFFFF"));
        addView(this.mAdLogo);
        addView(this.mAdText);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(Color.parseColor("#26000000"));
        gradientDrawable.setCornerRadius(kg);
        setBackground(gradientDrawable);
        setGravity(16);
    }

    public static PAGLogoView createPAGLogoViewByMaterial(Context context, jz jzVar) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.initData(jzVar);
        return pAGLogoView;
    }

    public void initData(jz jzVar) {
        if (jzVar == null) {
            return;
        }
        initData(jzVar.zv());
    }

    public void initData(com.bytedance.sdk.openadsdk.core.model.kg kgVar) {
        if (kgVar == null) {
            return;
        }
        if (kgVar.rb()) {
            this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.jz.gff(com.bytedance.sdk.openadsdk.core.rmu.fxn(), "tt_ad_logo"));
        } else {
            String fxn = kgVar.fxn();
            if (TextUtils.isEmpty(fxn)) {
                this.mAdLogo.setVisibility(8);
            } else {
                if (fxn.contains("logo")) {
                    this.mAdLogo.setImageDrawable(com.bytedance.sdk.component.utils.jz.gff(com.bytedance.sdk.openadsdk.core.rmu.fxn(), "tt_ad_logo"));
                } else {
                    com.bytedance.sdk.openadsdk.jq.hm.fxn(fxn).gff(1).fxn(this.mAdLogo);
                }
                this.mAdLogo.setVisibility(0);
            }
        }
        String kg = kgVar.kg();
        if (kgVar.rb()) {
            this.mAdText.setText(com.bytedance.sdk.component.utils.jz.fxn(com.bytedance.sdk.openadsdk.core.rmu.fxn(), "tt_logo_en"));
        } else if (TextUtils.isEmpty(kg)) {
            this.mAdText.setVisibility(8);
        } else {
            this.mAdText.setText(kg);
            this.mAdText.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -2;
        layoutParams.height = this.containerHeight;
        super.setLayoutParams(com.bytedance.sdk.openadsdk.core.bh.jq.fxn(this, layoutParams));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }
}
