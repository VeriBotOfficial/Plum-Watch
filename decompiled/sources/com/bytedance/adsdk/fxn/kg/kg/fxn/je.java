package com.bytedance.adsdk.fxn.kg.kg.fxn;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class je extends rmu {
    private static final ThreadLocal<StringBuilder> hm = new ThreadLocal<StringBuilder>() { // from class: com.bytedance.adsdk.fxn.kg.kg.fxn.je.1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder();
        }
    };

    public je() {
        super(com.bytedance.adsdk.fxn.kg.hm.gff.PLUS);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn;
        Object fxn2 = this.fxn.fxn(map);
        if (fxn2 == null || (fxn = this.kg.fxn(map)) == null) {
            return null;
        }
        if ((fxn2 instanceof String) || (fxn instanceof String)) {
            StringBuilder sb = hm.get();
            sb.append(fxn2).append(fxn);
            String sb2 = sb.toString();
            sb.setLength(0);
            return sb2;
        }
        return com.bytedance.adsdk.fxn.kg.rb.fxn.tw.fxn((Number) fxn2, (Number) fxn);
    }
}
