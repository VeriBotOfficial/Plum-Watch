package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes5.dex */
public final class hi0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f15693a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");
    private static final Pattern b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long a(java.lang.String r10, java.lang.String r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            boolean r1 = android.text.TextUtils.isEmpty(r10)
            java.lang.String r2 = "HttpUtil"
            java.lang.String r3 = "]"
            if (r1 != 0) goto L27
            long r4 = java.lang.Long.parseLong(r10)     // Catch: java.lang.NumberFormatException -> L11
            goto L29
        L11:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected Content-Length ["
            r1.<init>(r4)
            java.lang.StringBuilder r1 = r1.append(r10)
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.yandex.mobile.ads.impl.et0.b(r2, r1)
        L27:
            r4 = -1
        L29:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L9c
            java.util.regex.Pattern r1 = com.yandex.mobile.ads.impl.hi0.f15693a
            java.util.regex.Matcher r1 = r1.matcher(r11)
            boolean r6 = r1.matches()
            if (r6 == 0) goto L9c
            r6 = 2
            java.lang.String r6 = r1.group(r6)     // Catch: java.lang.NumberFormatException -> L86
            r6.getClass()     // Catch: java.lang.NumberFormatException -> L86
            long r6 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L86
            r8 = 1
            java.lang.String r1 = r1.group(r8)     // Catch: java.lang.NumberFormatException -> L86
            r1.getClass()     // Catch: java.lang.NumberFormatException -> L86
            long r8 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L86
            long r6 = r6 - r8
            r8 = 1
            long r6 = r6 + r8
            r8 = 0
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 >= 0) goto L5f
            r4 = r6
            goto L9c
        L5f:
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L9c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L86
            r1.<init>(r0)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.StringBuilder r10 = r1.append(r10)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r0 = "] ["
            java.lang.StringBuilder r10 = r10.append(r0)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.StringBuilder r10 = r10.append(r11)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.StringBuilder r10 = r10.append(r3)     // Catch: java.lang.NumberFormatException -> L86
            java.lang.String r10 = r10.toString()     // Catch: java.lang.NumberFormatException -> L86
            com.yandex.mobile.ads.impl.et0.d(r2, r10)     // Catch: java.lang.NumberFormatException -> L86
            long r4 = java.lang.Math.max(r4, r6)     // Catch: java.lang.NumberFormatException -> L86
            goto L9c
        L86:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unexpected Content-Range ["
            r10.<init>(r0)
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r3)
            java.lang.String r10 = r10.toString()
            com.yandex.mobile.ads.impl.et0.b(r2, r10)
        L9c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hi0.a(java.lang.String, java.lang.String):long");
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
