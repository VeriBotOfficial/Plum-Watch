package com.alipay.sdk.m.y;

import android.content.Context;
import android.net.NetworkInfo;
import android.text.TextUtils;

/* loaded from: classes11.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1481a = "00:00:00:00:00:00";
    public static d b;

    public d(Context context) {
    }

    public static d b(Context context) {
        if (b == null) {
            b = new d(context);
        }
        return b;
    }

    public String a() {
        String str = b() + "|";
        String c = c();
        return TextUtils.isEmpty(c) ? str + "000000000000000" : str + c;
    }

    public String c() {
        return "000000000000000";
    }

    public String d() {
        return "00:00:00:00:00:00";
    }

    public static i d(Context context) {
        try {
            NetworkInfo a2 = com.alipay.sdk.m.a0.b.a(null, context);
            return (a2 == null || a2.getType() != 0) ? (a2 == null || a2.getType() != 1) ? i.NONE : i.WIFI : i.a(a2.getSubtype());
        } catch (Exception unused) {
            return i.NONE;
        }
    }

    public static String c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public String b() {
        return "000000000000000";
    }

    public static String a(Context context) {
        return b(context).a().substring(0, 8);
    }
}
