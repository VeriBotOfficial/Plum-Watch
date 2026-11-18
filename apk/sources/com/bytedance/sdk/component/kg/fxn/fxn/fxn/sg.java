package com.bytedance.sdk.component.kg.fxn.fxn.fxn;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes15.dex */
public class sg extends InputStream {
    InputStream fxn;
    HttpURLConnection kg;

    public sg(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.fxn = inputStream;
        this.kg = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int r3, int r4) throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.read(bArr, r3, r4);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            inputStream.close();
            this.fxn = null;
        }
        HttpURLConnection httpURLConnection = this.kg;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.kg = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int r2) {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            inputStream.mark(r2);
        }
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.fxn;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }
}
