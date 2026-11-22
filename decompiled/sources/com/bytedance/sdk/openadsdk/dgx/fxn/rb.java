package com.bytedance.sdk.openadsdk.dgx.fxn;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rb extends com.bytedance.sdk.component.fxn.hm<JSONObject, JSONObject> {
    private JSONObject fxn;

    public rb(JSONObject jSONObject) {
        this.fxn = jSONObject;
    }

    public static void fxn(com.bytedance.sdk.component.fxn.ckl cklVar, JSONObject jSONObject) {
        cklVar.fxn("getData", new rb(jSONObject));
    }

    @Override // com.bytedance.sdk.component.fxn.hm
    public JSONObject fxn(String str, JSONObject jSONObject, com.bytedance.sdk.component.fxn.rb rbVar) throws Exception {
        return com.bytedance.sdk.openadsdk.core.jq.fxn.kg.fxn(this.fxn, jSONObject);
    }
}
