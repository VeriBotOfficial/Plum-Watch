package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hie implements gff {
    private String bh;
    private String fxn;
    private long gff;
    private int hm;
    private long kg;
    private String rb;

    public void fxn(String str) {
        this.fxn = str;
    }

    public void fxn(long j) {
        this.kg = j;
    }

    public void kg(long j) {
        this.gff = j;
    }

    public void fxn(int i) {
        this.hm = i;
    }

    public void kg(String str) {
        this.rb = str;
    }

    public void gff(String str) {
        this.bh = str;
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
            jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, this.hm);
            jSONObject.put("error_message", this.rb);
            jSONObject.put("error_message_server", this.bh);
        } catch (Throwable th) {
            dx.gff("LoadVideoErrorModel", th.getMessage());
        }
    }
}
