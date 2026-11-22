package io.agora.base.internal.video;

import io.agora.base.VideoFrame;
import io.agora.base.internal.video.EncodedImage;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public interface VideoEncoder {

    public @interface BitrateAdjustment {
        public static final int ACTUAL_FRAMERATE_ADJUSTMENT = 2;
        public static final int CONSTANT_UNIT_BITRATE_ADJUSTMENT = 4;
        public static final int DYNAMIC_ADJUSTMENT = 3;
        public static final int FRAMERATE_ADJUSTMENT = 1;
        public static final int NO_ADJUSTMENT = 0;
    }

    public interface Callback {
        void onEncodeBufferPrepared(long j);

        void onEncodeReset();

        void onEncodedFrame(EncodedImage encodedImage, int i, int i2, int i3, int i4, int i5, CodecSpecificInfo codecSpecificInfo);
    }

    VideoCodecStatus attachProxyThread();

    long createNativeVideoEncoder();

    VideoCodecStatus detachProxyThread();

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo, CodecSpecificInfo codecSpecificInfo);

    VideoCodecStatus flush();

    EncoderStyle getEncoderStyle();

    String getImplementationName();

    long getResetCoolDownTimeMs();

    ScalingSettings getScalingSettings();

    VideoHWCodecSpec getVideoHWCodecSpec();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    boolean isQcomHardware();

    VideoCodecStatus release();

    VideoCodecStatus resume();

    VideoCodecStatus setChannelParameters(short s, long j);

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);

    public static class Settings {
        public final boolean automaticResizeOn;
        public final boolean expectTexture;
        public final int height;
        public final int keyFrameInterval;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int rateControlMode;
        public final int startBitrate;
        public final int width;

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, int i8, boolean z2) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.numberOfSimulcastStreams = i6;
            this.automaticResizeOn = z;
            this.keyFrameInterval = i7;
            this.rateControlMode = i8;
            this.expectTexture = z2;
        }

        public Settings(int i, int i2, int i3, int i4, int i5, boolean z) {
            this(i, i2, i3, i4, i5, 1, z, 0, -1, true);
        }
    }

    public static class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public static class BitrateAllocation {
        public final int[][] bitratesBbs;

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }

        public int getSum() {
            int i = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i2 : iArr) {
                    i += i2;
                }
            }
            return i;
        }
    }

    public static class VideoHWCodecSpec {
        public final int bitrateMode;
        public final String codecName;
        public final int inputType;
        public final String maxResolution;
        public final int minSupportedBitrate;
        public final int platformid = 4;
        public final int profile;

        public VideoHWCodecSpec(String str, String str2, int i, int i2, int i3, int i4) {
            this.codecName = str;
            this.maxResolution = str2;
            this.bitrateMode = i;
            this.inputType = i2;
            this.profile = i3;
            this.minSupportedBitrate = i4;
        }

        public String getCodecName() {
            return this.codecName;
        }

        public String getMaxResolution() {
            return this.maxResolution;
        }

        public int getPlatformid() {
            return this.platformid;
        }

        public int getInputType() {
            return this.inputType;
        }

        public int getBitrateMode() {
            return this.bitrateMode;
        }

        public int getProfile() {
            return this.profile;
        }

        public int getMinSupportedBitrate() {
            return this.minSupportedBitrate;
        }
    }

    public static class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        private ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z) {
            this.on = z;
            this.low = null;
            this.high = null;
        }

        @Deprecated
        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public String toString() {
            return this.on ? "[ " + this.low + ", " + this.high + " ]" : "OFF";
        }
    }

    public static class EncoderStyle {
        boolean highProfileSupported;
        int bitrateAdjustment = 0;
        boolean isNeedResetWhenDownBps = false;
        int bitrateAdjustNumerator = 1;
        int bitrateAdjustDenominator = 1;

        public int getBitrateAdjustment() {
            return this.bitrateAdjustment;
        }

        public boolean isNeedResetWhenDownBps() {
            return this.isNeedResetWhenDownBps;
        }

        public int getBitrateAdjustNumerator() {
            return this.bitrateAdjustNumerator;
        }

        public int getBitrateAdjustDenominator() {
            return this.bitrateAdjustDenominator;
        }

        public String toString() {
            return "EncoderStyle{bitrateAdjustment=" + this.bitrateAdjustment + ", isNeedResetWhenDownBps=" + this.isNeedResetWhenDownBps + ", highProfileSupported=" + this.highProfileSupported + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
