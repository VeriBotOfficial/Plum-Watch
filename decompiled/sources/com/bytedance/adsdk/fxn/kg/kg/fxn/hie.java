package com.bytedance.adsdk.fxn.kg.kg.fxn;

import android.gov.nist.core.Separators;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class hie implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private com.bytedance.adsdk.fxn.kg.kg.fxn[] fxn;
    private com.bytedance.adsdk.fxn.kg.fxn.fxn gff;
    private String kg;

    public hie(String str) {
        this.kg = str;
    }

    public void fxn(com.bytedance.adsdk.fxn.kg.kg.fxn[] fxnVarArr) {
        this.fxn = fxnVarArr;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        com.bytedance.adsdk.fxn.kg.fxn.fxn fxnVar = new com.bytedance.adsdk.fxn.kg.fxn.fxn();
        this.gff = fxnVar;
        fxnVar.fxn(this.kg);
        Object[] objArr = new Object[this.fxn.length];
        int i = 0;
        while (true) {
            com.bytedance.adsdk.fxn.kg.kg.fxn[] fxnVarArr = this.fxn;
            if (i < fxnVarArr.length) {
                com.bytedance.adsdk.fxn.kg.kg.fxn fxnVar2 = fxnVarArr[i];
                if (fxnVar2 != null) {
                    objArr[i] = fxnVar2.fxn(map);
                }
                i++;
            } else {
                this.gff.fxn(objArr);
                return com.bytedance.adsdk.fxn.dgx.fxn(this.kg).fxn(map.get("default_key"), objArr);
            }
        }
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.kg.METHOD;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kg).append(Separators.LPAREN);
        com.bytedance.adsdk.fxn.kg.kg.fxn[] fxnVarArr = this.fxn;
        if (fxnVarArr != null && fxnVarArr.length > 0) {
            int i = 0;
            while (true) {
                com.bytedance.adsdk.fxn.kg.kg.fxn[] fxnVarArr2 = this.fxn;
                if (i >= fxnVarArr2.length) {
                    break;
                }
                sb.append(fxnVarArr2[i].kg()).append(",");
                i++;
            }
        }
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
