package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* loaded from: classes6.dex */
public final class F2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Z1 fromModel(H2 h2) {
        Z1 z1 = new Z1();
        G2 g2 = h2.f17881a;
        if (g2 != null) {
            int ordinal = g2.ordinal();
            if (ordinal == 0) {
                z1.f18162a = 1;
            } else if (ordinal == 1) {
                z1.f18162a = 2;
            } else if (ordinal == 2) {
                z1.f18162a = 3;
            } else if (ordinal == 3) {
                z1.f18162a = 4;
            } else if (ordinal == 4) {
                z1.f18162a = 5;
            }
        }
        Boolean bool = h2.b;
        if (bool != null) {
            if (bool.booleanValue()) {
                z1.b = 1;
                return z1;
            }
            z1.b = 0;
        }
        return z1;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final H2 toModel(Z1 z1) {
        G2 g2;
        int i = z1.f18162a;
        Boolean bool = null;
        if (i == 1) {
            g2 = G2.ACTIVE;
        } else if (i == 2) {
            g2 = G2.WORKING_SET;
        } else if (i == 3) {
            g2 = G2.FREQUENT;
        } else if (i != 4) {
            g2 = i != 5 ? null : G2.RESTRICTED;
        } else {
            g2 = G2.RARE;
        }
        int i2 = z1.b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new H2(g2, bool);
    }
}
