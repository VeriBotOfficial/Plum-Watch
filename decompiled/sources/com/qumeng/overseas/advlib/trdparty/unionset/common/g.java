package com.qumeng.overseas.advlib.trdparty.unionset.common;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SlotIDItemConfigEntity;

/* loaded from: classes17.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13373a = "DspAdModelAdapter";

    public static double a(double d, SlotIDItemConfigEntity slotIDItemConfigEntity) {
        return slotIDItemConfigEntity != null ? (d * slotIDItemConfigEntity.getDiscount()) / 100.0d : d;
    }

    public static double a(com.qumeng.overseas.advlib.core.j jVar, double d) {
        double a2 = a(jVar);
        if (a2 > 0.0d || d < 0.0d) {
            d = a2;
        }
        n.a(f13373a, "getCpmPrice: price = " + d, new Object[0]);
        return d;
    }

    public static double a(com.qumeng.overseas.advlib.core.j jVar) {
        double d = 0.0d;
        if (jVar != null && jVar.D() > 0.0d) {
            d = jVar.D();
        }
        n.a(f13373a, "getPrice: price = " + d, new Object[0]);
        return d;
    }
}
