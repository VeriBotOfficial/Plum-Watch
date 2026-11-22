package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class gff extends rmu {
    public gff() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.DOUBLE_BAR);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        return Boolean.valueOf(com.bytedance.adsdk.fxn.kg.rb.kg.fxn(this.fxn.fxn(map)) || com.bytedance.adsdk.fxn.kg.rb.kg.fxn(this.kg.fxn(map)));
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn.rmu
    public String toString() {
        return kg();
    }
}
