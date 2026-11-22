package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public final class vv extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final tv f17196a;
    private final xv b;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public vv(s22 s22Var, xv xvVar) {
        this.f17196a = s22Var;
        this.b = xvVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = this.c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.f17196a.close();
        this.e = true;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.e) {
            if (!this.d) {
                this.f17196a.a(this.b);
                this.d = true;
            }
            int read = this.f17196a.read(bArr, i, i2);
            if (read == -1) {
                return -1;
            }
            return read;
        }
        throw new IllegalStateException();
    }
}
