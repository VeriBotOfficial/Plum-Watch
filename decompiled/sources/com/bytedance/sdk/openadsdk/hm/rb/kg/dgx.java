package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class dgx implements gff {
    private final String fxn;
    private final long kg;

    public dgx(String str, long j) {
        this.fxn = str;
        this.kg = j;
    }

    @Override // com.bytedance.sdk.openadsdk.hm.rb.kg.gff
    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.fxn);
            jSONObject.put("preload_size", this.kg);
        } catch (Throwable th) {
            dx.gff("LoadVideoStartModel", th.getMessage());
        }
    }
}
