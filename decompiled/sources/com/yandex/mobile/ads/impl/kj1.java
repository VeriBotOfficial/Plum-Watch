package com.yandex.mobile.ads.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class kj1 extends ByteArrayOutputStream {

    /* renamed from: a, reason: collision with root package name */
    private final pm f16029a;

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        int i2 = ((ByteArrayOutputStream) this).count + 1;
        if (i2 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a2 = this.f16029a.a(i2 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a2, 0, ((ByteArrayOutputStream) this).count);
            this.f16029a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a2;
        }
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        int i3 = ((ByteArrayOutputStream) this).count + i2;
        if (i3 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] a2 = this.f16029a.a(i3 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, a2, 0, ((ByteArrayOutputStream) this).count);
            this.f16029a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = a2;
        }
        super.write(bArr, i, i2);
    }

    public kj1(pm pmVar, int i) {
        this.f16029a = pmVar;
        ((ByteArrayOutputStream) this).buf = pmVar.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f16029a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f16029a.a(((ByteArrayOutputStream) this).buf);
    }
}
