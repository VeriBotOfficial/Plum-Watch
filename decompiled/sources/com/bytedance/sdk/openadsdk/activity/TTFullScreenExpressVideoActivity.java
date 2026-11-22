package com.bytedance.sdk.openadsdk.activity;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.jz;
import java.util.Map;

/* loaded from: classes14.dex */
public class TTFullScreenExpressVideoActivity extends TTFullScreenVideoActivity {
    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean iwp() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void sg() {
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public boolean ums() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        jz();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public FrameLayout ke() {
        if (this.gff != null && (this.gff instanceof com.bytedance.sdk.openadsdk.component.reward.kg.tw) && !this.kg.kwc) {
            return ((com.bytedance.sdk.openadsdk.component.reward.kg.tw) this.gff).ggo();
        }
        return this.kg.mve.kg();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public Map<String, Object> zn() {
        return this.kg.bh();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    public void mve() {
        if (jz.rb(this.kg.kg)) {
            finish();
            return;
        }
        if (this.kg.mve == null || this.kg.mve.fxn() == null) {
            return;
        }
        this.kg.mve.fxn().setTime("0", 0, 0, false);
        if (this.kg.mve.jq()) {
            this.kg.yws.fxn("0", TokenNames.X);
            this.kg.yws.rb(true);
            this.kg.yws.gff();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity, com.bytedance.sdk.openadsdk.activity.TTBaseVideoActivity
    protected void fxn(long j, long j2) {
        int i = (int) (j / 1000);
        if (this.kg.mve != null && this.kg.mve.fxn() != null) {
            this.kg.mve.fxn().setTime(String.valueOf(this.bh), i, 0, false);
            this.kg.mve.fxn().fxn(j, j2);
        }
        if ((this.kg.mve == null || !this.kg.mve.jq()) && !this.kg.kg.obr()) {
            return;
        }
        gff(i);
        if (this.bh >= 0) {
            this.kg.yws.hm(true);
            this.kg.yws.fxn(String.valueOf(this.bh), null);
        }
    }
}
