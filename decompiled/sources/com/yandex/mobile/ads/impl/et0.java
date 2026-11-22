package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;

/* loaded from: classes5.dex */
public final class et0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Object f15421a = new Object();

    @Pure
    public static void c(String str, String str2) {
        synchronized (f15421a) {
            Log.i(str, str2);
        }
    }

    @Pure
    public static void d(String str, String str2) {
        synchronized (f15421a) {
            Log.w(str, str2);
        }
    }

    @Pure
    private static String a(String str, Throwable th) {
        String replace;
        synchronized (f15421a) {
            try {
                if (th != null) {
                    Throwable th2 = th;
                    while (true) {
                        if (th2 == null) {
                            replace = Log.getStackTraceString(th).trim().replace(Separators.HT, "    ");
                            break;
                        }
                        if (th2 instanceof UnknownHostException) {
                            replace = "UnknownHostException (no network)";
                        } else {
                            th2 = th2.getCause();
                        }
                    }
                } else {
                    replace = null;
                }
            } finally {
            }
        }
        return !TextUtils.isEmpty(replace) ? str + "\n  " + replace.replace("\n", "\n  ") + '\n' : str;
    }

    @Pure
    public static void b(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    @Pure
    public static void b(String str, String str2) {
        synchronized (f15421a) {
            Log.e(str, str2);
        }
    }

    @Pure
    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    @Pure
    public static void a(String str, Exception exc) {
        c("BundleUtil", a(str, (Throwable) exc));
    }

    @Pure
    public static void a(String str, String str2) {
        synchronized (f15421a) {
            Log.d(str, str2);
        }
    }
}
