package com.bytedance.sdk.component.rb.gff.fxn.fxn;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* loaded from: classes13.dex */
class gff implements Closeable {
    private final InputStream fxn;
    private byte[] gff;
    private int hm;
    private final Charset kg;
    private int rb;

    public gff(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    public gff(InputStream inputStream, int i, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(hm.fxn)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.fxn = inputStream;
        this.kg = charset;
        this.gff = new byte[i];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.fxn) {
            if (this.gff != null) {
                this.gff = null;
                this.fxn.close();
            }
        }
    }

    public String fxn() throws IOException {
        int i;
        byte[] bArr;
        int i2;
        synchronized (this.fxn) {
            if (this.gff == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.hm >= this.rb) {
                gff();
            }
            for (int i3 = this.hm; i3 != this.rb; i3++) {
                byte[] bArr2 = this.gff;
                if (bArr2[i3] == 10) {
                    if (i3 != this.hm) {
                        i2 = i3 - 1;
                        if (bArr2[i2] == 13) {
                            byte[] bArr3 = this.gff;
                            int i4 = this.hm;
                            String str = new String(bArr3, i4, i2 - i4, this.kg.name());
                            this.hm = i3 + 1;
                            return str;
                        }
                    }
                    i2 = i3;
                    byte[] bArr32 = this.gff;
                    int i42 = this.hm;
                    String str2 = new String(bArr32, i42, i2 - i42, this.kg.name());
                    this.hm = i3 + 1;
                    return str2;
                }
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((this.rb - this.hm) + 80) { // from class: com.bytedance.sdk.component.rb.gff.fxn.fxn.gff.1
                @Override // java.io.ByteArrayOutputStream
                public String toString() {
                    try {
                        return new String(this.buf, 0, (this.count <= 0 || this.buf[this.count + (-1)] != 13) ? this.count : this.count - 1, gff.this.kg.name());
                    } catch (UnsupportedEncodingException e) {
                        throw new AssertionError(e);
                    }
                }
            };
            loop1: while (true) {
                byte[] bArr4 = this.gff;
                int i5 = this.hm;
                byteArrayOutputStream.write(bArr4, i5, this.rb - i5);
                this.rb = -1;
                gff();
                i = this.hm;
                while (i != this.rb) {
                    bArr = this.gff;
                    if (bArr[i] == 10) {
                        break loop1;
                    }
                    i++;
                }
            }
            int i6 = this.hm;
            if (i != i6) {
                byteArrayOutputStream.write(bArr, i6, i - i6);
            }
            this.hm = i + 1;
            return byteArrayOutputStream.toString();
        }
    }

    public boolean kg() {
        return this.rb == -1;
    }

    private void gff() throws IOException {
        InputStream inputStream = this.fxn;
        byte[] bArr = this.gff;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read == -1) {
            throw new EOFException();
        }
        this.hm = 0;
        this.rb = read;
    }
}
