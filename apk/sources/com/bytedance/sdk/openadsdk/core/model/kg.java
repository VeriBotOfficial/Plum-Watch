package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class kg {
    private String fxn;
    private String gff;
    private String hm;
    private String kg;
    private boolean rb;

    public void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.fxn = jSONObject.optString("icon");
        this.kg = jSONObject.optString("text");
        this.gff = jSONObject.optString("privacy_url");
        this.hm = jSONObject.optString("privacy_title");
    }

    public String fxn() {
        return this.fxn;
    }

    public String kg() {
        return this.kg;
    }

    public String gff() {
        return this.gff;
    }

    public String hm() {
        return this.hm;
    }

    public boolean rb() {
        return this.rb;
    }

    public void fxn(boolean z) {
        this.rb = z;
    }

    public JSONObject bh() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacy_url", this.gff);
            jSONObject.put("privacy_title", this.hm);
            jSONObject.put("text", this.kg);
            jSONObject.put("icon", this.fxn);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
