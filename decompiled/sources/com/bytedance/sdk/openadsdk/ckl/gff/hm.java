package com.bytedance.sdk.openadsdk.ckl.gff;

import com.anythink.basead.webtemplet.a.b;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hm {

    public static class fxn {
        public final String fxn;
        public final JSONObject kg;

        public fxn(String str, JSONObject jSONObject) {
            this.fxn = str;
            this.kg = jSONObject;
            JSONObject optJSONObject = jSONObject.optJSONObject(b.c.d);
            if (optJSONObject != null) {
                try {
                    optJSONObject.put("gaid", com.bytedance.sdk.openadsdk.ud.fxn.kg.fxn.fxn().kg());
                    jSONObject.put(b.c.d, optJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static gff fxn() {
        return rb.fxn();
    }
}
