package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class bx {
    private final int fxn;
    private final int gff;
    private final int hm;
    private final int kg;

    public bx(JSONObject jSONObject) {
        this.fxn = jSONObject.optInt("max_time", 0);
        this.kg = jSONObject.optInt("auto_skip_time", -1);
        this.gff = jSONObject.optInt("show_after_inactivity", 10);
        this.hm = jSONObject.optInt("user_wait_time", 10);
    }

    public int fxn() {
        return this.fxn;
    }

    public int kg() {
        return this.gff;
    }

    public int gff() {
        return this.hm;
    }

    public JSONObject hm() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("max_time", this.fxn);
            jSONObject.put("auto_skip_time", this.kg);
            jSONObject.put("show_after_inactivity", this.gff);
            jSONObject.put("user_wait_time", this.hm);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
