package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public final class q1 extends t1 {
    public int c;
    public int d;
    public boolean e;
    public boolean f;

    public q1(int i, InputStream inputStream) throws IOException {
        super(i, inputStream);
        this.e = false;
        this.f = true;
        this.c = inputStream.read();
        int read = inputStream.read();
        this.d = read;
        if (read < 0) {
            throw new EOFException();
        }
        c();
    }

    public final boolean c() {
        if (!this.e && this.f && this.c == 0 && this.d == 0) {
            this.e = true;
            b();
        }
        return this.e;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (c()) {
            return -1;
        }
        int read = this.f8293a.read();
        if (read < 0) {
            throw new EOFException();
        }
        int i = this.c;
        this.c = this.d;
        this.d = read;
        return i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f || i2 < 3) {
            return super.read(bArr, i, i2);
        }
        if (this.e) {
            return -1;
        }
        int read = this.f8293a.read(bArr, i + 2, i2 - 2);
        if (read < 0) {
            throw new EOFException();
        }
        bArr[i] = (byte) this.c;
        bArr[i + 1] = (byte) this.d;
        this.c = this.f8293a.read();
        int read2 = this.f8293a.read();
        this.d = read2;
        if (read2 >= 0) {
            return read + 2;
        }
        throw new EOFException();
    }
}
