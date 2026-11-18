package com.qumeng.overseas.advlib.trdparty.unionset.utils;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class b {
    private b() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    public static boolean a(Object obj) {
        return obj != null;
    }

    public static boolean b(Object obj) {
        return obj == null;
    }

    public static boolean c(Class<?> cls) {
        return cls != null && cls.isPrimitive();
    }

    public static boolean a(Collection<?> collection) {
        return collection == null || collection.isEmpty();
    }

    public static boolean b(Collection<?> collection) {
        return !a(collection);
    }

    public static boolean a(Map<?, ?> map) {
        return map == null || map.isEmpty();
    }

    public static boolean b(Map<?, ?> map) {
        return !a(map);
    }

    public static boolean a(String str) {
        return TextUtils.isEmpty(str) || str.trim().isEmpty();
    }

    public static boolean b(String str) {
        return !a(str);
    }

    public static boolean a(Object obj, Class<?> cls) {
        if (obj == null || cls == null || !cls.isInterface()) {
            return false;
        }
        return cls.isInstance(obj);
    }

    public static boolean b(Object obj, Class<?> cls) {
        if (obj == null || cls == null) {
            return false;
        }
        return cls.isInstance(obj);
    }

    public static boolean b(Class<?> cls) {
        return cls != null && cls.isInterface();
    }

    public static boolean a(Class<?> cls) {
        return cls != null && cls.isArray();
    }
}
