package com.alipay.sdk.m.w;

import android.content.Context;
import com.alipay.sdk.m.o.c;
import java.io.File;

/* loaded from: classes11.dex */
public class b {
    public static b b;

    /* renamed from: a, reason: collision with root package name */
    public Context f1474a;

    public static b c() {
        if (b == null) {
            b = new b();
        }
        return b;
    }

    public static boolean e() {
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return true;
            }
        }
        return false;
    }

    public void a(Context context) {
        c.a();
        this.f1474a = context.getApplicationContext();
    }

    public Context b() {
        return this.f1474a;
    }

    public String d() {
        return com.alipay.sdk.m.a0.b.c(null, this.f1474a);
    }

    public c a() {
        return c.a();
    }
}
