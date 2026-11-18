package com.pgl.ssdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class at {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f12742a;

    public static class a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f12743a;
        public final T b;
    }

    static {
        HashMap map = new HashMap();
        f12742a = map;
        Class cls = Boolean.TYPE;
        map.put(Boolean.class, cls);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        Class cls2 = Integer.TYPE;
        map.put(Integer.class, cls2);
        Class cls3 = Float.TYPE;
        map.put(Float.class, cls3);
        Class cls4 = Long.TYPE;
        map.put(Long.class, cls4);
        map.put(Double.class, Double.TYPE);
        map.put(cls, cls);
        Class cls5 = Byte.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Character.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Short.TYPE;
        map.put(cls7, cls7);
        map.put(cls2, cls2);
        map.put(cls3, cls3);
        map.put(cls4, cls4);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static void a(String str, String str2, Object... objArr) {
        try {
            a(Class.forName(str), str2, objArr);
        } catch (Exception unused) {
        }
    }

    private static Object[] b(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Object[] objArr2 = new Object[objArr.length];
        for (int r1 = 0; r1 < objArr.length; r1++) {
            Object obj = objArr[r1];
            if (obj == null || !(obj instanceof a)) {
                objArr2[r1] = obj;
            } else {
                objArr2[r1] = ((a) obj).b;
            }
        }
        return objArr2;
    }

    private static Method a(Class<?> cls, String str, Class... clsArr) throws NoSuchMethodException, SecurityException {
        Method methodA = a(cls.getDeclaredMethods(), str, (Class<?>[]) clsArr);
        if (methodA == null) {
            if (cls.getSuperclass() != null) {
                return a((Class<?>) cls.getSuperclass(), str, clsArr);
            }
            throw new NoSuchMethodException();
        }
        methodA.setAccessible(true);
        return methodA;
    }

    private static Method a(Method[] methodArr, String str, Class<?>[] clsArr) {
        if (str != null) {
            for (Method method : methodArr) {
                if (method.getName().equals(str) && a(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        }
        throw new NullPointerException("Method name must not be null.");
    }

    private static boolean a(Class<?>[] clsArr, Class<?>[] clsArr2) {
        if (clsArr == null) {
            return clsArr2 == null || clsArr2.length == 0;
        }
        if (clsArr2 == null) {
            return clsArr.length == 0;
        }
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int r2 = 0; r2 < clsArr.length; r2++) {
            if (!clsArr[r2].isAssignableFrom(clsArr2[r2])) {
                Map<Class<?>, Class<?>> map = f12742a;
                if (!map.containsKey(clsArr[r2]) || !map.get(clsArr[r2]).equals(map.get(clsArr2[r2]))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void a(Class<?> cls, String str, Object... objArr) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        a(cls, str, (Class[]) a(objArr)).invoke(null, b(objArr));
    }

    private static Class<?>[] a(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return null;
        }
        Class<?>[] clsArr = new Class[objArr.length];
        for (int r2 = 0; r2 < objArr.length; r2++) {
            Object obj = objArr[r2];
            if (obj != null && (obj instanceof a)) {
                clsArr[r2] = ((a) obj).f12743a;
            } else {
                clsArr[r2] = obj == null ? null : obj.getClass();
            }
        }
        return clsArr;
    }
}
