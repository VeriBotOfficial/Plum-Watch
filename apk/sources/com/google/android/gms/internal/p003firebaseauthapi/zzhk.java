package com.google.android.gms.internal.p003firebaseauthapi;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* JADX INFO: loaded from: classes12.dex */
final class zzhk {
    private static final int[] zza = zza(new byte[]{BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, 32, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, 32, BuiltinOptions.HashtableOptions});

    private static int zza(int r1, int r2) {
        return (r1 >>> (-r2)) | (r1 << r2);
    }

    private static void zza(int[] r2, int r3, int r4, int r5, int r6) {
        int r0 = r2[r3] + r2[r4];
        r2[r3] = r0;
        int r1 = zza(r0 ^ r2[r6], 16);
        r2[r6] = r1;
        int r7 = r2[r5] + r1;
        r2[r5] = r7;
        int r8 = zza(r2[r4] ^ r7, 12);
        r2[r4] = r8;
        int r9 = r2[r3] + r8;
        r2[r3] = r9;
        int r10 = zza(r2[r6] ^ r9, 8);
        r2[r6] = r10;
        int r11 = r2[r5] + r10;
        r2[r5] = r11;
        r2[r4] = zza(r2[r4] ^ r11, 7);
    }

    static void zza(int[] r3, int[] r4) {
        int[] r0 = zza;
        System.arraycopy(r0, 0, r3, 0, r0.length);
        System.arraycopy(r4, 0, r3, r0.length, 8);
    }

    static void zza(int[] r16) {
        for (int r2 = 0; r2 < 10; r2++) {
            zza(r16, 0, 4, 8, 12);
            zza(r16, 1, 5, 9, 13);
            zza(r16, 2, 6, 10, 14);
            zza(r16, 3, 7, 11, 15);
            zza(r16, 0, 5, 10, 15);
            zza(r16, 1, 6, 11, 12);
            zza(r16, 2, 7, 8, 13);
            zza(r16, 3, 4, 9, 14);
        }
    }

    static byte[] zza(byte[] bArr, byte[] bArr2) {
        int[] r1 = zzb(zza(bArr), zza(bArr2));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(r1.length << 2).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(r1);
        return byteBufferOrder.array();
    }

    static int[] zzb(int[] r4, int[] r5) {
        int[] r0 = new int[16];
        zza(r0, r4);
        r0[12] = r5[0];
        r0[13] = r5[1];
        r0[14] = r5[2];
        r0[15] = r5[3];
        zza(r0);
        r0[4] = r0[12];
        r0[5] = r0[13];
        r0[6] = r0[14];
        r0[7] = r0[15];
        return Arrays.copyOf(r0, 8);
    }

    static int[] zza(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] r0 = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(r0);
        return r0;
    }
}
