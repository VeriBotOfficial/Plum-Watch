package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class ckl implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private Number fxn;

    public ckl(String str) {
        if (str.indexOf(46) >= 0) {
            Float valueOf = Float.valueOf(str);
            this.fxn = valueOf;
            if (Float.isInfinite(valueOf.floatValue())) {
                this.fxn = Double.valueOf(str);
                return;
            }
            return;
        }
        try {
            this.fxn = Integer.valueOf(str);
        } catch (NumberFormatException unused) {
            this.fxn = Long.valueOf(str);
        }
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.NUMBER;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn.toString();
    }

    public String toString() {
        return kg();
    }
}
