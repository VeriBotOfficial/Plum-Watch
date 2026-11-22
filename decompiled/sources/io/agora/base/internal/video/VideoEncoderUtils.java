package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import io.agora.base.internal.Logging;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class VideoEncoderUtils {
    public static final List<String> H264_HW_EXCEPTION_MODELS = Arrays.asList("Lenovo S90-u", "CHM-CL00", "CHM-TL00H", "CHM-UL00", "E6533", "HUAWEI CRR-UL00", "HUAWEI MT7-TL00", "HONOR H30-L01", "CHE-TL00H", "CHE-TL00", "Che2-TL00", "Che2-TL00M", "HTC D820mt", "HUAWEI P7-L10", "HUAWEI P7-L07", "M5s", "SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "P6-C00", "HM 2A", "XT105", "XT109", "XT1060");
    private static final List<String> H265_HW_EXCEPTION_HARDWARES = Arrays.asList("mt6771", "mt6762");
    private static final String TAG = "HardwareVideoEncoderUtils";

    public static int getRecommendedEncoderType() {
        return getRecommendedEncoderTypeImpl(Build.MODEL, Build.VERSION.SDK_INT);
    }

    static int getRecommendedEncoderTypeImpl(String str, int i) {
        return (!H264_HW_EXCEPTION_MODELS.contains(str) && i > 18) ? 0 : 1;
    }

    static boolean isSupportHwEncoderByType(String str) {
        return VideoCodecType.contains(str) && !(findCodecForType(VideoCodecType.valueOf(str), false) == null && findCodecForType(VideoCodecType.valueOf(str), true) == null);
    }

    static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType, boolean z) {
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder() && isSupportedCodec(mediaCodecInfo, videoCodecType, z)) {
                Logging.d(TAG, "found available encodec: " + mediaCodecInfo.getName());
                return mediaCodecInfo;
            }
            i++;
        }
    }

    static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType, boolean z) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            Logging.w(TAG, "not support codec type:" + videoCodecType);
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.encoderColorFormats(mediaCodecInfo.getName()), mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) == null) {
                Logging.e(TAG, "no match color format");
                return false;
            }
            if (MediaCodecUtils.checkInvalidEncoder(mediaCodecInfo.getName())) {
                return false;
            }
            if (z) {
                return isHardwareTextureSupportedInCurrentSdk(mediaCodecInfo, videoCodecType);
            }
            return isHardwareSupportedInCurrentSdk(mediaCodecInfo, videoCodecType);
        } catch (Exception unused) {
            Logging.w(TAG, "fail to selectColorFormat, not support mimeType:" + videoCodecType.mimeType());
            return false;
        }
    }

    /* renamed from: io.agora.base.internal.video.VideoEncoderUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$internal$video$VideoCodecType;

        static {
            int[] iArr = new int[VideoCodecType.values().length];
            $SwitchMap$io$agora$base$internal$video$VideoCodecType = iArr;
            try {
                iArr[VideoCodecType.VP8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.VP9.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H264.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.H265.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$agora$base$internal$video$VideoCodecType[VideoCodecType.UNKNOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static boolean isHardwareTextureSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i == 3) {
            if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
                return false;
            }
            mediaCodecInfo.getName().startsWith("OMX.k3.");
            return true;
        }
        if (i == 4) {
            return isHardwareSupportedInCurrentSdkH265();
        }
        if (i != 5) {
            return false;
        }
        Logging.e(TAG, "UNKNOWN is not excepted!!!");
        return false;
    }

    static boolean isHardwareSupportedInCurrentSdk(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        int i = AnonymousClass1.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        if (i == 1) {
            return isHardwareSupportedInCurrentSdkVp8(mediaCodecInfo);
        }
        if (i == 2) {
            return isHardwareSupportedInCurrentSdkVp9(mediaCodecInfo);
        }
        if (i == 3) {
            return isHardwareSupportedInCurrentSdkH264(mediaCodecInfo);
        }
        if (i == 4) {
            return isHardwareSupportedInCurrentSdkH265();
        }
        if (i != 5) {
            return false;
        }
        Logging.e(TAG, "UNKNOWN is not excepted!!!");
        return false;
    }

    static boolean isHardwareSupportedInCurrentSdkVp8(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Intel.");
    }

    static boolean isHardwareSupportedInCurrentSdkVp9(MediaCodecInfo mediaCodecInfo) {
        String name = mediaCodecInfo.getName();
        return name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.");
    }

    static boolean isHardwareSupportedInCurrentSdkH264(MediaCodecInfo mediaCodecInfo) {
        if (H264_HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            return false;
        }
        mediaCodecInfo.getName().startsWith("OMX.qcom.");
        return true;
    }

    static boolean isHardwareSupportedInCurrentSdkH265() {
        if (!H265_HW_EXCEPTION_HARDWARES.contains(Build.HARDWARE)) {
            return true;
        }
        Logging.w(TAG, "Hardware: " + Build.HARDWARE + " has black listed H.265 encoder.");
        return false;
    }

    static int getSupportedEncoders() {
        int i = 0;
        for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (codecInfoAt.isEncoder()) {
                for (String str : codecInfoAt.getSupportedTypes()) {
                    if (str.equals(VideoCodecType.VP8.mimeType())) {
                        i |= 1;
                    } else if (str.equals(VideoCodecType.H264.mimeType())) {
                        i |= 2;
                    } else if (str.equals(VideoCodecType.H265.mimeType())) {
                        i |= 4;
                    }
                }
            }
        }
        return i;
    }
}
