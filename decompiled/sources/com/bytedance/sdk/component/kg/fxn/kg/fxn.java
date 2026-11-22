package com.bytedance.sdk.component.kg.fxn.kg;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes13.dex */
public final class fxn implements gff, kg, Cloneable, ByteChannel {
    private static final byte[] gff = {BuiltinOptions.SliceOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TileOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions};
    rb fxn;
    long kg;

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
    }

    @Override // java.io.Flushable
    public void flush() {
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public boolean fxn() {
        return this.kg == 0;
    }

    public byte kg() {
        if (this.kg == 0) {
            throw new IllegalStateException("size == 0");
        }
        rb rbVar = this.fxn;
        int i = rbVar.kg;
        int i2 = rbVar.gff;
        int i3 = i + 1;
        byte b = rbVar.fxn[i];
        this.kg--;
        if (i3 == i2) {
            this.fxn = rbVar.kg();
            bh.fxn(rbVar);
            return b;
        }
        rbVar.kg = i3;
        return b;
    }

    public String gff() {
        try {
            return fxn(this.kg, jq.fxn);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String fxn(long j, Charset charset) throws EOFException {
        jq.fxn(this.kg, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        if (j == 0) {
            return "";
        }
        rb rbVar = this.fxn;
        if (rbVar.kg + j > rbVar.gff) {
            return new String(fxn(j), charset);
        }
        String str = new String(rbVar.fxn, rbVar.kg, (int) j, charset);
        rbVar.kg = (int) (rbVar.kg + j);
        this.kg -= j;
        if (rbVar.kg == rbVar.gff) {
            this.fxn = rbVar.kg();
            bh.fxn(rbVar);
        }
        return str;
    }

    public byte[] fxn(long j) throws EOFException {
        jq.fxn(this.kg, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        }
        byte[] bArr = new byte[(int) j];
        fxn(bArr);
        return bArr;
    }

    public void fxn(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int fxn = fxn(bArr, i, bArr.length - i);
            if (fxn == -1) {
                throw new EOFException();
            }
            i += fxn;
        }
    }

    public int fxn(byte[] bArr, int i, int i2) {
        jq.fxn(bArr.length, i, i2);
        rb rbVar = this.fxn;
        if (rbVar == null) {
            return -1;
        }
        int min = Math.min(i2, rbVar.gff - rbVar.kg);
        System.arraycopy(rbVar.fxn, rbVar.kg, bArr, i, min);
        rbVar.kg += min;
        this.kg -= min;
        if (rbVar.kg == rbVar.gff) {
            this.fxn = rbVar.kg();
            bh.fxn(rbVar);
        }
        return min;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        rb rbVar = this.fxn;
        if (rbVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rbVar.gff - rbVar.kg);
        byteBuffer.put(rbVar.fxn, rbVar.kg, min);
        rbVar.kg += min;
        this.kg -= min;
        if (rbVar.kg == rbVar.gff) {
            this.fxn = rbVar.kg();
            bh.fxn(rbVar);
        }
        return min;
    }

    public fxn fxn(String str) {
        return fxn(str, 0, str.length());
    }

    public fxn fxn(String str, int i, int i2) {
        char charAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt2 = str.charAt(i);
            if (charAt2 < 128) {
                rb gff2 = gff(1);
                byte[] bArr = gff2.fxn;
                int i3 = gff2.gff - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                bArr[i + i3] = (byte) charAt2;
                while (true) {
                    i = i4;
                    if (i >= min || (charAt = str.charAt(i)) >= 128) {
                        break;
                    }
                    i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                }
                int i5 = (i3 + i) - gff2.gff;
                gff2.gff += i5;
                this.kg += i5;
            } else {
                if (charAt2 < 2048) {
                    kg((charAt2 >> 6) | 192);
                    kg((charAt2 & '?') | 128);
                } else if (charAt2 < 55296 || charAt2 > 57343) {
                    kg((charAt2 >> '\f') | 224);
                    kg(((charAt2 >> 6) & 63) | 128);
                    kg((charAt2 & '?') | 128);
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt2 > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        kg(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt2 & 10239) << 10) | (9215 & charAt3)) + 65536;
                        kg((i7 >> 18) | 240);
                        kg(((i7 >> 12) & 63) | 128);
                        kg(((i7 >> 6) & 63) | 128);
                        kg((i7 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
        return this;
    }

    public fxn fxn(int i) {
        if (i < 128) {
            kg(i);
            return this;
        }
        if (i < 2048) {
            kg((i >> 6) | 192);
            kg((i & 63) | 128);
            return this;
        }
        if (i >= 65536) {
            if (i <= 1114111) {
                kg((i >> 18) | 240);
                kg(((i >> 12) & 63) | 128);
                kg(((i >> 6) & 63) | 128);
                kg((i & 63) | 128);
                return this;
            }
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        if (i >= 55296 && i <= 57343) {
            kg(63);
            return this;
        }
        kg((i >> 12) | 224);
        kg(((i >> 6) & 63) | 128);
        kg((i & 63) | 128);
        return this;
    }

    public fxn fxn(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (charset.equals(jq.fxn)) {
            return fxn(str, i, i2);
        }
        byte[] bytes = str.substring(i, i2).getBytes(charset);
        return kg(bytes, 0, bytes.length);
    }

    public fxn kg(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        jq.fxn(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            rb gff2 = gff(1);
            int min = Math.min(i3 - i, 8192 - gff2.gff);
            System.arraycopy(bArr, i, gff2.fxn, gff2.gff, min);
            i += min;
            gff2.gff += min;
        }
        this.kg += j;
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            rb gff2 = gff(1);
            int min = Math.min(i, 8192 - gff2.gff);
            byteBuffer.get(gff2.fxn, gff2.gff, min);
            i -= min;
            gff2.gff += min;
        }
        this.kg += remaining;
        return remaining;
    }

    public fxn kg(int i) {
        rb gff2 = gff(1);
        byte[] bArr = gff2.fxn;
        int i2 = gff2.gff;
        gff2.gff = i2 + 1;
        bArr[i2] = (byte) i;
        this.kg++;
        return this;
    }

    public fxn kg(long j) {
        if (j == 0) {
            return kg(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        rb gff2 = gff(numberOfTrailingZeros);
        byte[] bArr = gff2.fxn;
        int i = gff2.gff;
        for (int i2 = (gff2.gff + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = gff[(int) (15 & j)];
            j >>>= 4;
        }
        gff2.gff += numberOfTrailingZeros;
        this.kg += numberOfTrailingZeros;
        return this;
    }

    rb gff(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        rb rbVar = this.fxn;
        if (rbVar == null) {
            rb fxn = bh.fxn();
            this.fxn = fxn;
            fxn.f9374sg = fxn;
            fxn.bh = fxn;
            return fxn;
        }
        rb rbVar2 = rbVar.f9374sg;
        return (rbVar2.gff + i > 8192 || !rbVar2.rb) ? rbVar2.fxn(bh.fxn()) : rbVar2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fxn)) {
            return false;
        }
        fxn fxnVar = (fxn) obj;
        long j = this.kg;
        if (j != fxnVar.kg) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        rb rbVar = this.fxn;
        rb rbVar2 = fxnVar.fxn;
        int i = rbVar.kg;
        int i2 = rbVar2.kg;
        while (j2 < this.kg) {
            long min = Math.min(rbVar.gff - i, rbVar2.gff - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (rbVar.fxn[i] != rbVar2.fxn[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == rbVar.gff) {
                rbVar = rbVar.bh;
                i = rbVar.kg;
            }
            if (i2 == rbVar2.gff) {
                rbVar2 = rbVar2.bh;
                i2 = rbVar2.kg;
            }
            j2 += min;
        }
        return true;
    }

    public int hashCode() {
        rb rbVar = this.fxn;
        if (rbVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rbVar.gff;
            for (int i3 = rbVar.kg; i3 < i2; i3++) {
                i = (i * 31) + rbVar.fxn[i3];
            }
            rbVar = rbVar.bh;
        } while (rbVar != this.fxn);
        return i;
    }

    public String toString() {
        return rb().toString();
    }

    /* renamed from: hm, reason: merged with bridge method [inline-methods] */
    public fxn clone() {
        fxn fxnVar = new fxn();
        if (this.kg == 0) {
            return fxnVar;
        }
        rb fxn = this.fxn.fxn();
        fxnVar.fxn = fxn;
        fxn.f9374sg = fxn;
        fxn.bh = fxn;
        rb rbVar = this.fxn;
        while (true) {
            rbVar = rbVar.bh;
            if (rbVar != this.fxn) {
                fxnVar.fxn.f9374sg.fxn(rbVar.fxn());
            } else {
                fxnVar.kg = this.kg;
                return fxnVar;
            }
        }
    }

    public final hm rb() {
        long j = this.kg;
        if (j > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.kg);
        }
        return hm((int) j);
    }

    public final hm hm(int i) {
        if (i == 0) {
            return hm.gff;
        }
        return new sg(this, i);
    }
}
