package com.baidu.platform.comapi.walknavi.g.i.h;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: SoLoadPrefs.java */
/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final Context f8737a;

    public c(Context context) {
        this.f8737a = context;
    }

    public void a(String str) {
        b().edit().putString("ar_sdk_version", str).commit();
    }

    public void b(String str) {
        b().edit().putString("so_version", str).commit();
    }

    public String c() {
        return b().getString("so_version", "");
    }

    private SharedPreferences b() {
        return this.f8737a.getSharedPreferences("ar_so_info", 0);
    }

    public String a() {
        return b().getString("ar_sdk_version", "");
    }
}
