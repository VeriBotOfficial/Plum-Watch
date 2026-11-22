package com.amap.location.support.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public class ReflectUtil {
    public static Object getFiledValue(Object obj, String str) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    public static int getStaticIntProp(String str, String str2) throws Exception {
        return ((Integer) getStaticProp(str, str2)).intValue();
    }

    public static Object getStaticProp(String str, String str2) throws Exception {
        Class<?> cls = Class.forName(str);
        Field field = cls.getField(str2);
        field.setAccessible(true);
        return field.get(cls);
    }

    public static int invokeIntMethod(Object obj, String str, Object... objArr) throws Exception {
        Class<?> cls = obj.getClass();
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = objArr[i].getClass();
            clsArr[i] = cls2;
            if (cls2 == Integer.class) {
                clsArr[i] = Integer.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return ((Integer) declaredMethod.invoke(obj, objArr)).intValue();
    }

    public static Object invokeMethod(Object obj, String str, Object... objArr) throws Exception {
        Class<?> cls = obj.getClass();
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = objArr[i].getClass();
            clsArr[i] = cls2;
            if (cls2 == Integer.class) {
                clsArr[i] = Integer.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(obj, objArr);
    }

    public static Object invokeStaticMethod(String str, String str2, Object[] objArr, Class<?>[] clsArr) throws Exception {
        Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(null, objArr);
    }

    public static Object invokeVoidParameterStaticMethod(String str, String str2) throws Exception {
        Method declaredMethod = Class.forName(str).getDeclaredMethod(str2, new Class[0]);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(null, new Object[0]);
    }

    public static Object newInstance(String str, Object... objArr) throws Exception {
        Class<?> cls = Class.forName(str);
        Class<?>[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = objArr[i].getClass();
        }
        return cls.getConstructor(clsArr).newInstance(objArr);
    }

    public static void setFiledValue(Object obj, String str, Object obj2) throws Exception {
        Field declaredField = obj.getClass().getDeclaredField(str);
        declaredField.setAccessible(true);
        declaredField.set(obj, obj2);
    }

    public static final boolean testClassExistence(String str) {
        if (str == null) {
            return false;
        }
        try {
            Class.forName(str, false, ClassLoader.getSystemClassLoader());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static Object invokeStaticMethod(Class<?> cls, String str, Object... objArr) throws Exception {
        Class<?>[] clsArr = new Class[objArr.length];
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Class<?> cls2 = objArr[i].getClass();
            clsArr[i] = cls2;
            if (cls2 == Integer.class) {
                clsArr[i] = Integer.TYPE;
            } else if (cls2 == Long.class) {
                clsArr[i] = Long.TYPE;
            } else if (cls2 == Short.class) {
                clsArr[i] = Short.TYPE;
            }
        }
        Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
        if (!declaredMethod.isAccessible()) {
            declaredMethod.setAccessible(true);
        }
        return declaredMethod.invoke(null, objArr);
    }
}
