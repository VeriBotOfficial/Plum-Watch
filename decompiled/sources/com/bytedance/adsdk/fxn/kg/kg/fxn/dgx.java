package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class dgx extends rmu {
    public dgx() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.MINUS);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        Object fxn2 = this.fxn.fxn(map);
        if (fxn2 == null || (fxn = this.kg.fxn(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.fxn.kg.rb.fxn.rb.fxn((Number) fxn2, (Number) fxn);
    }
}
