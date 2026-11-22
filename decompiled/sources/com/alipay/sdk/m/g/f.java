package com.alipay.sdk.m.g;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes11.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public static List<j> f1385a;

    static {
        ArrayList arrayList = new ArrayList();
        f1385a = arrayList;
        arrayList.add(new l());
        f1385a.add(new d());
        f1385a.add(new c());
        f1385a.add(new h());
        f1385a.add(new b());
        f1385a.add(new a());
        f1385a.add(new g());
    }

    public static String a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object b = b(obj);
        if (com.alipay.sdk.m.h.a.a(b.getClass())) {
            return org.json.alipay.b.d(b.toString());
        }
        if (Collection.class.isAssignableFrom(b.getClass())) {
            return new org.json.alipay.a((Collection) b).toString();
        }
        if (Map.class.isAssignableFrom(b.getClass())) {
            return new org.json.alipay.b((Map) b).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + b.getClass());
    }

    public static Object b(Object obj) {
        Object a2;
        if (obj == null) {
            return null;
        }
        for (j jVar : f1385a) {
            if (jVar.a(obj.getClass()) && (a2 = jVar.a(obj)) != null) {
                return a2;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
