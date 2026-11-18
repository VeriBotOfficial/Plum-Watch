package com.amap.api.col.p0003sl;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: StrictLineReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class fb implements Closeable {
    public static final Charset f = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputStream f1654a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    /* JADX INFO: compiled from: StrictLineReader.java */
    final class a extends ByteArrayOutputStream {
        a(int r2) {
            super(r2);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int r0 = ((ByteArrayOutputStream) this).count;
            if (r0 > 0) {
                int r2 = r0 - 1;
                if (((ByteArrayOutputStream) this).buf[r2] == 13) {
                    r0 = r2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, r0, fb.this.b.name());
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
    }

    public fb(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private void b() throws IOException {
        InputStream inputStream = this.f1654a;
        byte[] bArr = this.c;
        int r0 = inputStream.read(bArr, 0, bArr.length);
        if (r0 == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = r0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        synchronized (this.f1654a) {
            if (this.c != null) {
                this.c = null;
                this.f1654a.close();
            }
        }
    }

    private fb(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (!charset.equals(f)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f1654a = inputStream;
        this.b = charset;
        this.c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002b  */
    public final String a() throws IOException {
        int r2;
        byte[] bArr;
        int r3;
        synchronized (this.f1654a) {
            if (this.c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.d >= this.e) {
                b();
            }
            for (int r1 = this.d; r1 != this.e; r1++) {
                byte[] bArr2 = this.c;
                if (bArr2[r1] == 10) {
                    if (r1 != this.d) {
                        r3 = r1 - 1;
                        if (bArr2[r3] != 13) {
                            r3 = r1;
                        }
                    } else {
                        r3 = r1;
                    }
                    byte[] bArr3 = this.c;
                    int r5 = this.d;
                    String str = new String(bArr3, r5, r3 - r5, this.b.name());
                    this.d = r1 + 1;
                    return str;
                }
            }
            a aVar = new a((this.e - this.d) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.c;
                int r4 = this.d;
                aVar.write(bArr4, r4, this.e - r4);
                this.e = -1;
                b();
                r2 = this.d;
                while (r2 != this.e) {
                    bArr = this.c;
                    if (bArr[r2] == 10) {
                        break loop1;
                    }
                    r2++;
                }
            }
            int r6 = this.d;
            if (r2 != r6) {
                aVar.write(bArr, r6, r2 - r6);
            }
            this.d = r2 + 1;
            return aVar.toString();
        }
    }
}
