package com.vivo.push.util;

import android.content.Context;
import android.util.Base64;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: AESParseManager.java */
/* loaded from: classes2.dex */
public class a {
    private static volatile a c;

    /* renamed from: a, reason: collision with root package name */
    private byte[] f14146a;
    private byte[] b;

    private a(Context context) {
        ad.c().a(ContextDelegate.getContext(context));
    }

    public static synchronized a a(Context context) {
        a aVar;
        synchronized (a.class) {
            if (c == null) {
                synchronized (a.class) {
                    if (c == null) {
                        c = new a(context.getApplicationContext());
                    }
                }
            }
            aVar = c;
        }
        return aVar;
    }

    public final String a(String str) throws Exception {
        String a2 = j.a(a());
        String a3 = j.a(b());
        byte[] decode = Base64.decode(str, 2);
        SecretKeySpec secretKeySpec = new SecretKeySpec(a3.getBytes("utf-8"), "AES");
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(2, secretKeySpec, new IvParameterSpec(a2.getBytes("utf-8")));
        return new String(cipher.doFinal(decode), "utf-8");
    }

    private synchronized byte[] a() {
        byte[] bArr = this.f14146a;
        if (bArr == null || bArr.length <= 0) {
            this.f14146a = ad.c().d();
        }
        return this.f14146a;
    }

    private synchronized byte[] b() {
        byte[] bArr = this.b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] e = ad.c().e();
        this.b = e;
        return e;
    }
}
