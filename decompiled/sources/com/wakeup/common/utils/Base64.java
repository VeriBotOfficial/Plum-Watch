package com.wakeup.common.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public class Base64 {
    private Base64() {
    }

    public static Encoder getEncoder() {
        return Encoder.RFC4648;
    }

    public static Encoder getUrlEncoder() {
        return Encoder.RFC4648_URLSAFE;
    }

    public static Encoder getMimeEncoder() {
        return Encoder.RFC2045;
    }

    public static Encoder getMimeEncoder(int lineLength, byte[] lineSeparator) {
        Objects.requireNonNull(lineSeparator);
        int[] iArr = Decoder.fromBase64;
        for (byte b : lineSeparator) {
            if (iArr[b & 255] != -1) {
                throw new IllegalArgumentException("Illegal base64 line separator character 0x" + Integer.toString(b, 16));
            }
        }
        if (lineLength <= 0) {
            return Encoder.RFC4648;
        }
        return new Encoder(false, lineSeparator, (lineLength >> 2) << 2, true);
    }

    public static Decoder getDecoder() {
        return Decoder.RFC4648;
    }

    public static Decoder getUrlDecoder() {
        return Decoder.RFC4648_URLSAFE;
    }

    public static Decoder getMimeDecoder() {
        return Decoder.RFC2045;
    }

    public static class Encoder {
        private static final byte[] CRLF;
        private static final int MIMELINEMAX = 76;
        static final Encoder RFC2045;
        private final boolean doPadding;
        private final boolean isURL;
        private final int linemax;
        private final byte[] newline;
        private static final char[] toBase64 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};
        private static final char[] toBase64URL = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', Matrix.MATRIX_TYPE_RANDOM_LT, 'M', 'N', 'O', 'P', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'S', 'T', Matrix.MATRIX_TYPE_RANDOM_UT, 'V', 'W', 'X', 'Y', Matrix.MATRIX_TYPE_ZERO, 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '_'};
        static final Encoder RFC4648 = new Encoder(false, null, -1, true);
        static final Encoder RFC4648_URLSAFE = new Encoder(true, null, -1, true);

        private Encoder(boolean isURL, byte[] newline, int linemax, boolean doPadding) {
            this.isURL = isURL;
            this.newline = newline;
            this.linemax = linemax;
            this.doPadding = doPadding;
        }

        static {
            byte[] bArr = {13, 10};
            CRLF = bArr;
            RFC2045 = new Encoder(false, bArr, 76, true);
        }

        private final int outLength(int srclen) {
            int i;
            if (this.doPadding) {
                i = ((srclen + 2) / 3) * 4;
            } else {
                int i2 = srclen % 3;
                i = ((srclen / 3) * 4) + (i2 == 0 ? 0 : i2 + 1);
            }
            int i3 = this.linemax;
            return i3 > 0 ? i + (((i - 1) / i3) * this.newline.length) : i;
        }

        public byte[] encode(byte[] src) {
            int outLength = outLength(src.length);
            byte[] bArr = new byte[outLength];
            int encode0 = encode0(src, 0, src.length, bArr);
            return encode0 != outLength ? Arrays.copyOf(bArr, encode0) : bArr;
        }

        public int encode(byte[] src, byte[] dst) {
            if (dst.length < outLength(src.length)) {
                throw new IllegalArgumentException("Output byte array is too small for encoding all input bytes");
            }
            return encode0(src, 0, src.length, dst);
        }

        public String encodeToString(byte[] src) {
            byte[] encode = encode(src);
            return new String(encode, 0, 0, encode.length);
        }

        public ByteBuffer encode(ByteBuffer buffer) {
            int encode0;
            int outLength = outLength(buffer.remaining());
            byte[] bArr = new byte[outLength];
            if (buffer.hasArray()) {
                encode0 = encode0(buffer.array(), buffer.arrayOffset() + buffer.position(), buffer.arrayOffset() + buffer.limit(), bArr);
                buffer.position(buffer.limit());
            } else {
                int remaining = buffer.remaining();
                byte[] bArr2 = new byte[remaining];
                buffer.get(bArr2);
                encode0 = encode0(bArr2, 0, remaining, bArr);
            }
            if (encode0 != outLength) {
                bArr = Arrays.copyOf(bArr, encode0);
            }
            return ByteBuffer.wrap(bArr);
        }

        public OutputStream wrap(OutputStream os) {
            Objects.requireNonNull(os);
            return new EncOutputStream(os, this.isURL ? toBase64URL : toBase64, this.newline, this.linemax, this.doPadding);
        }

        public Encoder withoutPadding() {
            return !this.doPadding ? this : new Encoder(this.isURL, this.newline, this.linemax, false);
        }

        private int encode0(byte[] src, int off, int end, byte[] dst) {
            char[] cArr = this.isURL ? toBase64URL : toBase64;
            int i = ((end - off) / 3) * 3;
            int i2 = off + i;
            int i3 = this.linemax;
            if (i3 > 0 && i > (i3 / 4) * 3) {
                i = (i3 / 4) * 3;
            }
            int i4 = off;
            int i5 = 0;
            while (i4 < i2) {
                int min = Math.min(i4 + i, i2);
                int i6 = i4;
                int i7 = i5;
                while (i6 < min) {
                    int i8 = i6 + 2;
                    int i9 = ((src[i6 + 1] & 255) << 8) | ((src[i6] & 255) << 16);
                    i6 += 3;
                    int i10 = i9 | (src[i8] & 255);
                    dst[i7] = (byte) cArr[(i10 >>> 18) & 63];
                    dst[i7 + 1] = (byte) cArr[(i10 >>> 12) & 63];
                    int i11 = i7 + 3;
                    dst[i7 + 2] = (byte) cArr[(i10 >>> 6) & 63];
                    i7 += 4;
                    dst[i11] = (byte) cArr[i10 & 63];
                }
                int i12 = ((min - i4) / 3) * 4;
                i5 += i12;
                if (i12 == this.linemax && min < end) {
                    byte[] bArr = this.newline;
                    int length = bArr.length;
                    int i13 = 0;
                    while (i13 < length) {
                        dst[i5] = bArr[i13];
                        i13++;
                        i5++;
                    }
                }
                i4 = min;
            }
            if (i4 >= end) {
                return i5;
            }
            int i14 = i4 + 1;
            int i15 = src[i4] & 255;
            int i16 = i5 + 1;
            dst[i5] = (byte) cArr[i15 >> 2];
            if (i14 == end) {
                int i17 = i5 + 2;
                dst[i16] = (byte) cArr[(i15 << 4) & 63];
                if (!this.doPadding) {
                    return i17;
                }
                int i18 = i5 + 3;
                dst[i17] = 61;
                int i19 = i5 + 4;
                dst[i18] = 61;
                return i19;
            }
            int i20 = src[i14] & 255;
            dst[i16] = (byte) cArr[((i15 << 4) & 63) | (i20 >> 4)];
            int i21 = i5 + 3;
            dst[i5 + 2] = (byte) cArr[(i20 << 2) & 63];
            if (!this.doPadding) {
                return i21;
            }
            int i22 = i5 + 4;
            dst[i21] = 61;
            return i22;
        }
    }

    public static class Decoder {
        static final Decoder RFC2045;
        static final Decoder RFC4648;
        static final Decoder RFC4648_URLSAFE;
        private static final int[] fromBase64;
        private static final int[] fromBase64URL;
        private final boolean isMIME;
        private final boolean isURL;

        private Decoder(boolean isURL, boolean isMIME) {
            this.isURL = isURL;
            this.isMIME = isMIME;
        }

        static {
            int[] iArr = new int[256];
            fromBase64 = iArr;
            Arrays.fill(iArr, -1);
            for (int i = 0; i < Encoder.toBase64.length; i++) {
                fromBase64[Encoder.toBase64[i]] = i;
            }
            fromBase64[61] = -2;
            int[] iArr2 = new int[256];
            fromBase64URL = iArr2;
            Arrays.fill(iArr2, -1);
            for (int i2 = 0; i2 < Encoder.toBase64URL.length; i2++) {
                fromBase64URL[Encoder.toBase64URL[i2]] = i2;
            }
            fromBase64URL[61] = -2;
            RFC4648 = new Decoder(false, false);
            RFC4648_URLSAFE = new Decoder(true, false);
            RFC2045 = new Decoder(false, true);
        }

        public byte[] decode(byte[] src) {
            int outLength = outLength(src, 0, src.length);
            byte[] bArr = new byte[outLength];
            int decode0 = decode0(src, 0, src.length, bArr);
            return decode0 != outLength ? Arrays.copyOf(bArr, decode0) : bArr;
        }

        public byte[] decode(String src) {
            return decode(src.getBytes(StandardCharsets.ISO_8859_1));
        }

        public int decode(byte[] src, byte[] dst) {
            if (dst.length < outLength(src, 0, src.length)) {
                throw new IllegalArgumentException("Output byte array is too small for decoding all input bytes");
            }
            return decode0(src, 0, src.length, dst);
        }

        public ByteBuffer decode(ByteBuffer buffer) {
            int remaining;
            byte[] bArr;
            int i;
            int position = buffer.position();
            try {
                if (buffer.hasArray()) {
                    bArr = buffer.array();
                    i = buffer.arrayOffset() + buffer.position();
                    remaining = buffer.arrayOffset() + buffer.limit();
                    buffer.position(buffer.limit());
                } else {
                    remaining = buffer.remaining();
                    bArr = new byte[remaining];
                    buffer.get(bArr);
                    i = 0;
                }
                byte[] bArr2 = new byte[outLength(bArr, i, remaining)];
                return ByteBuffer.wrap(bArr2, 0, decode0(bArr, i, remaining, bArr2));
            } catch (IllegalArgumentException e) {
                buffer.position(position);
                throw e;
            }
        }

        public InputStream wrap(InputStream is) {
            Objects.requireNonNull(is);
            return new DecInputStream(is, this.isURL ? fromBase64URL : fromBase64, this.isMIME);
        }

        private int outLength(byte[] src, int sp, int sl) {
            int i;
            int[] iArr = this.isURL ? fromBase64URL : fromBase64;
            int i2 = sl - sp;
            int i3 = 0;
            if (i2 == 0) {
                return 0;
            }
            if (i2 < 2) {
                if (this.isMIME && iArr[0] == -1) {
                    return 0;
                }
                throw new IllegalArgumentException("Input byte[] should at least have 2 bytes for base64 bytes");
            }
            if (this.isMIME) {
                int i4 = 0;
                while (true) {
                    if (sp >= sl) {
                        break;
                    }
                    int i5 = sp + 1;
                    int i6 = src[sp] & 255;
                    if (i6 == 61) {
                        i2 -= (sl - i5) + 1;
                        break;
                    }
                    if (iArr[i6] == -1) {
                        i4++;
                    }
                    sp = i5;
                }
                i2 -= i4;
            } else if (src[sl - 1] == 61) {
                i3 = src[sl - 2] == 61 ? 2 : 1;
            }
            if (i3 == 0 && (i = i2 & 3) != 0) {
                i3 = 4 - i;
            }
            return (((i2 + 3) / 4) * 3) - i3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x002b, code lost:
        
            if (r12[r8] == 61) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
        
            if (r4 != 18) goto L33;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private int decode0(byte[] r12, int r13, int r14, byte[] r15) {
            /*
                Method dump skipped, instructions count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.utils.Base64.Decoder.decode0(byte[], int, int, byte[]):int");
        }
    }

    private static class EncOutputStream extends FilterOutputStream {
        private int b0;
        private int b1;
        private int b2;
        private final char[] base64;
        private boolean closed;
        private final boolean doPadding;
        private int leftover;
        private final int linemax;
        private int linepos;
        private final byte[] newline;

        EncOutputStream(OutputStream os, char[] base64, byte[] newline, int linemax, boolean doPadding) {
            super(os);
            this.leftover = 0;
            this.closed = false;
            this.linepos = 0;
            this.base64 = base64;
            this.newline = newline;
            this.linemax = linemax;
            this.doPadding = doPadding;
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(int b) throws IOException {
            write(new byte[]{(byte) (b & 255)}, 0, 1);
        }

        private void checkNewline() throws IOException {
            if (this.linepos == this.linemax) {
                this.out.write(this.newline);
                this.linepos = 0;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] b, int off, int len) throws IOException {
            if (this.closed) {
                throw new IOException("Stream is closed");
            }
            if (off < 0 || len < 0 || len > b.length - off) {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (len == 0) {
                return;
            }
            int i = this.leftover;
            if (i != 0) {
                if (i == 1) {
                    int i2 = off + 1;
                    this.b1 = b[off] & 255;
                    len--;
                    if (len == 0) {
                        this.leftover = i + 1;
                        return;
                    }
                    off = i2;
                }
                this.b2 = b[off] & 255;
                len--;
                checkNewline();
                this.out.write(this.base64[this.b0 >> 2]);
                this.out.write(this.base64[((this.b0 << 4) & 63) | (this.b1 >> 4)]);
                this.out.write(this.base64[((this.b1 << 2) & 63) | (this.b2 >> 6)]);
                this.out.write(this.base64[this.b2 & 63]);
                this.linepos += 4;
                off++;
            }
            int i3 = len / 3;
            this.leftover = len - (i3 * 3);
            while (true) {
                int i4 = i3 - 1;
                if (i3 <= 0) {
                    break;
                }
                checkNewline();
                int i5 = off + 2;
                int i6 = ((b[off + 1] & 255) << 8) | ((b[off] & 255) << 16);
                off += 3;
                int i7 = i6 | (b[i5] & 255);
                this.out.write(this.base64[(i7 >>> 18) & 63]);
                this.out.write(this.base64[(i7 >>> 12) & 63]);
                this.out.write(this.base64[(i7 >>> 6) & 63]);
                this.out.write(this.base64[i7 & 63]);
                this.linepos += 4;
                i3 = i4;
            }
            int i8 = this.leftover;
            if (i8 == 1) {
                this.b0 = b[off] & 255;
            } else if (i8 == 2) {
                this.b0 = b[off] & 255;
                this.b1 = b[off + 1] & 255;
            }
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            int i = this.leftover;
            if (i == 1) {
                checkNewline();
                this.out.write(this.base64[this.b0 >> 2]);
                this.out.write(this.base64[(this.b0 << 4) & 63]);
                if (this.doPadding) {
                    this.out.write(61);
                    this.out.write(61);
                }
            } else if (i == 2) {
                checkNewline();
                this.out.write(this.base64[this.b0 >> 2]);
                this.out.write(this.base64[((this.b0 << 4) & 63) | (this.b1 >> 4)]);
                this.out.write(this.base64[(this.b1 << 2) & 63]);
                if (this.doPadding) {
                    this.out.write(61);
                }
            }
            this.leftover = 0;
            this.out.close();
        }
    }

    private static class DecInputStream extends InputStream {
        private final int[] base64;
        private final InputStream is;
        private final boolean isMIME;
        private int bits = 0;
        private int nextin = 18;
        private int nextout = -8;
        private boolean eof = false;
        private boolean closed = false;
        private byte[] sbBuf = new byte[1];

        DecInputStream(InputStream is, int[] base64, boolean isMIME) {
            this.is = is;
            this.base64 = base64;
            this.isMIME = isMIME;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (read(this.sbBuf, 0, 1) == -1) {
                return -1;
            }
            return this.sbBuf[0] & 255;
        }

        @Override // java.io.InputStream
        public int read(byte[] b, int off, int len) throws IOException {
            int i;
            if (this.closed) {
                throw new IOException("Stream is closed");
            }
            if (this.eof && this.nextout < 0) {
                return -1;
            }
            if (off < 0 || len < 0 || len > b.length - off) {
                throw new IndexOutOfBoundsException();
            }
            if (this.nextout >= 0) {
                int i2 = off;
                while (len != 0) {
                    i = i2 + 1;
                    int i3 = this.bits;
                    int i4 = this.nextout;
                    b[i2] = (byte) (i3 >> i4);
                    len--;
                    int i5 = i4 - 8;
                    this.nextout = i5;
                    if (i5 < 0) {
                        this.bits = 0;
                    } else {
                        i2 = i;
                    }
                }
                return i2 - off;
            }
            i = off;
            while (true) {
                if (len <= 0) {
                    break;
                }
                int read = this.is.read();
                if (read == -1) {
                    this.eof = true;
                    int i6 = this.nextin;
                    if (i6 != 18) {
                        if (i6 == 12) {
                            throw new IOException("Base64 stream has one un-decoded dangling byte.");
                        }
                        int i7 = i + 1;
                        int i8 = this.bits;
                        b[i] = (byte) (i8 >> 16);
                        int i9 = len - 1;
                        if (i6 == 0) {
                            if (i9 == 0) {
                                this.bits = i8 >> 8;
                                this.nextout = 0;
                            } else {
                                i += 2;
                                b[i7] = (byte) (i8 >> 8);
                            }
                        }
                        i = i7;
                    }
                    if (i == off) {
                        return -1;
                    }
                    return i - off;
                }
                if (read == 61) {
                    int i10 = this.nextin;
                    if (i10 == 18 || i10 == 12 || (i10 == 6 && this.is.read() != 61)) {
                        throw new IOException("Illegal base64 ending sequence:" + this.nextin);
                    }
                    int i11 = i + 1;
                    int i12 = this.bits;
                    b[i] = (byte) (i12 >> 16);
                    int i13 = len - 1;
                    if (this.nextin == 0) {
                        if (i13 == 0) {
                            this.bits = i12 >> 8;
                            this.nextout = 0;
                        } else {
                            i += 2;
                            b[i11] = (byte) (i12 >> 8);
                            this.eof = true;
                        }
                    }
                    i = i11;
                    this.eof = true;
                } else {
                    int i14 = this.base64[read];
                    if (i14 == -1) {
                        if (!this.isMIME) {
                            throw new IOException("Illegal base64 character " + Integer.toString(i14, 16));
                        }
                    } else {
                        int i15 = this.bits;
                        int i16 = this.nextin;
                        this.bits = (i14 << i16) | i15;
                        if (i16 == 0) {
                            this.nextin = 18;
                            this.nextout = 16;
                            while (true) {
                                int i17 = this.nextout;
                                if (i17 >= 0) {
                                    int i18 = i + 1;
                                    b[i] = (byte) (this.bits >> i17);
                                    len--;
                                    int i19 = i17 - 8;
                                    this.nextout = i19;
                                    if (len == 0 && i19 >= 0) {
                                        return i18 - off;
                                    }
                                    i = i18;
                                } else {
                                    this.bits = 0;
                                    break;
                                }
                            }
                        } else {
                            this.nextin = i16 - 6;
                        }
                    }
                }
            }
            return i - off;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (this.closed) {
                throw new IOException("Stream is closed");
            }
            return this.is.available();
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.closed) {
                return;
            }
            this.closed = true;
            this.is.close();
        }
    }
}
