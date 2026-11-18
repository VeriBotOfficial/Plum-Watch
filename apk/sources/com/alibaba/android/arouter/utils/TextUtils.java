package com.alibaba.android.arouter.utils;

import android.net.Uri;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class TextUtils {
    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String formatStackTrace(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            sb.append("    at ").append(stackTraceElement.toString());
            sb.append("\n");
        }
        return sb.toString();
    }

    public static Map<String, String> splitQueryParameters(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int r1 = 0;
        do {
            int length = encodedQuery.indexOf(38, r1);
            if (length == -1) {
                length = encodedQuery.length();
            }
            int r4 = encodedQuery.indexOf(61, r1);
            if (r4 > length || r4 == -1) {
                r4 = length;
            }
            String strSubstring = encodedQuery.substring(r1, r4);
            if (!android.text.TextUtils.isEmpty(strSubstring)) {
                linkedHashMap.put(Uri.decode(strSubstring), Uri.decode(r4 == length ? "" : encodedQuery.substring(r4 + 1, length)));
            }
            r1 = length + 1;
        } while (r1 < encodedQuery.length());
        return Collections.unmodifiableMap(linkedHashMap);
    }

    public static String getLeft(String str) {
        return (!str.contains("|") || str.endsWith("|")) ? str : str.substring(0, str.indexOf("|"));
    }

    public static String getRight(String str) {
        return (!str.contains("|") || str.startsWith("|")) ? str : str.substring(str.indexOf("|") + 1);
    }
}
