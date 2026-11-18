package com.apm.insight.h;

import android.util.Log;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: JavaCalls.java */
/* JADX INFO: loaded from: classes16.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Class<?>, Class<?>> f6033a;

    /* JADX INFO: renamed from: com.apm.insight.h.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: JavaCalls.java */
    public static class C0382a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<? extends T> f6034a;
        public final T b;
    }

    static {
        HashMap map = new HashMap();
        f6033a = map;
        map.put(Boolean.class, Boolean.TYPE);
        map.put(Byte.class, Byte.TYPE);
        map.put(Character.class, Character.TYPE);
        map.put(Short.class, Short.TYPE);
        map.put(Integer.class, Integer.TYPE);
        map.put(Float.class, Float.TYPE);
        map.put(Long.class, Long.TYPE);
        map.put(Double.class, Double.TYPE);
        Class cls = Boolean.TYPE;
        map.put(cls, cls);
        Class cls2 = Byte.TYPE;
        map.put(cls2, cls2);
        Class cls3 = Character.TYPE;
        map.put(cls3, cls3);
        Class cls4 = Short.TYPE;
        map.put(cls4, cls4);
        Class cls5 = Integer.TYPE;
        map.put(cls5, cls5);
        Class cls6 = Float.TYPE;
        map.put(cls6, cls6);
        Class cls7 = Long.TYPE;
        map.put(cls7, cls7);
        Class cls8 = Double.TYPE;
        map.put(cls8, cls8);
    }

    public static <T> T a(String str, String str2, Object... objArr) {
        Method method;
        Class<?>[] parameterTypes;
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName(str);
            Class<?>[] clsArr = new Class[4];
            for (int r6 = 0; r6 < 4; r6++) {
                Object obj = objArr[r6];
                if (obj != null && (obj instanceof C0382a)) {
                    cls = ((C0382a) obj).f6034a;
                } else {
                    cls = obj == null ? null : obj.getClass();
                }
                clsArr[r6] = cls;
            }
            while (true) {
                Method[] declaredMethods = cls2.getDeclaredMethods();
                int length = declaredMethods.length;
                int r8 = 0;
                while (true) {
                    if (r8 >= length) {
                        method = null;
                        break;
                    }
                    method = declaredMethods[r8];
                    if (method.getName().equals(str2) && (parameterTypes = method.getParameterTypes()) != null && parameterTypes.length == 4) {
                        int r11 = 0;
                        while (true) {
                            if (r11 >= parameterTypes.length) {
                                break;
                            }
                            if (!parameterTypes[r11].isAssignableFrom(clsArr[r11])) {
                                Map<Class<?>, Class<?>> map = f6033a;
                                if (!map.containsKey(parameterTypes[r11]) || !map.get(parameterTypes[r11]).equals(map.get(clsArr[r11]))) {
                                    break;
                                    break;
                                }
                            }
                            r11++;
                        }
                    }
                    r8++;
                }
                if (method == null) {
                    if (cls2.getSuperclass() != null) {
                        cls2 = cls2.getSuperclass();
                    } else {
                        throw new NoSuchMethodException();
                    }
                } else {
                    method.setAccessible(true);
                    Object[] objArr2 = new Object[4];
                    for (int r5 = 0; r5 < 4; r5++) {
                        Object obj2 = objArr[r5];
                        if (obj2 != null && (obj2 instanceof C0382a)) {
                            objArr2[r5] = ((C0382a) obj2).b;
                        } else {
                            objArr2[r5] = obj2;
                        }
                    }
                    return (T) method.invoke(null, objArr2);
                }
            }
        } catch (Exception e) {
            Log.w("JavaCalls", "Meet exception when call Method '" + str2 + "' in " + str, e);
            return null;
        }
    }
}
