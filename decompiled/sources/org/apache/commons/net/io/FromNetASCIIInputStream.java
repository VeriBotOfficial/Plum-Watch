package org.apache.commons.net.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;

/* loaded from: classes8.dex */
public final class FromNetASCIIInputStream extends PushbackInputStream {
    static final String _lineSeparator;
    static final byte[] _lineSeparatorBytes;
    static final boolean _noConversionRequired;
    private int length;

    static {
        String lineSeparator = System.lineSeparator();
        _lineSeparator = lineSeparator;
        _noConversionRequired = lineSeparator.equals("\r\n");
        _lineSeparatorBytes = lineSeparator.getBytes(StandardCharsets.US_ASCII);
    }

    public static boolean isConversionRequired() {
        return !_noConversionRequired;
    }

    public FromNetASCIIInputStream(InputStream inputStream) {
        super(inputStream, _lineSeparatorBytes.length + 1);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        if (this.in == null) {
            throw new IOException("Stream closed");
        }
        return (this.buf.length - this.pos) + this.in.available();
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (_noConversionRequired) {
            return super.read();
        }
        return readInt();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.PushbackInputStream, java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (_noConversionRequired) {
            return super.read(bArr, i, i2);
        }
        if (i2 < 1) {
            return 0;
        }
        int min = Math.min(i2, available());
        this.length = min;
        if (min < 1) {
            this.length = 1;
        }
        int readInt = readInt();
        if (readInt == -1) {
            return -1;
        }
        int i4 = i;
        while (true) {
            i3 = i4 + 1;
            bArr[i4] = (byte) readInt;
            int i5 = this.length - 1;
            this.length = i5;
            if (i5 <= 0 || (readInt = readInt()) == -1) {
                break;
            }
            i4 = i3;
        }
        return i3 - i;
    }

    private int readInt() throws IOException {
        int read = super.read();
        if (read != 13) {
            return read;
        }
        int read2 = super.read();
        if (read2 != 10) {
            if (read2 != -1) {
                unread(read2);
            }
            return 13;
        }
        unread(_lineSeparatorBytes);
        this.length--;
        return super.read();
    }
}
