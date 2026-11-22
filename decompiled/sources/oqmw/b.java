package oqmw;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes8.dex */
public class b {
    public static Object a(Object obj, Class<?> cls) {
        if (obj != null && cls != null) {
            try {
                for (Field field : a(obj.getClass())) {
                    field.setAccessible(true);
                    if (field.getType().equals(cls)) {
                        return field.get(obj);
                    }
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return null;
    }

    public static List<Field> a(Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        while (cls != null && !cls.getName().startsWith("java.")) {
            arrayList.addAll(Arrays.asList(cls.getDeclaredFields()));
            cls = cls.getSuperclass();
        }
        return arrayList;
    }
}
