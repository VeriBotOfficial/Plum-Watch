package androidx.camera.core.impl.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
class ByteOrderedDataOutputStream extends FilterOutputStream {
    private ByteOrder mByteOrder;
    final OutputStream mOutputStream;

    ByteOrderedDataOutputStream(OutputStream outputStream, ByteOrder byteOrder) {
        super(outputStream);
        this.mOutputStream = outputStream;
        this.mByteOrder = byteOrder;
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mOutputStream.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int r3, int r4) throws IOException {
        this.mOutputStream.write(bArr, r3, r4);
    }

    public void writeByte(int r2) throws IOException {
        this.mOutputStream.write(r2);
    }

    public void writeShort(short s) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(s & 255);
            this.mOutputStream.write((s >>> 8) & 255);
        } else if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((s >>> 8) & 255);
            this.mOutputStream.write(s & 255);
        }
    }

    public void writeInt(int r3) throws IOException {
        if (this.mByteOrder == ByteOrder.LITTLE_ENDIAN) {
            this.mOutputStream.write(r3 & 255);
            this.mOutputStream.write((r3 >>> 8) & 255);
            this.mOutputStream.write((r3 >>> 16) & 255);
            this.mOutputStream.write((r3 >>> 24) & 255);
            return;
        }
        if (this.mByteOrder == ByteOrder.BIG_ENDIAN) {
            this.mOutputStream.write((r3 >>> 24) & 255);
            this.mOutputStream.write((r3 >>> 16) & 255);
            this.mOutputStream.write((r3 >>> 8) & 255);
            this.mOutputStream.write(r3 & 255);
        }
    }

    public void writeUnsignedShort(int r1) throws IOException {
        writeShort((short) r1);
    }

    public void writeUnsignedInt(long j) throws IOException {
        writeInt((int) j);
    }
}
