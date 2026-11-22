package com.huawei.hms.scankit.p;

import java.lang.reflect.Array;

/* compiled from: BarcodeMatrix.java */
/* renamed from: com.huawei.hms.scankit.p.yc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3077yc {

    /* renamed from: a, reason: collision with root package name */
    private final zc[] f10702a;
    private int b;
    private final int c;
    private final int d;

    C3077yc(int i, int i2) {
        zc[] zcVarArr = new zc[i];
        this.f10702a = zcVarArr;
        int length = zcVarArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            this.f10702a[i3] = new zc(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    zc a() {
        int i = this.b;
        if (i >= 0) {
            zc[] zcVarArr = this.f10702a;
            if (i < zcVarArr.length) {
                return zcVarArr[i];
            }
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    void b() {
        this.b++;
    }

    public byte[][] a(int i, int i2) {
        int i3 = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.d * i);
        for (int i4 = 0; i4 < i3; i4++) {
            bArr[(i3 - i4) - 1] = this.f10702a[i4 / i2].a(i);
        }
        return bArr;
    }
}
