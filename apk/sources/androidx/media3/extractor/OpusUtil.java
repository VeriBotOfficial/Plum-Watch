package androidx.media3.extractor;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private static long getPacketDurationUs(byte b, byte b2) {
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

    private OpusUtil() {
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & 255;
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long jSampleCountToNanoseconds = sampleCountToNanoseconds(getPreSkipSamples(bArr));
        long jSampleCountToNanoseconds2 = sampleCountToNanoseconds(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(buildNativeOrderByteArray(jSampleCountToNanoseconds));
        arrayList.add(buildNativeOrderByteArray(jSampleCountToNanoseconds2));
        return arrayList;
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        int oggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int r1 = byteBuffer.get(oggPacketForPreAudioSampleByteCount + 26) + 27 + oggPacketForPreAudioSampleByteCount;
        return (int) ((getPacketDurationUs(byteBuffer.get(r1), byteBuffer.limit() - r1 > 1 ? byteBuffer.get(r1 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b = byteBuffer.get(26);
        int r2 = 28;
        int r4 = 28;
        for (int r3 = 0; r3 < b; r3++) {
            r4 += byteBuffer.get(r3 + 27);
        }
        byte b2 = byteBuffer.get(r4 + 26);
        for (int r1 = 0; r1 < b2; r1++) {
            r2 += byteBuffer.get(r4 + 27 + r1);
        }
        return r4 + r2;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        return (int) ((getPacketDurationUs(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    public static long getPacketDurationUs(byte[] bArr) {
        return getPacketDurationUs(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }

    public static int getPreSkipSamples(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean needToDecodeOpusFrame(long j, long j2) {
        return j - j2 <= sampleCountToNanoseconds(3840L) / 1000;
    }

    private static byte[] buildNativeOrderByteArray(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }

    private static long sampleCountToNanoseconds(long j) {
        return (j * 1000000000) / 48000;
    }
}
