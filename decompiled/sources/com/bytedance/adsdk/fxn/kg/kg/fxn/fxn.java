package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn extends rmu {
    public fxn() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.DIVISION);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        Object fxn2 = this.fxn.fxn(map);
        if (fxn2 == null || (fxn = this.kg.fxn(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.fxn.kg.rb.fxn.fxn.fxn((Number) fxn2, (Number) fxn);
    }
}
