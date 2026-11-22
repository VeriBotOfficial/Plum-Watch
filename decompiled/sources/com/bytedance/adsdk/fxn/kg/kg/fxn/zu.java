package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class zu extends rmu {
    public zu() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.NOT_EQ);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn = this.fxn.fxn(map);
        Object fxn2 = this.kg.fxn(map);
        if (fxn == null && fxn2 == null) {
            return Boolean.FALSE;
        }
        if (fxn == null && fxn2 != null) {
            return Boolean.TRUE;
        }
        if (fxn != null && fxn2 == null) {
            return Boolean.TRUE;
        }
        if ((fxn instanceof Number) && (fxn2 instanceof Number)) {
            return Boolean.valueOf(!com.bytedance.adsdk.fxn.kg.rb.fxn.kg.fxn((Number) fxn, (Number) fxn2));
        }
        return Boolean.valueOf(!fxn.equals(fxn2));
    }
}
