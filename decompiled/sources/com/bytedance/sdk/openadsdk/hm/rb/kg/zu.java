package com.bytedance.sdk.openadsdk.hm.rb.kg;

import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.utils.dx;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zu implements gff {
    private long fxn;
    private final int gff;
    private final int hm;
    private long kg;
    private final String rb;

    public zu(com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn fxnVar) {
        this.gff = fxnVar.fxn();
        this.hm = fxnVar.kg();
        this.rb = fxnVar.gff();
    }

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
            jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, this.gff);
            jSONObject.put("extra_error_code", this.hm);
            jSONObject.put("error_message", this.rb);
        } catch (Throwable th) {
            dx.gff("PlayErrorModel", th.getMessage());
        }
    }
}
