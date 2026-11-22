package com.baidu.sec.privacy.f;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;

/* compiled from: PrvMethodHelper.java */
/* loaded from: classes13.dex */
public class f {
    public static boolean a(Context context, int i) {
        if (com.baidu.sec.privacy.d.a.b(i)) {
            return b(context, i);
        }
        return false;
    }

    public static boolean b(Context context, int i) {
        if (com.baidu.sec.privacy.d.a.a(i)) {
            return true;
        }
        return c.d(context);
    }

    public static int a(Context context, int i, String str, int i2, boolean z, com.baidu.sec.privacy.e.d.a<Integer> aVar, Object... objArr) {
        int a2;
        try {
            if (com.baidu.sec.privacy.d.a.b(i)) {
                String str2 = i + "";
                if (!TextUtils.isEmpty(str)) {
                    str2 = str2 + Base64.encodeToString(str.getBytes(), 0);
                }
                if (!a(str2)) {
                    if (com.baidu.sec.privacy.d.a.a(str2) && (a2 = com.baidu.sec.privacy.d.a.a(str2, i2)) != i2) {
                        return a2;
                    }
                    if (b(context, i)) {
                        int intValue = aVar.a(str, objArr).intValue();
                        if (intValue != i2) {
                            com.baidu.sec.privacy.d.a.b(str2, intValue);
                        }
                        return intValue;
                    }
                    return a(context, i2, z);
                }
                if (b(context, i)) {
                    int intValue2 = aVar.a(str, objArr).intValue();
                    if (intValue2 == i2) {
                        if (com.baidu.sec.privacy.d.a.a(str2)) {
                            return com.baidu.sec.privacy.d.a.a(str2, i2);
                        }
                    } else {
                        com.baidu.sec.privacy.d.a.b(str2, intValue2);
                        return intValue2;
                    }
                } else {
                    if (com.baidu.sec.privacy.d.a.a(str2)) {
                        int a3 = com.baidu.sec.privacy.d.a.a(str2, i2);
                        return a3 == i2 ? a(context, i2, z) : a3;
                    }
                    return a(context, i2, z);
                }
            }
            return i2;
        } catch (Throwable th) {
            c.a(th);
            return i2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:50:0x0008, B:5:0x0016, B:9:0x001d, B:11:0x0034, B:12:0x004d, B:14:0x0053, B:16:0x0059, B:20:0x0066, B:22:0x006c, B:24:0x0078, B:26:0x007c, B:29:0x0083, B:31:0x0089, B:33:0x0095, B:35:0x009b, B:38:0x00a1, B:40:0x00a5, B:42:0x00ab, B:44:0x00b5, B:47:0x00bb), top: B:49:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:50:0x0008, B:5:0x0016, B:9:0x001d, B:11:0x0034, B:12:0x004d, B:14:0x0053, B:16:0x0059, B:20:0x0066, B:22:0x006c, B:24:0x0078, B:26:0x007c, B:29:0x0083, B:31:0x0089, B:33:0x0095, B:35:0x009b, B:38:0x00a1, B:40:0x00a5, B:42:0x00ab, B:44:0x00b5, B:47:0x00bb), top: B:49:0x0008 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r6, int r7, java.lang.String r8, boolean r9, com.baidu.sec.privacy.e.d.a<java.lang.String> r10, java.lang.Object... r11) {
        /*
            r0 = 64
            r1 = 0
            java.lang.String r2 = ""
            r3 = 1
            if (r7 != r0) goto L13
            boolean r0 = com.baidu.sec.privacy.d.a.b()     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L13
            r0 = r1
            goto L14
        L10:
            r6 = move-exception
            goto Lc0
        L13:
            r0 = r3
        L14:
            if (r0 == 0) goto L1d
            boolean r4 = com.baidu.sec.privacy.d.a.b(r7)     // Catch: java.lang.Throwable -> L10
            if (r4 != 0) goto L1d
            return r2
        L1d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r4.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r4 = r4.append(r7)     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r4 = r4.append(r2)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L10
            boolean r5 = android.text.TextUtils.isEmpty(r8)     // Catch: java.lang.Throwable -> L10
            if (r5 != 0) goto L4d
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L10
            r5.<init>()     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r4 = r5.append(r4)     // Catch: java.lang.Throwable -> L10
            byte[] r5 = r8.getBytes()     // Catch: java.lang.Throwable -> L10
            java.lang.String r1 = android.util.Base64.encodeToString(r5, r1)     // Catch: java.lang.Throwable -> L10
            java.lang.StringBuilder r1 = r4.append(r1)     // Catch: java.lang.Throwable -> L10
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L10
        L4d:
            boolean r1 = a(r4)     // Catch: java.lang.Throwable -> L10
            if (r1 != 0) goto L81
            boolean r1 = com.baidu.sec.privacy.d.a.a(r4)     // Catch: java.lang.Throwable -> L10
            if (r1 == 0) goto L64
            java.lang.String r1 = com.baidu.sec.privacy.d.a.a(r4, r2)     // Catch: java.lang.Throwable -> L10
            boolean r5 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L10
            if (r5 != 0) goto L64
            return r1
        L64:
            if (r0 == 0) goto L6a
            boolean r3 = b(r6, r7)     // Catch: java.lang.Throwable -> L10
        L6a:
            if (r3 == 0) goto L7c
            java.lang.Object r6 = r10.a(r8, r11)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L10
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != 0) goto L7b
            com.baidu.sec.privacy.d.a.b(r4, r6)     // Catch: java.lang.Throwable -> L10
        L7b:
            return r6
        L7c:
            java.lang.String r6 = a(r6, r9)     // Catch: java.lang.Throwable -> L10
            return r6
        L81:
            if (r0 == 0) goto L87
            boolean r3 = b(r6, r7)     // Catch: java.lang.Throwable -> L10
        L87:
            if (r3 == 0) goto La5
            java.lang.Object r6 = r10.a(r8, r11)     // Catch: java.lang.Throwable -> L10
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L10
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto La1
            boolean r6 = com.baidu.sec.privacy.d.a.a(r4)     // Catch: java.lang.Throwable -> L10
            if (r6 == 0) goto La0
            java.lang.String r6 = com.baidu.sec.privacy.d.a.a(r4, r2)     // Catch: java.lang.Throwable -> L10
            return r6
        La0:
            return r2
        La1:
            com.baidu.sec.privacy.d.a.b(r4, r6)     // Catch: java.lang.Throwable -> L10
            return r6
        La5:
            boolean r7 = com.baidu.sec.privacy.d.a.a(r4)     // Catch: java.lang.Throwable -> L10
            if (r7 == 0) goto Lbb
            java.lang.String r7 = com.baidu.sec.privacy.d.a.a(r4, r2)     // Catch: java.lang.Throwable -> L10
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L10
            if (r8 == 0) goto Lba
            java.lang.String r6 = a(r6, r9)     // Catch: java.lang.Throwable -> L10
            return r6
        Lba:
            return r7
        Lbb:
            java.lang.String r6 = a(r6, r9)     // Catch: java.lang.Throwable -> L10
            return r6
        Lc0:
            com.baidu.sec.privacy.f.c.a(r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.sec.privacy.f.f.a(android.content.Context, int, java.lang.String, boolean, com.baidu.sec.privacy.e.d.a, java.lang.Object[]):java.lang.String");
    }

    public static String a(Context context, int i, boolean z, com.baidu.sec.privacy.e.d.a<String> aVar, Object... objArr) {
        return a(context, i, null, z, aVar, objArr);
    }

    public static boolean a(String str) {
        return System.currentTimeMillis() - com.baidu.sec.privacy.d.a.a(new StringBuilder().append(str).append("la_in").toString(), 0L) >= 86400000;
    }

    public static String a(Context context, boolean z) {
        return !z ? "" : !c.c(context) ? "-1000" : "-1001";
    }

    public static int a(Context context, int i, boolean z) {
        return !z ? i : !c.c(context) ? -1000 : -1001;
    }
}
