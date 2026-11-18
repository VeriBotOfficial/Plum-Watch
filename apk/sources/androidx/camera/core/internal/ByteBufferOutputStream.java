package androidx.camera.core.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public final class ByteBufferOutputStream extends OutputStream {
    private final ByteBuffer mByteBuffer;

    public ByteBufferOutputStream(ByteBuffer byteBuffer) {
        this.mByteBuffer = byteBuffer;
    }

    @Override // java.io.OutputStream
    public void write(int r2) throws IOException {
        if (!this.mByteBuffer.hasRemaining()) {
            throw new EOFException("Output ByteBuffer has no bytes remaining.");
        }
        this.mByteBuffer.put((byte) r2);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int r4, int r5) throws IOException {
        int r0;
        bArr.getClass();
        if (r4 < 0 || r4 > bArr.length || r5 < 0 || (r0 = r4 + r5) > bArr.length || r0 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (r5 == 0) {
            return;
        }
        if (this.mByteBuffer.remaining() < r5) {
            throw new EOFException("Output ByteBuffer has insufficient bytes remaining.");
        }
        this.mByteBuffer.put(bArr, r4, r5);
    }
}
