package com.baidu.ar;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class b4 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6804a;

    public b4(Context context) {
        this.f6804a = context;
    }

    public String a() {
        SharedPreferences b = b();
        return b == null ? "" : b.getString("fea_res_md5", "");
    }

    public void a(String str) {
        SharedPreferences b = b();
        if (b == null || b.edit() == null) {
            return;
        }
        b.edit().putString("fea_res_md5", str).apply();
    }

    public final SharedPreferences b() {
        Context context = this.f6804a;
        if (context == null) {
            return null;
        }
        return context.getSharedPreferences("fea_res_info", 0);
    }
}
