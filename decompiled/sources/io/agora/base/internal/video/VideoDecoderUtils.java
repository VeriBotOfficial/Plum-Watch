package io.agora.base.internal.video;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import io.agora.base.internal.Logging;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes6.dex */
public class VideoDecoderUtils {
    private static final List<String> H264_HWDEC_EXCEPTION_MODELS = Arrays.asList("ASUS_T00J");
    private static final String TAG = "HardwareVideoDecoderUtils";
    private static MediaCodecInfo h264CodecInfo;
    private static MediaCodecInfo h265CodecInfo;
    private static MediaCodecInfo vp8CodecInfo;
    private static MediaCodecInfo vp9CodecInfo;

    static boolean isSupportHwDecoderByType(String str) {
        return VideoCodecType.contains(str) && findCodecForType(VideoCodecType.valueOf(str)) != null;
    }

    static boolean isSupportHwDecoderByTypeAndProfile(String str, String str2) {
        MediaCodecInfo findCodecForType;
        Logging.w(TAG, "isSupportHwDecoderByTypeAndProfile " + str + ":" + str2);
        if (!VideoCodecType.contains(str) || (findCodecForType = findCodecForType(VideoCodecType.valueOf(str))) == null) {
            return false;
        }
        try {
            if (VideoCodecProfile.contains(str2)) {
                return isSupportedProfile(findCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType()), VideoCodecProfile.valueOf(str2));
            }
            return false;
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    static boolean IsSupportDecodeHEVC10Bit() {
        MediaCodecInfo findCodecForType = findCodecForType(VideoCodecType.H265);
        if (findCodecForType == null) {
            return false;
        }
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(VideoCodecType.H265.mimeType());
            if (capabilitiesForType != null && capabilitiesForType.profileLevels != null) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : capabilitiesForType.profileLevels) {
                    if (codecProfileLevel.profile == 2 || codecProfileLevel.profile == 4096 || codecProfileLevel.profile == 8192) {
                        break;
                    }
                }
                return true;
            }
            return false;
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    static MediaCodecInfo findCodecForType(VideoCodecType videoCodecType) {
        MediaCodecInfo mediaCodecInfo;
        MediaCodecInfo mediaCodecInfo2;
        MediaCodecInfo mediaCodecInfo3;
        MediaCodecInfo mediaCodecInfo4;
        if (videoCodecType == VideoCodecType.VP8 && (mediaCodecInfo4 = vp8CodecInfo) != null) {
            return mediaCodecInfo4;
        }
        if (videoCodecType == VideoCodecType.VP9 && (mediaCodecInfo3 = vp9CodecInfo) != null) {
            return mediaCodecInfo3;
        }
        if (videoCodecType == VideoCodecType.H264 && (mediaCodecInfo2 = h264CodecInfo) != null) {
            return mediaCodecInfo2;
        }
        if (videoCodecType == VideoCodecType.H265 && (mediaCodecInfo = h265CodecInfo) != null) {
            return mediaCodecInfo;
        }
        int i = 0;
        while (true) {
            MediaCodecInfo mediaCodecInfo5 = null;
            if (i >= MediaCodecList.getCodecCount()) {
                return null;
            }
            try {
                mediaCodecInfo5 = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.e(TAG, "Cannot retrieve encoder codec info", e);
            }
            if (mediaCodecInfo5 != null && !mediaCodecInfo5.isEncoder() && isSupportedCodec(mediaCodecInfo5, videoCodecType)) {
                Logging.d(TAG, "found available decodec: " + mediaCodecInfo5.getName());
                if (videoCodecType == VideoCodecType.VP8) {
                    vp8CodecInfo = mediaCodecInfo5;
                } else if (videoCodecType == VideoCodecType.VP9) {
                    vp9CodecInfo = mediaCodecInfo5;
                } else if (videoCodecType == VideoCodecType.H264) {
                    h264CodecInfo = mediaCodecInfo5;
                } else if (videoCodecType == VideoCodecType.H265) {
                    h265CodecInfo = mediaCodecInfo5;
                }
                return mediaCodecInfo5;
            }
            i++;
        }
    }

    static boolean isSupportedCodec(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        if (!MediaCodecUtils.codecSupportsType(mediaCodecInfo, videoCodecType)) {
            return false;
        }
        try {
            if (MediaCodecUtils.selectColorFormat(MediaCodecUtils.DECODER_COLOR_FORMATS, mediaCodecInfo.getCapabilitiesForType(videoCodecType.mimeType())) == null) {
                Logging.w(TAG, "selectColorFormat is null");
                return false;
            }
            if (MediaCodecUtils.checkInvalidDecoder(mediaCodecInfo.getName())) {
                return false;
            }
            return isHardwareSupported(mediaCodecInfo, videoCodecType);
        } catch (IllegalArgumentException e) {
            ThrowableExtension.printStackTrace(e);
            return false;
        }
    }

    /* renamed from: io.agora.base.internal.video.VideoDecoderUtils$1, reason: invalid class name */
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
        }
    }

    static boolean isHardwareSupported(MediaCodecInfo mediaCodecInfo, VideoCodecType videoCodecType) {
        String name = mediaCodecInfo.getName();
        int i = AnonymousClass1.$SwitchMap$io$agora$base$internal$video$VideoCodecType[videoCodecType.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? i == 4 : !H264_HWDEC_EXCEPTION_MODELS.contains(Build.MODEL) : name.startsWith("OMX.qcom.") || name.startsWith("OMX.Exynos.") : name.startsWith("OMX.qcom.") || name.startsWith("OMX.Intel.") || name.startsWith("OMX.Exynos.") || name.startsWith("OMX.Nvidia.");
    }

    static int getSupportedDecoders() {
        int i = 0;
        for (int i2 = 0; i2 < MediaCodecList.getCodecCount(); i2++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i2);
            if (!codecInfoAt.isEncoder()) {
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

    static boolean isSupportedProfile(MediaCodecInfo.CodecCapabilities codecCapabilities, VideoCodecProfile videoCodecProfile) {
        if (codecCapabilities != null) {
            for (int i = 0; i < codecCapabilities.profileLevels.length; i++) {
                Logging.i(TAG, "device decoder profile:" + codecCapabilities.profileLevels[i].profile);
                if (codecCapabilities.profileLevels[i].profile == videoCodecProfile.profile()) {
                    Logging.i(TAG, "match decoder profile:" + codecCapabilities.profileLevels[i].profile);
                    return true;
                }
            }
        }
        return false;
    }

    static int getMaxSupportedInstances(String str) {
        MediaCodecInfo findCodecForType;
        if (VideoCodecType.contains(str) && (findCodecForType = findCodecForType(VideoCodecType.valueOf(str))) != null) {
            try {
                MediaCodecInfo.CodecCapabilities capabilitiesForType = findCodecForType.getCapabilitiesForType(VideoCodecType.valueOf(str).mimeType());
                if (capabilitiesForType == null) {
                    return -1;
                }
                return capabilitiesForType.getMaxSupportedInstances();
            } catch (IllegalArgumentException e) {
                ThrowableExtension.printStackTrace(e);
            }
        }
        return -1;
    }
}
