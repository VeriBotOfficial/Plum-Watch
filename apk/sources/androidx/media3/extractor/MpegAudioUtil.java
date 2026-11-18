package androidx.media3.extractor;

import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* JADX INFO: loaded from: classes8.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, OpusUtil.SAMPLE_RATE, PcmAudioUtil.PCM_BYTES_PER_SEC};
    private static final int[] BITRATE_V1_L1 = {PcmAudioUtil.PCM_BYTES_PER_SEC, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
    private static final int[] BITRATE_V1_L2 = {PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, ErrorCode.ERROR_TTS_INVALID_PARA, PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int r1) {
        return (r1 & (-2097152)) == -2097152;
    }

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public Header() {
        }

        public Header(Header header) {
            this.version = header.version;
            this.mimeType = header.mimeType;
            this.frameSize = header.frameSize;
            this.sampleRate = header.sampleRate;
            this.channels = header.channels;
            this.bitrate = header.bitrate;
            this.samplesPerFrame = header.samplesPerFrame;
        }

        public boolean setForHeaderData(int r9) {
            int r0;
            int r4;
            int r5;
            int r6;
            if (!MpegAudioUtil.isMagicPresent(r9) || (r0 = (r9 >>> 19) & 3) == 1 || (r4 = (r9 >>> 17) & 3) == 0 || (r5 = (r9 >>> 12) & 15) == 0 || r5 == 15 || (r6 = (r9 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = r0;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - r4];
            int r1 = MpegAudioUtil.SAMPLING_RATE_V1[r6];
            this.sampleRate = r1;
            if (r0 == 2) {
                this.sampleRate = r1 / 2;
            } else if (r0 == 0) {
                this.sampleRate = r1 / 4;
            }
            int r2 = (r9 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(r0, r4);
            if (r4 == 3) {
                int r3 = r0 == 3 ? MpegAudioUtil.BITRATE_V1_L1[r5 - 1] : MpegAudioUtil.BITRATE_V2_L1[r5 - 1];
                this.bitrate = r3;
                this.frameSize = (((r3 * 12) / this.sampleRate) + r2) * 4;
            } else {
                if (r0 == 3) {
                    int r7 = r4 == 2 ? MpegAudioUtil.BITRATE_V1_L2[r5 - 1] : MpegAudioUtil.BITRATE_V1_L3[r5 - 1];
                    this.bitrate = r7;
                    this.frameSize = ((r7 * 144) / this.sampleRate) + r2;
                } else {
                    int r8 = MpegAudioUtil.BITRATE_V2[r5 - 1];
                    this.bitrate = r8;
                    this.frameSize = (((r4 == 1 ? 72 : 144) * r8) / this.sampleRate) + r2;
                }
            }
            this.channels = ((r9 >> 6) & 3) == 3 ? 1 : 2;
            return true;
        }
    }

    public static int getFrameSize(int r7) {
        int r0;
        int r4;
        int r5;
        int r6;
        int r8;
        if (!isMagicPresent(r7) || (r0 = (r7 >>> 19) & 3) == 1 || (r4 = (r7 >>> 17) & 3) == 0 || (r5 = (r7 >>> 12) & 15) == 0 || r5 == 15 || (r6 = (r7 >>> 10) & 3) == 3) {
            return -1;
        }
        int r1 = SAMPLING_RATE_V1[r6];
        if (r0 == 2) {
            r1 /= 2;
        } else if (r0 == 0) {
            r1 /= 4;
        }
        int r9 = (r7 >>> 9) & 1;
        if (r4 == 3) {
            return ((((r0 == 3 ? BITRATE_V1_L1[r5 - 1] : BITRATE_V2_L1[r5 - 1]) * 12) / r1) + r9) * 4;
        }
        if (r0 == 3) {
            r8 = r4 == 2 ? BITRATE_V1_L2[r5 - 1] : BITRATE_V1_L3[r5 - 1];
        } else {
            r8 = BITRATE_V2[r5 - 1];
        }
        if (r0 == 3) {
            return ((r8 * 144) / r1) + r9;
        }
        return (((r4 == 1 ? 72 : 144) * r8) / r1) + r9;
    }

    public static int parseMpegAudioFrameSampleCount(int r6) {
        int r0;
        int r3;
        if (!isMagicPresent(r6) || (r0 = (r6 >>> 19) & 3) == 1 || (r3 = (r6 >>> 17) & 3) == 0) {
            return -1;
        }
        int r4 = (r6 >>> 12) & 15;
        int r7 = (r6 >>> 10) & 3;
        if (r4 == 0 || r4 == 15 || r7 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(r0, r3);
    }

    private MpegAudioUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int r3, int r4) {
        if (r4 == 1) {
            if (r3 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (r4 == 2) {
            return 1152;
        }
        if (r4 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }
}
