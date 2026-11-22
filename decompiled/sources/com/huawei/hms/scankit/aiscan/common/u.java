package com.huawei.hms.scankit.aiscan.common;

/* compiled from: ReedSolomonDecoder.java */
/* loaded from: classes14.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    private final h f10525a;

    public u(h hVar) {
        this.f10525a = hVar;
    }

    public void a(int[] iArr, int i) throws C2967a {
        i iVar = new i(this.f10525a, iArr);
        int[] iArr2 = new int[i];
        boolean z = true;
        for (int i2 = 0; i2 < i; i2++) {
            h hVar = this.f10525a;
            int a2 = iVar.a(hVar.a(hVar.a() + i2));
            iArr2[(i - 1) - i2] = a2;
            if (a2 != 0) {
                z = false;
            }
        }
        if (z) {
            return;
        }
        i[] a3 = a(this.f10525a.b(i, 1), new i(this.f10525a, iArr2), i);
        i iVar2 = a3[0];
        i iVar3 = a3[1];
        int[] a4 = a(iVar2);
        int[] a5 = a(iVar3, a4);
        for (int i3 = 0; i3 < a4.length; i3++) {
            int length = (iArr.length - 1) - this.f10525a.c(a4[i3]);
            if (length < 0) {
                throw C2967a.a("Bad error location");
            }
            iArr[length] = h.a(iArr[length], a5[i3]);
        }
    }

    private i[] a(i iVar, i iVar2, int i) throws C2967a {
        if (iVar.b() >= iVar2.b()) {
            iVar2 = iVar;
            iVar = iVar2;
        }
        i d = this.f10525a.d();
        i b = this.f10525a.b();
        while (true) {
            i iVar3 = b;
            i iVar4 = d;
            d = iVar3;
            if (iVar.b() >= i / 2) {
                if (!iVar.c()) {
                    i d2 = this.f10525a.d();
                    int b2 = this.f10525a.b(iVar.b(iVar.b()));
                    while (iVar2.b() >= iVar.b() && !iVar2.c()) {
                        int b3 = iVar2.b() - iVar.b();
                        int c = this.f10525a.c(iVar2.b(iVar2.b()), b2);
                        d2 = d2.a(this.f10525a.b(b3, c));
                        iVar2 = iVar2.a(iVar.a(b3, c));
                    }
                    b = d2.c(d).a(iVar4);
                    if (iVar2.b() >= iVar.b()) {
                        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
                    }
                    i iVar5 = iVar2;
                    iVar2 = iVar;
                    iVar = iVar5;
                } else {
                    throw C2967a.a("r_{i-1} was zero");
                }
            } else {
                int b4 = d.b(0);
                if (b4 != 0) {
                    int b5 = this.f10525a.b(b4);
                    return new i[]{d.c(b5), iVar.c(b5)};
                }
                throw C2967a.a("sigmaTilde(0) was zero");
            }
        }
    }

    private int[] a(i iVar) throws C2967a {
        int b = iVar.b();
        if (b == 1) {
            return new int[]{iVar.b(1)};
        }
        int[] iArr = new int[b];
        int i = 0;
        for (int i2 = 1; i2 < this.f10525a.c() && i < b; i2++) {
            if (iVar.a(i2) == 0) {
                iArr[i] = this.f10525a.b(i2);
                i++;
            }
        }
        if (i == b) {
            return iArr;
        }
        throw C2967a.a("Error locator degree does not match number of roots");
    }

    private int[] a(i iVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i = 0; i < length; i++) {
            int b = this.f10525a.b(iArr[i]);
            int i2 = 1;
            for (int i3 = 0; i3 < length; i3++) {
                if (i != i3) {
                    int c = this.f10525a.c(iArr[i3], b);
                    i2 = this.f10525a.c(i2, (c & 1) == 0 ? c | 1 : c & (-2));
                }
            }
            iArr2[i] = this.f10525a.c(iVar.a(b), this.f10525a.b(i2));
            if (this.f10525a.a() != 0) {
                iArr2[i] = this.f10525a.c(iArr2[i], b);
            }
        }
        return iArr2;
    }
}
