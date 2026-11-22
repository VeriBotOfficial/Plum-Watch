package com.bytedance.sdk.openadsdk.dgx.fxn;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rlu extends com.bytedance.sdk.component.fxn.hm<JSONObject, JSONObject> {
    private WeakReference<com.bytedance.sdk.component.jq.bh> fxn;

    public static void fxn(com.bytedance.sdk.component.fxn.ckl cklVar, com.bytedance.sdk.component.jq.bh bhVar) {
        cklVar.fxn("preventTouchEvent", new rlu(bhVar));
    }

    public rlu(com.bytedance.sdk.component.jq.bh bhVar) {
        this.fxn = new WeakReference<>(bhVar);
    }

    @Override // com.bytedance.sdk.component.fxn.hm
    public JSONObject fxn(String str, JSONObject jSONObject, com.bytedance.sdk.component.fxn.rb rbVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        try {
            boolean optBoolean = jSONObject.optBoolean("isPrevent", false);
            com.bytedance.sdk.component.jq.bh bhVar = this.fxn.get();
            if (bhVar != null) {
                bhVar.setIsPreventTouchEvent(optBoolean);
                jSONObject2.put("success", true);
                return jSONObject2;
            }
            jSONObject2.put("success", false);
            return jSONObject2;
        } catch (Throwable unused) {
            jSONObject2.put("success", false);
            return jSONObject2;
        }
    }
}
