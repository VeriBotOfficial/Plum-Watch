package com.bytedance.sdk.openadsdk.bx.kg;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    private final int fxn;
    private final float gff;
    private final int kg;

    public fxn(int r1, int r2, float f) {
        this.fxn = r1;
        this.kg = r2;
        this.gff = f;
    }

    public static JSONObject fxn(fxn fxnVar) throws Throwable {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", fxnVar.fxn);
        jSONObject.put("height", fxnVar.kg);
        jSONObject.put("alpha", fxnVar.gff);
        return jSONObject;
    }
}
