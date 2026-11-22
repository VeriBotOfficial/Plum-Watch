package com.bytedance.adsdk.ugeno.hm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class hie {
    private static Map<String, sg> fxn = new HashMap();

    public static void fxn(List<sg> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        for (sg sgVar : list) {
            if (sgVar != null) {
                fxn.put(sgVar.fxn(), sgVar);
            }
        }
    }

    public static sg fxn(String str) {
        return fxn.get(str);
    }
}
