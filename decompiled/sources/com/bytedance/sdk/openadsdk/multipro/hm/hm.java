package com.bytedance.sdk.openadsdk.multipro.hm;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.sdk.component.fxn;
import com.bytedance.sdk.openadsdk.core.jq;
import com.bytedance.sdk.openadsdk.core.rmu;

/* loaded from: classes14.dex */
public class hm {
    private static boolean fxn() {
        return rmu.fxn() == null;
    }

    private static String kg(String str) {
        return TextUtils.isEmpty(str) ? "tt_sp" : str;
    }

    public static void fxn(String str, String str2, Boolean bool) {
        if (fxn()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            fxn.fxn(kg(str), str2, bool);
        } else {
            fxn(kg(str), str2, bool);
        }
    }

    public static void fxn(String str, String str2, Long l) {
        if (fxn()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            fxn.fxn(kg(str), str2, l);
        } else {
            fxn(kg(str), str2, l);
        }
    }

    public static void fxn(String str, String str2, String str3) {
        if (fxn()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            fxn.fxn(kg(str), str2, str3);
        } else {
            fxn(kg(str), str2, str3);
        }
    }

    public static void fxn(String str, String str2, Integer num) {
        if (fxn()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            fxn.fxn(kg(str), str2, num);
        } else {
            fxn(kg(str), str2, num);
        }
    }

    public static int fxn(String str, String str2, int i) {
        if (fxn()) {
            return i;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return fxn.fxn(kg(str), str2, i);
        }
        return fxn.fxn(rmu.fxn(), kg(str), str2, i);
    }

    public static boolean fxn(String str, String str2, boolean z) {
        if (fxn()) {
            return z;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return fxn.fxn(kg(str), str2, z);
        }
        return fxn.fxn(rmu.fxn(), kg(str), str2, z);
    }

    public static long fxn(String str, String str2, long j) {
        if (fxn()) {
            return j;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return fxn.fxn(kg(str), str2, j);
        }
        return fxn.fxn(rmu.fxn(), kg(str), str2, j);
    }

    public static String kg(String str, String str2, String str3) {
        if (fxn()) {
            return str3;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return fxn.kg(kg(str), str2, str3);
        }
        return fxn.fxn(rmu.fxn(), kg(str), str2, str3);
    }

    public static void fxn(String str, String str2) {
        if (fxn()) {
            return;
        }
        try {
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                fxn.kg(kg(str), str2);
            } else {
                kg.kg(rmu.fxn(), kg(str), str2);
            }
        } catch (Throwable unused) {
        }
    }

    public static void fxn(String str) {
        if (fxn()) {
            return;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            fxn.fxn(kg(str));
        } else {
            kg.kg(rmu.fxn(), kg(str));
        }
    }

    private static <T> void fxn(String str, String str2, T t) {
        String fxn = fxn.fxn(str, str2);
        if (jq.sg(fxn)) {
            fxn.gff kg = com.bytedance.sdk.component.fxn.fxn(rmu.fxn(), kg(fxn)).kg();
            kg.fxn(kg, str2, (Object) t);
            kg.apply();
        } else {
            SharedPreferences fxn2 = kg.fxn(rmu.fxn(), kg(fxn));
            if (fxn2 == null) {
                return;
            }
            SharedPreferences.Editor edit = fxn2.edit();
            kg.fxn(edit, str2, t);
            edit.apply();
        }
    }
}
