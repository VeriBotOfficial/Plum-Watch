package com.bytedance.sdk.component.utils;

import android.content.Context;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes15.dex */
public class zn {
    public static final Class<?>[] fxn;
    private static final HashMap<Class<?>, Class<?>> gff;
    private static Map<String, Method> kg = new HashMap();

    static {
        HashMap<Class<?>, Class<?>> map = new HashMap<>();
        gff = map;
        map.put(Boolean.TYPE, Boolean.class);
        map.put(Byte.TYPE, Byte.class);
        map.put(Character.TYPE, Character.class);
        map.put(Short.TYPE, Short.class);
        map.put(Integer.TYPE, Integer.class);
        map.put(Long.TYPE, Long.class);
        map.put(Double.TYPE, Double.class);
        map.put(Float.TYPE, Float.class);
        map.put(Void.TYPE, Void.class);
        fxn = new Class[0];
    }

    public static int fxn(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int fxn(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }
}
