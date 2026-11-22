package com.amap.api.col.p0003sl;

import android.content.Context;
import android.util.Log;
import com.amap.api.map3d.R;

/* compiled from: AuthLogUtil.java */
/* loaded from: classes11.dex */
public class a4 {

    /* renamed from: a, reason: collision with root package name */
    static String f1511a;

    static {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 80; i++) {
            sb.append("=");
        }
        f1511a = sb.toString();
    }

    public static void a() {
        String a2 = n1.a(R.string.O105492_282);
        a(f1511a);
        a(a2);
        a(f1511a);
    }

    public static void b(String str) {
        a(f1511a);
        a(str);
        a(f1511a);
    }

    static void c(String str) {
        if (str.length() >= 78) {
            a("|" + str.substring(0, 78) + "|");
            c(str.substring(78));
            return;
        }
        StringBuilder sb = new StringBuilder("|");
        sb.append(str);
        for (int i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        a(sb.toString());
    }

    public static void a(Context context, String str) {
        a(f1511a);
        if (context != null) {
            c("key:" + z8.e(context));
        }
        a(str);
        a(f1511a);
    }

    private static void a(String str) {
        if (str != null) {
            Log.i("authErrLog", str);
        }
    }
}
