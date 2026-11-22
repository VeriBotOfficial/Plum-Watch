package com.yandex.mobile.ads.impl;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class wz implements a80 {
    private final qv b;
    private final long c;
    private long d;
    private int f;
    private int g;
    private byte[] e = new byte[65536];

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f17295a = new byte[4096];

    static {
        u60.a("goog.exo.extractor");
    }

    public wz(tv tvVar, long j, long j2) {
        this.b = tvVar;
        this.d = j;
        this.c = j2;
    }

    public final boolean a(boolean z, int i) throws IOException {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            int i3 = f92.f15466a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i2, Math.min(bArr.length * 2, i2 + 524288)));
        }
        int i4 = this.g - this.f;
        while (i4 < i) {
            boolean z2 = z;
            int i5 = i;
            i4 = a(this.e, this.f, i5, i4, z2);
            if (i4 == -1) {
                return false;
            }
            this.g = this.f + i4;
            i = i5;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final int c(byte[] bArr, int i, int i2) throws IOException {
        wz wzVar;
        int min;
        int i3 = this.f + i2;
        byte[] bArr2 = this.e;
        if (i3 > bArr2.length) {
            int i4 = f92.f15466a;
            this.e = Arrays.copyOf(this.e, Math.max(65536 + i3, Math.min(bArr2.length * 2, i3 + 524288)));
        }
        int i5 = this.g;
        int i6 = this.f;
        int i7 = i5 - i6;
        if (i7 == 0) {
            wzVar = this;
            min = wzVar.a(this.e, i6, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            wzVar.g += min;
        } else {
            wzVar = this;
            min = Math.min(i2, i7);
        }
        System.arraycopy(wzVar.e, wzVar.f, bArr, i, min);
        wzVar.f += min;
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.qv
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        wz wzVar;
        int i3 = this.g;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            d(min);
            i4 = min;
        }
        if (i4 == 0) {
            wzVar = this;
            i4 = wzVar.a(bArr, i, i2, 0, true);
        } else {
            wzVar = this;
        }
        if (i4 != -1) {
            wzVar.d += i4;
        }
        return i4;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void b(int i) throws IOException {
        a(false, i);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final long d() {
        return this.d + this.f;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void c() {
        this.f = 0;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final long a() {
        return this.d;
    }

    public final int c(int i) throws IOException {
        wz wzVar;
        int min = Math.min(this.g, i);
        d(min);
        if (min == 0) {
            byte[] bArr = this.f17295a;
            wzVar = this;
            min = wzVar.a(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            wzVar = this;
        }
        if (min != -1) {
            wzVar.d += min;
        }
        return min;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void a(byte[] bArr, int i, int i2) throws IOException {
        b(bArr, i, i2, false);
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final boolean a(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int i3;
        int i4 = this.g;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = Math.min(i4, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            d(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.d += i3;
        }
        return i3 != -1;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final long b() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void a(int i) throws IOException {
        int min = Math.min(this.g, i);
        d(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = a(this.f17295a, -i2, Math.min(i, this.f17295a.length + i2), i2, false);
        }
        if (i2 != -1) {
            this.d += i2;
        }
    }

    private int a(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedIOException();
    }

    private void d(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final boolean b(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (!a(z, i2)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.a80
    public final void b(byte[] bArr, int i, int i2) throws IOException {
        a(bArr, i, i2, false);
    }
}
