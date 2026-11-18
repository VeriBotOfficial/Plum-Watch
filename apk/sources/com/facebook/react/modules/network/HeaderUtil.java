package com.facebook.react.modules.network;

/* JADX INFO: loaded from: classes11.dex */
class HeaderUtil {
    HeaderUtil() {
    }

    public static String stripHeaderName(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        boolean z = false;
        for (int r2 = 0; r2 < length; r2++) {
            char cCharAt = str.charAt(r2);
            if (cCharAt <= ' ' || cCharAt >= 127) {
                z = true;
            } else {
                sb.append(cCharAt);
            }
        }
        return z ? sb.toString() : str;
    }
}
