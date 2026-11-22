package com.huawei.hms.scankit.aiscan.common;

import java.util.List;

/* compiled from: Util.java */
/* loaded from: classes14.dex */
public class E {
    public static List<x> a(List<x> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int size = list.size() - 1; size > i; size--) {
                if (list.get(i).i().equals(list.get(size).i()) && a(r2.h(), r3.h()) > 0.5d) {
                    list.remove(size);
                }
            }
        }
        return list;
    }

    public static float a(z[] zVarArr, z[] zVarArr2) {
        float f = Float.MIN_VALUE;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MIN_VALUE;
        float f4 = Float.MIN_VALUE;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (z zVar : zVarArr) {
            if (zVar.b() > f3) {
                f3 = zVar.b();
            }
            if (zVar.b() < f5) {
                f5 = zVar.b();
            }
            if (zVar.c() > f4) {
                f4 = zVar.c();
            }
            if (zVar.c() < f6) {
                f6 = zVar.c();
            }
        }
        float f7 = Float.MIN_VALUE;
        float f8 = Float.MAX_VALUE;
        for (z zVar2 : zVarArr2) {
            if (zVar2.b() > f) {
                f = zVar2.b();
            }
            if (zVar2.b() < f2) {
                f2 = zVar2.b();
            }
            if (zVar2.c() > f7) {
                f7 = zVar2.c();
            }
            if (zVar2.c() < f8) {
                f8 = zVar2.c();
            }
        }
        float f9 = (f < f3 ? f : f3) - (f2 > f5 ? f2 : f5);
        float f10 = (f7 < f4 ? f7 : f4) - (f8 > f6 ? f8 : f6);
        if (f9 < 0.0f) {
            f9 = 0.0f;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        float f11 = f9 * f10;
        return f11 / ((((f3 - f5) * (f4 - f6)) + ((f - f2) * (f7 - f8))) - f11);
    }
}
