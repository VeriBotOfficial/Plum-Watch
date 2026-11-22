package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class xdg implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private final com.bytedance.adsdk.fxn.kg.hm.gff fxn;

    public xdg(com.bytedance.adsdk.fxn.kg.hm.gff gffVar) {
        this.fxn = gffVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn.fxn();
    }

    public String toString() {
        return kg();
    }
}
