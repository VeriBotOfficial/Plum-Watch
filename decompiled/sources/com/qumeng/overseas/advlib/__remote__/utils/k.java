package com.qumeng.overseas.advlib.__remote__.utils;

import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, Map<String, Field>> f13236a = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, Map<Field, String>> b = new ConcurrentHashMap<>();
    private static ConcurrentHashMap<String, List<Field>> c = new ConcurrentHashMap<>();

    private static Map<String, Field> a(Class cls) {
        Field[] fields = cls.getFields();
        HashMap hashMap = new HashMap();
        for (Field field : fields) {
            JSONBeanFrm.a aVar = (JSONBeanFrm.a) field.getAnnotation(JSONBeanFrm.a.class);
            if (aVar != null && aVar.marshallable() && !TextUtils.isEmpty(aVar.fieldname())) {
                hashMap.put(aVar.fieldname(), field);
            }
        }
        return hashMap;
    }

    public static Map<String, Field> b(Class cls) {
        String name = cls.getName();
        if (f13236a.containsKey(name)) {
            return f13236a.get(name);
        }
        Map<String, Field> a2 = a(cls);
        b.put(name, new h.b().putReverseMap(a2).getMap());
        f13236a.put(name, a2);
        return a2;
    }

    public static List<Field> c(Class cls) {
        String name = cls.getName();
        if (c.containsKey(name)) {
            return c.get(name);
        }
        List<Field> e = e(cls);
        c.put(name, e);
        return e;
    }

    public static Map<Field, String> d(Class cls) {
        String name = cls.getName();
        if (b.containsKey(name)) {
            return b.get(name);
        }
        Map<String, Field> a2 = a(cls);
        Map<Field, String> map = new h.b().putReverseMap(a2).getMap();
        b.put(name, map);
        f13236a.put(name, a2);
        return map;
    }

    private static List<Field> e(Class cls) {
        Field[] fields = cls.getFields();
        ArrayList arrayList = new ArrayList();
        for (Field field : fields) {
            JSONBeanFrm.a aVar = (JSONBeanFrm.a) field.getAnnotation(JSONBeanFrm.a.class);
            if (aVar != null && !aVar.marshallable()) {
                arrayList.add(field);
            }
        }
        return arrayList;
    }
}
