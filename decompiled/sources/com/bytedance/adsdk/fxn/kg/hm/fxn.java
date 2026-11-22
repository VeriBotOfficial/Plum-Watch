package com.bytedance.adsdk.fxn.kg.hm;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public enum fxn implements rb {
    TRUE,
    FALSE,
    NULL;

    private static final Map<String, fxn> hm = new HashMap(128);

    static {
        for (fxn fxnVar : values()) {
            hm.put(fxnVar.name().toLowerCase(), fxnVar);
        }
    }

    public static fxn fxn(String str) {
        return hm.get(str.toLowerCase());
    }
}
