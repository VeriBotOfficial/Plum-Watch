package io.appmetrica.analytics.impl;

import java.util.HashMap;

/* loaded from: classes6.dex */
public final class Lb implements InterfaceC3411n2 {

    /* renamed from: a, reason: collision with root package name */
    public final D4 f17955a;

    public Lb(D4 d4) {
        this.f17955a = d4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3411n2
    public final Cn a(An an, Cn cn) {
        int i = an.b;
        int i2 = this.f17955a.f17809a;
        if (i == i2) {
            if (((Cn) ((HashMap) an.f17772a.get(cn.b)).get(new String(cn.f17803a))) != null) {
                ((HashMap) an.f17772a.get(cn.b)).put(new String(cn.f17803a), cn);
                return cn;
            }
        } else if (i < i2) {
            ((HashMap) an.f17772a.get(cn.b)).put(new String(cn.f17803a), cn);
            an.b++;
        }
        return cn;
    }
}
