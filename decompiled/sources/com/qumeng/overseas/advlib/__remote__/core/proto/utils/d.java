package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.text.TextUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class d {
    public static <T> T a(T t, T t2) {
        return t == null ? t2 : t;
    }

    public static boolean a(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean b(String str) {
        return TextUtils.isEmpty(str);
    }

    public static <T> boolean c(T t) {
        return !a(t);
    }

    public static boolean b(Object obj) {
        return obj == null || !obj.getClass().isArray() || Array.getLength(obj) <= 0;
    }

    public static boolean a(Collection<? extends Object> collection) {
        return collection == null || collection.size() <= 0;
    }

    public static boolean a(Map<? extends Object, ? extends Object> map) {
        return map == null || map.size() <= 0;
    }

    public static <T> boolean a(T[] tArr) {
        return tArr == null || tArr.length <= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean a(T t) {
        if (t == 0) {
            return true;
        }
        return t instanceof String ? ((String) t).length() == 0 : t instanceof List ? ((List) t).size() == 0 : t instanceof Map ? ((Map) t).size() == 0 : t instanceof JSONObject ? ((JSONObject) t).length() == 0 : (t instanceof Object[]) && ((Object[]) t).length == 0;
    }

    public static <T> T a(Object obj, int i, T t) {
        T t2;
        return (b(obj) || !obj.getClass().isArray() || Array.getLength(obj) < i || (t2 = (T) Array.get(obj, i)) == null) ? t : t2;
    }

    public static <T> T a(Map map, String str, T t) {
        return (map == null || !map.containsKey(str)) ? t : (T) map.get(str);
    }

    public static boolean a(String str) {
        int length = str.length();
        if (length == 0) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (!a(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
