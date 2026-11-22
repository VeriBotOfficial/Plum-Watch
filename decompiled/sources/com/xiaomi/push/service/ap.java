package com.xiaomi.push.service;

import android.content.Context;
import android.net.Uri;
import android.provider.Settings;

/* loaded from: classes4.dex */
public class ap {

    /* renamed from: a, reason: collision with root package name */
    private static ap f14759a;

    /* renamed from: a, reason: collision with other field name */
    private int f1025a = 0;

    /* renamed from: a, reason: collision with other field name */
    private Context f1026a;

    public static ap a(Context context) {
        if (f14759a == null) {
            f14759a = new ap(context);
        }
        return f14759a;
    }

    private ap(Context context) {
        this.f1026a = context.getApplicationContext();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m12435a() {
        return com.xiaomi.push.y.f1125a.contains("xmsf") || com.xiaomi.push.y.f1125a.contains("xiaomi") || com.xiaomi.push.y.f1125a.contains("miui");
    }

    public int a() {
        int i = this.f1025a;
        if (i != 0) {
            return i;
        }
        try {
            this.f1025a = Settings.Global.getInt(this.f1026a.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.f1025a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public Uri m12434a() {
        return Settings.Global.getUriFor("device_provisioned");
    }
}
