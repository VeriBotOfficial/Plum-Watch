package com.baidu.platform.comapi.walknavi.g.i;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: ResourceLoadPrefs.java */
/* loaded from: classes13.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8728a;

    public d(Context context) {
        this.f8728a = context;
    }

    public void a(String str, String str2) {
        try {
            a().edit().putString(str, str2).apply();
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("saveLocalResourcePath exception");
        }
    }

    public String a(String str) {
        return a().getString(str, "");
    }

    private SharedPreferences a() {
        return this.f8728a.getSharedPreferences("ar_resource_info", 0);
    }
}
