package livekit.org.webrtc;

import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import livekit.org.webrtc.RendererCommon;
import livekit.org.webrtc.VideoFrame;

/* loaded from: classes8.dex */
public class VideoFrameDrawer {
    public static final String TAG = "VideoFrameDrawer";
    static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private VideoFrame lastI420Frame;
    private int renderHeight;
    private int renderWidth;
    private final float[] dstPoints = new float[6];
    private final YuvUploader yuvUploader = new YuvUploader();
    private final Matrix renderMatrix = new Matrix();

    public static void drawTexture(RendererCommon.GlDrawer drawer, VideoFrame.TextureBuffer buffer, Matrix renderMatrix, int frameWidth, int frameHeight, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
        Matrix matrix = new Matrix(buffer.getTransformMatrix());
        matrix.preConcat(renderMatrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix);
        int i = AnonymousClass1.$SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[buffer.getType().ordinal()];
        if (i == 1) {
            drawer.drawOes(buffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, frameWidth, frameHeight, viewportX, viewportY, viewportWidth, viewportHeight);
        } else {
            if (i == 2) {
                drawer.drawRgb(buffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, frameWidth, frameHeight, viewportX, viewportY, viewportWidth, viewportHeight);
                return;
            }
            throw new RuntimeException("Unknown texture type.");
        }
    }

    /* renamed from: livekit.org.webrtc.VideoFrameDrawer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$webrtc$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public int[] uploadYuvData(int width, int height, int[] strides, ByteBuffer[] planes) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i = width / 2;
            int[] iArr = {width, i, i};
            int i2 = height / 2;
            int[] iArr2 = {height, i2, i2};
            int i3 = 0;
            for (int i4 = 0; i4 < 3; i4++) {
                int i5 = strides[i4];
                int i6 = iArr[i4];
                if (i5 > i6) {
                    i3 = Math.max(i3, i6 * iArr2[i4]);
                }
            }
            if (i3 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i3)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i3);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i7 = 0; i7 < 3; i7++) {
                    this.yuvTextures[i7] = GlUtil.generateTexture(3553);
                }
            }
            for (int i8 = 0; i8 < 3; i8++) {
                GLES20.glActiveTexture(33984 + i8);
                GLES20.glBindTexture(3553, this.yuvTextures[i8]);
                int i9 = strides[i8];
                int i10 = iArr[i8];
                if (i9 == i10) {
                    byteBuffer = planes[i8];
                } else {
                    YuvHelper.copyPlane(planes[i8], i9, this.copyBuffer, i10, i10, iArr2[i8]);
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr[i8], iArr2[i8], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer buffer) {
            return uploadYuvData(buffer.getWidth(), buffer.getHeight(), new int[]{buffer.getStrideY(), buffer.getStrideU(), buffer.getStrideV()}, new ByteBuffer[]{buffer.getDataY(), buffer.getDataU(), buffer.getDataV()});
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }
    }

    private static int distance(float x0, float y0, float x1, float y1) {
        return (int) Math.round(Math.hypot(x1 - x0, y1 - y0));
    }

    private void calculateTransformedRenderSize(int frameWidth, int frameHeight, Matrix renderMatrix) {
        if (renderMatrix == null) {
            this.renderWidth = frameWidth;
            this.renderHeight = frameHeight;
            return;
        }
        renderMatrix.mapPoints(this.dstPoints, srcPoints);
        for (int i = 0; i < 3; i++) {
            float[] fArr = this.dstPoints;
            int i2 = i * 2;
            fArr[i2] = fArr[i2] * frameWidth;
            int i3 = i2 + 1;
            fArr[i3] = fArr[i3] * frameHeight;
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    public void drawFrame(VideoFrame frame, RendererCommon.GlDrawer drawer) {
        drawFrame(frame, drawer, null);
    }

    public void drawFrame(VideoFrame frame, RendererCommon.GlDrawer drawer, Matrix additionalRenderMatrix) {
        drawFrame(frame, drawer, additionalRenderMatrix, 0, 0, frame.getRotatedWidth(), frame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame frame, RendererCommon.GlDrawer drawer, Matrix additionalRenderMatrix, int viewportX, int viewportY, int viewportWidth, int viewportHeight) {
        calculateTransformedRenderSize(frame.getRotatedWidth(), frame.getRotatedHeight(), additionalRenderMatrix);
        int i = this.renderWidth;
        if (i <= 0 || this.renderHeight <= 0) {
            Logging.w(TAG, "Illegal frame size: " + i + "x" + this.renderHeight);
            return;
        }
        boolean z = frame.getBuffer() instanceof VideoFrame.TextureBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate(frame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (additionalRenderMatrix != null) {
            this.renderMatrix.preConcat(additionalRenderMatrix);
        }
        if (z) {
            this.lastI420Frame = null;
            drawTexture(drawer, (VideoFrame.TextureBuffer) frame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, viewportX, viewportY, viewportWidth, viewportHeight);
            return;
        }
        if (frame != this.lastI420Frame) {
            this.lastI420Frame = frame;
            VideoFrame.I420Buffer i420 = frame.getBuffer().toI420();
            this.yuvUploader.uploadFromBuffer(i420);
            i420.release();
        }
        drawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, viewportX, viewportY, viewportWidth, viewportHeight);
    }

    public VideoFrame.Buffer prepareBufferForViewportSize(VideoFrame.Buffer buffer, int width, int height) {
        buffer.retain();
        return buffer;
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
    }
}
