package com.bytedance.adsdk.fxn.kg.kg.fxn;

import android.gov.nist.core.Separators;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class ud implements com.bytedance.adsdk.fxn.kg.kg.kg {
    private com.bytedance.adsdk.fxn.kg.kg.fxn fxn;
    private com.bytedance.adsdk.fxn.kg.kg.fxn gff;
    private com.bytedance.adsdk.fxn.kg.kg.fxn kg;

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        Object fxn = this.fxn.fxn(map);
        if (fxn == null) {
            return null;
        }
        if (((Boolean) fxn).booleanValue()) {
            return this.kg.fxn(map);
        }
        return this.gff.fxn(map);
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.OPERATOR_RESULT;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.kg
    public void fxn(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar) {
        this.fxn = fxnVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.kg
    public void kg(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar) {
        this.kg = fxnVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.kg
    public void gff(com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar) {
        this.gff = fxnVar;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        return this.fxn.kg() + Separators.QUESTION + this.kg.kg() + ":" + this.gff.kg();
    }

    public String toString() {
        return kg();
    }
}
