package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import com.autonavi.aps.amapapi.security.Encrypt;
import java.net.URLEncoder;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONObject;

/* compiled from: NetReuestParam.java */
/* loaded from: classes11.dex */
public final class z9 {
    private static final String b = m9.b("SRFZHZUVZT3BOa0ZiemZRQQ");
    private static final String c = m9.b("FbGJzX3Nkaw");
    private static final String d = m9.b("SWjJuYVh2eEMwSzVmNklFSmh0UXpVb2xtOVM4eU9Ua3E");
    private static final String e = m9.b("FQU5EU0RLMTA");
    private static final String f = m9.b("FMTAw");
    private static boolean g = false;
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    private String f1999a = "";

    private String b() {
        if (!TextUtils.isEmpty(this.f1999a)) {
            return this.f1999a;
        }
        String c2 = m9.c(f9.a("TUpJaVFGNk5LXHtSX1ZwQlRiV1VVZmtYWU1haV1hYWHCiXJtZcKLdmp8wpFewo1/wphwwoFzZmR8aWp6X2k6XsKDwoF+WGbChGdAScKLwoVXfmNxYEvCjcKLSG7CjGNvwoZtVFZ7WMKXYMKfwo5dZcKHfzZXUG85X0hNOVJrb2U8ZlJGW8KCe8KOV8KQWllrcGrCjcKIT25lUHPCicKGVsKKeG5fwp56XsKbc8KJbUVYR0pqU09gfE5/WT5YeHNAwoDCh1Z4V8KQT3JQYmxQbcKYwpFxdG/Ci3rCmMKQwop+YVbCmWFxwpxBdW07Zjp/ODlAbcKEY1pQwoJowohbV1VmV1laWmtcYGbClXfCk2NvesKdwohdWFnCol/CjWTCmMKicG1ENnAvPFtpcXtfclhfXsKAwolgRWNbS29OwpFafV3CkMKLTcKCwolrU3DCmGnCmX9wdsKPcXDCg3LCnFpGcDVTeTxNWW07bXJePVRfQn3ChGNraFhbwpNcwpXChMKNaFVjeVF8wojChm9YbmvChGDCmHvChGVQWjo0Z3o9djleOztWcVxSfWE9woLChkZdcGTCgVzCjMKUVE12wpV5bcKVwprCnntZworCgsKfwpHCksKnwpHClURURW9YaDtwXU1bck5YX3hSVFZUYlxKWFlua1xeYm9jU8KDa3ZrwpZ5am9Za3jCknR3fA"));
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < c2.length(); i++) {
            stringBuffer.append((char) (c2.charAt(i) - (i % 48)));
        }
        String stringBuffer2 = stringBuffer.toString();
        StringBuffer stringBuffer3 = new StringBuffer();
        for (int i2 = 0; i2 < stringBuffer2.length() / 2; i2++) {
            stringBuffer3.append((char) ((stringBuffer2.charAt(i2) + stringBuffer2.charAt((stringBuffer2.length() - 1) - i2)) / 2));
        }
        String stringBuffer4 = stringBuffer3.toString();
        this.f1999a = stringBuffer4;
        return stringBuffer4;
    }

    public final synchronized Map<String, String> a() {
        if (g) {
            return null;
        }
        g = true;
        HashMap hashMap = new HashMap();
        hashMap.put(m9.b("FZW50"), m9.b("FMg"));
        StringBuilder sb = new StringBuilder();
        StringBuilder append = sb.append(m9.b("SY2hhbm5lbD0"));
        String str = c;
        StringBuilder append2 = append.append(str).append(m9.b("SJmRpdj0"));
        String str2 = e;
        append2.append(str2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str).append(str2).append(m9.b("FQA")).append(d);
        sb.append(m9.b("FJnNpZ249")).append(i9.c(stringBuffer.toString()).toUpperCase(Locale.US));
        sb.append(m9.b("SJm91dHB1dD1qc29u") + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR);
        hashMap.put(m9.b("FaW4"), w9.a(db.a(sb.toString().getBytes(), b.getBytes())));
        hashMap.put(m9.b("Sa2V5dA"), f);
        return hashMap;
    }

    public final String a(String str, String str2, String str3, String str4) {
        String str5;
        byte[] bArr;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(m9.b("LdGlk"), str);
            jSONObject.put(m9.b("FZGl1"), str2);
            jSONObject.put(m9.b("AZGl1Mg"), str3);
            jSONObject.put(m9.b("EZGl1Mw"), str4);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        String jSONObject2 = jSONObject.toString();
        if (TextUtils.isEmpty(jSONObject2)) {
            return null;
        }
        SecureRandom secureRandom = new SecureRandom();
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance(m9.b("EQUVT"));
            keyGenerator.init(128, secureRandom);
            str5 = w9.a(keyGenerator.generateKey().getEncoded());
        } catch (Throwable unused) {
            str5 = null;
        }
        if (!TextUtils.isEmpty(str5)) {
            String a2 = w9.a(db.a((jSONObject2 + WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR).getBytes(), str5.getBytes()));
            if (!TextUtils.isEmpty(a2)) {
                try {
                    PublicKey a3 = x.a(b());
                    byte[] bytes = str5.getBytes("utf-8");
                    try {
                        Cipher cipher = Cipher.getInstance(m9.b(Encrypt.KEY_TRANSFORMATION));
                        cipher.init(1, a3);
                        bArr = cipher.doFinal(bytes);
                    } catch (Throwable unused2) {
                        bArr = null;
                    }
                    return m9.b("Fa2V5PQ") + URLEncoder.encode(w9.a(bArr)) + m9.b("SJmRhdGE9") + URLEncoder.encode(a2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return null;
    }
}
