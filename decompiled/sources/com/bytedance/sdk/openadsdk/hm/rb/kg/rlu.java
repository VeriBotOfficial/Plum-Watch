package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rlu implements gff {
    public long fxn;
    public long gff;
    public int kg;

    public void fxn(long j) {
        this.fxn = j;
    }

    public void fxn(int i) {
        this.kg = i;
    }

    public void kg(long j) {
        this.gff = j;
    }

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.fxn);
            jSONObject.put("buffers_count", this.kg);
            jSONObject.put("total_duration", this.gff);
        } catch (Throwable th) {
            dx.gff("PlayBufferModel", th.getMessage());
        }
    }
}
