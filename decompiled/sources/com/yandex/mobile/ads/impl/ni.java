package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.e41;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class ni {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f16345a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final String f;

    private ni(ArrayList arrayList, int i, int i2, int i3, float f, String str) {
        this.f16345a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    public static ni a(ag1 ag1Var) throws eg1 {
        float f;
        String str;
        int i;
        int i2;
        try {
            ag1Var.f(4);
            int t = (ag1Var.t() & 3) + 1;
            if (t != 3) {
                ArrayList arrayList = new ArrayList();
                int t2 = ag1Var.t() & 31;
                for (int i3 = 0; i3 < t2; i3++) {
                    int z = ag1Var.z();
                    int d = ag1Var.d();
                    ag1Var.f(z);
                    arrayList.add(oq.a(ag1Var.c(), d, z));
                }
                int t3 = ag1Var.t();
                for (int i4 = 0; i4 < t3; i4++) {
                    int z2 = ag1Var.z();
                    int d2 = ag1Var.d();
                    ag1Var.f(z2);
                    arrayList.add(oq.a(ag1Var.c(), d2, z2));
                }
                if (t2 > 0) {
                    e41.c b = e41.b((byte[]) arrayList.get(0), t, ((byte[]) arrayList.get(0)).length);
                    int i5 = b.e;
                    int i6 = b.f;
                    f = b.g;
                    str = String.format("avc1.%02X%02X%02X", Integer.valueOf(b.f15345a), Integer.valueOf(b.b), Integer.valueOf(b.c));
                    i = i5;
                    i2 = i6;
                } else {
                    f = 1.0f;
                    str = null;
                    i = -1;
                    i2 = -1;
                }
                return new ni(arrayList, t, i, i2, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw eg1.a("Error parsing AVC config", e);
        }
    }
}
