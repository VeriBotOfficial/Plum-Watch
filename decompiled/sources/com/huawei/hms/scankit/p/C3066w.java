package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: BinaryBitmap.java */
/* renamed from: com.huawei.hms.scankit.p.w, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3066w {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC3062v f10697a;
    private C3074y b;

    public C3066w(AbstractC3062v abstractC3062v) {
        if (abstractC3062v == null) {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        }
        this.f10697a = abstractC3062v;
    }

    public C3070x a(int i, int i2) throws C2967a {
        int i3;
        int e = e();
        if (e < 45) {
            throw C2967a.a();
        }
        C3070x c3070x = new C3070x(e);
        byte[] bArr = new byte[e];
        a().c().a(i, bArr);
        int[] iArr = new int[e];
        int[] iArr2 = new int[e];
        int i4 = bArr[0] & 255;
        iArr[0] = i4;
        iArr2[0] = i4 * i4;
        for (int i5 = 1; i5 < e; i5++) {
            iArr[i5] = iArr[i5 - 1] + (bArr[i5] & 255);
        }
        if (i2 != 0) {
            return a(45, e, iArr, iArr2, bArr, 22);
        }
        int i6 = 23;
        while (true) {
            i3 = e - 22;
            if (i6 >= i3) {
                break;
            }
            if ((bArr[i6] & 255) + 5 < (iArr[i6 + 22] - iArr[i6 - 23]) / 45) {
                c3070x.d(i6);
            }
            i6++;
        }
        if (c3070x.a(23)) {
            c3070x.c(0, 23);
        }
        if (c3070x.a(e - 23)) {
            c3070x.c(i3, e);
        }
        return c3070x;
    }

    public C3074y b() throws C2967a {
        if (this.b == null) {
            this.b = this.f10697a.a();
        }
        return this.b;
    }

    public int c() {
        return this.f10697a.b();
    }

    public byte[] d() {
        return this.f10697a.c().b();
    }

    public int e() {
        return this.f10697a.d();
    }

    private C3070x a(int i, int i2, int[] iArr, int[] iArr2, byte[] bArr, int i3) {
        int i4;
        C3070x c3070x = new C3070x(i2);
        for (int i5 = 1; i5 < i2; i5++) {
            int i6 = iArr2[i5 - 1];
            byte b = bArr[i5];
            iArr2[i5] = i6 + ((b & 255) * (b & 255));
        }
        int i7 = i3 + 1;
        int i8 = i7;
        while (true) {
            i4 = i2 - i3;
            if (i8 >= i4) {
                break;
            }
            double d = iArr[i8 + i3] - iArr[(i8 - i3) - 1];
            double d2 = i;
            if ((bArr[i8] & 255) <= (d / d2) * ((0.5f * (Math.sqrt(((iArr2[r6] - iArr2[r8]) - ((d * d) / d2)) / (i - 1)) / 127)) + 1.0d)) {
                c3070x.d(i8);
            }
            i8++;
        }
        if (c3070x.a(i7)) {
            c3070x.c(0, i7);
        }
        if (c3070x.a(i4 - 1)) {
            c3070x.c(i4, i2);
        }
        return c3070x;
    }

    public C3070x a(int i, C3070x c3070x) throws C2967a {
        return this.f10697a.a(i, c3070x);
    }

    public void a(C3074y c3074y) {
        this.b = c3074y;
    }

    public C3066w a(int i, int i2, int i3, int i4) {
        return new C3066w(this.f10697a.a(this.f10697a.c().a(i, i2, i3, i4)));
    }

    public AbstractC3062v a() {
        return this.f10697a;
    }
}
