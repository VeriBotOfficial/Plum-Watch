package com.bytedance.sdk.openadsdk.hm.fxn;

import android.text.TextUtils;
import com.baidu.mapapi.SDKInitializer;
import com.iflytek.cloud.SpeechConstant;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rlu implements com.bytedance.sdk.openadsdk.ckl.kg {
    private final com.bytedance.sdk.component.bh.fxn.bh.hm fxn;
    private final boolean kg;

    public rlu(boolean z, com.bytedance.sdk.component.bh.fxn.bh.hm hmVar) {
        this.fxn = hmVar;
        this.kg = z;
    }

    @Override // com.bytedance.sdk.openadsdk.ckl.kg
    public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
        int i;
        if (this.fxn == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.kg);
        jSONObject.put("url", this.fxn.kg());
        int hm = this.fxn.hm();
        if (hm <= 0) {
            hm = 0;
        }
        jSONObject.put("retry_times", hm);
        jSONObject.put("ad_id", this.fxn.bh());
        jSONObject.put(SpeechConstant.ISE_TRACK_TYPE, this.fxn.rb());
        if (!this.kg) {
            i = 4;
        } else if (this.fxn.hie()) {
            i = 3;
        } else {
            i = this.fxn.hm() <= 0 ? 1 : 2;
        }
        jSONObject.put("upload_scene", i);
        String sg2 = this.fxn.sg();
        if (!TextUtils.isEmpty(sg2)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : sg2.split(",")) {
                jSONArray.put(str);
            }
            jSONObject.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, jSONArray);
        }
        String jq = this.fxn.jq();
        if (!TextUtils.isEmpty(jq)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : jq.split(",")) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn("track_link_result").kg(jSONObject.toString());
    }
}
