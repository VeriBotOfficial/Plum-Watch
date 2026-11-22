package com.bytedance.sdk.component.tw.kg;

import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn {
    public int fxn;
    public int gff;
    public int hm;
    public int kg;

    public fxn(int i, int i2, int i3, int i4) {
        this.fxn = i;
        this.kg = i2;
        this.gff = i3;
        this.hm = i4;
    }

    public JSONObject fxn() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.fxn);
            jSONObject.put("sdk_max_thread_num", this.kg);
            jSONObject.put("app_thread_num", this.gff);
            jSONObject.put("app_max_thread_num", this.hm);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
