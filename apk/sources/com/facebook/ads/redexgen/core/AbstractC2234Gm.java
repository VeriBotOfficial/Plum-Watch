package com.facebook.ads.redexgen.core;

import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC2234Gm {
    public static byte[] A00;
    public static String[] A01 = {"wNk4F48Tu3AG7Z4F7CEax", "Q3Xv5sIL2TDrtW8yXR3dvi", "vexXXyFX5NNV4ziL4Q5MBx4locsFR2tR", "qvuj1ZZFgqOZzW4yl3sJoBizwIu3mzuW", "F9U7Z4TBUsCQBus7nNJljVmhfAVgv4lP", "pwS", "B3rn9fTC63wAJDGOR1lgaZRSiOmdejRD", "uz6PPvsEvjCr7qg3UfeXn9kgEA7UaI0b"};
    public static final int[] A02;
    public static final int[] A03;
    public static final int[] A04;
    public static final int[] A05;
    public static final int[] A06;
    public static final int[] A07;
    public static final String[] A08;

    public static String A04(int r2, int r3, int r4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, r2, r2 + r3);
        for (int r1 = 0; r1 < bArrCopyOfRange.length; r1++) {
            bArrCopyOfRange[r1] = (byte) ((bArrCopyOfRange[r1] - r4) - 125);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{BuiltinOptions.EqualOptions, BuiltinOptions.RangeOptions, BuiltinOptions.PowOptions, 61, BuiltinOptions.ZerosLikeOptions, 3, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.PackOptions, -12, 8, -9, -4, 2, -62, 0, 3, -8, -6, -64, -33, -60, BuiltinOptions.SelectOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ShapeOptions, 61, -3, BuiltinOptions.PackOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.TileOptions, BuiltinOptions.EqualOptions, -5, 26, 0};
    }

    static {
        A05();
        A08 = new String[]{A04(10, 13, 22), A04(23, 13, 81), A04(0, 10, 87)};
        A07 = new int[]{44100, OpusUtil.SAMPLE_RATE, PcmAudioUtil.PCM_BYTES_PER_SEC};
        A02 = new int[]{PcmAudioUtil.PCM_BYTES_PER_SEC, 64000, 96000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 288000, 320000, 352000, 384000, 416000, 448000};
        A06 = new int[]{PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND};
        A03 = new int[]{PcmAudioUtil.PCM_BYTES_PER_SEC, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000, 384000};
        A04 = new int[]{PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 160000, DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND, 224000, AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND, 320000};
        A05 = new int[]{8000, 16000, ErrorCode.ERROR_TTS_INVALID_PARA, PcmAudioUtil.PCM_BYTES_PER_SEC, 40000, OpusUtil.SAMPLE_RATE, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    }

    public static int A00(int r10) {
        int r7;
        int layer;
        int padding;
        int r1;
        int samplingRate;
        int version;
        if (!A06(r10) || (r7 = (r10 >>> 19) & 3) == 1 || (layer = (r10 >>> 17) & 3) == 0 || (padding = (r10 >>> 12) & 15) == 0 || padding == 15 || (r1 = (r10 >>> 10) & 3) == 3) {
            return -1;
        }
        int r3 = A07[r1];
        if (r7 == 2) {
            r3 /= 2;
        } else if (r7 == 0) {
            r3 /= 4;
        }
        int r11 = (r10 >>> 9) & 1;
        if (layer == 3) {
            if (r7 == 3) {
                int version2 = padding - 1;
                version = A02[version2];
            } else {
                int version3 = padding - 1;
                version = A06[version3];
            }
            return (((version * 12) / r3) + r11) * 4;
        }
        if (r7 == 3) {
            if (layer == 2) {
                int version4 = padding - 1;
                samplingRate = A03[version4];
            } else {
                int version5 = padding - 1;
                samplingRate = A04[version5];
            }
        } else {
            int[] r9 = A05;
            String[] strArr = A01;
            String str = strArr[0];
            String str2 = strArr[1];
            int samplingRate2 = str.length();
            int version6 = str2.length();
            if (samplingRate2 == version6) {
                throw new RuntimeException();
            }
            A01[5] = "31X";
            int version7 = padding - 1;
            samplingRate = r9[version7];
        }
        if (r7 == 3) {
            int version8 = samplingRate * 144;
            return (version8 / r3) + r11;
        }
        int version9 = layer == 1 ? 72 : 144;
        return ((version9 * samplingRate) / r3) + r11;
    }

    public static int A01(int r7) {
        int r5;
        int layer;
        if (!A06(r7) || (r5 = (r7 >>> 19) & 3) == 1 || (layer = (r7 >>> 17) & 3) == 0) {
            return -1;
        }
        int r2 = (r7 >>> 12) & 15;
        int version = r7 >>> 10;
        int version2 = version & 3;
        if (r2 == 0 || r2 == 15 || version2 == 3) {
            return -1;
        }
        int version3 = A02(r5, layer);
        return version3;
    }

    public static int A02(int r2, int r3) {
        switch (r3) {
            case 1:
                return r2 == 3 ? 1152 : 576;
            case 2:
                return 1152;
            case 3:
                return 384;
            default:
                throw new IllegalArgumentException();
        }
    }

    public static boolean A06(int r1) {
        return (r1 & (-2097152)) == -2097152;
    }

    public static /* synthetic */ int[] A0C() {
        int[] r3 = A04;
        if (A01[6].charAt(14) != 'G') {
            throw new RuntimeException();
        }
        A01[4] = "YpQ2FEpgCaHa1vzVK0UO04rJGRLP7Hel";
        return r3;
    }
}
