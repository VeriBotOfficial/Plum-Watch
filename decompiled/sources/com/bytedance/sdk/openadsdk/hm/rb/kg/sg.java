package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class sg implements gff {
    private long fxn;
    private long kg;

    public void fxn(long j) {
        this.fxn = j;
    }

    public void kg(long j) {
        this.kg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.fxn);
            jSONObject.put("total_duration", this.kg);
        } catch (Throwable th) {
            dx.gff("FeedPauseModel", th.getMessage());
        }
    }
}
