package com.bytedance.sdk.openadsdk.core.settings;

import com.bytedance.sdk.openadsdk.core.settings.mvp;
import com.bytedance.sdk.openadsdk.core.settings.rb;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn extends mvp {
    public fxn() {
        super("tt_set_apm.prop", new mvp.fxn() { // from class: com.bytedance.sdk.openadsdk.core.settings.fxn.1
            @Override // com.bytedance.sdk.openadsdk.core.settings.mvp.fxn
            public void fxn() {
            }

            @Override // com.bytedance.sdk.openadsdk.core.settings.mvp.fxn
            public void kg() {
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.settings.rb
    public void fxn(JSONObject jSONObject) {
        rb.fxn fxn = fxn();
        if (jSONObject.has("apm_url")) {
            fxn.fxn("apm_url", jSONObject.optString("apm_url"));
        }
        if (jSONObject.has("perf_con")) {
            try {
                JSONObject optJSONObject = jSONObject.optJSONObject("perf_con");
                if (optJSONObject != null && optJSONObject.has("perf_con_apm")) {
                    fxn.fxn("perf_con_apm", optJSONObject.optInt("perf_con_apm"));
                }
            } catch (Exception unused) {
            }
        }
        fxn.fxn();
        hm();
    }
}
