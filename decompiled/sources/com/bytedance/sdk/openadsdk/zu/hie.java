package com.bytedance.sdk.openadsdk.zu;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.rmu;

/* loaded from: classes14.dex */
public abstract class hie extends com.bytedance.sdk.openadsdk.core.bh.gff {
    protected com.bytedance.sdk.openadsdk.core.bh.tw bh;
    protected com.bytedance.sdk.openadsdk.core.bh.gff fxn;
    protected rmu gff;
    protected com.bytedance.sdk.openadsdk.core.bh.tw hm;
    protected com.bytedance.sdk.openadsdk.core.bh.hm kg;
    protected com.bytedance.sdk.openadsdk.core.bh.tw rb;

    protected abstract void fxn(Context context);

    public hie(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxn(context);
    }

    public FrameLayout getTtAdContainer() {
        return this.fxn;
    }

    public ImageView getTtFullImg() {
        return this.kg;
    }

    public rmu getTtFullAdIcon() {
        return this.gff;
    }

    public TextView getTtFullAdAppName() {
        return this.hm;
    }

    public TextView getTtFullAdDesc() {
        return this.rb;
    }

    public TextView getTtFullAdDownload() {
        return this.bh;
    }

    protected com.bytedance.sdk.openadsdk.core.bh.gff rb(Context context) {
        return new com.bytedance.sdk.openadsdk.core.bh.gff(context);
    }

    protected com.bytedance.sdk.openadsdk.core.bh.hm bh(Context context) {
        com.bytedance.sdk.openadsdk.core.bh.hm hmVar = new com.bytedance.sdk.openadsdk.core.bh.hm(context);
        hmVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return hmVar;
    }

    protected rmu sg(Context context) {
        rmu rmuVar = new rmu(context);
        rmuVar.setScaleType(ImageView.ScaleType.FIT_XY);
        rmuVar.setBackgroundColor(0);
        return rmuVar;
    }

    protected com.bytedance.sdk.openadsdk.core.bh.tw kg(Context context) {
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setEllipsize(TextUtils.TruncateAt.END);
        twVar.setMaxLines(1);
        twVar.setTextColor(Color.parseColor("#FF999999"));
        twVar.setTextSize(2, 16.0f);
        return twVar;
    }

    protected com.bytedance.sdk.openadsdk.core.bh.tw gff(Context context) {
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setEllipsize(TextUtils.TruncateAt.END);
        twVar.setMaxLines(1);
        twVar.setSingleLine();
        twVar.setTextColor(Color.parseColor("#FF999999"));
        twVar.setTextSize(2, 12.0f);
        return twVar;
    }

    protected com.bytedance.sdk.openadsdk.core.bh.tw hm(Context context) {
        com.bytedance.sdk.openadsdk.core.bh.tw twVar = new com.bytedance.sdk.openadsdk.core.bh.tw(context);
        twVar.setBackground(com.bytedance.sdk.openadsdk.utils.dgx.fxn(context, "tt_backup_btn_1"));
        twVar.setGravity(17);
        twVar.setText(jz.fxn(context, "tt_video_download_apk"));
        twVar.setTextColor(-1);
        twVar.setTextSize(2, 14.0f);
        return twVar;
    }

    protected PAGLogoView tw(Context context) {
        PAGLogoView pAGLogoView = new PAGLogoView(context);
        pAGLogoView.setId(520093739);
        return pAGLogoView;
    }
}
