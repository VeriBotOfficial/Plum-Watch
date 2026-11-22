package com.yandex.mobile.ads.impl;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class mz1 {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16295a;

        static {
            int[] iArr = new int[wz1.values().length];
            try {
                int i = wz1.d;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                int i2 = wz1.d;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16295a = iArr;
        }
    }

    public static lz1 a(m6 m6Var) {
        n6 b;
        wz1 c = (m6Var == null || (b = m6Var.b()) == null) ? null : b.c();
        int i = c == null ? -1 : a.f16295a[c.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return new ji2();
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return new o00();
    }
}
