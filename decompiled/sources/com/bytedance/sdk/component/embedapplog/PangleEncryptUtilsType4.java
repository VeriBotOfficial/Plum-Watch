package com.bytedance.sdk.component.embedapplog;

import android.util.Log;
import android.util.Pair;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class PangleEncryptUtilsType4 {
    private static int getCryptFailedReason(int i) {
        switch (i) {
            case 501:
                return 6;
            case 502:
                return 4;
            case 503:
                return 1;
            case 504:
                return 3;
            case 505:
            case 506:
                return 2;
            default:
                return 0;
        }
    }

    PangleEncryptUtilsType4() {
    }

    static JSONObject encrypt(JSONObject jSONObject, IDefaultEncrypt iDefaultEncrypt) {
        Pair<Integer, JSONObject> pair;
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(jSONObject);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pair = null;
        }
        if (pair != null && ((Integer) pair.first).intValue() == 0 && pair.second != null) {
            return (JSONObject) pair.second;
        }
        if (iDefaultEncrypt == null) {
            return null;
        }
        try {
            return iDefaultEncrypt.encrypt(jSONObject, pair == null ? 0 : getCryptFailedReason(((Integer) pair.first).intValue()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static org.json.JSONObject encryptType4WithNoWrapBase64(org.json.JSONObject r5, com.bytedance.sdk.component.embedapplog.IDefaultEncrypt r6) {
        /*
            java.lang.String r0 = "pangle-encrypt"
            r1 = 0
            if (r5 == 0) goto L29
            com.bytedance.sdk.component.pglcrypt.PglCryptUtils r2 = com.bytedance.sdk.component.pglcrypt.PglCryptUtils.getInstance()     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Pair r2 = r2.cypher4EncryptWithNoWrapBase64(r3)     // Catch: java.lang.Throwable -> L12
            goto L2a
        L12:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "encrypt exception "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            java.lang.StringBuilder r2 = r3.append(r2)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r0, r2)
        L29:
            r2 = r1
        L2a:
            if (r2 == 0) goto L69
            java.lang.Object r3 = r2.first
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            if (r3 != 0) goto L69
            java.lang.Object r3 = r2.second
            if (r3 == 0) goto L69
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L51
            r5.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "message"
            java.lang.Object r1 = r2.second     // Catch: java.lang.Throwable -> L4e
            r5.put(r6, r1)     // Catch: java.lang.Throwable -> L4e
            java.lang.String r6 = "cypher"
            r1 = 4
            r5.put(r6, r1)     // Catch: java.lang.Throwable -> L4e
            r1 = r5
            goto L7f
        L4e:
            r6 = move-exception
            r1 = r5
            goto L52
        L51:
            r6 = move-exception
        L52:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r2 = "encrypt json exception "
            r5.<init>(r2)
            java.lang.String r6 = r6.getMessage()
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            goto L7f
        L69:
            if (r6 == 0) goto L7f
            if (r2 != 0) goto L6f
            r0 = 0
            goto L7b
        L6f:
            java.lang.Object r0 = r2.first
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r0 = getCryptFailedReason(r0)
        L7b:
            org.json.JSONObject r1 = r6.encrypt(r5, r0)     // Catch: java.lang.Exception -> L7f
        L7f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.embedapplog.PangleEncryptUtilsType4.encryptType4WithNoWrapBase64(org.json.JSONObject, com.bytedance.sdk.component.embedapplog.IDefaultEncrypt):org.json.JSONObject");
    }

    static Pair<Integer, byte[]> encryptWithoutBase64(byte[] bArr) {
        Pair<Integer, byte[]> pair;
        byte[] bArr2 = null;
        if (bArr == null) {
            return null;
        }
        try {
            pair = PglCryptUtils.getInstance().cypher4Encrypt(bArr);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "encrypt exception " + th.getMessage());
            pair = null;
        }
        int i = 0;
        if (pair != null && ((Integer) pair.first).intValue() == 0 && pair.second != null && ((byte[]) pair.second).length > 0) {
            bArr2 = (byte[]) pair.second;
        } else if (pair != null) {
            i = getCryptFailedReason(((Integer) pair.first).intValue());
        }
        return new Pair<>(Integer.valueOf(i), bArr2);
    }

    static Pair<Integer, String> decrypt(String str) {
        try {
            Pair<Integer, String> cypher4Decrypt = PglCryptUtils.getInstance().cypher4Decrypt(str);
            return new Pair<>(Integer.valueOf(getCryptFailedReason(((Integer) cypher4Decrypt.first).intValue())), cypher4Decrypt.second);
        } catch (Throwable th) {
            Log.e("pangle-encrypt", "decrypt exception " + th.getMessage());
            return new Pair<>(2, null);
        }
    }
}
