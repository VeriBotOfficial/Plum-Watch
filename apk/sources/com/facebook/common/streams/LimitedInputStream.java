package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class LimitedInputStream extends FilterInputStream {
    private int mBytesToRead;
    private int mBytesToReadWhenMarked;

    public LimitedInputStream(InputStream inputStream, int r2) {
        super(inputStream);
        inputStream.getClass();
        if (r2 < 0) {
            throw new IllegalArgumentException("limit must be >= 0");
        }
        this.mBytesToRead = r2;
        this.mBytesToReadWhenMarked = -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (this.mBytesToRead == 0) {
            return -1;
        }
        int r0 = this.in.read();
        if (r0 != -1) {
            this.mBytesToRead--;
        }
        return r0;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int r3, int r4) throws IOException {
        int r0 = this.mBytesToRead;
        if (r0 == 0) {
            return -1;
        }
        int r2 = this.in.read(bArr, r3, Math.min(r4, r0));
        if (r2 > 0) {
            this.mBytesToRead -= r2;
        }
        return r2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j) throws IOException {
        long jSkip = this.in.skip(Math.min(j, this.mBytesToRead));
        this.mBytesToRead = (int) (((long) this.mBytesToRead) - jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        return Math.min(this.in.available(), this.mBytesToRead);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r2) {
        if (this.in.markSupported()) {
            this.in.mark(r2);
            this.mBytesToReadWhenMarked = this.mBytesToRead;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("mark is not supported");
        }
        if (this.mBytesToReadWhenMarked == -1) {
            throw new IOException("mark not set");
        }
        this.in.reset();
        this.mBytesToRead = this.mBytesToReadWhenMarked;
    }
}
