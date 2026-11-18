package com.google.firebase.encoders.proto;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
final class LengthCountingOutputStream extends OutputStream {
    private long length = 0;

    LengthCountingOutputStream() {
    }

    @Override // java.io.OutputStream
    public void write(int r5) {
        this.length++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.length += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int r4, int r5) {
        int r6;
        if (r4 < 0 || r4 > bArr.length || r5 < 0 || (r6 = r4 + r5) > bArr.length || r6 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.length += (long) r5;
    }

    long getLength() {
        return this.length;
    }
}
