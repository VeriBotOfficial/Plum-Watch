package com.bykv.vk.openvk.preload.geckox.buffer.stream;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: BufferInputStream.java */
/* loaded from: classes13.dex */
public final class a extends InputStream {

    /* renamed from: a, reason: collision with root package name */
    private com.bykv.vk.openvk.preload.geckox.buffer.a f9184a;
    private long b;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public a(com.bykv.vk.openvk.preload.geckox.buffer.a aVar) {
        this.f9184a = aVar;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f9184a.b(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f9184a.b(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.f9184a.a(j);
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long b = this.f9184a.b() - this.f9184a.c();
        if (b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) b;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.b = i;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f9184a.b(this.b);
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f9184a.d();
    }
}
