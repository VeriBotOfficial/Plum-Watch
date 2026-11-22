package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.huawei.secure.android.common.encrypt.keystore.aes.AesGcmKS;
import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* loaded from: classes14.dex */
public class o0 {
    private static o0 c;

    /* renamed from: a, reason: collision with root package name */
    private String f10421a;
    private String b;

    private String a(String str) {
        String decrypt = f() ? AesGcmKS.decrypt("analytics_keystore", str) : "";
        if (!TextUtils.isEmpty(decrypt)) {
            return decrypt;
        }
        v.c("hmsSdk", "deCrypt work key first");
        String a2 = n.a(str, e());
        if (!TextUtils.isEmpty(a2)) {
            if (f()) {
                c(b(a2));
                x.c();
            }
            return a2;
        }
        String generateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        c(b(generateSecureRandomStr));
        if (f()) {
            x.c();
        }
        return generateSecureRandomStr;
    }

    private String b(String str) {
        return f() ? AesGcmKS.encrypt("analytics_keystore", str) : n.b(str, e());
    }

    private String c() {
        String a2 = d.a(q0.i(), "Privacy_MY", "PrivacyData", "");
        if (!TextUtils.isEmpty(a2)) {
            return a(a2);
        }
        String generateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        c(b(generateSecureRandomStr));
        return generateSecureRandomStr;
    }

    private boolean c(String str) {
        v.c("hmsSdk", "refresh sp aes key");
        if (TextUtils.isEmpty(str)) {
            v.c("hmsSdk", "refreshLocalKey(): encrypted key is empty");
            return false;
        }
        d.b(q0.i(), "Privacy_MY", "PrivacyData", str);
        d.b(q0.i(), "Privacy_MY", "flashKeyTime", System.currentTimeMillis());
        return true;
    }

    public static o0 d() {
        if (c == null) {
            g();
        }
        return c;
    }

    private String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = new x().a();
        }
        return this.b;
    }

    private boolean f() {
        return true;
    }

    private static synchronized void g() {
        synchronized (o0.class) {
            if (c == null) {
                c = new o0();
            }
        }
    }

    public String a() {
        if (TextUtils.isEmpty(this.f10421a)) {
            this.f10421a = c();
        }
        return this.f10421a;
    }

    public void b() {
        String generateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
        if (c(b(generateSecureRandomStr))) {
            this.f10421a = generateSecureRandomStr;
        }
    }
}
