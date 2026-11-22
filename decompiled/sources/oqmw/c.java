package oqmw;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes8.dex */
public class c {
    private static Object a(Object obj) {
        Object obj2;
        Object a2;
        try {
            for (Field field : obj.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.getType().isInterface() && (obj2 = field.get(obj)) != null) {
                    Object a3 = a(obj2, "dsp_id", "oid");
                    if (a3 != null) {
                        return a3;
                    }
                    for (Field field2 : obj2.getClass().getDeclaredFields()) {
                        field2.setAccessible(true);
                        Object obj3 = field2.get(obj2);
                        if (obj3 != null && !b(obj3.getClass()) && (a2 = a(obj3, "dsp_id", "oid")) != null) {
                            return a2;
                        }
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Object b(Object obj) {
        Class cls = null;
        if (obj == null) {
            return null;
        }
        try {
            Field[] declaredFields = obj.getClass().getDeclaredFields();
            HashMap hashMap = new HashMap();
            for (Field field : declaredFields) {
                Class<?> type = field.getType();
                if (!b(type)) {
                    Integer num = (Integer) hashMap.get(type);
                    if (num == null) {
                        hashMap.put(type, 1);
                    } else {
                        hashMap.put(type, Integer.valueOf(num.intValue() + 1));
                    }
                }
            }
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Integer) entry.getValue()).intValue() == 2) {
                    cls = (Class) entry.getKey();
                    break;
                }
            }
            if (cls == null) {
                return "Error: Could not find ad class type";
            }
            for (Field field2 : declaredFields) {
                if (field2.getType().equals(cls)) {
                    field2.setAccessible(true);
                    Object obj2 = field2.get(obj);
                    if (obj2 == null) {
                        continue;
                    } else {
                        Object a2 = a(obj2, "dsp_id", "oid");
                        if (a2 != null) {
                            return a2;
                        }
                        Object a3 = a(obj2);
                        if (a3 != null) {
                            return a3;
                        }
                    }
                }
            }
            return "Error:Not found dsp_id/oid data";
        } catch (Throwable th) {
            return "Error: " + th.getLocalizedMessage();
        }
    }

    private static Object a(Object obj, String str, String str2) {
        if (obj == null || b(obj.getClass())) {
            return null;
        }
        try {
            for (Field field : a(obj.getClass())) {
                field.setAccessible(true);
                Object obj2 = field.get(obj);
                if (obj2 != null) {
                    String obj3 = obj2.toString();
                    if (obj3.contains(str) && obj3.contains(str2)) {
                        return obj2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    private static List<Field> a(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.getName().startsWith("java.")) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }

    private static boolean b(Class<?> cls) {
        return cls.isPrimitive() || cls.getName().startsWith("java.") || cls.getName().startsWith("android.") || cls.getName().startsWith("org.json");
    }
}
