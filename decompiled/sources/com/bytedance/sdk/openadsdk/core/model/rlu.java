package com.bytedance.sdk.openadsdk.core.model;

import com.autonavi.aps.amapapi.config.Const;
import com.umeng.analytics.pro.ak;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class rlu {
    private String fxn;
    private int gff;
    private String kg;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public String kg() {
        return this.kg;
    }

    public void kg(String str) {
        this.kg = str;
    }

    public int gff() {
        return this.gff;
    }

    public void fxn(int i) {
        this.gff = i;
    }

    public JSONObject hm() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ak.aG, this.fxn);
            jSONObject.put("ft", this.gff);
            jSONObject.put(Const.SP_KEY_FORCED_UPLOAD, this.kg);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
