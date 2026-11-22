package com.xiaomi.push;

import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class e {
    public abstract int a();

    public abstract e a(b bVar);

    public abstract void a(c cVar);

    public abstract int b();

    /* renamed from: a, reason: collision with other method in class */
    public byte[] m12105a() {
        int b = b();
        byte[] bArr = new byte[b];
        m12104a(bArr, 0, b);
        return bArr;
    }

    /* renamed from: a, reason: collision with other method in class */
    public void m12104a(byte[] bArr, int i, int i2) {
        try {
            c a2 = c.a(bArr, i, i2);
            a(a2);
            a2.b();
        } catch (IOException unused) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).");
        }
    }

    public e a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public e a(byte[] bArr, int i, int i2) {
        try {
            b a2 = b.a(bArr, i, i2);
            a(a2);
            a2.m11900a(0);
            return this;
        } catch (d e) {
            throw e;
        } catch (IOException unused) {
            throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
        }
    }

    protected boolean a(b bVar, int i) {
        return bVar.m11902a(i);
    }
}
