package com.google.android.gms.internal.ads;

import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzadg {
    private static final String[] zza = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] zzb = {44100, OpusUtil.SAMPLE_RATE, PcmAudioUtil.PCM_BYTES_PER_SEC};
    private static final int[] zzc = {PcmAudioUtil.PCM_BYTES_PER_SEC, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] zzd = {PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] zze = {PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] zzf = {PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] zzg = {8000, 16000, ErrorCode.ERROR_TTS_INVALID_PARA, PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    public static int zzc(int r5) {
        int r0;
        int r2;
        if (!zzm(r5) || (r0 = (r5 >>> 19) & 3) == 1 || (r2 = (r5 >>> 17) & 3) == 0) {
            return -1;
        }
        int r3 = r5 >>> 12;
        int r6 = (r5 >>> 10) & 3;
        int r4 = r3 & 15;
        if (r4 == 0 || r4 == 15 || r6 == 3) {
            return -1;
        }
        return zzl(r0, r2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zzl(int r2, int r3) {
        if (r3 != 1) {
            return r3 != 2 ? 384 : 1152;
        }
        return r2 == 3 ? 1152 : 576;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzm(int r1) {
        return (r1 & (-2097152)) == -2097152;
    }

    public static int zzb(int r7) {
        int r0;
        int r4;
        int r5;
        int r6;
        int r8;
        if (!zzm(r7) || (r0 = (r7 >>> 19) & 3) == 1 || (r4 = (r7 >>> 17) & 3) == 0 || (r5 = (r7 >>> 12) & 15) == 0 || r5 == 15 || (r6 = (r7 >>> 10) & 3) == 3) {
            return -1;
        }
        int r9 = r5 - 1;
        int r1 = zzb[r6];
        if (r0 == 2) {
            r1 /= 2;
        } else if (r0 == 0) {
            r1 /= 4;
        }
        int r10 = (r7 >>> 9) & 1;
        if (r4 == 3) {
            return ((((r0 == 3 ? zzc[r9] : zzd[r9]) * 12) / r1) + r10) * 4;
        }
        if (r0 == 3) {
            r8 = r4 == 2 ? zze[r9] : zzf[r9];
        } else {
            r8 = zzg[r9];
        }
        if (r0 == 3) {
            return ((r8 * 144) / r1) + r10;
        }
        return (((r4 == 1 ? 72 : 144) * r8) / r1) + r10;
    }
}
