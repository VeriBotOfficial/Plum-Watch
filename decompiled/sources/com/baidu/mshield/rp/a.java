package com.baidu.mshield.rp;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.utility.c;

/* compiled from: ReportHeader.java */
/* loaded from: classes13.dex */
public class a {
    public static String a(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
            String m = a2.m();
            try {
                if (!TextUtils.isEmpty(m)) {
                    a2.g("");
                }
                return c.a(context);
            } catch (Throwable th) {
                th = th;
                str = m;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String b(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
            String s = a2.s();
            try {
                if (!TextUtils.isEmpty(s)) {
                    a2.k("");
                }
                return c.e(context);
            } catch (Throwable th) {
                th = th;
                str = s;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String c(Context context) {
        String str = "";
        try {
            com.baidu.mshield.sharedpreferences.a a2 = com.baidu.mshield.sharedpreferences.a.a(context);
            String u = a2.u();
            try {
                if (!TextUtils.isEmpty(u)) {
                    a2.l("");
                }
                return c.f(context);
            } catch (Throwable th) {
                th = th;
                str = u;
                com.baidu.mshield.utility.a.a(th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
