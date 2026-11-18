package com.facebook.common.streams;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes11.dex */
public class TailAppendingInputStream extends FilterInputStream {
    private int mMarkedTailOffset;
    private final byte[] mTail;
    private int mTailOffset;

    public TailAppendingInputStream(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        inputStream.getClass();
        bArr.getClass();
        this.mTail = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int r0 = this.in.read();
        return r0 != -1 ? r0 : readNextTailByte();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int r6, int r7) throws IOException {
        int r0 = this.in.read(bArr, r6, r7);
        if (r0 != -1) {
            return r0;
        }
        int r1 = 0;
        if (r7 == 0) {
            return 0;
        }
        while (r1 < r7) {
            int nextTailByte = readNextTailByte();
            if (nextTailByte == -1) {
                break;
            }
            bArr[r6 + r1] = (byte) nextTailByte;
            r1++;
        }
        if (r1 > 0) {
            return r1;
        }
        return -1;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        if (this.in.markSupported()) {
            this.in.reset();
            this.mTailOffset = this.mMarkedTailOffset;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int r2) {
        if (this.in.markSupported()) {
            super.mark(r2);
            this.mMarkedTailOffset = this.mTailOffset;
        }
    }

    private int readNextTailByte() {
        int r0 = this.mTailOffset;
        byte[] bArr = this.mTail;
        if (r0 >= bArr.length) {
            return -1;
        }
        this.mTailOffset = r0 + 1;
        return bArr[r0] & 255;
    }
}
