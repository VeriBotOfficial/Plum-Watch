package io.agora.base;

import android.graphics.Matrix;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.RefCounted;
import io.agora.base.internal.video.EglBase;
import io.agora.base.internal.video.WrappedNativeColorSpace;
import java.nio.ByteBuffer;

/* loaded from: classes6.dex */
public class VideoFrame implements RefCounted {
    private ByteBuffer alphaBuffer;
    private AlphaStitchMode alphaStitchMode;
    private Buffer buffer;
    private ColorSpace colorSpace;
    private VideoFrameMetaInfo metaInfo;
    private long nativeAlphaBuffer;
    private int rotation;
    private float sampleAspectRatio;
    private SourceType sourceType;
    private long timestampNs;

    public interface Buffer extends RefCounted {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        Buffer mirror(int i);

        @Override // io.agora.base.internal.RefCounted
        void release();

        @Override // io.agora.base.internal.RefCounted
        void retain();

        Buffer rotate(int i);

        I420Buffer toI420();

        Buffer transform(int i, int i2, int i3, int i4, int i5, int i6, int i7);
    }

    public interface I010Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface I422Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface RgbaBuffer extends Buffer {
        ByteBuffer getData();
    }

    public enum SourceType {
        kFrontCamera,
        kBackCamera,
        kUnspecified
    }

    public interface TextureBuffer extends Buffer {

        public enum ContextType {
            EGL_CONTEXT_10,
            EGL_CONTEXT_14
        }

        EglBase.Context getEglBaseContext();

        int getEglContextType();

        long getFenceObject();

        long getNativeEglContext();

        int getSequence();

        Object getSourceTexturePool();

        int getTextureId();

        Matrix getTransformMatrix();

        float[] getTransformMatrixArray();

        Type getType();

        boolean is10BitTexture();

        I010Buffer toI010();

        public enum Type {
            OES(36197),
            RGB(3553);

            private final int glTarget;

            Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }
    }

    public interface ColorSpace {
        HdrMetadata getHdrMetadata();

        Matrix getMatrix();

        Primary getPrimary();

        Range getRange();

        Transfer getTransfer();

        public enum Range {
            Invalid(0),
            Limited(1),
            Full(2);

            private final int range;

            Range(int i) {
                this.range = i;
            }

            public int getRange() {
                return this.range;
            }
        }

        public enum Matrix {
            RGB(0),
            BT709(1),
            Unspecified(2),
            FCC(4),
            BT470BG(5),
            SMPTE170M(6),
            SMPTE240M(7),
            YCOCG(8),
            BT2020_NCL(9),
            BT2020_CL(10),
            SMPTE2085(11),
            CDNCLS(12),
            CDCLS(13),
            BT2100_ICTCP(14);

            private final int matrix;

            Matrix(int i) {
                this.matrix = i;
            }

            public int getMatrix() {
                return this.matrix;
            }
        }

        public enum Transfer {
            BT709(1),
            Unspecified(2),
            GAMMA22(4),
            GAMMA28(5),
            SMPTE170M(6),
            SMPTE240M(7),
            LINEAR(8),
            LOG(9),
            LOG_SQRT(10),
            IEC61966_2_4(11),
            BT1361_ECG(12),
            IEC61966_2_1(13),
            BT2020_10(14),
            BT2020_12(15),
            SMPTEST2084(16),
            SMPTEST428(17),
            ARIB_STD_B67(18);

            private final int transfer;

            Transfer(int i) {
                this.transfer = i;
            }

            public int getTransfer() {
                return this.transfer;
            }
        }

        public enum Primary {
            BT709(1),
            Unspecified(2),
            BT470M(4),
            BT470BG(5),
            kSMPTE170M(6),
            kSMPTE240M(7),
            kFILM(8),
            kBT2020(9),
            kSMPTEST428(10),
            kSMPTEST431(11),
            kSMPTEST432(12),
            kJEDECP22(22);

            private final int primary;

            Primary(int i) {
                this.primary = i;
            }

            public int getPrimary() {
                return this.primary;
            }
        }
    }

    public interface HdrMetadata {
        int getLuminanceMax();

        int getLuminanceMin();

        int getMaxContentLightLevel();

        int getMaxFrameAverageLightLevel();

        Chromaticity getWhitePoint();

        Chromaticity getprimaryB();

        Chromaticity getprimaryG();

        Chromaticity getprimaryR();

        public static class Chromaticity {
            public int x;
            public int y;

            public Chromaticity(int i, int i2) {
                this.x = i;
                this.y = i2;
            }
        }
    }

    public enum AlphaStitchMode {
        ALPHA_NO_STITCH(0),
        ALPHA_STITCH_UP(1),
        ALPHA_STITCH_BELOW(2),
        ALPHA_STITCH_LEFT(3),
        ALPHA_STITCH_RIGHT(4);

        private final int stitchMode;

        AlphaStitchMode(int i) {
            this.stitchMode = i;
        }

        public int value() {
            return this.stitchMode;
        }
    }

    public VideoFrame(Buffer buffer, int i, long j) {
        this(buffer, i, j, new WrappedNativeColorSpace(), null, 0L, 1.0f, SourceType.kUnspecified.ordinal());
    }

    public VideoFrame(Buffer buffer, int i, long j, ColorSpace colorSpace, ByteBuffer byteBuffer, long j2, float f, int i2) {
        this.alphaStitchMode = AlphaStitchMode.ALPHA_NO_STITCH;
        this.metaInfo = new VideoFrameMetaInfo();
        if (buffer == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        }
        if (i % 90 != 0) {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
        this.colorSpace = colorSpace;
        this.alphaBuffer = byteBuffer;
        this.nativeAlphaBuffer = j2;
        this.sampleAspectRatio = f;
        this.sourceType = SourceType.values()[i2];
    }

    public SourceType getSourceType() {
        return this.sourceType;
    }

    public float getSampleAspectRatio() {
        return this.sampleAspectRatio;
    }

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotation() {
        return this.rotation;
    }

    public int getAlphaStitchMode() {
        return this.alphaStitchMode.value();
    }

    public void setAlphaStitchMode(int i) {
        this.alphaStitchMode = AlphaStitchMode.values()[i];
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public VideoFrameMetaInfo getMetaInfo() {
        return this.metaInfo;
    }

    public int getRotatedWidth() {
        if (this.rotation % 180 == 0) {
            if (this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) {
                return this.buffer.getWidth() / 2;
            }
            return this.buffer.getWidth();
        }
        if (this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) {
            return this.buffer.getHeight() / 2;
        }
        return this.buffer.getHeight();
    }

    public int getRotatedHeight() {
        if (this.rotation % 180 == 0) {
            if (this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_UP || this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_BELOW) {
                return this.buffer.getHeight() / 2;
            }
            return this.buffer.getHeight();
        }
        if (this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_LEFT || this.alphaStitchMode == AlphaStitchMode.ALPHA_STITCH_RIGHT) {
            return this.buffer.getWidth() / 2;
        }
        return this.buffer.getWidth();
    }

    public void replaceBuffer(Buffer buffer, int i, long j) {
        release();
        this.buffer = buffer;
        this.rotation = i;
        this.timestampNs = j;
    }

    public ColorSpace getColorSpace() {
        return this.colorSpace;
    }

    public void setColorSpace(ColorSpace colorSpace) {
        this.colorSpace = colorSpace;
    }

    private int getColorSpaceRange() {
        ColorSpace colorSpace = this.colorSpace;
        if (colorSpace == null) {
            return ColorSpace.Range.Invalid.getRange();
        }
        return colorSpace.getRange().getRange();
    }

    private int getColorSpaceMatrix() {
        ColorSpace colorSpace = this.colorSpace;
        if (colorSpace == null) {
            return ColorSpace.Matrix.Unspecified.getMatrix();
        }
        return colorSpace.getMatrix().getMatrix();
    }

    private int getColorSpaceTransfer() {
        ColorSpace colorSpace = this.colorSpace;
        if (colorSpace == null) {
            return ColorSpace.Transfer.Unspecified.getTransfer();
        }
        return colorSpace.getTransfer().getTransfer();
    }

    private int getColorSpacePrimary() {
        ColorSpace colorSpace = this.colorSpace;
        if (colorSpace == null) {
            return ColorSpace.Primary.Unspecified.getPrimary();
        }
        return colorSpace.getPrimary().getPrimary();
    }

    public ByteBuffer getAlphaBuffer() {
        return this.alphaBuffer;
    }

    public void retainAlphaBuffer() {
        JniCommon.nativeAddRef(this.nativeAlphaBuffer);
    }

    public void releaseAlphaBuffer() {
        JniCommon.nativeReleaseRef(this.nativeAlphaBuffer);
    }

    public void fillAlphaData(ByteBuffer byteBuffer) {
        this.alphaBuffer = byteBuffer;
    }

    @Override // io.agora.base.internal.RefCounted
    public void retain() {
        this.buffer.retain();
    }

    @Override // io.agora.base.internal.RefCounted
    public void release() {
        this.buffer.release();
    }
}
