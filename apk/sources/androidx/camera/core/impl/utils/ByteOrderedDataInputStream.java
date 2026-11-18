package androidx.camera.core.impl.utils;

import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: loaded from: classes.dex */
final class ByteOrderedDataInputStream extends InputStream implements DataInput {
    private ByteOrder mByteOrder;
    private final DataInputStream mDataInputStream;
    final int mLength;
    int mPosition;
    private static final ByteOrder LITTLE_ENDIAN = ByteOrder.LITTLE_ENDIAN;
    private static final ByteOrder BIG_ENDIAN = ByteOrder.BIG_ENDIAN;

    ByteOrderedDataInputStream(InputStream inputStream) throws IOException {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    ByteOrderedDataInputStream(InputStream inputStream, ByteOrder byteOrder) throws IOException {
        this.mByteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.mDataInputStream = dataInputStream;
        int r3 = dataInputStream.available();
        this.mLength = r3;
        this.mPosition = 0;
        dataInputStream.mark(r3);
        this.mByteOrder = byteOrder;
    }

    ByteOrderedDataInputStream(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public void setByteOrder(ByteOrder byteOrder) {
        this.mByteOrder = byteOrder;
    }

    public void seek(long j) throws IOException {
        int r0 = this.mPosition;
        if (r0 > j) {
            this.mPosition = 0;
            this.mDataInputStream.reset();
            this.mDataInputStream.mark(this.mLength);
        } else {
            j -= (long) r0;
        }
        int r4 = (int) j;
        if (skipBytes(r4) != r4) {
            throw new IOException("Couldn't seek up to the byteCount");
        }
    }

    public int peek() {
        return this.mPosition;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.mDataInputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int r3, int r4) throws IOException {
        int r2 = this.mDataInputStream.read(bArr, r3, r4);
        this.mPosition += r2;
        return r2;
    }

    @Override // java.io.DataInput
    public int readUnsignedByte() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public String readLine() {
        throw new UnsupportedOperationException("readLine() not implemented.");
    }

    @Override // java.io.DataInput
    public boolean readBoolean() throws IOException {
        this.mPosition++;
        return this.mDataInputStream.readBoolean();
    }

    @Override // java.io.DataInput
    public char readChar() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readChar();
    }

    @Override // java.io.DataInput
    public String readUTF() throws IOException {
        this.mPosition += 2;
        return this.mDataInputStream.readUTF();
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr, int r4, int r5) throws IOException {
        int r0 = this.mPosition + r5;
        this.mPosition = r0;
        if (r0 > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, r4, r5) != r5) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public void readFully(byte[] bArr) throws IOException {
        int length = this.mPosition + bArr.length;
        this.mPosition = length;
        if (length > this.mLength) {
            throw new EOFException();
        }
        if (this.mDataInputStream.read(bArr, 0, bArr.length) != bArr.length) {
            throw new IOException("Couldn't read up to the length of buffer");
        }
    }

    @Override // java.io.DataInput
    public byte readByte() throws IOException {
        int r0 = this.mPosition + 1;
        this.mPosition = r0;
        if (r0 > this.mLength) {
            throw new EOFException();
        }
        int r1 = this.mDataInputStream.read();
        if (r1 >= 0) {
            return (byte) r1;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public short readShort() throws IOException {
        int r0 = this.mPosition + 2;
        this.mPosition = r0;
        if (r0 > this.mLength) {
            throw new EOFException();
        }
        int r1 = this.mDataInputStream.read();
        int r2 = this.mDataInputStream.read();
        if ((r1 | r2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (short) ((r2 << 8) + r1);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (short) ((r1 << 8) + r2);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int readInt() throws IOException {
        int r0 = this.mPosition + 4;
        this.mPosition = r0;
        if (r0 > this.mLength) {
            throw new EOFException();
        }
        int r1 = this.mDataInputStream.read();
        int r2 = this.mDataInputStream.read();
        int r3 = this.mDataInputStream.read();
        int r4 = this.mDataInputStream.read();
        if ((r1 | r2 | r3 | r4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (r4 << 24) + (r3 << 16) + (r2 << 8) + r1;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (r1 << 24) + (r2 << 16) + (r3 << 8) + r4;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public int skipBytes(int r4) throws IOException {
        int r5 = Math.min(r4, this.mLength - this.mPosition);
        int r0 = 0;
        while (r0 < r5) {
            r0 += this.mDataInputStream.skipBytes(r5 - r0);
        }
        this.mPosition += r0;
        return r0;
    }

    @Override // java.io.DataInput
    public int readUnsignedShort() throws IOException {
        int r0 = this.mPosition + 2;
        this.mPosition = r0;
        if (r0 > this.mLength) {
            throw new EOFException();
        }
        int r1 = this.mDataInputStream.read();
        int r2 = this.mDataInputStream.read();
        if ((r1 | r2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (r2 << 8) + r1;
        }
        if (byteOrder == BIG_ENDIAN) {
            return (r1 << 8) + r2;
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    public long readUnsignedInt() throws IOException {
        return ((long) readInt()) & BodyPartID.bodyIdMax;
    }

    @Override // java.io.DataInput
    public long readLong() throws IOException {
        int r1 = this.mPosition + 8;
        this.mPosition = r1;
        if (r1 > this.mLength) {
            throw new EOFException();
        }
        int r2 = this.mDataInputStream.read();
        int r3 = this.mDataInputStream.read();
        int r4 = this.mDataInputStream.read();
        int r5 = this.mDataInputStream.read();
        int r6 = this.mDataInputStream.read();
        int r7 = this.mDataInputStream.read();
        int r8 = this.mDataInputStream.read();
        int r9 = this.mDataInputStream.read();
        if ((r2 | r3 | r4 | r5 | r6 | r7 | r8 | r9) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.mByteOrder;
        if (byteOrder == LITTLE_ENDIAN) {
            return (((long) r9) << 56) + (((long) r8) << 48) + (((long) r7) << 40) + (((long) r6) << 32) + (((long) r5) << 24) + (((long) r4) << 16) + (((long) r3) << 8) + ((long) r2);
        }
        if (byteOrder == BIG_ENDIAN) {
            return (((long) r2) << 56) + (((long) r3) << 48) + (((long) r4) << 40) + (((long) r5) << 32) + (((long) r6) << 24) + (((long) r7) << 16) + (((long) r8) << 8) + ((long) r9);
        }
        throw new IOException("Invalid byte order: " + this.mByteOrder);
    }

    @Override // java.io.DataInput
    public float readFloat() throws IOException {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public double readDouble() throws IOException {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.InputStream
    public void mark(int r3) {
        synchronized (this.mDataInputStream) {
            this.mDataInputStream.mark(r3);
        }
    }

    public int getLength() {
        return this.mLength;
    }
}
