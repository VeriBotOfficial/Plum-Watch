package com.baidu.platform.comapi.wnplatform.p;

import android.content.SharedPreferences;

/* compiled from: WNaviPreference.java */
/* loaded from: classes13.dex */
public class n extends com.baidu.platform.comapi.walknavi.a {
    private SharedPreferences.Editor b = null;

    /* renamed from: a, reason: collision with root package name */
    private SharedPreferences f8959a = com.baidu.platform.comapi.wnplatform.p.q.a.a().getSharedPreferences("walknavi_preference", 0);

    public String a(String str, String str2) {
        return this.f8959a.getString(str, str2);
    }

    public boolean b(String str, boolean z) {
        SharedPreferences.Editor edit = this.f8959a.edit();
        this.b = edit;
        edit.putBoolean(str, z);
        return this.b.commit();
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public boolean ready() {
        return true;
    }

    @Override // com.baidu.platform.comapi.walknavi.a
    public void release() {
    }

    public boolean a(String str, boolean z) {
        return this.f8959a.getBoolean(str, z);
    }

    public boolean b(String str, String str2) {
        SharedPreferences.Editor edit = this.f8959a.edit();
        this.b = edit;
        edit.putString(str, str2);
        return this.b.commit();
    }
}
