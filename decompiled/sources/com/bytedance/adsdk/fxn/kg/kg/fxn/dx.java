package com.bytedance.adsdk.fxn.kg.kg.fxn;

import android.gov.nist.core.Separators;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class dx implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private final String fxn;

    public dx(String str) {
        this.fxn = str;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.STRING;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return Separators.QUOTE + this.fxn + Separators.QUOTE;
    }

    public String toString() {
        return kg();
    }
}
