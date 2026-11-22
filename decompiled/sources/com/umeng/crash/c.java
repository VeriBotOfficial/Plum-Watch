package com.umeng.crash;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: UCrash */
/* loaded from: classes2.dex */
final class c {
    private static final c r = new c();

    /* renamed from: a, reason: collision with root package name */
    Application f13994a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    long k;
    int o;
    int p;
    int l = 300;
    int m = 100;
    int n = 100;

    /* renamed from: q, reason: collision with root package name */
    final Map<String, String> f13995q = new LinkedHashMap();

    static void a(final Context context) {
        final c cVar = r;
        cVar.k = System.currentTimeMillis();
        String packageName = context.getPackageName();
        if (TextUtils.isEmpty(packageName)) {
            packageName = "unknown";
        }
        cVar.f13994a = (Application) context;
        cVar.e = packageName;
        cVar.b = m.c(context);
        cVar.g = m.d(context);
        cVar.h = m.e(context);
        cVar.f = m.a(context);
        cVar.i = m.b(context);
        cVar.j = context.getApplicationInfo().nativeLibraryDir;
        cVar.c = k.a(context).getPath();
        b.a(new Runnable() { // from class: com.umeng.crash.c.1
            @Override // java.lang.Runnable
            public final void run() {
                String a2 = j.a(context, cVar.f);
                if (!TextUtils.equals(a2, cVar.g)) {
                    Context context2 = context;
                    String str = cVar.f;
                    String str2 = cVar.g;
                    try {
                        SharedPreferences sharedPreferences = context2.getSharedPreferences("um_crash_cfg", 0);
                        String str3 = "k_ver";
                        if (!TextUtils.isEmpty(str)) {
                            String[] split = str.split(":");
                            if (split.length > 1) {
                                str3 = "k_ver_" + split[1];
                            }
                        }
                        sharedPreferences.edit().putString(str3, str2).apply();
                    } catch (Exception e) {
                        UCrash.a().a("UCrash", "save app ver failed", e);
                    }
                }
                cVar.d = a2;
            }
        });
    }

    static c a() {
        return r;
    }

    private c() {
    }

    public final Map<String, String> b() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f13995q) {
            linkedHashMap = new LinkedHashMap(this.f13995q);
        }
        return linkedHashMap;
    }
}
