package com.mbridge.msdk.playercommon.exoplayer2.extractor;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ogg.DefaultOggSeeker;
import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* JADX INFO: loaded from: classes2.dex */
public final class MpegAudioHeader {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public int bitrate;
    public int channels;
    public int frameSize;
    public String mimeType;
    public int sampleRate;
    public int samplesPerFrame;
    public int version;
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, PcmAudioUtil.PCM_BYTES_PER_SEC};
    private static final int[] BITRATE_V1_L1 = {32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448};
    private static final int[] BITRATE_V2_L1 = {32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256};
    private static final int[] BITRATE_V1_L2 = {32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384};
    private static final int[] BITRATE_V1_L3 = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320};
    private static final int[] BITRATE_V2 = {8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160};

    public static int getFrameSize(int r7) {
        int r0;
        int r4;
        int r5;
        int r6;
        int r8;
        if ((r7 & (-2097152)) != -2097152 || (r0 = (r7 >>> 19) & 3) == 1 || (r4 = (r7 >>> 17) & 3) == 0 || (r5 = (r7 >>> 12) & 15) == 0 || r5 == 15 || (r6 = (r7 >>> 10) & 3) == 3) {
            return -1;
        }
        int r2 = SAMPLING_RATE_V1[r6];
        if (r0 == 2) {
            r2 /= 2;
        } else if (r0 == 0) {
            r2 /= 4;
        }
        int r9 = (r7 >>> 9) & 1;
        if (r4 == 3) {
            return ((((r0 == 3 ? BITRATE_V1_L1[r5 - 1] : BITRATE_V2_L1[r5 - 1]) * ErrorCode.MSP_ERROR_HTTP_BASE) / r2) + r9) * 4;
        }
        if (r0 == 3) {
            r8 = r4 == 2 ? BITRATE_V1_L2[r5 - 1] : BITRATE_V1_L3[r5 - 1];
        } else {
            r8 = BITRATE_V2[r5 - 1];
        }
        if (r0 == 3) {
            return ((r8 * 144000) / r2) + r9;
        }
        return (((r4 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * r8) / r2) + r9;
    }

    public static boolean populateHeader(int r11, MpegAudioHeader mpegAudioHeader) {
        int r4;
        int r3;
        int r5;
        int r6;
        int r7;
        int r8;
        int r9;
        int r10;
        if ((r11 & (-2097152)) != -2097152 || (r4 = (r11 >>> 19) & 3) == 1 || (r3 = (r11 >>> 17) & 3) == 0 || (r5 = (r11 >>> 12) & 15) == 0 || r5 == 15 || (r6 = (r11 >>> 10) & 3) == 3) {
            return false;
        }
        int r2 = SAMPLING_RATE_V1[r6];
        if (r4 == 2) {
            r2 /= 2;
        } else if (r4 == 0) {
            r2 /= 4;
        }
        int r12 = r2;
        int r13 = (r11 >>> 9) & 1;
        if (r3 == 3) {
            r7 = r4 == 3 ? BITRATE_V1_L1[r5 - 1] : BITRATE_V2_L1[r5 - 1];
            r9 = (((r7 * ErrorCode.MSP_ERROR_HTTP_BASE) / r12) + r13) * 4;
            r10 = 384;
        } else {
            int r14 = 1152;
            if (r4 == 3) {
                r7 = r3 == 2 ? BITRATE_V1_L2[r5 - 1] : BITRATE_V1_L3[r5 - 1];
                r8 = (144000 * r7) / r12;
            } else {
                r7 = BITRATE_V2[r5 - 1];
                r14 = r3 == 1 ? 576 : 1152;
                r8 = ((r3 == 1 ? DefaultOggSeeker.MATCH_RANGE : 144000) * r7) / r12;
            }
            r9 = r8 + r13;
            r10 = r14;
        }
        mpegAudioHeader.setValues(r4, MIME_TYPE_BY_LAYER[3 - r3], r9, r12, ((r11 >> 6) & 3) == 3 ? 1 : 2, r7 * 1000, r10);
        return true;
    }

    private void setValues(int r1, String str, int r3, int r4, int r5, int r6, int r7) {
        this.version = r1;
        this.mimeType = str;
        this.frameSize = r3;
        this.sampleRate = r4;
        this.channels = r5;
        this.bitrate = r6;
        this.samplesPerFrame = r7;
    }
}
