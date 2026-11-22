package com.alipay.sdk.m.g;

import com.autonavi.aps.amapapi.config.Const;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static List<i> f1384a;

    static {
        ArrayList arrayList = new ArrayList();
        f1384a = arrayList;
        arrayList.add(new l());
        f1384a.add(new d());
        f1384a.add(new c());
        f1384a.add(new h());
        f1384a.add(new k());
        f1384a.add(new b());
        f1384a.add(new a());
        f1384a.add(new g());
    }

    public static final <T> T a(Object obj, Type type) {
        T t;
        for (i iVar : f1384a) {
            if (iVar.a(com.alipay.sdk.m.h.a.a(type)) && (t = (T) iVar.a(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    public static final Object a(String str, Type type) {
        Object bVar;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            bVar = new org.json.alipay.a(trim);
        } else {
            if (!trim.startsWith(Const.STR_MART_JSON_BEGIN) || !trim.endsWith("}")) {
                return a((Object) trim, type);
            }
            bVar = new org.json.alipay.b(trim);
        }
        return a(bVar, type);
    }
}
