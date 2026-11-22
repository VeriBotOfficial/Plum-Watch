package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Locale;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static Context f19713a = null;
    private static boolean b = true;

    public static Drawable a(Context context, int i) {
        if (context != null) {
            try {
                return d(context, i);
            } catch (Exception unused) {
                a("Activity context getDrawable failed. the resId is " + Integer.toHexString(i));
                try {
                    return d(b(context), i);
                } catch (Exception unused2) {
                    a("Application context getDrawable failed. the resId is " + Integer.toHexString(i));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0020 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.view.View a(android.content.Context r2, int r3, android.view.ViewGroup r4, boolean r5) {
        /*
            if (r2 == 0) goto L1d
            android.view.View r0 = b(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L7
            goto L1e
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Self context inflateView failed. the resId is "
            r0.<init>(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            a(r0)
        L1d:
            r0 = 0
        L1e:
            if (r0 != 0) goto L3f
            android.content.Context r2 = b(r2)     // Catch: java.lang.Exception -> L29
            android.view.View r0 = b(r2, r3, r4, r5)     // Catch: java.lang.Exception -> L29
            goto L3f
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "Application context inflateView failed. the resId is "
            r2.<init>(r4)
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            a(r2)
        L3f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.utils.a.a(android.content.Context, int, android.view.ViewGroup, boolean):android.view.View");
    }

    public static String a(Context context, int i, Locale locale) {
        CharSequence b2 = b(context, i, locale);
        if (b2 != null) {
            return b2.toString();
        }
        return null;
    }

    public static String a(Context context, int i, Object... objArr) {
        try {
            return b(context, i, objArr);
        } catch (Exception unused) {
            a("Activity context getString failed. the resId is " + Integer.toHexString(i));
            try {
                return b(b(context), i, objArr);
            } catch (Exception unused2) {
                a("Application context getString failed. the resId is " + Integer.toHexString(i));
                return "";
            }
        }
    }

    private static void a(Context context) {
        if (b) {
            b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                f19713a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private static void a(String str) {
        sg.bigo.ads.common.t.a.a(0, "BigoAAB", String.valueOf(str));
    }

    public static int b(Context context, int i) {
        try {
            return e(context, i);
        } catch (Exception unused) {
            a("Activity context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i));
            try {
                return e(b(context), i);
            } catch (Exception unused2) {
                a("Application context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i));
                return 0;
            }
        }
    }

    private static Context b(Context context) {
        a(context);
        Context context2 = f19713a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    private static View b(Context context, int i, ViewGroup viewGroup, boolean z) {
        try {
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        } catch (Exception unused) {
            c(context);
            return LayoutInflater.from(context).inflate(i, viewGroup, z);
        }
    }

    public static CharSequence b(Context context, int i, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i);
    }

    private static String b(Context context, int i, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    return context.getString(i, objArr);
                }
            } catch (Exception unused) {
                c(context);
                return (objArr == null || objArr.length <= 0) ? context.getString(i) : context.getString(i, objArr);
            }
        }
        return context.getString(i);
    }

    public static int c(Context context, int i) {
        try {
            return f(context, i);
        } catch (Exception unused) {
            a("Activity context getColor failed. the resId is " + Integer.toHexString(i));
            try {
                return f(b(context), i);
            } catch (Exception unused2) {
                a("Application context getColor failed. the resId is " + Integer.toHexString(i));
                return 0;
            }
        }
    }

    private static void c(Context context) {
        try {
            SplitCompat.install(context);
        } catch (Throwable unused) {
            a("SplitCompact not found.");
        }
    }

    private static Drawable d(Context context, int i) {
        try {
            return context.getResources().getDrawable(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDrawable(i);
        }
    }

    private static int e(Context context, int i) {
        try {
            return context.getResources().getDimensionPixelSize(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDimensionPixelSize(i);
        }
    }

    private static int f(Context context, int i) {
        try {
            return context.getResources().getColor(i);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getColor(i);
        }
    }
}
