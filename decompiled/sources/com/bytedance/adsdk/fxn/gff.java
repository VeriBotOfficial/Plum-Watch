package com.bytedance.adsdk.fxn;

import com.bytedance.adsdk.ugeno.gff.fxn;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class gff implements com.bytedance.adsdk.ugeno.gff.fxn {
    @Override // com.bytedance.adsdk.ugeno.gff.fxn
    public fxn.InterfaceC0458fxn fxn(String str) {
        return fxn.fxn(str);
    }

    static class fxn implements fxn.InterfaceC0458fxn {
        private com.bytedance.adsdk.fxn.kg.fxn fxn;
        private String kg;

        private fxn(String str) {
            this.kg = str;
            this.fxn = com.bytedance.adsdk.fxn.kg.fxn.fxn(str);
        }

        public static fxn fxn(String str) {
            return new fxn(str);
        }

        @Override // com.bytedance.adsdk.ugeno.gff.fxn.InterfaceC0458fxn
        public Object fxn(JSONObject jSONObject) {
            com.bytedance.adsdk.fxn.kg.fxn fxnVar = this.fxn;
            if (fxnVar == null) {
                return this.kg;
            }
            Object fxn = fxnVar.fxn(jSONObject);
            if (fxn instanceof String) {
                return fxn;
            }
            if (fxn instanceof com.bytedance.adsdk.fxn.kg.fxn.fxn) {
                return String.valueOf(dgx.fxn((com.bytedance.adsdk.fxn.kg.fxn.fxn) fxn));
            }
            return String.valueOf(fxn);
        }
    }
}
