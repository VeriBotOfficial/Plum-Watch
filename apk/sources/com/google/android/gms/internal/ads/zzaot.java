package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzaot {
    public static long zza(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 16);
    }

    public static long zzb(ByteBuffer byteBuffer) {
        zzg(byteBuffer);
        return zze(byteBuffer, byteBuffer.position() + 12);
    }

    static Pair zzc(RandomAccessFile randomAccessFile) throws IOException {
        if (randomAccessFile.length() < 22) {
            return null;
        }
        Pair pairZzf = zzf(randomAccessFile, 0);
        return pairZzf != null ? pairZzf : zzf(randomAccessFile, 65535);
    }

    public static void zzd(ByteBuffer byteBuffer, long j) {
        zzg(byteBuffer);
        int r0 = byteBuffer.position() + 16;
        if (j >= 0 && j <= BodyPartID.bodyIdMax) {
            byteBuffer.putInt(byteBuffer.position() + r0, (int) j);
        } else {
            throw new IllegalArgumentException("uint32 value of out range: " + j);
        }
    }

    private static long zze(ByteBuffer byteBuffer, int r3) {
        return ((long) byteBuffer.getInt(r3)) & BodyPartID.bodyIdMax;
    }

    private static Pair zzf(RandomAccessFile randomAccessFile, int r9) throws IOException {
        int r5;
        long length = randomAccessFile.length();
        if (length < 22) {
            return null;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(((int) Math.min(r9, (-22) + length)) + 22);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        long jCapacity = length - ((long) byteBufferAllocate.capacity());
        randomAccessFile.seek(jCapacity);
        randomAccessFile.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
        zzg(byteBufferAllocate);
        int r8 = byteBufferAllocate.capacity();
        if (r8 >= 22) {
            int r10 = r8 - 22;
            int r2 = Math.min(r10, 65535);
            int r4 = 0;
            while (true) {
                if (r4 >= r2) {
                    r5 = -1;
                    break;
                }
                r5 = r10 - r4;
                if (byteBufferAllocate.getInt(r5) == 101010256 && ((char) byteBufferAllocate.getShort(r5 + 20)) == r4) {
                    break;
                }
                r4++;
            }
        } else {
            r5 = -1;
            break;
        }
        if (r5 == -1) {
            return null;
        }
        byteBufferAllocate.position(r5);
        ByteBuffer byteBufferSlice = byteBufferAllocate.slice();
        byteBufferSlice.order(ByteOrder.LITTLE_ENDIAN);
        return Pair.create(byteBufferSlice, Long.valueOf(jCapacity + ((long) r5)));
    }

    private static void zzg(ByteBuffer byteBuffer) {
        if (byteBuffer.order() != ByteOrder.LITTLE_ENDIAN) {
            throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
        }
    }
}
