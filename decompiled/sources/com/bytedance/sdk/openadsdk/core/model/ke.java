package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ke {
    private int fxn;
    private int gff;
    private String hm = "Next Ad";
    private int kg;

    public int fxn() {
        return this.gff;
    }

    public void fxn(int i) {
        this.gff = i;
    }

    public int kg() {
        return this.kg;
    }

    public void kg(int i) {
        this.kg = i;
    }

    public String gff() {
        return this.hm;
    }

    public void fxn(String str) {
        this.hm = str;
    }

    public int hm() {
        return this.fxn;
    }

    public void gff(int i) {
        this.fxn = i;
    }

    public static ke fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ke keVar = new ke();
        try {
            int max = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int optInt = jSONObject.optInt("is_allow_pause", 0);
            int optInt2 = jSONObject.optInt("landing_type", 0);
            String optString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            keVar.gff(max);
            keVar.kg(optInt);
            keVar.fxn(optString);
            keVar.fxn(optInt2);
        } catch (Throwable unused) {
        }
        return keVar;
    }

    public JSONObject rb() {
        JSONObject jSONObject = new JSONObject();
        try {
            int i = this.fxn;
            if (i != -1) {
                jSONObject.put("endcard_show_time", i);
            }
            jSONObject.put("is_allow_pause", this.kg);
            jSONObject.put("landing_type", this.gff);
            if (!TextUtils.isEmpty(this.hm)) {
                jSONObject.put("endcard_next_ad_text", this.hm);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }
}
