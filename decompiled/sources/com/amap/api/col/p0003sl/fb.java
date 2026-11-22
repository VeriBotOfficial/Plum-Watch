package com.amap.api.col.p0003sl;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* compiled from: StrictLineReader.java */
/* loaded from: classes11.dex */
public final class fb implements Closeable {
    public static final Charset f = Charset.forName("US-ASCII");

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f1654a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    /* compiled from: StrictLineReader.java */
    final class a extends ByteArrayOutputStream {
        a(int i) {
            super(i);
        }

        @Override // java.io.ByteArrayOutputStream
        public final String toString() {
            int i = ((ByteArrayOutputStream) this).count;
            if (i > 0) {
                int i2 = i - 1;
                if (((ByteArrayOutputStream) this).buf[i2] == 13) {
                    i = i2;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i, fb.this.b.name());
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
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.d = 0;
        this.e = read;
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

    public final String a() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.f1654a) {
            if (this.c == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.d >= this.e) {
                b();
            }
            for (int i3 = this.d; i3 != this.e; i3++) {
                byte[] bArr2 = this.c;
                if (bArr2[i3] == 10) {
                    if (i3 != this.d) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            byte[] bArr3 = this.c;
                            int i4 = this.d;
                            String str = new String(bArr3, i4, i2 - i4, this.b.name());
                            this.d = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    byte[] bArr32 = this.c;
                    int i42 = this.d;
                    String str2 = new String(bArr32, i42, i2 - i42, this.b.name());
                    this.d = i3 + 1;
                    return str2;
                }
            }
            a aVar = new a((this.e - this.d) + 80);
            loop1: while (true) {
                byte[] bArr4 = this.c;
                int i5 = this.d;
                aVar.write(bArr4, i5, this.e - i5);
                this.e = -1;
                b();
                i = this.d;
                while (i != this.e) {
                    bArr = this.c;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.d;
            if (i != i6) {
                aVar.write(bArr, i6, i - i6);
            }
            this.d = i + 1;
            return aVar.toString();
        }
    }
}
