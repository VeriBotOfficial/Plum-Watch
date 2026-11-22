package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.BillingInfo;
import io.appmetrica.analytics.billinginterface.internal.ProductType;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;

/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3610v2 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3188e3 f18544a;

    public C3610v2() {
        this(new C3188e3());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3660x2 fromModel(C3585u2 c3585u2) {
        C3660x2 c3660x2 = new C3660x2();
        c3660x2.f18573a = new C3635w2[c3585u2.f18522a.size()];
        int i = 0;
        for (BillingInfo billingInfo : c3585u2.f18522a) {
            C3635w2[] c3635w2Arr = c3660x2.f18573a;
            this.f18544a.getClass();
            c3635w2Arr[i] = C3188e3.a(billingInfo);
            i++;
        }
        c3660x2.b = c3585u2.b;
        return c3660x2;
    }

    public C3610v2(C3188e3 c3188e3) {
        this.f18544a = c3188e3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3585u2 toModel(C3660x2 c3660x2) {
        ProductType productType;
        ArrayList arrayList = new ArrayList(c3660x2.f18573a.length);
        for (C3635w2 c3635w2 : c3660x2.f18573a) {
            this.f18544a.getClass();
            int i = c3635w2.f18559a;
            if (i == 2) {
                productType = ProductType.INAPP;
            } else if (i != 3) {
                productType = ProductType.UNKNOWN;
            } else {
                productType = ProductType.SUBS;
            }
            arrayList.add(new BillingInfo(productType, c3635w2.b, c3635w2.c, c3635w2.d, c3635w2.e));
        }
        return new C3585u2(arrayList, c3660x2.b);
    }
}
