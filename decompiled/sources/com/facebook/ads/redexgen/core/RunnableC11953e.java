package com.facebook.ads.redexgen.core;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* renamed from: com.facebook.ads.redexgen.X.3e, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class RunnableC11953e implements SurfaceTexture.OnFrameAvailableListener, Runnable {
    public static byte[] A06;
    public static String[] A07 = {"LhLlUYOA3naT6ewiIfSatK6wPnwZfiw3", "Yilysgn0AAb9YtLDTNJji2mPRB", "c9oRdUKVrFFtnTa1I", "KQ", "xlNtsgcQCcIfApmgkmgvKWlCiiYZcHMk", "hc66151z6q5iwEh2NbNUTWK4J8", "zFcjHNMQlzxWDemIwLbPjRBcPW9AB4cx", "Z4gs05w13PySoO170q3JfxFVkqHBiozt"};
    public static final int[] A08;
    public SurfaceTexture A00;
    public EGLContext A01;
    public EGLDisplay A02;
    public EGLSurface A03;
    public final Handler A04;
    public final int[] A05 = new int[1];

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 116);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A06 = new byte[]{BuiltinOptions.FloorModOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.AddNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.RankOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, 3, BuiltinOptions.RangeOptions, BuiltinOptions.FillOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 29, 3, BuiltinOptions.RankOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RankOptions, BuiltinOptions.RankOptions, 32, 8, BuiltinOptions.BidirectionalSequenceLSTMOptions, 15, 3, BuiltinOptions.ReverseV2Options, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, 19, 64, 32, 8, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 15, 3, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, 19, 64, 32, 8, BuiltinOptions.RankOptions, -27, -25, -20, -61, -14, -27, -31, -12, -27, -61, -17, -18, -12, -27, -8, -12, OtaCommandGenerator.CMD_OTA_INFO, -26, -31, -23, -20, -27, -28, 20, 22, 27, -14, BuiltinOptions.ExpOptions, 20, 16, 35, 20, -1, 17, BuiltinOptions.LogSoftmaxOptions, 21, 21, 20, BuiltinOptions.ExpOptions, 2, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpOptions, 21, 16, 18, 20, -49, 21, 16, 24, 27, 20, 19, -6, -4, 1, -36, -6, 9, -39, -2, 8, 5, 1, -10, 14, -75, -5, -10, -2, 1, -6, -7, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.AddNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, 63, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.ZerosLikeOptions, -2, BuiltinOptions.FillOptions, 63, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquareOptions, 2, 4, 9, -22, -2, 8, 2, -32, 18, 15, 15, 2, 11, 17, -67, 3, -2, 6, 9, 2, 1, 13, 18, -19, 11, 20, -6, 11, 30, 26, 27, 24, 11, 25, -58, 12, 7, 15, 18, 11, 10, -44, -58, -21, 24, 24, 21, 24, -32, -58};
    }

    static {
        A05();
        A08 = new int[]{12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};
    }

    public RunnableC11953e(Handler handler) {
        this.A04 = handler;
    }

    public static EGLConfig A00(EGLDisplay eGLDisplay) {
        EGLConfig[] configs = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean success = EGL14.eglChooseConfig(eGLDisplay, A08, 0, configs, 0, 1, iArr, 0);
        if (success && iArr[0] > 0 && configs[0] != null) {
            return configs[0];
        }
        throw new C11933c(AbstractC12174a.A0n(A04(0, 67, 111), Boolean.valueOf(success), Integer.valueOf(iArr[0]), configs[0]));
    }

    public static EGLContext A01(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i) {
        int[] iArr;
        if (i != 0) {
            iArr = new int[]{12440, 2, 12992, 1, 12344};
        } else {
            iArr = new int[]{12440, 2, 12344};
        }
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, iArr, 0);
        if (eglCreateContext != null) {
            return eglCreateContext;
        }
        throw new C11933c(A04(67, 23, 12));
    }

    public static EGLDisplay A02() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay == null) {
            throw new C11933c(A04(120, 20, 33));
        }
        int[] iArr = new int[2];
        boolean eglInitialized = EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        if (!eglInitialized) {
            throw new C11933c(A04(140, 20, 106));
        }
        return eglGetDisplay;
    }

    public static EGLSurface A03(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i) {
        int[] pbufferAttributes;
        EGLSurface eglCreatePbufferSurface;
        if (i == 1) {
            eglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            if (i == 2) {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
            } else {
                pbufferAttributes = new int[]{12375, 1, 12374, 1, 12344};
            }
            eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, pbufferAttributes, 0);
            if (eglCreatePbufferSurface == null) {
                throw new C11933c(A04(90, 30, 59));
            }
        }
        if (!EGL14.eglMakeCurrent(eGLDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eGLContext)) {
            throw new C11933c(A04(160, 21, 41));
        }
        return eglCreatePbufferSurface;
    }

    public static void A06(int[] iArr) {
        GLES20.glGenTextures(1, iArr, 0);
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
        } else {
            throw new C11933c(A04(181, 29, 50) + Integer.toHexString(glGetError));
        }
    }

    public final SurfaceTexture A07() {
        return (SurfaceTexture) C3M.A01(this.A00);
    }

    /* JADX WARN: Finally extract failed */
    public final void A08() {
        this.A04.removeCallbacks(this);
        try {
            if (this.A00 != null) {
                this.A00.release();
                GLES20.glDeleteTextures(1, this.A05, 0);
            }
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            EGLContext eGLContext = this.A01;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                A07[0] = "QNIttSd1jDkmqHhtWtb4AUHxJPK3ppH8";
                if (eGLContext != null) {
                    EGL14.eglDestroyContext(this.A02, this.A01);
                }
                this.A02 = null;
                this.A01 = null;
                this.A03 = null;
                this.A00 = null;
                if (A07[0].charAt(22) != 'k') {
                    A07[0] = "tPWKOfvaIXpYJ8rWJX79LPHjnVzX8xxm";
                    return;
                }
            }
            throw new RuntimeException();
        } catch (Throwable th) {
            if (this.A03 != null && !this.A03.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.A02, this.A03);
            }
            if (this.A01 != null) {
                EGL14.eglDestroyContext(this.A02, this.A01);
            }
            this.A02 = null;
            this.A01 = null;
            this.A03 = null;
            this.A00 = null;
            throw th;
        }
    }

    public final void A09(int i) {
        this.A02 = A02();
        EGLConfig A00 = A00(this.A02);
        this.A01 = A01(this.A02, A00, i);
        this.A03 = A03(this.A02, A00, this.A01, i);
        A06(this.A05);
        this.A00 = new SurfaceTexture(this.A05[0]);
        this.A00.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.A04.post(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC1907Vl.A02(this)) {
            return;
        }
        try {
            if (this.A00 != null) {
                this.A00.updateTexImage();
            }
        } catch (Throwable th) {
            AbstractC1907Vl.A00(th, this);
        }
    }
}
