package com.bytedance.sdk.component.fxn;

import android.text.TextUtils;

/* loaded from: classes13.dex */
class ud {
    private static boolean fxn;

    static String fxn(Throwable th) {
        return "{\"code\":" + (th instanceof xdg ? ((xdg) th).fxn : 0) + "}";
    }

    static String fxn(String str, boolean z) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            return "{\"code\":1}";
        }
        if (fxn && !z) {
            str2 = str.substring(1, str.length() - 1);
        } else {
            str2 = "";
        }
        String concat = "{\"code\":1,\"__data\":".concat(String.valueOf(str));
        if (!str2.isEmpty()) {
            return concat + "," + str2 + "}";
        }
        return concat + "}";
    }

    static String fxn() {
        return "";
    }

    static void fxn(boolean z) {
        fxn = z;
    }
}
