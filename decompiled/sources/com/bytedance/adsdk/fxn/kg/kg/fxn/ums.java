package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class ums implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private com.bytedance.adsdk.fxn.kg.hm.hm fxn;

    public ums(com.bytedance.adsdk.fxn.kg.hm.hm hmVar) {
        this.fxn = hmVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return this.fxn;
    }

    public String toString() {
        return kg();
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn.fxn();
    }
}
