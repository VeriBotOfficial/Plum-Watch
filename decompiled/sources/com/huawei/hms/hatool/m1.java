package com.huawei.hms.hatool;

import com.huawei.secure.android.common.encrypt.utils.EncryptUtil;

/* loaded from: classes14.dex */
public class m1 {
    private static m1 b = new m1();

    /* renamed from: a, reason: collision with root package name */
    private a f10417a = new a();

    class a {

        /* renamed from: a, reason: collision with root package name */
        String f10418a;
        String b;
        long c = 0;

        a() {
        }

        void a(long j) {
            m1.this.f10417a.c = j;
        }

        void a(String str) {
            m1.this.f10417a.b = str;
        }

        void b(String str) {
            m1.this.f10417a.f10418a = str;
        }
    }

    public static m1 d() {
        return b;
    }

    public String a() {
        return this.f10417a.b;
    }

    public void a(String str, String str2) {
        long b2 = b();
        String b3 = w0.b(str, str2);
        if (b3 == null || b3.isEmpty()) {
            v.e("WorkKeyHandler", "get rsa pubkey config error");
            return;
        }
        if (b2 == 0) {
            long currentTimeMillis = System.currentTimeMillis();
            String generateSecureRandomStr = EncryptUtil.generateSecureRandomStr(16);
            String a2 = h0.a(b3, generateSecureRandomStr);
            this.f10417a.a(currentTimeMillis);
            this.f10417a.b(generateSecureRandomStr);
            this.f10417a.a(a2);
            return;
        }
        if (System.currentTimeMillis() - b2 > com.heytap.mcssdk.constant.a.g) {
            String generateSecureRandomStr2 = EncryptUtil.generateSecureRandomStr(16);
            String a3 = h0.a(b3, generateSecureRandomStr2);
            this.f10417a.a(b2);
            this.f10417a.b(generateSecureRandomStr2);
            this.f10417a.a(a3);
        }
    }

    public long b() {
        return this.f10417a.c;
    }

    public String c() {
        return this.f10417a.f10418a;
    }
}
