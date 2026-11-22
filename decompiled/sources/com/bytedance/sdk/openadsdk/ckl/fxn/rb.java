package com.bytedance.sdk.openadsdk.ckl.fxn;

import com.baidu.mapapi.SDKInitializer;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rb {
    public static void fxn(final String str, final String str2, final int i, final String str3) {
        com.bytedance.sdk.openadsdk.ckl.gff.fxn(str, false, 10, new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.ckl.fxn.rb.1
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("url", str2);
                jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, i);
                jSONObject.put("error_msg", str3);
                return hm.kg().fxn(str).kg(jSONObject.toString());
            }
        });
    }
}
