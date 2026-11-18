package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes16.dex */
public class b4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f6804a;

    public b4(Context context) {
        this.f6804a = context;
    }

    public String a() {
        SharedPreferences sharedPreferencesB = b();
        return sharedPreferencesB == null ? "" : sharedPreferencesB.getString("fea_res_md5", "");
    }

    public void a(String str) {
        SharedPreferences sharedPreferencesB = b();
        if (sharedPreferencesB == null || sharedPreferencesB.edit() == null) {
            return;
        }
        sharedPreferencesB.edit().putString("fea_res_md5", str).apply();
    }

    public final SharedPreferences b() {
        Context context = this.f6804a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("fea_res_info", 0);
    }
}
