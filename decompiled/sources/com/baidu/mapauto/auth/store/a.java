package com.baidu.mapauto.auth.store;

import android.content.Context;
import android.content.SharedPreferences;
import com.baidu.mapauto.auth.base.d;

/* loaded from: classes13.dex */
public final class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f8318a;
    public final SharedPreferences.Editor b;

    public a(Context context) {
        SharedPreferences sharedPreferences = context == null ? null : context.getSharedPreferences("license_auth", 0);
        this.f8318a = sharedPreferences;
        this.b = sharedPreferences != null ? sharedPreferences.edit() : null;
    }
}
