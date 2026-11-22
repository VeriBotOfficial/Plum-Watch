package com.qumeng.overseas.advlib.__remote__.core;

import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static final List<String> f12835a = a();
    public static final List<String> b = b();
    public static final List<String> c = Arrays.asList(new String[0]);

    private static List<String> a() {
        try {
            Field declaredField = f.class.getClassLoader().loadClass("com.qumeng.overseas.advlib.core.SDKFlag").getDeclaredField("SDK_FLAG");
            declaredField.setAccessible(true);
            List<String> list = (List) declaredField.get(null);
            if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a((Collection<? extends Object>) list)) {
                return list;
            }
        } catch (Exception unused) {
        }
        return Collections.emptyList();
    }

    private static List<String> b() {
        try {
            Field declaredField = f.class.getClassLoader().loadClass("com.qumeng.overseas.advlib.core.SDKFlag").getDeclaredField("SDK_MANIFEST_FLAG");
            declaredField.setAccessible(true);
            List<String> list = (List) declaredField.get(null);
            if (!com.qumeng.overseas.advlib.__remote__.core.proto.utils.d.a((Collection<? extends Object>) list)) {
                return list;
            }
        } catch (Exception unused) {
        }
        return Collections.emptyList();
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return c.contains(str) || f12835a.contains(str) || b.contains(str);
    }
}
