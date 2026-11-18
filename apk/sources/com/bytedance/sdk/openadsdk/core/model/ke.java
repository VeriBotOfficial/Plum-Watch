package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class ke {
    private int fxn;
    private int gff;
    private String hm = "Next Ad";
    private int kg;

    public int fxn() {
        return this.gff;
    }

    public void fxn(int r1) {
        this.gff = r1;
    }

    public int kg() {
        return this.kg;
    }

    public void kg(int r1) {
        this.kg = r1;
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

    public void gff(int r1) {
        this.fxn = r1;
    }

    public static ke fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ke keVar = new ke();
        try {
            int r1 = Math.max(jSONObject.optInt("endcard_show_time", 0), 0);
            int r3 = jSONObject.optInt("is_allow_pause", 0);
            int r2 = jSONObject.optInt("landing_type", 0);
            String strOptString = jSONObject.optString("endcard_next_ad_text", "Next Ad");
            keVar.gff(r1);
            keVar.kg(r3);
            keVar.fxn(strOptString);
            keVar.fxn(r2);
        } catch (Throwable unused) {
        }
        return keVar;
    }

    public JSONObject rb() {
        JSONObject jSONObject = new JSONObject();
        try {
            int r1 = this.fxn;
            if (r1 != -1) {
                jSONObject.put("endcard_show_time", r1);
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
