package com.anythink.core.common.v;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;

/* loaded from: classes12.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4433a = "t";
    private static double b;
    private static double c;

    public static double a() {
        return c;
    }

    public static double b() {
        return b;
    }

    public static void a(double d) {
        b = d;
        if (d > 0.0d) {
            c = 1.0d / d;
        }
    }

    public static ATAdConst.CURRENCY a(String str) {
        if (j.C0192j.b.equalsIgnoreCase(str)) {
            return ATAdConst.CURRENCY.RMB;
        }
        if (j.C0192j.f3689a.equalsIgnoreCase(str)) {
            return ATAdConst.CURRENCY.USD;
        }
        return ATAdConst.CURRENCY.RMB_CENT;
    }

    /* renamed from: com.anythink.core.common.v.t$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4434a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f4434a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4434a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4434a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a(double d, ATAdConst.CURRENCY currency, ATAdConst.CURRENCY currency2) {
        double d2;
        int i;
        double d3;
        if (d <= 0.0d || currency2 == null || currency == null) {
            return d;
        }
        try {
            i = AnonymousClass1.f4434a[currency.ordinal()];
        } catch (Throwable th) {
            new Object[]{th.getMessage()};
            d2 = d;
        }
        if (i == 1) {
            if (currency2 == ATAdConst.CURRENCY.USD) {
                d3 = b;
                d2 = d3 * d;
                new Object[]{Double.valueOf(b), Double.valueOf(c)};
                new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
                return d2;
            }
            if (currency2 == ATAdConst.CURRENCY.RMB_CENT) {
                d2 = d * 100.0d;
                new Object[]{Double.valueOf(b), Double.valueOf(c)};
                new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
                return d2;
            }
            d2 = d * 1.0d;
            new Object[]{Double.valueOf(b), Double.valueOf(c)};
            new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
            return d2;
        }
        if (i == 2) {
            if (currency2 == ATAdConst.CURRENCY.USD) {
                d2 = (d / 100.0d) * b;
            } else if (currency2 == ATAdConst.CURRENCY.RMB) {
                d2 = d / 100.0d;
            }
            new Object[]{Double.valueOf(b), Double.valueOf(c)};
            new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
            return d2;
        }
        if (currency2 == ATAdConst.CURRENCY.RMB) {
            d3 = c;
            d2 = d3 * d;
            new Object[]{Double.valueOf(b), Double.valueOf(c)};
            new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
            return d2;
        }
        if (currency2 == ATAdConst.CURRENCY.RMB_CENT) {
            d2 = c * d * 100.0d;
            new Object[]{Double.valueOf(b), Double.valueOf(c)};
            new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
            return d2;
        }
        d2 = d * 1.0d;
        new Object[]{Double.valueOf(b), Double.valueOf(c)};
        new Object[]{Double.valueOf(d), Double.valueOf(d2), currency, currency2};
        return d2;
    }
}
