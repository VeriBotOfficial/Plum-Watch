package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class mvp implements gff {
    private String fxn;
    private long gff;
    private long hm;
    private long kg;

    public void fxn(String str) {
        this.fxn = str;
    }

    public void fxn(long j) {
        this.kg = j;
    }

    public void kg(long j) {
        this.gff = j;
    }

    public void gff(long j) {
        this.hm = j;
    }

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.fxn);
            jSONObject.put("preload_size", this.kg);
            jSONObject.put("load_time", this.gff);
            jSONObject.put("local_cache", this.hm);
        } catch (Throwable th) {
            dx.gff("LoadVideoSuccessModel", th.getMessage());
        }
    }
}
