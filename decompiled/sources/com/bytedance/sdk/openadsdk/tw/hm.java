package com.bytedance.sdk.openadsdk.tw;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.utils.ij;
import java.util.Map;

/* loaded from: classes14.dex */
public final class hm extends fxn {
    public static gff fxn;

    public static String fxn(com.bytedance.sdk.component.sg.kg.gff gffVar, String str) {
        gff fxn2;
        Map map;
        if (!ij.gff() || (fxn2 = kg.fxn("net")) == null || (map = (Map) fxn2.fxn(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                gffVar.kg(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
