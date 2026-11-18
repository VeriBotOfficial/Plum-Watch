package com.bytedance.sdk.component.tw.kg;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes15.dex */
public class fxn {
    public int fxn;
    public int gff;
    public int hm;
    public int kg;

    public fxn(int r1, int r2, int r3, int r4) {
        this.fxn = r1;
        this.kg = r2;
        this.gff = r3;
        this.hm = r4;
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
