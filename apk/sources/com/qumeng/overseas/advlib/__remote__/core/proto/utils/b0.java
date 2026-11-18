package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f12851a = Pattern.compile("^[-\\+]?[\\d]*$");

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T a(Object obj, Class<T> cls, T t) {
        return (cls == null || obj == 0 || !(cls == obj.getClass() || cls.isAssignableFrom(obj.getClass()))) ? t : obj;
    }

    public static long b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0L;
            }
            return Long.valueOf(str).longValue();
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f12851a.matcher(str).matches();
    }

    public static <T> T a(Object obj, Class<T> cls) {
        return (T) a(obj, cls, null);
    }

    public static <T extends Integer> int a(T t) {
        if (t != null) {
            return t.intValue();
        }
        return 0;
    }

    public static int a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            return Integer.valueOf(str).intValue();
        } catch (NumberFormatException unused) {
            return 0;
        }
    }
}
