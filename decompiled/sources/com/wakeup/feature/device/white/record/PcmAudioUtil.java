package com.wakeup.feature.device.white.record;

import com.wakeup.common.log.LogUtils;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PcmAudioUtil.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u0014\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000eJ\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0005J&\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u0012J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/wakeup/feature/device/white/record/PcmAudioUtil;", "", "<init>", "()V", "SAMPLE_RATE", "", "CHANNELS", "BITS", "BYTES_PER_SAMPLE", "PCM_BYTES_PER_SEC", "MP3_BYTES_PER_SEC", "TAG", "", "alignToSample", "", "byteOffset", "secToPcmByte", "sec", "", "pcmDurationSec", "byteLen", "predictedMp3Bytes", "maxTrimSec", "singleSize", "trimPcm", "srcPath", "dstPath", "startSec", "endSec", "readWaveform", "", "pcmPath", "buckets", "feature-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PcmAudioUtil {
    public static final int BITS = 16;
    public static final int BYTES_PER_SAMPLE = 2;
    public static final int CHANNELS = 1;
    public static final PcmAudioUtil INSTANCE = new PcmAudioUtil();
    public static final int MP3_BYTES_PER_SEC = 4000;
    public static final int PCM_BYTES_PER_SEC = 32000;
    public static final int SAMPLE_RATE = 16000;
    private static final String TAG = "PcmAudioUtil";

    public final double maxTrimSec(int singleSize) {
        if (singleSize <= 0) {
            return 0.0d;
        }
        return singleSize / 4000;
    }

    public final double pcmDurationSec(long byteLen) {
        if (byteLen <= 0) {
            return 0.0d;
        }
        return byteLen / PCM_BYTES_PER_SEC;
    }

    public final long predictedMp3Bytes(double sec) {
        return (long) (sec * 4000);
    }

    private PcmAudioUtil() {
    }

    public final long alignToSample(long byteOffset) {
        return byteOffset - (byteOffset % 2);
    }

    public final long secToPcmByte(double sec) {
        return alignToSample((long) (sec * PCM_BYTES_PER_SEC));
    }

    public final long trimPcm(String srcPath, String dstPath, double startSec, double endSec) {
        int read;
        Intrinsics.checkNotNullParameter(srcPath, "srcPath");
        Intrinsics.checkNotNullParameter(dstPath, "dstPath");
        File file = new File(srcPath);
        if (!file.exists()) {
            return -1L;
        }
        long length = file.length();
        long coerceIn = RangesKt.coerceIn(secToPcmByte(startSec), 0L, length);
        long coerceIn2 = RangesKt.coerceIn(secToPcmByte(endSec), 0L, length);
        if (coerceIn2 <= coerceIn) {
            return -1L;
        }
        long alignToSample = alignToSample(coerceIn);
        long alignToSample2 = alignToSample(coerceIn2) - alignToSample;
        try {
            BufferedOutputStream randomAccessFile = new RandomAccessFile(file, "r");
            try {
                RandomAccessFile randomAccessFile2 = randomAccessFile;
                randomAccessFile2.seek(alignToSample);
                OutputStream fileOutputStream = new FileOutputStream(new File(dstPath));
                randomAccessFile = fileOutputStream instanceof BufferedOutputStream ? (BufferedOutputStream) fileOutputStream : new BufferedOutputStream(fileOutputStream, 8192);
                try {
                    BufferedOutputStream bufferedOutputStream = randomAccessFile;
                    byte[] bArr = new byte[65536];
                    long j = alignToSample2;
                    while (j > 0 && (read = randomAccessFile2.read(bArr, 0, (int) Math.min(65536, j))) > 0) {
                        bufferedOutputStream.write(bArr, 0, read);
                        j -= read;
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(randomAccessFile, null);
                    Unit unit2 = Unit.INSTANCE;
                    CloseableKt.closeFinally(randomAccessFile, null);
                    return alignToSample2;
                } finally {
                }
            } finally {
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "trimPcm error: " + e.getMessage());
            return -1L;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00cc A[ADDED_TO_REGION, EDGE_INSN: B:40:0x00cc->B:34:0x00cc BREAK  A[LOOP:1: B:25:0x009b->B:30:0x00ca], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00bb -> B:23:0x0093). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final float[] readWaveform(java.lang.String r23, int r24) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.white.record.PcmAudioUtil.readWaveform(java.lang.String, int):float[]");
    }
}
