package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cd;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dz implements cd {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15326a;
    private final int b;
    private final byte[] c;
    private int d;
    private int e;
    private int f;
    private bd[] g;

    public dz() {
        this(0);
    }

    public dz(int i) {
        this.f15326a = true;
        this.b = 65536;
        this.f = 0;
        this.g = new bd[100];
        this.c = null;
    }

    public final synchronized void d() {
        if (this.f15326a) {
            a(0);
        }
    }

    public final synchronized bd a() {
        bd bdVar;
        int i = this.e + 1;
        this.e = i;
        int i2 = this.f;
        if (i2 > 0) {
            bd[] bdVarArr = this.g;
            int i3 = i2 - 1;
            this.f = i3;
            bdVar = bdVarArr[i3];
            bdVar.getClass();
            this.g[this.f] = null;
        } else {
            bd bdVar2 = new bd(0, new byte[this.b]);
            bd[] bdVarArr2 = this.g;
            if (i > bdVarArr2.length) {
                this.g = (bd[]) Arrays.copyOf(bdVarArr2, bdVarArr2.length * 2);
            }
            bdVar = bdVar2;
        }
        return bdVar;
    }

    public final synchronized void e() {
        int i = this.d;
        int i2 = this.b;
        int i3 = f92.f15466a;
        int i4 = (((i + i2) - 1) / i2) - this.e;
        int i5 = 0;
        int max = Math.max(0, i4);
        int i6 = this.f;
        if (max >= i6) {
            return;
        }
        if (this.c != null) {
            int i7 = i6 - 1;
            while (i5 <= i7) {
                bd bdVar = this.g[i5];
                bdVar.getClass();
                if (bdVar.f15095a == this.c) {
                    i5++;
                } else {
                    bd bdVar2 = this.g[i7];
                    bdVar2.getClass();
                    if (bdVar2.f15095a != this.c) {
                        i7--;
                    } else {
                        bd[] bdVarArr = this.g;
                        bdVarArr[i5] = bdVar2;
                        bdVarArr[i7] = bdVar;
                        i7--;
                        i5++;
                    }
                }
            }
            max = Math.max(max, i5);
            if (max >= this.f) {
                return;
            }
        }
        Arrays.fill(this.g, max, this.f, (Object) null);
        this.f = max;
    }

    public final synchronized int c() {
        return this.e * this.b;
    }

    public final int b() {
        return this.b;
    }

    public final synchronized void a(bd bdVar) {
        bd[] bdVarArr = this.g;
        int i = this.f;
        this.f = i + 1;
        bdVarArr[i] = bdVar;
        this.e--;
        notifyAll();
    }

    public final synchronized void a(cd.a aVar) {
        while (aVar != null) {
            bd[] bdVarArr = this.g;
            int i = this.f;
            this.f = i + 1;
            bdVarArr[i] = aVar.a();
            this.e--;
            aVar = aVar.next();
        }
        notifyAll();
    }

    public final synchronized void a(int i) {
        boolean z = i < this.d;
        this.d = i;
        if (z) {
            e();
        }
    }
}
