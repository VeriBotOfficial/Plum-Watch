package com.amap.api.col.p0003sl;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.os.Looper;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: Log.java */
/* loaded from: classes11.dex */
public class ga {

    /* renamed from: a, reason: collision with root package name */
    private static long f1669a;
    private static Vector<l9> b = new Vector<>();
    public static final /* synthetic */ int c = 0;

    /* compiled from: Log.java */
    static class a extends qc {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f1670a;

        a(Context context) {
            this.f1670a = context;
        }

        @Override // com.amap.api.col.p0003sl.qc
        public final void runTask() {
            try {
                ka.b(this.f1670a);
                ka.d(this.f1670a);
                ka.c(this.f1670a);
                zb.a(this.f1670a);
                xb.a(this.f1670a);
            } catch (RejectedExecutionException unused) {
            } catch (Throwable th) {
                ja.a(th, "Lg", "proL");
            }
        }
    }

    public static String a(Context context, String str) {
        return context.getFilesDir().getAbsolutePath() + "/a/" + str;
    }

    public static String b(Context context, String str) {
        return context.getSharedPreferences("AMSKLG_CFG", 0).getString(str, "");
    }

    public static void a(Context context) {
        try {
            if (System.currentTimeMillis() - f1669a < 60000) {
                return;
            }
            f1669a = System.currentTimeMillis();
            pc.d().b(new a(context));
        } catch (Throwable th) {
            ja.a(th, "Lg", "proL");
        }
    }

    public static void a(l9 l9Var) {
        try {
            synchronized (Looper.getMainLooper()) {
                if (l9Var == null) {
                    return;
                }
                if (b.contains(l9Var)) {
                    return;
                }
                b.add(l9Var);
            }
        } catch (Throwable unused) {
        }
    }

    static List<l9> a() {
        Vector<l9> vector;
        try {
            synchronized (Looper.getMainLooper()) {
                vector = b;
            }
            return vector;
        } catch (Throwable th) {
            th.printStackTrace();
            return b;
        }
    }

    static boolean a(String[] strArr, String str) {
        if (strArr != null && str != null) {
            try {
                for (String str2 : strArr) {
                    str = str.trim();
                    if (str.startsWith("at ") && str.contains(str2 + ".") && str.endsWith(Separators.RPAREN) && !str.contains("uncaughtException")) {
                        return true;
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }
}
