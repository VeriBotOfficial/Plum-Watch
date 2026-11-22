package com.yandex.mobile.ads.impl;

import java.util.Comparator;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class po {
    public static final b b;
    private static final a c = new a();
    private static final LinkedHashMap d = new LinkedHashMap();
    public static final po e;
    public static final po f;
    public static final po g;
    public static final po h;
    public static final po i;
    public static final po j;
    public static final po k;
    public static final po l;
    public static final po m;
    public static final po n;
    public static final po o;
    public static final po p;

    /* renamed from: q, reason: collision with root package name */
    public static final po f16588q;
    public static final po r;
    public static final po s;
    public static final po t;

    /* renamed from: a, reason: collision with root package name */
    private final String f16589a;

    public static final class b {
        @JvmStatic
        public final synchronized po a(String javaName) {
            po poVar;
            Intrinsics.checkNotNullParameter(javaName, "javaName");
            poVar = (po) ((LinkedHashMap) po.d).get(javaName);
            if (poVar == null) {
                poVar = (po) ((LinkedHashMap) po.d).get(b(javaName));
                if (poVar == null) {
                    poVar = new po(javaName, 0);
                }
                po.d.put(javaName, poVar);
            }
            return poVar;
        }

        private static String b(String str) {
            if (StringsKt.startsWith$default(str, "TLS_", false, 2, (Object) null)) {
                String substring = str.substring(4);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                return "SSL_" + substring;
            }
            if (!StringsKt.startsWith$default(str, "SSL_", false, 2, (Object) null)) {
                return str;
            }
            String substring2 = str.substring(4);
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            return "TLS_" + substring2;
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }
    }

    static {
        int i2 = 0;
        b = new b(i2);
        po a2 = oo.a("SSL_RSA_WITH_DES_CBC_SHA", oo.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", oo.a("SSL_RSA_WITH_RC4_128_SHA", oo.a("SSL_RSA_WITH_RC4_128_MD5", oo.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", oo.a("SSL_RSA_WITH_NULL_SHA", oo.a("SSL_RSA_WITH_NULL_MD5", new po("SSL_RSA_WITH_NULL_MD5", i2), "SSL_RSA_WITH_NULL_SHA", 0), "SSL_RSA_EXPORT_WITH_RC4_40_MD5", 0), "SSL_RSA_WITH_RC4_128_MD5", 0), "SSL_RSA_WITH_RC4_128_SHA", 0), "SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_RSA_WITH_DES_CBC_SHA", 0), "SSL_RSA_WITH_3DES_EDE_CBC_SHA", 0);
        d.put("SSL_RSA_WITH_3DES_EDE_CBC_SHA", a2);
        e = a2;
        d.put("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", oo.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", oo.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", oo.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", oo.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", oo.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", oo.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", new po("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", i2), "SSL_DHE_DSS_WITH_DES_CBC_SHA", 0), "SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DHE_RSA_WITH_DES_CBC_SHA", 0), "SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 0));
        po a3 = oo.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", oo.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", oo.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", oo.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", oo.a("TLS_KRB5_WITH_RC4_128_MD5", oo.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", oo.a("TLS_KRB5_WITH_DES_CBC_MD5", oo.a("TLS_KRB5_WITH_RC4_128_SHA", oo.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_KRB5_WITH_DES_CBC_SHA", oo.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", oo.a("SSL_DH_anon_WITH_DES_CBC_SHA", oo.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", oo.a("SSL_DH_anon_WITH_RC4_128_MD5", new po("SSL_DH_anon_WITH_RC4_128_MD5", i2), "SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 0), "SSL_DH_anon_WITH_DES_CBC_SHA", 0), "SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_DES_CBC_SHA", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 0), "TLS_KRB5_WITH_RC4_128_SHA", 0), "TLS_KRB5_WITH_DES_CBC_MD5", 0), "TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 0), "TLS_KRB5_WITH_RC4_128_MD5", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 0), "TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 0), "TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 0), "TLS_RSA_WITH_AES_128_CBC_SHA", 0);
        d.put("TLS_RSA_WITH_AES_128_CBC_SHA", a3);
        f = a3;
        d.put("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", oo.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", new po("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", i2), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 0));
        po a4 = oo.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", new po("TLS_DH_anon_WITH_AES_128_CBC_SHA", i2), "TLS_RSA_WITH_AES_256_CBC_SHA", 0);
        d.put("TLS_RSA_WITH_AES_256_CBC_SHA", a4);
        g = a4;
        d.put("TLS_DH_anon_WITH_AES_256_CBC_SHA256", oo.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", oo.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", oo.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", oo.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", oo.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", oo.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", oo.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", oo.a("TLS_RSA_WITH_AES_256_CBC_SHA256", oo.a("TLS_RSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_RSA_WITH_NULL_SHA256", oo.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", oo.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", oo.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", new po("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", i2), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_NULL_SHA256", 0), "TLS_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 0), "TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 0), "TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 0), "TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_128_CBC_SHA256", 0), "TLS_DH_anon_WITH_AES_256_CBC_SHA256", 0));
        po a5 = oo.a("TLS_RSA_WITH_SEED_CBC_SHA", oo.a("TLS_PSK_WITH_AES_256_CBC_SHA", oo.a("TLS_PSK_WITH_AES_128_CBC_SHA", oo.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_PSK_WITH_RC4_128_SHA", oo.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", oo.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", oo.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", new po("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", i2), "TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 0), "TLS_PSK_WITH_RC4_128_SHA", 0), "TLS_PSK_WITH_3DES_EDE_CBC_SHA", 0), "TLS_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_RSA_WITH_SEED_CBC_SHA", 0), "TLS_RSA_WITH_AES_128_GCM_SHA256", 0);
        d.put("TLS_RSA_WITH_AES_128_GCM_SHA256", a5);
        h = a5;
        po poVar = new po("TLS_RSA_WITH_AES_256_GCM_SHA384", i2);
        d.put("TLS_RSA_WITH_AES_256_GCM_SHA384", poVar);
        i = poVar;
        d.put("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", oo.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", oo.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", oo.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", oo.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", oo.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", oo.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", new po("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", i2), "TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 0), "TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 0), "TLS_DH_anon_WITH_AES_128_GCM_SHA256", 0), "TLS_DH_anon_WITH_AES_256_GCM_SHA384", 0), "TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 0));
        d.put("TLS_ECDHE_RSA_WITH_NULL_SHA", oo.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", oo.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", oo.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", oo.a("TLS_ECDH_RSA_WITH_NULL_SHA", oo.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", oo.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", oo.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", oo.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", oo.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", oo.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", oo.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", oo.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", oo.a("TLS_FALLBACK_SCSV", new po("TLS_FALLBACK_SCSV", i2), "TLS_ECDH_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_NULL_SHA", 0), "TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 0), "TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_NULL_SHA", 0), "TLS_ECDH_RSA_WITH_RC4_128_SHA", 0), "TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_NULL_SHA", 0));
        po a6 = oo.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", new po("TLS_ECDHE_RSA_WITH_RC4_128_SHA", i2), "TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 0);
        d.put("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", a6);
        j = a6;
        po poVar2 = new po("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", i2);
        d.put("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", poVar2);
        k = poVar2;
        d.put("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", oo.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", oo.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", oo.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", oo.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", oo.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", oo.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", oo.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", oo.a("TLS_ECDH_anon_WITH_RC4_128_SHA", oo.a("TLS_ECDH_anon_WITH_NULL_SHA", new po("TLS_ECDH_anon_WITH_NULL_SHA", i2), "TLS_ECDH_anon_WITH_RC4_128_SHA", 0), "TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 0), "TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 0), "TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 0), "TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 0));
        po poVar3 = new po("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", i2);
        d.put("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", poVar3);
        l = poVar3;
        po poVar4 = new po("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", i2);
        d.put("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", poVar4);
        m = poVar4;
        po a7 = oo.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", oo.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", new po("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", i2), "TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 0);
        d.put("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", a7);
        n = a7;
        po poVar5 = new po("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", i2);
        d.put("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", poVar5);
        o = poVar5;
        po a8 = oo.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", oo.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", oo.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", oo.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", new po("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", i2), "TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 0), "TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 0), "TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 0), "TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 0);
        d.put("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", a8);
        p = a8;
        po poVar6 = new po("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", i2);
        d.put("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", poVar6);
        f16588q = poVar6;
        po a9 = oo.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", oo.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", new po("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", i2), "TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 0), "TLS_AES_128_GCM_SHA256", 0);
        d.put("TLS_AES_128_GCM_SHA256", a9);
        r = a9;
        po poVar7 = new po("TLS_AES_256_GCM_SHA384", i2);
        d.put("TLS_AES_256_GCM_SHA384", poVar7);
        s = poVar7;
        po poVar8 = new po("TLS_CHACHA20_POLY1305_SHA256", i2);
        d.put("TLS_CHACHA20_POLY1305_SHA256", poVar8);
        t = poVar8;
        d.put("TLS_AES_128_CCM_8_SHA256", oo.a("TLS_AES_128_CCM_SHA256", new po("TLS_AES_128_CCM_SHA256", i2), "TLS_AES_128_CCM_8_SHA256", 0));
    }

    private po(String str) {
        this.f16589a = str;
    }

    public final String c() {
        return this.f16589a;
    }

    public /* synthetic */ po(String str, int i2) {
        this(str);
    }

    public final String toString() {
        return this.f16589a;
    }

    public static final class a implements Comparator<String> {
        a() {
        }

        @Override // java.util.Comparator
        public final int compare(String str, String str2) {
            String a2 = str;
            String b = str2;
            Intrinsics.checkNotNullParameter(a2, "a");
            Intrinsics.checkNotNullParameter(b, "b");
            int min = Math.min(a2.length(), b.length());
            for (int i = 4; i < min; i++) {
                char charAt = a2.charAt(i);
                char charAt2 = b.charAt(i);
                if (charAt != charAt2) {
                    return Intrinsics.compare((int) charAt, (int) charAt2) < 0 ? -1 : 1;
                }
            }
            int length = a2.length();
            int length2 = b.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    }
}
