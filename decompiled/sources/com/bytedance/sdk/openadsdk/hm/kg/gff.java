package com.bytedance.sdk.openadsdk.hm.kg;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff implements kg {
    kg fxn;

    @Override // com.bytedance.sdk.openadsdk.hm.kg.kg
    public void fxn(JSONObject jSONObject, long j) throws JSONException {
        kg kgVar = this.fxn;
        if (kgVar != null) {
            kgVar.fxn(jSONObject, j);
        }
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j);
    }
}
