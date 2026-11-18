package com.google.protobuf.micro;

import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes12.dex */
public final class ByteStringMicro {
    public static final ByteStringMicro EMPTY = new ByteStringMicro(new byte[0]);
    private final byte[] bytes;
    private volatile int hash = 0;

    private ByteStringMicro(byte[] bArr) {
        this.bytes = bArr;
    }

    public byte byteAt(int r2) {
        return this.bytes[r2];
    }

    public int size() {
        return this.bytes.length;
    }

    public boolean isEmpty() {
        return this.bytes.length == 0;
    }

    public static ByteStringMicro copyFrom(byte[] bArr, int r3, int r4) {
        byte[] bArr2 = new byte[r4];
        System.arraycopy(bArr, r3, bArr2, 0, r4);
        return new ByteStringMicro(bArr2);
    }

    public static ByteStringMicro copyFrom(byte[] bArr) {
        return copyFrom(bArr, 0, bArr.length);
    }

    public static ByteStringMicro copyFrom(String str, String str2) throws UnsupportedEncodingException {
        return new ByteStringMicro(str.getBytes(str2));
    }

    public static ByteStringMicro copyFromUtf8(String str) {
        try {
            return new ByteStringMicro(str.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public void copyTo(byte[] bArr, int r5) {
        byte[] bArr2 = this.bytes;
        System.arraycopy(bArr2, 0, bArr, r5, bArr2.length);
    }

    public void copyTo(byte[] bArr, int r3, int r4, int r5) {
        System.arraycopy(this.bytes, r3, bArr, r4, r5);
    }

    public byte[] toByteArray() {
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public String toString(String str) throws UnsupportedEncodingException {
        return new String(this.bytes, str);
    }

    public String toStringUtf8() {
        try {
            return new String(this.bytes, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported?");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ByteStringMicro)) {
            return false;
        }
        byte[] bArr = this.bytes;
        int length = bArr.length;
        byte[] bArr2 = ((ByteStringMicro) obj).bytes;
        if (length != bArr2.length) {
            return false;
        }
        for (int r4 = 0; r4 < length; r4++) {
            if (bArr[r4] != bArr2[r4]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int r0 = this.hash;
        if (r0 == 0) {
            byte[] bArr = this.bytes;
            int length = bArr.length;
            for (byte b : bArr) {
                length = (length * 31) + b;
            }
            r0 = length == 0 ? 1 : length;
            this.hash = r0;
        }
        return r0;
    }
}
