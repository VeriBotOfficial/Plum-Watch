package com.baidu.mapauto.auth.org.spongycastle.asn1;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes13.dex */
public final class o1 extends t1 {
    public static final byte[] e = new byte[0];
    public final int c;
    public int d;

    public o1(int i, InputStream inputStream) {
        super(i, inputStream);
        if (i < 0) {
            throw new IllegalArgumentException("negative lengths not allowed");
        }
        this.c = i;
        this.d = i;
        if (i == 0) {
            b();
        }
    }

    @Override // com.baidu.mapauto.auth.org.spongycastle.asn1.t1
    public final int a() {
        return this.d;
    }

    public final byte[] c() throws IOException {
        int i = this.d;
        if (i == 0) {
            return e;
        }
        byte[] bArr = new byte[i];
        InputStream inputStream = this.f8293a;
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        int i3 = i - i2;
        this.d = i3;
        if (i3 != 0) {
            throw new EOFException(com.baidu.mapauto.auth.b.a("DEF length ").append(this.c).append(" object truncated by ").append(this.d).toString());
        }
        b();
        return bArr;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        if (this.d == 0) {
            return -1;
        }
        int read = this.f8293a.read();
        if (read < 0) {
            throw new EOFException(com.baidu.mapauto.auth.b.a("DEF length ").append(this.c).append(" object truncated by ").append(this.d).toString());
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            b();
        }
        return read;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int read = this.f8293a.read(bArr, i, Math.min(i2, i3));
        if (read < 0) {
            throw new EOFException(com.baidu.mapauto.auth.b.a("DEF length ").append(this.c).append(" object truncated by ").append(this.d).toString());
        }
        int i4 = this.d - read;
        this.d = i4;
        if (i4 == 0) {
            b();
        }
        return read;
    }
}
