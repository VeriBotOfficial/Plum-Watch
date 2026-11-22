package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import com.yandex.mobile.ads.impl.hv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.zip.Inflater;

/* loaded from: classes5.dex */
public final class wg1 extends uy1 {
    private final ag1 m = new ag1();
    private final ag1 n = new ag1();
    private final a o = new a();
    private Inflater p;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ag1 f17248a = new ag1();
        private final int[] b = new int[256];
        private boolean c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.yandex.mobile.ads.impl.uy1
    protected final n32 a(byte[] bArr, int i, boolean z) throws p32 {
        ag1 ag1Var;
        hv hvVar;
        int i2;
        int i3;
        int w;
        this.m.a(i, bArr);
        ag1 ag1Var2 = this.m;
        if (ag1Var2.a() > 0 && ag1Var2.g() == 120) {
            if (this.p == null) {
                this.p = new Inflater();
            }
            if (f92.a(ag1Var2, this.n, this.p)) {
                ag1Var2.a(this.n.e(), this.n.c());
            }
        }
        a aVar = this.o;
        int i4 = 0;
        aVar.d = 0;
        aVar.e = 0;
        aVar.f = 0;
        aVar.g = 0;
        aVar.h = 0;
        aVar.i = 0;
        aVar.f17248a.c(0);
        aVar.c = false;
        ArrayList arrayList = new ArrayList();
        while (this.m.a() >= 3) {
            ag1 ag1Var3 = this.m;
            a aVar2 = this.o;
            int e = ag1Var3.e();
            int t = ag1Var3.t();
            int z2 = ag1Var3.z();
            int d = ag1Var3.d() + z2;
            if (d > e) {
                ag1Var3.e(e);
                i2 = i4;
                hvVar = null;
            } else {
                char c = 128;
                if (t != 128) {
                    switch (t) {
                        case 20:
                            aVar2.getClass();
                            if (z2 % 5 == 2) {
                                ag1Var3.f(2);
                                Arrays.fill(aVar2.b, i4);
                                int i5 = z2 / 5;
                                int i6 = i4;
                                while (i6 < i5) {
                                    int t2 = ag1Var3.t();
                                    int t3 = ag1Var3.t();
                                    int t4 = ag1Var3.t();
                                    int t5 = ag1Var3.t();
                                    int t6 = ag1Var3.t();
                                    char c2 = c;
                                    double d2 = t3;
                                    double d3 = t4 + com.alipay.sdk.m.p.a.g;
                                    ag1 ag1Var4 = ag1Var3;
                                    double d4 = t5 + com.alipay.sdk.m.p.a.g;
                                    int[] iArr = aVar2.b;
                                    int i7 = f92.f15466a;
                                    iArr[t2] = Math.max(0, Math.min((int) ((d4 * 1.772d) + d2), 255)) | (t6 << 24) | (Math.max(0, Math.min((int) ((1.402d * d3) + d2), 255)) << 16) | (Math.max(0, Math.min((int) ((d2 - (0.34414d * d4)) - (d3 * 0.71414d)), 255)) << 8);
                                    i6++;
                                    c = c2;
                                    ag1Var3 = ag1Var4;
                                }
                                ag1Var = ag1Var3;
                                aVar2.c = true;
                                break;
                            }
                            ag1Var = ag1Var3;
                            break;
                        case 21:
                            aVar2.getClass();
                            if (z2 >= 4) {
                                ag1Var3.f(3);
                                int i8 = z2 - 4;
                                if (((ag1Var3.t() & 128) != 0 ? 1 : i4) != 0) {
                                    if (i8 >= 7 && (w = ag1Var3.w()) >= 4) {
                                        aVar2.h = ag1Var3.z();
                                        aVar2.i = ag1Var3.z();
                                        aVar2.f17248a.c(w - 4);
                                        i8 = z2 - 11;
                                    }
                                }
                                int d5 = aVar2.f17248a.d();
                                int e2 = aVar2.f17248a.e();
                                if (d5 < e2 && i8 > 0) {
                                    int min = Math.min(i8, e2 - d5);
                                    ag1Var3.a(aVar2.f17248a.c(), d5, min);
                                    aVar2.f17248a.e(d5 + min);
                                }
                            }
                            ag1Var = ag1Var3;
                            break;
                        case 22:
                            aVar2.getClass();
                            if (z2 >= 19) {
                                aVar2.d = ag1Var3.z();
                                aVar2.e = ag1Var3.z();
                                ag1Var3.f(11);
                                aVar2.f = ag1Var3.z();
                                aVar2.g = ag1Var3.z();
                            }
                            ag1Var = ag1Var3;
                            break;
                        default:
                            ag1Var = ag1Var3;
                            break;
                    }
                    hvVar = null;
                    i2 = 0;
                } else {
                    ag1Var = ag1Var3;
                    if (aVar2.d == 0 || aVar2.e == 0 || aVar2.h == 0 || aVar2.i == 0 || aVar2.f17248a.e() == 0 || aVar2.f17248a.d() != aVar2.f17248a.e() || !aVar2.c) {
                        hvVar = null;
                    } else {
                        aVar2.f17248a.e(0);
                        int i9 = aVar2.h * aVar2.i;
                        int[] iArr2 = new int[i9];
                        int i10 = 0;
                        while (i10 < i9) {
                            int t7 = aVar2.f17248a.t();
                            if (t7 != 0) {
                                i3 = i10 + 1;
                                iArr2[i10] = aVar2.b[t7];
                            } else {
                                int t8 = aVar2.f17248a.t();
                                if (t8 != 0) {
                                    i3 = ((t8 & 64) == 0 ? t8 & 63 : ((t8 & 63) << 8) | aVar2.f17248a.t()) + i10;
                                    Arrays.fill(iArr2, i10, i3, (t8 & 128) == 0 ? 0 : aVar2.b[aVar2.f17248a.t()]);
                                }
                            }
                            i10 = i3;
                        }
                        hvVar = new hv.a().a(Bitmap.createBitmap(iArr2, aVar2.h, aVar2.i, Bitmap.Config.ARGB_8888)).b(aVar2.f / aVar2.d).b(0).a(0, aVar2.g / aVar2.e).a(0).d(aVar2.h / aVar2.d).a(aVar2.i / aVar2.e).a();
                    }
                    i2 = 0;
                    aVar2.d = 0;
                    aVar2.e = 0;
                    aVar2.f = 0;
                    aVar2.g = 0;
                    aVar2.h = 0;
                    aVar2.i = 0;
                    aVar2.f17248a.c(0);
                    aVar2.c = false;
                }
                ag1Var.e(d);
            }
            if (hvVar != null) {
                arrayList.add(hvVar);
            }
            i4 = i2;
        }
        return new xg1(Collections.unmodifiableList(arrayList));
    }
}
