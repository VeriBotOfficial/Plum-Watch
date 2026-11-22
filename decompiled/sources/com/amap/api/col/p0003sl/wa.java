package com.amap.api.col.p0003sl;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.anythink.core.common.m.e;
import java.util.Arrays;

/* compiled from: SPUtil.java */
/* loaded from: classes11.dex */
public final class wa {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f1955a;
    static byte[] b;

    public static void a(Context context, String str, String str2, String str3) {
        byte[] bArr;
        if (context == null || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        try {
            SharedPreferences.Editor edit = context.getSharedPreferences(str, 0).edit();
            try {
                bArr = f9.c(a(context), m9.e(str3), b(context));
            } catch (Throwable unused) {
                bArr = new byte[0];
            }
            edit.putString(str2, m9.b(bArr));
            a(edit);
        } catch (Throwable unused2) {
        }
    }

    public static byte[] b(Context context, byte[] bArr) {
        try {
            return f9.b(a(context), bArr, b(context));
        } catch (Exception unused) {
            return new byte[0];
        }
    }

    private static byte[] b(Context context) {
        byte[] bArr = b;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] copyOfRange = Arrays.copyOfRange(a(context), 0, a(context).length / 2);
        b = copyOfRange;
        return copyOfRange;
    }

    public static String b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return null;
        }
        try {
            return context.getSharedPreferences(str, 0).getString(str2, str3);
        } catch (Throwable th) {
            ja.a(th, "csp", "gsv");
            return str3;
        }
    }

    public static byte[] a(Context context, byte[] bArr) {
        try {
            return f9.c(a(context), bArr, b(context));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    private static byte[] a(Context context) {
        if (context == null) {
            return new byte[0];
        }
        byte[] bArr = f1955a;
        if (bArr != null && bArr.length > 0) {
            return bArr;
        }
        byte[] bytes = z8.e(context).getBytes();
        f1955a = bytes;
        return bytes;
    }

    public static String a(Context context, String str, String str2) {
        byte[] bArr;
        try {
            try {
                bArr = f9.b(a(context), m9.c(context.getSharedPreferences(str, 0).getString(str2, "")), b(context));
            } catch (Exception unused) {
                bArr = new byte[0];
            }
            return m9.c(bArr);
        } catch (Throwable unused2) {
            return "";
        }
    }

    public static SharedPreferences.Editor a(Context context, String str) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    return context.getSharedPreferences(str, 0).edit();
                }
            } catch (Throwable th) {
                fa.a(th, "sp", "ge");
            }
        }
        return null;
    }

    public static void a(SharedPreferences.Editor editor) {
        if (editor == null) {
            return;
        }
        try {
            editor.apply();
        } catch (Throwable th) {
            fa.a(th, "sp", "cm");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, boolean z) {
        try {
            editor.putBoolean(str, z);
        } catch (Throwable th) {
            ja.a(th, "csp", "setPrefsStr");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, int i) {
        try {
            editor.putInt(str, i);
        } catch (Throwable th) {
            ja.a(th, "csp", "putPrefsInt");
        }
    }

    public static boolean a(Context context, String str, String str2, boolean z) {
        try {
            return context.getSharedPreferences(str, 0).getBoolean(str2, z);
        } catch (Throwable th) {
            ja.a(th, "csp", "gbv");
            return z;
        }
    }

    public static int a(Context context, String str, String str2, int i) {
        try {
            return context.getSharedPreferences(str, 0).getInt(str2, i);
        } catch (Throwable th) {
            ja.a(th, "csp", "giv");
            return i;
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, long j) {
        if (editor == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            editor.putLong(str, j);
        } catch (Throwable th) {
            ja.a(th, "csp", "plv");
        }
    }

    public static void a(SharedPreferences.Editor editor, String str, String str2) {
        if (editor != null) {
            try {
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    editor.putString(str, str2);
                }
            } catch (Throwable th) {
                fa.a(th, "sp", e.bc);
            }
        }
    }
}
