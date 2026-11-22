package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes5.dex */
public final class cl {
    public static pp1 a(dl dlVar) {
        ts a2;
        pp1 pp1Var = new pp1((Map) null, 3);
        pp1Var.a((dlVar == null || (a2 = dlVar.a()) == null) ? null : a2.a(), "ad_type");
        pp1Var.a(dlVar != null ? dlVar.b() : null, "parameters");
        gz1 c = dlVar != null ? dlVar.c() : null;
        if (c != null) {
            pp1Var.b(c.a().a(), "size_type");
            pp1Var.b(Integer.valueOf(c.getWidth()), "width");
            pp1Var.b(Integer.valueOf(c.getHeight()), "height");
        }
        return pp1Var;
    }
}
