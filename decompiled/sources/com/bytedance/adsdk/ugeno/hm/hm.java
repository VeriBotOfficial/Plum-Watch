package com.bytedance.adsdk.ugeno.hm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class hm {
    private static Map<String, kg> fxn = new HashMap();

    public static void fxn(List<kg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (kg kgVar : list) {
            if (kgVar != null) {
                fxn.put(kgVar.fxn(), kgVar);
            }
        }
    }

    public static kg fxn(String str) {
        return fxn.get(str);
    }
}
