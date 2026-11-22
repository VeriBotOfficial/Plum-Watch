package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final int f14480a;

    /* renamed from: a, reason: collision with other field name */
    private final OutputStream f260a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f261a;
    private int b;

    public static int a(boolean z) {
        return 1;
    }

    public static int c(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int d(int i) {
        if ((i & com.alipay.sdk.m.p.a.g) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private c(byte[] bArr, int i, int i2) {
        this.f260a = null;
        this.f261a = bArr;
        this.b = i;
        this.f14480a = i + i2;
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f260a = outputStream;
        this.f261a = bArr;
        this.b = 0;
        this.f14480a = bArr.length;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    public static c a(byte[] bArr, int i, int i2) {
        return new c(bArr, i, i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11932a(int i, long j) {
        c(i, 0);
        m11937a(j);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11945b(int i, long j) {
        c(i, 0);
        m11946b(j);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11931a(int i, int i2) {
        c(i, 0);
        m11930a(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11936a(int i, boolean z) {
        c(i, 0);
        m11941a(z);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11935a(int i, String str) {
        c(i, 2);
        m11940a(str);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11934a(int i, e eVar) {
        c(i, 2);
        m11939a(eVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11933a(int i, com.xiaomi.push.a aVar) {
        c(i, 2);
        m11938a(aVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11944b(int i, int i2) {
        c(i, 0);
        m11943b(i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11937a(long j) {
        m11948c(j);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11946b(long j) {
        m11948c(j);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11930a(int i) {
        if (i >= 0) {
            m11949d(i);
        } else {
            m11948c(i);
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11941a(boolean z) {
        m11947c(z ? 1 : 0);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11940a(String str) {
        byte[] bytes = str.getBytes("UTF-8");
        m11949d(bytes.length);
        a(bytes);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11939a(e eVar) {
        m11949d(eVar.a());
        eVar.a(this);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11938a(com.xiaomi.push.a aVar) {
        byte[] m11860a = aVar.m11860a();
        m11949d(m11860a.length);
        a(m11860a);
    }

    /* renamed from: b, reason: collision with other method in class */
    public void m11943b(int i) {
        m11949d(i);
    }

    public static int a(int i, long j) {
        return c(i) + a(j);
    }

    public static int b(int i, long j) {
        return c(i) + b(j);
    }

    public static int a(int i, int i2) {
        return c(i) + a(i2);
    }

    public static int a(int i, boolean z) {
        return c(i) + a(z);
    }

    public static int a(int i, String str) {
        return c(i) + a(str);
    }

    public static int a(int i, e eVar) {
        return c(i) + a(eVar);
    }

    public static int a(int i, com.xiaomi.push.a aVar) {
        return c(i) + a(aVar);
    }

    public static int b(int i, int i2) {
        return c(i) + b(i2);
    }

    public static int a(long j) {
        return c(j);
    }

    public static int b(long j) {
        return c(j);
    }

    public static int a(int i) {
        if (i >= 0) {
            return d(i);
        }
        return 10;
    }

    public static int a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return d(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int a(e eVar) {
        int b = eVar.b();
        return d(b) + b;
    }

    public static int a(com.xiaomi.push.a aVar) {
        return d(aVar.a()) + aVar.a();
    }

    public static int b(int i) {
        return d(i);
    }

    private void c() {
        OutputStream outputStream = this.f260a;
        if (outputStream == null) {
            throw new a();
        }
        outputStream.write(this.f261a, 0, this.b);
        this.b = 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11929a() {
        if (this.f260a != null) {
            c();
        }
    }

    public int a() {
        if (this.f260a == null) {
            return this.f14480a - this.b;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void b() {
        if (a() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    public void a(byte b) {
        if (this.b == this.f14480a) {
            c();
        }
        byte[] bArr = this.f261a;
        int i = this.b;
        this.b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m11947c(int i) {
        a((byte) i);
    }

    public void a(byte[] bArr) {
        m11942a(bArr, 0, bArr.length);
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11942a(byte[] bArr, int i, int i2) {
        int i3 = this.f14480a;
        int i4 = this.b;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f261a, i4, i2);
            this.b += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f261a, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.b = this.f14480a;
        c();
        if (i7 <= this.f14480a) {
            System.arraycopy(bArr, i6, this.f261a, 0, i7);
            this.b = i7;
        } else {
            this.f260a.write(bArr, i6, i7);
        }
    }

    public void c(int i, int i2) {
        m11949d(f.a(i, i2));
    }

    public static int c(int i) {
        return d(f.a(i, 0));
    }

    /* renamed from: d, reason: collision with other method in class */
    public void m11949d(int i) {
        while ((i & com.alipay.sdk.m.p.a.g) != 0) {
            m11947c((i & 127) | 128);
            i >>>= 7;
        }
        m11947c(i);
    }

    /* renamed from: c, reason: collision with other method in class */
    public void m11948c(long j) {
        while (((-128) & j) != 0) {
            m11947c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        m11947c((int) j);
    }
}
