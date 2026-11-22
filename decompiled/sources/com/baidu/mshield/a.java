package com.baidu.mshield;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: PluginPreferences.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public SharedPreferences f8412a;
    public SharedPreferences.Editor b;

    public a(Context context) {
        try {
            SharedPreferences c = com.baidu.mshield.sharedpreferences.a.a(context).c("msgzpfc");
            this.f8412a = c;
            this.b = c.edit();
        } catch (Throwable th) {
            com.baidu.mshield.b.c.a.c(th.getMessage());
        }
    }

    public boolean a() {
        return this.f8412a.getInt("cloud_sw", 0) == 1;
    }

    public int b() {
        return this.f8412a.getInt("wm_in_ma_cco", 3);
    }

    public void a(String str, int i) {
        this.b.putInt("wm_in_cco" + str, i);
        this.b.commit();
    }

    public int a(String str) {
        return this.f8412a.getInt("wm_in_cco" + str, 0);
    }
}
