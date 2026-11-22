package com.baidu.geofence.a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;

/* loaded from: classes13.dex */
public class a {
    private static String a(String str) {
        String str2 = "";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < digest.length; i++) {
                int i2 = digest[i];
                if (i2 < 0) {
                    i2 += 256;
                }
                if (i2 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i2));
            }
            str2 = stringBuffer.toString();
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return str2;
        }
    }

    public static String a(HashMap<String, String> hashMap, String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(b(hashMap, str));
        return a(stringBuffer.toString() + "99754106633f94d350db34d548d6091a");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0079 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0026 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String b(java.util.HashMap<java.lang.String, java.lang.String> r6, java.lang.String r7) {
        /*
            java.util.Set r0 = r6.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
        Ld:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L1d
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r1.add(r2)
            goto Ld
        L1d:
            java.util.Collections.sort(r1)
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r2 = 0
        L26:
            int r3 = r1.size()
            if (r2 >= r3) goto L7f
            java.lang.Object r3 = r1.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r0.append(r3)
            java.lang.String r4 = "="
            r0.append(r4)
            java.lang.String r4 = "UTF-8"
            if (r7 != 0) goto L49
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            goto L6e
        L49:
            java.lang.Object r3 = r6.get(r3)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r3 = java.net.URLEncoder.encode(r3, r4)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r4 = "\\+"
            java.lang.String r5 = "%20"
            java.lang.String r3 = r3.replaceAll(r4, r5)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            java.lang.String r4 = "\\%7E"
            java.lang.String r5 = "~"
            java.lang.String r3 = r3.replaceAll(r4, r5)     // Catch: java.lang.NullPointerException -> L64 java.io.UnsupportedEncodingException -> L69
            goto L6e
        L64:
            r3 = move-exception
            r3.printStackTrace()
            goto L6d
        L69:
            r3 = move-exception
            r3.printStackTrace()
        L6d:
            r3 = 0
        L6e:
            r0.append(r3)
            int r2 = r2 + 1
            int r3 = r1.size()
            if (r2 >= r3) goto L26
            if (r7 == 0) goto L26
            r0.append(r7)
            goto L26
        L7f:
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.geofence.a.a.b(java.util.HashMap, java.lang.String):java.lang.String");
    }
}
