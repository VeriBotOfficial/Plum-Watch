package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.util.Log;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    private static Boolean f1288a;

    public static final boolean a(Context context) {
        Boolean bool = f1288a;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean valueOf = Boolean.valueOf((context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).flags & 2) != 0);
            f1288a = valueOf;
            return valueOf.booleanValue();
        } catch (Exception e) {
            Log.e("MiscUtils", "", e);
            return false;
        }
    }
}
