package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public final class wa {
    public static String a(List list) {
        Object obj;
        Object obj2;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((e5) obj).a() == f5.c) {
                    break;
                }
            }
            e5 e5Var = (e5) obj;
            if (e5Var != null && (obj2 = e5Var.b().get(f5.c.a())) != null) {
                return obj2.toString();
            }
        }
        return null;
    }
}
