package com.bytedance.sdk.openadsdk.bx.kg;

import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private final int fxn;
    private final float gff;
    private final int kg;

    public fxn(int i, int i2, float f) {
        this.fxn = i;
        this.kg = i2;
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
