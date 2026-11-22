package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class rlu extends rmu {
    public rlu() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.MULTI);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        Object fxn2 = this.fxn.fxn(map);
        if (fxn2 == null || (fxn = this.kg.fxn(map)) == null) {
            return null;
        }
        return com.bytedance.adsdk.fxn.kg.rb.fxn.sg.fxn((Number) fxn2, (Number) fxn);
    }
}
