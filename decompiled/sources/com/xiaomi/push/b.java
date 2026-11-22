package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f14451a;

    /* renamed from: a, reason: collision with other field name */
    private final InputStream f223a;

    /* renamed from: a, reason: collision with other field name */
    private final byte[] f224a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public static b a(InputStream inputStream) {
        return new b(inputStream);
    }

    public static b a(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public int m11895a() {
        if (m11906b()) {
            this.d = 0;
            return 0;
        }
        int d = d();
        this.d = d;
        if (d != 0) {
            return d;
        }
        throw d.d();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11900a(int i) {
        if (this.d != i) {
            throw d.e();
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11902a(int i) {
        int a2 = f.a(i);
        if (a2 == 0) {
            m11904b();
            return true;
        }
        if (a2 == 1) {
            m11908d();
            return true;
        }
        if (a2 == 2) {
            c(d());
            return true;
        }
        if (a2 == 3) {
            m11899a();
            m11900a(f.a(f.b(i), 4));
            return true;
        }
        if (a2 == 4) {
            return false;
        }
        if (a2 == 5) {
            e();
            return true;
        }
        throw d.f();
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m11899a() {
        int m11895a;
        do {
            m11895a = m11895a();
            if (m11895a == 0) {
                return;
            }
        } while (m11902a(m11895a));
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m11896a() {
        return m11907c();
    }

    /* renamed from: b, reason: collision with other method in class */
    public long m11905b() {
        return m11907c();
    }

    /* renamed from: b, reason: collision with other method in class */
    public int m11904b() {
        return d();
    }

    /* renamed from: a, reason: collision with other method in class */
    public boolean m11901a() {
        return d() != 0;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String m11898a() {
        int d = d();
        if (d <= this.f14451a - this.c && d > 0) {
            String str = new String(this.f224a, this.c, d, "UTF-8");
            this.c += d;
            return str;
        }
        return new String(m11903a(d), "UTF-8");
    }

    public void a(e eVar) {
        int d = d();
        if (this.g >= this.h) {
            throw d.g();
        }
        int a2 = a(d);
        this.g++;
        eVar.a(this);
        m11900a(0);
        this.g--;
        b(a2);
    }

    /* renamed from: a, reason: collision with other method in class */
    public a m11897a() {
        int d = d();
        int i = this.f14451a;
        int i2 = this.c;
        if (d <= i - i2 && d > 0) {
            a a2 = a.a(this.f224a, i2, d);
            this.c += d;
            return a2;
        }
        return a.a(m11903a(d));
    }

    public int c() {
        return d();
    }

    public int d() {
        int i;
        byte a2 = a();
        if (a2 >= 0) {
            return a2;
        }
        int i2 = a2 & Byte.MAX_VALUE;
        byte a3 = a();
        if (a3 >= 0) {
            i = a3 << 7;
        } else {
            i2 |= (a3 & Byte.MAX_VALUE) << 7;
            byte a4 = a();
            if (a4 >= 0) {
                i = a4 << 14;
            } else {
                i2 |= (a4 & Byte.MAX_VALUE) << 14;
                byte a5 = a();
                if (a5 < 0) {
                    int i3 = i2 | ((a5 & Byte.MAX_VALUE) << 21);
                    byte a6 = a();
                    int i4 = i3 | (a6 << 28);
                    if (a6 < 0) {
                        for (int i5 = 0; i5 < 5; i5++) {
                            if (a() < 0) {
                            }
                        }
                        throw d.c();
                    }
                    return i4;
                }
                i = a5 << 21;
            }
        }
        return i2 | i;
    }

    /* renamed from: c, reason: collision with other method in class */
    public long m11907c() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((a() & 128) == 0) {
                return j;
            }
        }
        throw d.c();
    }

    public int e() {
        return (a() & 255) | ((a() & 255) << 8) | ((a() & 255) << 16) | ((a() & 255) << 24);
    }

    /* renamed from: d, reason: collision with other method in class */
    public long m11908d() {
        return ((a() & 255) << 8) | (a() & 255) | ((a() & 255) << 16) | ((a() & 255) << 24) | ((a() & 255) << 32) | ((a() & 255) << 40) | ((a() & 255) << 48) | ((a() & 255) << 56);
    }

    private b(byte[] bArr, int i, int i2) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f224a = bArr;
        this.f14451a = i2 + i;
        this.c = i;
        this.f223a = null;
    }

    private b(InputStream inputStream) {
        this.f = Integer.MAX_VALUE;
        this.h = 64;
        this.i = 67108864;
        this.f224a = new byte[4096];
        this.f14451a = 0;
        this.c = 0;
        this.f223a = inputStream;
    }

    public int a(int i) {
        if (i < 0) {
            throw d.b();
        }
        int i2 = i + this.e + this.c;
        int i3 = this.f;
        if (i2 > i3) {
            throw d.a();
        }
        this.f = i2;
        b();
        return i3;
    }

    private void b() {
        int i = this.f14451a + this.b;
        this.f14451a = i;
        int i2 = this.e + i;
        int i3 = this.f;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.b = i4;
            this.f14451a = i - i4;
            return;
        }
        this.b = 0;
    }

    public void b(int i) {
        this.f = i;
        b();
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m11906b() {
        return this.c == this.f14451a && !a(false);
    }

    private boolean a(boolean z) {
        int i = this.c;
        int i2 = this.f14451a;
        if (i < i2) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i3 = this.e;
        if (i3 + i2 == this.f) {
            if (z) {
                throw d.a();
            }
            return false;
        }
        this.e = i3 + i2;
        this.c = 0;
        InputStream inputStream = this.f223a;
        int read = inputStream == null ? -1 : inputStream.read(this.f224a);
        this.f14451a = read;
        if (read == 0 || read < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f14451a + "\nThe InputStream implementation is buggy.");
        }
        if (read == -1) {
            this.f14451a = 0;
            if (z) {
                throw d.a();
            }
            return false;
        }
        b();
        int i4 = this.e + this.f14451a + this.b;
        if (i4 > this.i || i4 < 0) {
            throw d.h();
        }
        return true;
    }

    public byte a() {
        if (this.c == this.f14451a) {
            a(true);
        }
        byte[] bArr = this.f224a;
        int i = this.c;
        this.c = i + 1;
        return bArr[i];
    }

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m11903a(int i) {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.e;
        int i3 = this.c;
        int i4 = i2 + i3 + i;
        int i5 = this.f;
        if (i4 > i5) {
            c((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.f14451a;
        if (i <= i6 - i3) {
            byte[] bArr = new byte[i];
            System.arraycopy(this.f224a, i3, bArr, 0, i);
            this.c += i;
            return bArr;
        }
        if (i < 4096) {
            byte[] bArr2 = new byte[i];
            int i7 = i6 - i3;
            System.arraycopy(this.f224a, i3, bArr2, 0, i7);
            this.c = this.f14451a;
            a(true);
            while (true) {
                int i8 = i - i7;
                int i9 = this.f14451a;
                if (i8 > i9) {
                    System.arraycopy(this.f224a, 0, bArr2, i7, i9);
                    int i10 = this.f14451a;
                    i7 += i10;
                    this.c = i10;
                    a(true);
                } else {
                    System.arraycopy(this.f224a, 0, bArr2, i7, i8);
                    this.c = i8;
                    return bArr2;
                }
            }
        } else {
            this.e = i2 + i6;
            this.c = 0;
            this.f14451a = 0;
            int i11 = i6 - i3;
            int i12 = i - i11;
            Vector vector = new Vector();
            while (i12 > 0) {
                int min = Math.min(i12, 4096);
                byte[] bArr3 = new byte[min];
                int i13 = 0;
                while (i13 < min) {
                    InputStream inputStream = this.f223a;
                    int read = inputStream == null ? -1 : inputStream.read(bArr3, i13, min - i13);
                    if (read == -1) {
                        throw d.a();
                    }
                    this.e += read;
                    i13 += read;
                }
                i12 -= min;
                vector.addElement(bArr3);
            }
            byte[] bArr4 = new byte[i];
            System.arraycopy(this.f224a, i3, bArr4, 0, i11);
            for (int i14 = 0; i14 < vector.size(); i14++) {
                byte[] bArr5 = (byte[]) vector.elementAt(i14);
                System.arraycopy(bArr5, 0, bArr4, i11, bArr5.length);
                i11 += bArr5.length;
            }
            return bArr4;
        }
    }

    public void c(int i) {
        if (i < 0) {
            throw d.b();
        }
        int i2 = this.e;
        int i3 = this.c;
        int i4 = i2 + i3 + i;
        int i5 = this.f;
        if (i4 > i5) {
            c((i5 - i2) - i3);
            throw d.a();
        }
        int i6 = this.f14451a;
        if (i <= i6 - i3) {
            this.c = i3 + i;
            return;
        }
        int i7 = i6 - i3;
        this.e = i2 + i6;
        this.c = 0;
        this.f14451a = 0;
        while (i7 < i) {
            InputStream inputStream = this.f223a;
            int skip = inputStream == null ? -1 : (int) inputStream.skip(i - i7);
            if (skip <= 0) {
                throw d.a();
            }
            i7 += skip;
            this.e += skip;
        }
    }
}
