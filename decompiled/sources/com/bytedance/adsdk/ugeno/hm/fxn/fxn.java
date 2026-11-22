package com.bytedance.adsdk.ugeno.hm.fxn;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class fxn {
    private volatile Map<String, gff> fxn = new HashMap();

    public gff fxn(String str) {
        if (this.fxn.containsKey(str) && this.fxn.get(str) != null) {
            return this.fxn.get(str);
        }
        kg kgVar = new kg();
        this.fxn.put(str, kgVar);
        return kgVar;
    }

    public void fxn(String str, gff gffVar) {
        if (!this.fxn.containsKey(str) || this.fxn.get(str) == null) {
            this.fxn.put(str, gffVar);
        }
    }
}
