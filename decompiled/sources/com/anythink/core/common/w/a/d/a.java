package com.anythink.core.common.w.a.d;

import android.text.TextUtils;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ak;
import com.anythink.core.common.h.al;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public final class a {
    public static String a(String str, ak akVar) {
        List<String> list;
        if (akVar == null) {
            return "";
        }
        List<String> a2 = akVar.a();
        Map<String, List<String>> c = akVar.c();
        if (a2 != null && !a2.isEmpty()) {
            for (String str2 : a2) {
                if (!TextUtils.isEmpty(str2) && str.contains(str2)) {
                    if (c != null && !c.isEmpty() && (list = c.get(str2)) != null && !list.isEmpty()) {
                        for (int i = 0; i < list.size(); i++) {
                            String str3 = list.get(i);
                            if (str.contains(str3)) {
                                return str2 + "&&" + str3;
                            }
                        }
                    }
                    return str2;
                }
            }
        }
        return "";
    }

    private static ak a(al alVar, ai aiVar) {
        Map<Integer, ak> e;
        if (alVar == null || aiVar == null || (e = aiVar.e()) == null) {
            return null;
        }
        return e.get(Integer.valueOf(alVar.c()));
    }
}
