package com.baidu.bbalbscesium.k.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes12.dex */
public class b implements d {
    public static final int b = 16;
    public static final int c = 64;
    public static final int d = 8;
    public static final int e = 32;
    private static final int[] f = c(new byte[]{BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, 32, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, 32, BuiltinOptions.HashtableOptions});
    public static final int g = 32;

    /* renamed from: a, reason: collision with root package name */
    private final int f7425a;

    public b(int i) {
        this.f7425a = i;
    }

    private static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    private void a(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) throws GeneralSecurityException {
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer a2 = a(bArr, bArr2, this.f7425a + i3);
            int i4 = 64;
            if (i3 == i) {
                i4 = remaining % 64;
            }
            a.a(byteBuffer, byteBuffer2, a2, i4);
        }
    }

    static void a(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int a2 = a(i5 ^ iArr[i4], 16);
        iArr[i4] = a2;
        int i6 = iArr[i3] + a2;
        iArr[i3] = i6;
        int a3 = a(iArr[i2] ^ i6, 12);
        iArr[i2] = a3;
        int i7 = iArr[i] + a3;
        iArr[i] = i7;
        int a4 = a(iArr[i4] ^ i7, 8);
        iArr[i4] = a4;
        int i8 = iArr[i3] + a4;
        iArr[i3] = i8;
        iArr[i2] = a(iArr[i2] ^ i8, 7);
    }

    static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    int a() {
        return 12;
    }

    ByteBuffer a(byte[] bArr, byte[] bArr2, int i) {
        int[] a2 = a(c(bArr), c(bArr2), i);
        int[] iArr = (int[]) a2.clone();
        a(iArr);
        for (int i2 = 0; i2 < a2.length; i2++) {
            a2[i2] = a2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a2, 0, 16);
        return order;
    }

    void a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (byteBuffer.remaining() - a() < bArr.length) {
            throw new IllegalArgumentException("data output is too small");
        }
        if (bArr2 == null) {
            bArr2 = new byte[a()];
            new Random().nextBytes(bArr2);
        }
        byteBuffer.put(bArr2);
        a(bArr2, com.baidu.bbalbscesium.k.c.b.b(), byteBuffer, ByteBuffer.wrap(bArr));
    }

    byte[] a(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() < a()) {
            throw new GeneralSecurityException("data too short");
        }
        byte[] bArr = new byte[a()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        a(bArr, com.baidu.bbalbscesium.k.c.b.a(), allocate, byteBuffer);
        return allocate.array();
    }

    @Override // com.baidu.bbalbscesium.k.b.d
    public byte[] a(byte[] bArr) throws GeneralSecurityException {
        return a(ByteBuffer.wrap(bArr));
    }

    public byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > Integer.MAX_VALUE - a()) {
            throw new GeneralSecurityException("data too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(a() + bArr.length);
        a(allocate, bArr, bArr2);
        return allocate.array();
    }

    int[] a(int[] iArr, int[] iArr2, int i) {
        if (iArr.length != a() / 4) {
            throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr3 = new int[16];
        a(iArr3, iArr2);
        iArr3[12] = i;
        System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
        return iArr3;
    }

    @Override // com.baidu.bbalbscesium.k.b.d
    public byte[] b(byte[] bArr) throws GeneralSecurityException {
        return a(bArr, (byte[]) null);
    }
}
