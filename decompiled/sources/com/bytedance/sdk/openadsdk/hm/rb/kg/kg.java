package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg implements gff {
    private long fxn;
    private int gff;
    private int hm;
    private long kg;

    public void fxn(long j) {
        this.fxn = j;
    }

    public void kg(long j) {
        this.kg = j;
    }

    public void fxn(int i) {
        this.gff = i;
    }

    public void kg(int i) {
        this.hm = i;
    }

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.fxn);
            jSONObject.put("total_duration", this.kg);
            jSONObject.put("vbtt_skip_type", this.gff);
            jSONObject.put("skip_reason", this.hm);
        } catch (Throwable th) {
            dx.gff("EndcardSkipModel", th.getMessage());
        }
    }
}
