package com.bytedance.adsdk.kg;

import java.util.Map;

/* loaded from: classes13.dex */
public class dx {
    private final Map<String, String> fxn;
    private boolean kg;

    public String fxn(String str) {
        return str;
    }

    public String fxn(String str, String str2) {
        return fxn(str2);
    }

    public final String kg(String str, String str2) {
        if (this.kg && this.fxn.containsKey(str2)) {
            return this.fxn.get(str2);
        }
        String fxn = fxn(str, str2);
        if (this.kg) {
            this.fxn.put(str2, fxn);
        }
        return fxn;
    }
}
