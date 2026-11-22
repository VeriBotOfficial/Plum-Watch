package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    private static r f14800a;

    /* renamed from: a, reason: collision with other field name */
    private Context f1086a;

    /* renamed from: a, reason: collision with other field name */
    private List<String> f1087a = new ArrayList();
    private final List<String> b = new ArrayList();
    private final List<String> c = new ArrayList();

    public static r a(Context context) {
        if (f14800a == null) {
            f14800a = new r(context);
        }
        return f14800a;
    }

    private r(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f1086a = applicationContext;
        if (applicationContext == null) {
            this.f1086a = context;
        }
        SharedPreferences sharedPreferences = this.f1086a.getSharedPreferences("mipush_app_info", 0);
        for (String str : sharedPreferences.getString("unregistered_pkg_names", "").split(",")) {
            if (TextUtils.isEmpty(str)) {
                this.f1087a.add(str);
            }
        }
        for (String str2 : sharedPreferences.getString("disable_push_pkg_names", "").split(",")) {
            if (!TextUtils.isEmpty(str2)) {
                this.b.add(str2);
            }
        }
        for (String str3 : sharedPreferences.getString("disable_push_pkg_names_cache", "").split(",")) {
            if (!TextUtils.isEmpty(str3)) {
                this.c.add(str3);
            }
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12479a(String str) {
        boolean contains;
        synchronized (this.f1087a) {
            contains = this.f1087a.contains(str);
        }
        return contains;
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12480b(String str) {
        boolean contains;
        synchronized (this.b) {
            contains = this.b.contains(str);
        }
        return contains;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12481c(String str) {
        boolean contains;
        synchronized (this.c) {
            contains = this.c.contains(str);
        }
        return contains;
    }

    public void a(String str) {
        synchronized (this.f1087a) {
            if (!this.f1087a.contains(str)) {
                this.f1087a.add(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bc.a(this.f1087a, ",")).commit();
            }
        }
    }

    public void b(String str) {
        synchronized (this.b) {
            if (!this.b.contains(str)) {
                this.b.add(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bc.a(this.b, ",")).commit();
            }
        }
    }

    public void c(String str) {
        synchronized (this.c) {
            if (!this.c.contains(str)) {
                this.c.add(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bc.a(this.c, ",")).commit();
            }
        }
    }

    public void d(String str) {
        synchronized (this.f1087a) {
            if (this.f1087a.contains(str)) {
                this.f1087a.remove(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("unregistered_pkg_names", com.xiaomi.push.bc.a(this.f1087a, ",")).commit();
            }
        }
    }

    public void e(String str) {
        synchronized (this.b) {
            if (this.b.contains(str)) {
                this.b.remove(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names", com.xiaomi.push.bc.a(this.b, ",")).commit();
            }
        }
    }

    public void f(String str) {
        synchronized (this.c) {
            if (this.c.contains(str)) {
                this.c.remove(str);
                this.f1086a.getSharedPreferences("mipush_app_info", 0).edit().putString("disable_push_pkg_names_cache", com.xiaomi.push.bc.a(this.c, ",")).commit();
            }
        }
    }
}
