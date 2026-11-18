package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzadi {
    public static int zza(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static int zzb(ByteBuffer byteBuffer) {
        int r4;
        if ((byteBuffer.get(5) & 2) == 0) {
            r4 = 0;
        } else {
            byte b = byteBuffer.get(26);
            int r2 = 28;
            int r5 = 28;
            for (int r3 = 0; r3 < b; r3++) {
                r5 += byteBuffer.get(r3 + 27);
            }
            byte b2 = byteBuffer.get(r5 + 26);
            for (int r6 = 0; r6 < b2; r6++) {
                r2 += byteBuffer.get(r5 + 27 + r6);
            }
            r4 = r5 + r2;
        }
        int r0 = byteBuffer.get(r4 + 26) + 27 + r4;
        return (int) ((zzg(byteBuffer.get(r0), byteBuffer.limit() - r0 > 1 ? byteBuffer.get(r0 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int zzc(ByteBuffer byteBuffer) {
        return (int) ((zzg(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long zzd(byte[] bArr) {
        return zzg(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static List zze(byte[] bArr) {
        long jZza = zza(bArr);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(zzi(zzh(jZza)));
        arrayList.add(zzi(zzh(3840L)));
        return arrayList;
    }

    public static boolean zzf(long j, long j2) {
        return j - j2 <= zzh(3840L) / 1000;
    }

    private static long zzg(byte b, byte b2) {
        int r3;
        int r5;
        int r0 = b & 255;
        int r6 = b & 3;
        if (r6 != 0) {
            r3 = 2;
            if (r6 != 1 && r6 != 2) {
                r3 = b2 & 63;
            }
        } else {
            r3 = 1;
        }
        int r7 = r0 >> 3;
        int r8 = r7 & 3;
        if (r7 >= 16) {
            r5 = 2500 << r8;
        } else if (r7 >= 12) {
            r5 = 10000 << (r7 & 1);
        } else {
            r5 = r8 == 3 ? 60000 : 10000 << r8;
        }
        return ((long) r3) * ((long) r5);
    }

    private static long zzh(long j) {
        return (j * 1000000000) / 48000;
    }

    private static byte[] zzi(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
