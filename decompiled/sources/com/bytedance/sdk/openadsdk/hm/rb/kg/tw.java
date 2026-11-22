package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class tw implements gff {
    private long fxn;
    private int gff;
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

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("video_start_duration", this.fxn);
            jSONObject.put("video_cache_size", this.kg);
            jSONObject.put("is_auto_play", this.gff);
        } catch (Throwable th) {
            dx.gff("FeedPlayModel", th.getMessage());
        }
    }
}
