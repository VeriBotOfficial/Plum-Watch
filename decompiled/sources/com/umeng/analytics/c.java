package com.umeng.analytics;

import android.content.Context;
import android.text.TextUtils;

/* compiled from: InternalConfig.java */
/* loaded from: classes2.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String[] f13768a = new String[2];

    public static void a(Context context, String str, String str2) {
        String[] strArr = f13768a;
        strArr[0] = str;
        strArr[1] = str2;
        if (context != null) {
            com.umeng.common.b.a(context).a(str, str2);
        }
    }

    public static String[] a(Context context) {
        String[] a2;
        if (!TextUtils.isEmpty(f13768a[0]) && !TextUtils.isEmpty(f13768a[1])) {
            return f13768a;
        }
        if (context == null || (a2 = com.umeng.common.b.a(context).a()) == null) {
            return null;
        }
        String[] strArr = f13768a;
        strArr[0] = a2[0];
        strArr[1] = a2[1];
        return strArr;
    }

    public static void b(Context context) {
        String[] strArr = f13768a;
        strArr[0] = null;
        strArr[1] = null;
        if (context != null) {
            com.umeng.common.b.a(context).b();
        }
    }
}
