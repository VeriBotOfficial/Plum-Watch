package com.efs.sdk.memleaksdk.monitor.shark;

import android.gov.nist.core.Separators;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* loaded from: classes14.dex */
final class q implements n {

    /* renamed from: a, reason: collision with root package name */
    public final l f9920a = new l();
    public final v b;
    boolean c;

    q(v vVar) {
        if (vVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = vVar;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.v
    public long b(l lVar, long j) throws IOException {
        if (lVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.f9920a.b == 0 && this.b.b(this.f9920a, 8192L) == -1) {
            return -1L;
        }
        return this.f9920a.b(lVar, Math.min(j, this.f9920a.b));
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public boolean b() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        return this.f9920a.b() && this.b.b(this.f9920a, 8192L) == -1;
    }

    public void d(long j) throws IOException {
        if (!e(j)) {
            throw new EOFException();
        }
    }

    public boolean e(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.f9920a.b < j) {
            if (this.b.b(this.f9920a, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public byte c() throws IOException {
        d(1L);
        return this.f9920a.c();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public byte[] b(long j) throws IOException {
        d(j);
        return this.f9920a.b(j);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        if (this.f9920a.b == 0 && this.b.b(this.f9920a, 8192L) == -1) {
            return -1;
        }
        return this.f9920a.read(byteBuffer);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public String a(long j) throws IOException {
        d(j);
        return this.f9920a.a(j);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public String a(long j, Charset charset) throws IOException {
        d(j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        return this.f9920a.a(j, charset);
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public short d() throws IOException {
        d(2L);
        return this.f9920a.d();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public int e() throws IOException {
        d(4L);
        return this.f9920a.e();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public long f() throws IOException {
        d(8L);
        return this.f9920a.f();
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public void c(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            if (this.f9920a.b == 0 && this.b.b(this.f9920a, 8192L) == -1) {
                throw new EOFException();
            }
            long min = Math.min(j, this.f9920a.a());
            this.f9920a.c(min);
            j -= min;
        }
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.n
    public long a(byte b) throws IOException {
        return a(b, 0L, Long.MAX_VALUE);
    }

    public long a(byte b, long j, long j2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j), Long.valueOf(j2)));
        }
        long j3 = j;
        while (j3 < j2) {
            byte b2 = b;
            long j4 = j2;
            long a2 = this.f9920a.a(b2, j3, j4);
            if (a2 == -1) {
                long j5 = this.f9920a.b;
                if (j5 >= j4 || this.b.b(this.f9920a, 8192L) == -1) {
                    break;
                }
                j3 = Math.max(j3, j5);
                b = b2;
                j2 = j4;
            } else {
                return a2;
            }
        }
        return -1L;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.c;
    }

    @Override // com.efs.sdk.memleaksdk.monitor.shark.v, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.f9920a.g();
    }

    public String toString() {
        return "buffer(" + this.b + Separators.RPAREN;
    }
}
