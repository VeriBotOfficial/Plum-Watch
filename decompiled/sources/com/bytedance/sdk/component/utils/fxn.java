package com.bytedance.sdk.component.utils;

import android.text.TextUtils;
import java.security.SecureRandom;
import java.util.Random;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn {

    /* renamed from: com.bytedance.sdk.component.utils.fxn$fxn, reason: collision with other inner class name */
    static class C0489fxn {
        static final Random fxn = fxn.gff();
    }

    public static JSONObject fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        return fxn(jSONObject.toString());
    }

    public static JSONObject fxn(String str) {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                try {
                    String kg = kg(str);
                    if (!TextUtils.isEmpty(kg)) {
                        jSONObject.put("message", kg);
                        jSONObject.put("cypher", 3);
                        return jSONObject;
                    }
                    jSONObject.put("message", str);
                    jSONObject.put("cypher", 0);
                    return jSONObject;
                } catch (Throwable th) {
                    th.getMessage();
                }
            } catch (Throwable unused) {
                jSONObject.put("message", str);
                jSONObject.put("cypher", 0);
            }
        }
        return jSONObject;
    }

    public static String kg(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String fxn = fxn();
        String fxn2 = fxn(fxn, 32);
        String kg = kg();
        String fxn3 = (fxn2 == null || kg == null) ? null : com.bytedance.sdk.component.hm.fxn.fxn(str, kg, fxn2);
        StringBuilder sb = new StringBuilder("3");
        sb.append(fxn).append(kg).append(fxn3);
        return sb.toString();
    }

    public static String gff(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 49) {
            return str;
        }
        String fxn = fxn(str.substring(1, 33), 32);
        String substring = str.substring(33, 49);
        return (substring == null || fxn == null) ? str : com.bytedance.sdk.component.hm.fxn.kg(str.substring(49), substring, fxn);
    }

    public static String fxn() {
        String fxn = fxn(16);
        if (fxn == null || fxn.length() != 32) {
            return null;
        }
        return fxn;
    }

    public static String fxn(String str, int i) {
        if (str == null || str.length() != i) {
            return null;
        }
        int i2 = i / 2;
        return str.substring(i2, i) + str.substring(0, i2);
    }

    public static String kg() {
        String fxn = fxn(8);
        if (fxn == null || fxn.length() != 16) {
            return null;
        }
        return fxn;
    }

    public static String fxn(int i) {
        try {
            byte[] bArr = new byte[i];
            C0489fxn.fxn.nextBytes(bArr);
            return rb.fxn(bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Random gff() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }
}
