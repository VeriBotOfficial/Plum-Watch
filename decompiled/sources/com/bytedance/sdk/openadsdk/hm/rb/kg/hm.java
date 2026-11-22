package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hm implements gff {
    public long fxn;
    public int gff;
    public int hm = 0;
    public long kg;

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
            jSONObject.put("total_duration", this.fxn);
            jSONObject.put("buffers_time", this.kg);
            jSONObject.put("break_reason", this.gff);
            jSONObject.put("video_backup", this.hm);
        } catch (Throwable th) {
            dx.gff("FeedBreakModel", th.getMessage());
        }
    }
}
