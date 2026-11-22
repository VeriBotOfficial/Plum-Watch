package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class tw extends rmu {
    public tw() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.LT_EQ);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        if (this.fxn.fxn(map) == null || (fxn = this.kg.fxn(map)) == null) {
            return null;
        }
        return Boolean.valueOf(!((Boolean) com.bytedance.adsdk.fxn.kg.rb.fxn.gff.fxn(r0, (Number) fxn)).booleanValue());
    }
}
