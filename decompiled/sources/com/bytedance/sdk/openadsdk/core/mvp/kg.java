package com.bytedance.sdk.openadsdk.core.mvp;

import com.bytedance.sdk.openadsdk.core.mvp.gff.fxn;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class kg extends gff {
    private long dgx;
    private long hie;

    public kg(int i, int i2, long j, long j2, fxn.EnumC0518fxn enumC0518fxn, fxn.kg kgVar, String str, List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list, List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list2, String str2) {
        super(i, i2, enumC0518fxn, kgVar, str, list, list2, str2);
        this.hie = j;
        this.dgx = j2;
        this.jq = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.mvp.gff
    public JSONObject fxn() throws JSONException {
        JSONObject fxn = super.fxn();
        if (fxn != null) {
            fxn.put("offset", this.hie);
            fxn.put("duration", this.dgx);
        }
        return fxn;
    }

    public static kg fxn(JSONObject jSONObject) {
        gff kg = gff.kg(jSONObject);
        if (kg == null) {
            return null;
        }
        return new kg(kg.fxn, kg.kg, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), kg.gff, kg.hm, kg.rb, kg.bh, kg.f9515sg, kg.tw);
    }
}
