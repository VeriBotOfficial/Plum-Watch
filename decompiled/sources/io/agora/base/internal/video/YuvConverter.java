package io.agora.base.internal.video;

import android.graphics.Matrix;
import android.opengl.GLES20;
import android.opengl.GLES30;
import io.agora.base.JavaI010Buffer;
import io.agora.base.VideoFrame;
import io.agora.base.internal.JniCommon;
import io.agora.base.internal.Logging;
import io.agora.base.internal.ThreadUtils;
import io.agora.base.internal.video.GlGenericDrawer;
import io.agora.base.internal.video.YuvConverterStats;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class YuvConverter {
    private static final int ANDROID_MATRIX_LENGTH = 9;
    private static final boolean DEBUG = false;
    private static final String FRAGMENT_SHADER = "uniform vec2 xUnit;\nuniform vec4 coeffs;\n\nvoid main() {\n  gl_FragColor.r = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 1.5 * xUnit).rgb);\n  gl_FragColor.g = coeffs.a + dot(coeffs.rgb,\n      sample(tc - 0.5 * xUnit).rgb);\n  gl_FragColor.b = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 0.5 * xUnit).rgb);\n  gl_FragColor.a = coeffs.a + dot(coeffs.rgb,\n      sample(tc + 1.5 * xUnit).rgb);\n}\n";
    private static final String TAG = "YuvConverter";
    private static boolean enablePboOpt = true;
    private final List<YuvConverterStats> convertStatsList;
    private long convertTimeCounter;
    private long convertTimeInNS;
    private final GlGenericDrawer drawer;
    private final GlRectDrawer drawer10bit;
    private Matrix formerTextureMatrix;
    private final GPUPBOUtil gpupboUtil;
    private final GlTextureFrameBuffer i010TextureFrameBuffer;
    private final GlTextureFrameBuffer i420TextureFrameBuffer;
    private int maxTextureSize;
    private final ShaderCallbacks shaderCallbacks;
    private final ThreadUtils.ThreadChecker threadChecker;
    private static final AtomicBoolean mIsNeedForceResetPbo = new AtomicBoolean(false);
    private static boolean enableConvertPerLog = false;
    private static boolean enableReportYuvConvertStats = true;

    static native void nativeReportYuvConvertStats(YuvConverterStats yuvConverterStats);

    private static class ShaderCallbacks implements GlGenericDrawer.ShaderCallbacks {
        private float[] coeffs;
        private int coeffsLoc;
        private VideoFrame.ColorSpace colorSpace;
        private float stepSize;
        private int xUnitLoc;
        private static final float[] Y_COEFFS_BIT601_LIMIT = {0.256788f, 0.504129f, 0.0979059f, 0.0627451f};
        private static final float[] U_COEFFS_BIT601_LIMIT = {-0.148223f, -0.290993f, 0.439216f, 0.501961f};
        private static final float[] V_COEFFS_BIT601_LIMIT = {0.439216f, -0.367788f, -0.0714274f, 0.501961f};
        private static final float[] Y_COEFFS_BIT601_FULL = {0.299f, 0.587f, 0.114f, 0.0f};
        private static final float[] U_COEFFS_BIT601_FULL = {-0.168736f, -0.331264f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT601_FULL = {0.5f, -0.418688f, -0.0813124f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_LIMIT = {0.183f, 0.614f, 0.062f, 0.0627451f};
        private static final float[] U_COEFFS_BIT709_LIMIT = {-0.101f, -0.339f, 0.439f, 0.5f};
        private static final float[] V_COEFFS_BIT709_LIMIT = {0.439f, -0.399f, -0.04f, 0.5f};
        private static final float[] Y_COEFFS_BIT709_FULL = {0.2126f, 0.7154f, 0.072f, 0.0f};
        private static final float[] U_COEFFS_BIT709_FULL = {-0.1145f, -0.3855f, 0.5f, 0.5f};
        private static final float[] V_COEFFS_BIT709_FULL = {0.5f, -0.4543f, -0.0457f, 0.5f};
        private static final float[] Y_BT2020_FULL = {0.2627f, 0.678f, 0.0593f, 0.0f};
        private static final float[] U_BT2020_FULL = {-0.1396f, -0.3604f, 0.5f, 0.5f};
        private static final float[] V_BT2020_FULL = {0.5f, -0.4598f, -0.0402f, 0.5f};

        private ShaderCallbacks() {
            this.colorSpace = new WrappedNativeColorSpace(VideoFrame.ColorSpace.Range.Full.getRange(), VideoFrame.ColorSpace.Matrix.SMPTE170M.getMatrix(), VideoFrame.ColorSpace.Transfer.SMPTE170M.getTransfer(), VideoFrame.ColorSpace.Primary.kSMPTE170M.getPrimary());
        }

        public void setPlaneY() {
            float[] fArr;
            float[] fArr2;
            this.stepSize = 1.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = Y_BT2020_FULL;
                return;
            }
            if (this.colorSpace.getRange() == VideoFrame.ColorSpace.Range.Full) {
                if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                    fArr2 = Y_COEFFS_BIT709_FULL;
                } else {
                    fArr2 = Y_COEFFS_BIT601_FULL;
                }
                this.coeffs = fArr2;
                return;
            }
            if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                fArr = Y_COEFFS_BIT709_LIMIT;
            } else {
                fArr = Y_COEFFS_BIT601_LIMIT;
            }
            this.coeffs = fArr;
        }

        public void setPlaneU() {
            float[] fArr;
            float[] fArr2;
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = U_BT2020_FULL;
                return;
            }
            if (this.colorSpace.getRange() == VideoFrame.ColorSpace.Range.Full) {
                if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                    fArr2 = U_COEFFS_BIT709_FULL;
                } else {
                    fArr2 = U_COEFFS_BIT601_FULL;
                }
                this.coeffs = fArr2;
                return;
            }
            if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                fArr = U_COEFFS_BIT709_LIMIT;
            } else {
                fArr = U_COEFFS_BIT601_LIMIT;
            }
            this.coeffs = fArr;
        }

        public void setPlaneV() {
            float[] fArr;
            float[] fArr2;
            this.stepSize = 2.0f;
            if (this.colorSpace.getTransfer() == VideoFrame.ColorSpace.Transfer.BT2020_10) {
                this.coeffs = V_BT2020_FULL;
                return;
            }
            if (this.colorSpace.getRange() == VideoFrame.ColorSpace.Range.Full) {
                if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                    fArr2 = V_COEFFS_BIT709_FULL;
                } else {
                    fArr2 = V_COEFFS_BIT601_FULL;
                }
                this.coeffs = fArr2;
                return;
            }
            if (this.colorSpace.getMatrix() == VideoFrame.ColorSpace.Matrix.BT709) {
                fArr = V_COEFFS_BIT709_LIMIT;
            } else {
                fArr = V_COEFFS_BIT601_LIMIT;
            }
            this.coeffs = fArr;
        }

        public void setColorSpace(VideoFrame.ColorSpace colorSpace) {
            if (colorSpace != null) {
                this.colorSpace = colorSpace;
            }
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onNewShader(GlShader glShader) {
            this.xUnitLoc = glShader.getUniformLocation("xUnit");
            this.coeffsLoc = glShader.getUniformLocation("coeffs");
        }

        @Override // io.agora.base.internal.video.GlGenericDrawer.ShaderCallbacks
        public void onPrepareShader(GlShader glShader, float[] fArr, int i, int i2, int i3, int i4) {
            GLES20.glUniform4fv(this.coeffsLoc, 1, this.coeffs, 0);
            int i5 = this.xUnitLoc;
            float f = this.stepSize;
            float f2 = i;
            GLES20.glUniform2f(i5, (fArr[0] * f) / f2, (f * fArr[1]) / f2);
        }
    }

    public static void setEnablePboOpt(boolean z) {
        enablePboOpt = z;
    }

    public static void setEnableConvertPerLog(boolean z) {
        enableConvertPerLog = z;
    }

    public static void setEnableConvertReport(boolean z) {
        enableReportYuvConvertStats = z;
    }

    public static void clearPboBuffer() {
        mIsNeedForceResetPbo.set(true);
    }

    public YuvConverter() {
        ThreadUtils.ThreadChecker threadChecker = new ThreadUtils.ThreadChecker();
        this.threadChecker = threadChecker;
        this.i420TextureFrameBuffer = new GlTextureFrameBuffer(6408);
        ShaderCallbacks shaderCallbacks = new ShaderCallbacks();
        this.shaderCallbacks = shaderCallbacks;
        this.drawer = new GlGenericDrawer(FRAGMENT_SHADER, shaderCallbacks);
        this.i010TextureFrameBuffer = new GlTextureFrameBuffer(34842);
        this.drawer10bit = new GlRectDrawer();
        this.gpupboUtil = new GPUPBOUtil();
        this.formerTextureMatrix = new Matrix();
        this.maxTextureSize = 0;
        this.convertTimeInNS = 0L;
        this.convertTimeCounter = 0L;
        this.convertStatsList = new ArrayList();
        threadChecker.detachThread();
    }

    public VideoFrame.I420Buffer convert(VideoFrame.TextureBuffer textureBuffer) {
        return convert(textureBuffer, null);
    }

    public JavaI010Buffer convertI010(VideoFrame.TextureBuffer textureBuffer) {
        if (HdrUtil.isSupportedEGL3()) {
            return convert10Texture(textureBuffer);
        }
        return null;
    }

    private boolean checkMaxTextureSize(int i, int i2) {
        if (this.maxTextureSize == 0) {
            int[] iArr = new int[1];
            GLES20.glGetIntegerv(3379, iArr, 0);
            GlUtil.checkNoGLES2Error("glGetIntegerv of max texture size error");
            this.maxTextureSize = iArr[0];
        }
        int i3 = this.maxTextureSize;
        if (i3 >= i && i3 >= i2) {
            return false;
        }
        Logging.e(TAG, "reach max texture size width:" + i + ", height:" + i2 + ", maxTextureSize:" + this.maxTextureSize);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0129 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:22:0x0115, B:24:0x0129, B:26:0x0137, B:27:0x0142, B:29:0x0150, B:32:0x015e, B:34:0x017e, B:36:0x0182, B:38:0x0189, B:39:0x018e, B:41:0x019c, B:42:0x018c, B:43:0x019f, B:47:0x013a), top: B:21:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0182 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:22:0x0115, B:24:0x0129, B:26:0x0137, B:27:0x0142, B:29:0x0150, B:32:0x015e, B:34:0x017e, B:36:0x0182, B:38:0x0189, B:39:0x018e, B:41:0x019c, B:42:0x018c, B:43:0x019f, B:47:0x013a), top: B:21:0x0115 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.agora.base.VideoFrame.I420Buffer convert(io.agora.base.VideoFrame.TextureBuffer r30, io.agora.base.VideoFrame.ColorSpace r31) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.base.internal.video.YuvConverter.convert(io.agora.base.VideoFrame$TextureBuffer, io.agora.base.VideoFrame$ColorSpace):io.agora.base.VideoFrame$I420Buffer");
    }

    private ByteBuffer get10BitBuffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5 = i3 * i4;
        float[] fArr = new float[i5];
        byteBuffer.asFloatBuffer().get(fArr);
        int i6 = i * i2;
        byte[] bArr = new byte[i6 * 2];
        int i7 = (i6 / 4) * 2;
        byte[] bArr2 = new byte[i7];
        byte[] bArr3 = new byte[i7];
        for (int i8 = 0; i8 < i3; i8++) {
            for (int i9 = 0; i9 < i4; i9++) {
                int i10 = (i9 * i3) + i8;
                try {
                    float f = fArr[i10];
                    if (i10 < i3 * i2) {
                        short s = (short) (f * 1024.0f);
                        int i11 = i10 * 2;
                        bArr[i11] = (byte) (s & 255);
                        bArr[i11 + 1] = (byte) (s >> 8);
                    } else if (i8 < i3 / 2) {
                        short s2 = (short) (f * 1024.0f);
                        int i12 = (((i9 - i2) * (i3 / 2)) + i8) * 2;
                        bArr2[i12] = (byte) (s2 & 255);
                        bArr2[i12 + 1] = (byte) (s2 >> 8);
                    } else {
                        short s3 = (short) (f * 1024.0f);
                        int i13 = ((((i9 - i2) * (i3 / 2)) + i8) - (i3 / 2)) * 2;
                        bArr3[i13] = (byte) (s3 & 255);
                        bArr3[i13 + 1] = (byte) (s3 >> 8);
                    }
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            }
        }
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 * 2);
        nativeAllocateByteBuffer.put(bArr);
        nativeAllocateByteBuffer.put(bArr2);
        nativeAllocateByteBuffer.put(bArr3);
        nativeAllocateByteBuffer.flip();
        return nativeAllocateByteBuffer;
    }

    /* renamed from: io.agora.base.internal.video.YuvConverter$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type;

        static {
            int[] iArr = new int[VideoFrame.TextureBuffer.Type.values().length];
            $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type = iArr;
            try {
                iArr[VideoFrame.TextureBuffer.Type.OES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[VideoFrame.TextureBuffer.Type.RGB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void drawTexture(int i, VideoFrame.TextureBuffer.Type type, int i2, int i3, int i4) {
        GLES20.glClear(16384);
        int i5 = AnonymousClass3.$SwitchMap$io$agora$base$VideoFrame$TextureBuffer$Type[type.ordinal()];
        if (i5 == 1) {
            this.drawer10bit.drawOes(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else if (i5 == 2) {
            this.drawer10bit.drawRgb(i, 0, GlUtil.IDENTITY_MATRIX, i2, i3, 0, 0, i2, i3, i4, VideoFrame.AlphaStitchMode.ALPHA_NO_STITCH.value());
        } else {
            throw new IllegalArgumentException("Unknown texture type.");
        }
        GlUtil.checkNoGLES2Error("yuvconvert.drawFrameBuffer");
    }

    private JavaI010Buffer convert10Texture(VideoFrame.TextureBuffer textureBuffer) {
        this.threadChecker.checkIsOnValidThread();
        int width = textureBuffer.getWidth();
        int height = textureBuffer.getHeight();
        int i = ((width + 7) / 8) * 8;
        int i2 = (height + 1) / 2;
        int i3 = height + i2;
        int i4 = i / 4;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preScale(1.0f, -1.0f);
        matrix.preTranslate(-0.5f, -0.5f);
        if (checkMaxTextureSize(i4, i3)) {
            return null;
        }
        this.i010TextureFrameBuffer.setSize(i4, i3);
        this.shaderCallbacks.setColorSpace(new WrappedNativeColorSpace(VideoFrame.ColorSpace.Range.Full.getRange(), VideoFrame.ColorSpace.Matrix.BT2020_CL.getMatrix(), VideoFrame.ColorSpace.Transfer.BT2020_10.getTransfer(), VideoFrame.ColorSpace.Primary.kBT2020.getPrimary()));
        GLES20.glBindFramebuffer(36160, this.i010TextureFrameBuffer.getFrameBufferId());
        GlUtil.checkNoGLES2Error("glBindFramebuffer");
        this.shaderCallbacks.setPlaneY();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, 0, i4, height, 0);
        this.shaderCallbacks.setPlaneU();
        int i5 = i4 / 2;
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, 0, height, i5, i2, 0);
        this.shaderCallbacks.setPlaneV();
        VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, 0, matrix, width, height, i5, height, i5, i2, 0);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i * i3 * 4);
        GLES30.glReadPixels(0, 0, width, i3, 6408, 5126, allocateDirect);
        GLES20.glBindFramebuffer(36160, 0);
        GlUtil.checkNoGLES2Error("glReadPixels setSize");
        allocateDirect.order(ByteOrder.nativeOrder());
        final ByteBuffer byteBuffer = get10BitBuffer(allocateDirect, width, height, i, i3);
        int i6 = i * height;
        int i7 = i6 * 2;
        int i8 = i6 / 4;
        int i9 = (i6 + i8) * 2;
        byteBuffer.position(0);
        byteBuffer.limit(i7);
        ByteBuffer slice = byteBuffer.slice();
        byteBuffer.position(i7);
        int i10 = i8 * 2;
        byteBuffer.limit(i7 + i10);
        ByteBuffer slice2 = byteBuffer.slice();
        byteBuffer.position(i9);
        byteBuffer.limit(i9 + i10);
        int i11 = i / 2;
        return JavaI010Buffer.wrap(width, height, slice, i, slice2, i11, byteBuffer.slice(), i11, new Runnable() { // from class: io.agora.base.internal.video.YuvConverter.2
            @Override // java.lang.Runnable
            public void run() {
                JniCommon.nativeFreeByteBuffer(byteBuffer);
            }
        });
    }

    public void release() {
        this.threadChecker.checkIsOnValidThread();
        this.drawer.release();
        this.i420TextureFrameBuffer.release();
        this.gpupboUtil.release();
        this.threadChecker.detachThread();
        this.convertStatsList.clear();
    }

    private YuvConverterStats getYuvConverterStats(int i, int i2, YuvConverterStats.YuvConvertMethod yuvConvertMethod) {
        YuvConverterStats yuvConverterStats = null;
        for (YuvConverterStats yuvConverterStats2 : this.convertStatsList) {
            if (yuvConverterStats2.getWidth() == i && yuvConverterStats2.getHeight() == i2 && yuvConverterStats2.getMethod() == yuvConvertMethod.value) {
                yuvConverterStats = yuvConverterStats2;
            }
        }
        if (yuvConverterStats != null) {
            return yuvConverterStats;
        }
        YuvConverterStats yuvConverterStats3 = new YuvConverterStats(i, i2, yuvConvertMethod);
        this.convertStatsList.add(yuvConverterStats3);
        return yuvConverterStats3;
    }
}
