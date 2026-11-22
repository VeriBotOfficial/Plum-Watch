package com.anythink.basead.exoplayer.j;

import java.io.InputStream;

/* loaded from: classes11.dex */
public final class j extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private final h f2638a;
    private final k b;
    private long f;
    private boolean d = false;
    private boolean e = false;
    private final byte[] c = new byte[1];

    public j(h hVar, k kVar) {
        this.f2638a = hVar;
        this.b = kVar;
    }

    public final long a() {
        return this.f;
    }

    public final void b() {
        c();
    }

    @Override // java.io.InputStream
    public final int read() {
        if (read(this.c) == -1) {
            return -1;
        }
        return this.c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        com.anythink.basead.exoplayer.k.a.b(!this.e);
        c();
        int a2 = this.f2638a.a(bArr, i, i2);
        if (a2 == -1) {
            return -1;
        }
        this.f += a2;
        return a2;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.f2638a.b();
        this.e = true;
    }

    private void c() {
        if (this.d) {
            return;
        }
        this.f2638a.a(this.b);
        this.d = true;
    }
}
