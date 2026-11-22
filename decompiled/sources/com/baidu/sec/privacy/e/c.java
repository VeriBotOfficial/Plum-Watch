package com.baidu.sec.privacy.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PrvPackageManagerImpl.java */
/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static volatile c f9031a;
    public static Context b;

    public c(Context context) {
        b = context;
    }

    public static c a(Context context) {
        if (f9031a == null) {
            synchronized (c.class) {
                f9031a = new c(context);
            }
        }
        return f9031a;
    }

    public PackageInfo a(String str, int i) throws PackageManager.NameNotFoundException {
        try {
            if (com.baidu.sec.privacy.d.a.b(19)) {
                return b.getPackageManager().getPackageInfo(str, i);
            }
            return null;
        } catch (Throwable th) {
            com.baidu.sec.privacy.f.c.a(th);
            return null;
        }
    }
}
