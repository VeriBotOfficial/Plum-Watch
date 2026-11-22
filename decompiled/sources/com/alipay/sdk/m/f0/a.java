package com.alipay.sdk.m.f0;

import android.content.Context;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static a f1378a = new a();

    public static a a() {
        return f1378a;
    }

    public String a(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 16).versionName;
        } catch (Exception unused) {
            return "0.0.0";
        }
    }
}
