package com.baidu.ar;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import com.baidu.ar.arplay.core.engine.rotate.Orientation;
import com.baidu.ar.arplay.core.pixel.PixelRotation;
import com.baidu.ar.arplay.core.renderer.OutputFillMode;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.ScaleType;
import com.baidu.ar.bean.Size;
import com.phancy.mini.core.app.meta.MiniAppJson;
import java.util.HashMap;

/* loaded from: classes12.dex */
public class l {

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7056a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ScaleType.values().length];
            c = iArr;
            try {
                iArr[ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                c[ScaleType.FIT_XY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Orientation.values().length];
            b = iArr2;
            try {
                iArr2[Orientation.PORTRAIT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[Orientation.LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[Orientation.LANDSCAPE_REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr3 = new int[RotationType.values().length];
            f7056a = iArr3;
            try {
                iArr3[RotationType.ROTATE_0.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7056a[RotationType.ROTATE_90.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7056a[RotationType.ROTATE_180.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7056a[RotationType.ROTATE_270.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0025, code lost:
    
        if (r3 == com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0036, code lost:
    
        if (r3 == com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0049, code lost:
    
        if (r3 == com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x005c, code lost:
    
        if (r3 == com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.baidu.ar.arplay.core.pixel.PixelRotation a(com.baidu.ar.bean.RotationType r2, com.baidu.ar.bean.MirriorType r3) {
        /*
            com.baidu.ar.arplay.core.pixel.PixelRotation r0 = com.baidu.ar.arplay.core.pixel.PixelRotation.NoRotation
            int[] r1 = com.baidu.ar.l.a.f7056a
            int r2 = r2.ordinal()
            r2 = r1[r2]
            r1 = 1
            if (r2 == r1) goto L4e
            r1 = 2
            if (r2 == r1) goto L39
            r1 = 3
            if (r2 == r1) goto L28
            r1 = 4
            if (r2 == r1) goto L17
            goto L61
        L17:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.NO_MIRRIOR
            if (r3 != r2) goto L1e
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateLeft
            return r2
        L1e:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.VERTICAL_MIRRIOR
            if (r3 != r2) goto L23
            goto L4b
        L23:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR
            if (r3 != r2) goto L61
            goto L44
        L28:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.NO_MIRRIOR
            if (r3 != r2) goto L2f
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.Rotate180
            return r2
        L2f:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.VERTICAL_MIRRIOR
            if (r3 != r2) goto L34
            goto L5e
        L34:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR
            if (r3 != r2) goto L61
            goto L57
        L39:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.NO_MIRRIOR
            if (r3 != r2) goto L40
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRight
            return r2
        L40:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.VERTICAL_MIRRIOR
            if (r3 != r2) goto L47
        L44:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipVertical
            return r2
        L47:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR
            if (r3 != r2) goto L61
        L4b:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipHorizontal
            return r2
        L4e:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.NO_MIRRIOR
            if (r3 != r2) goto L53
            goto L61
        L53:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.VERTICAL_MIRRIOR
            if (r3 != r2) goto L5a
        L57:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.FlipVertical
            return r2
        L5a:
            com.baidu.ar.bean.MirriorType r2 = com.baidu.ar.bean.MirriorType.HORIZONTAL_MIRRIOR
            if (r3 != r2) goto L61
        L5e:
            com.baidu.ar.arplay.core.pixel.PixelRotation r2 = com.baidu.ar.arplay.core.pixel.PixelRotation.FlipHorizontal
            return r2
        L61:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.l.a(com.baidu.ar.bean.RotationType, com.baidu.ar.bean.MirriorType):com.baidu.ar.arplay.core.pixel.PixelRotation");
    }

    public static PixelRotation a(boolean z, RotationType rotationType, MirriorType mirriorType) {
        return z ? PixelRotation.FlipVertical : a(rotationType, mirriorType);
    }

    public static OutputFillMode a(ScaleType scaleType) {
        int i = a.c[scaleType.ordinal()];
        if (i == 1) {
            return OutputFillMode.KeepRatioCrop;
        }
        if (i == 2 || i == 3) {
            return OutputFillMode.KeepRatioFill;
        }
        return null;
    }

    public static Size a(int i, int i2, int i3, int i4) {
        Size size = new Size(i, i2);
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            float f4 = i3 / i4;
            if (f3 < f4) {
                size.setWidth((int) (f2 * f4));
                size.setHeight(i2);
                return size;
            }
            if (f3 > f4) {
                size.setWidth(i);
                size.setHeight((int) (f / f4));
            }
        }
        return size;
    }

    public static HashMap a(Orientation orientation) {
        String str;
        HashMap hashMap = new HashMap();
        int i = a.b[orientation.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "landscape_right";
            } else if (i == 3) {
                str = "landscape_left";
            }
            hashMap.put("orient", str);
            return hashMap;
        }
        str = MiniAppJson.PORTRAIT;
        hashMap.put("orient", str);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0015, code lost:
    
        if (r2 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.NoRotation;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.Rotate180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002c, code lost:
    
        if (r2 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.content.Context r1, boolean r2, com.baidu.ar.arplay.core.pixel.PixelReadParams r3) {
        /*
            boolean r0 = com.baidu.ar.nc.k()
            if (r0 == 0) goto L18
            boolean r1 = r3.getIsPortrait()
            if (r1 == 0) goto L15
            if (r2 == 0) goto Lf
            goto L42
        Lf:
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRight
        L11:
            r3.setPixelRotate(r1)
            return
        L15:
            if (r2 == 0) goto L2e
            goto L31
        L18:
            boolean r0 = com.baidu.ar.nc.j()
            if (r0 == 0) goto L34
            boolean r1 = r3.getIsPortrait()
            if (r1 == 0) goto L2c
            if (r2 == 0) goto L29
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipHorizontal
            goto L11
        L29:
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateLeft
            goto L11
        L2c:
            if (r2 == 0) goto L31
        L2e:
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.NoRotation
            goto L11
        L31:
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.Rotate180
            goto L11
        L34:
            boolean r1 = com.baidu.ar.nc.d(r1)
            if (r1 == 0) goto L45
            boolean r1 = r3.getIsPortrait()
            if (r1 == 0) goto L45
            if (r2 == 0) goto L45
        L42:
            com.baidu.ar.arplay.core.pixel.PixelRotation r1 = com.baidu.ar.arplay.core.pixel.PixelRotation.RotateRightFlipVertical
            goto L11
        L45:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.l.a(android.content.Context, boolean, com.baidu.ar.arplay.core.pixel.PixelReadParams):void");
    }

    public static void a(Context context, float[] fArr, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        int i;
        float[] fArr2;
        Matrix.setIdentityM(fArr, 0);
        if (nc.k() || nc.d(context)) {
            Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
            if (z) {
                return;
            }
        } else {
            f2 = 0.0f;
            f = 1.0f;
            if (!nc.j()) {
                i = 0;
                if (z) {
                    f4 = 270.0f;
                    f3 = 0.0f;
                    fArr2 = fArr;
                    Matrix.rotateM(fArr2, i, f4, f3, f2, f);
                    Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
                }
                f3 = 0.0f;
                fArr2 = fArr;
                Matrix.rotateM(fArr2, 0, 90.0f, 0.0f, 0.0f, 1.0f);
                Matrix.translateM(fArr, 0, 0.0f, -1.0f, 0.0f);
                f2 = 1.0f;
                f = 0.0f;
                f4 = 180.0f;
                Matrix.rotateM(fArr2, i, f4, f3, f2, f);
                Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
            }
            Matrix.rotateM(fArr, 0, 270.0f, 0.0f, 0.0f, 1.0f);
            Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
            if (z) {
                return;
            }
        }
        f2 = 1.0f;
        f = 0.0f;
        i = 0;
        f4 = 180.0f;
        f3 = 0.0f;
        fArr2 = fArr;
        Matrix.rotateM(fArr2, i, f4, f3, f2, f);
        Matrix.translateM(fArr, 0, -1.0f, 0.0f, 0.0f);
    }

    public static void a(PointF pointF, boolean z, DuMixInput duMixInput, DuMixOutput duMixOutput, boolean z2) {
        float inputWidth;
        int inputHeight;
        float outputWidth;
        int outputHeight;
        if (pointF == null || duMixInput == null || duMixOutput == null || duMixOutput.getScaleType() == ScaleType.FIT_XY) {
            return;
        }
        if (z) {
            inputWidth = duMixInput.getInputHeight();
            inputHeight = duMixInput.getInputWidth();
        } else {
            inputWidth = duMixInput.getInputWidth();
            inputHeight = duMixInput.getInputHeight();
        }
        float f = inputWidth / inputHeight;
        if (z2) {
            outputWidth = duMixOutput.getOutputHeight();
            outputHeight = duMixOutput.getOutputWidth();
        } else {
            outputWidth = duMixOutput.getOutputWidth();
            outputHeight = duMixOutput.getOutputHeight();
        }
        float f2 = outputWidth / outputHeight;
        if (f == f2) {
            return;
        }
        float f3 = pointF.x;
        float f4 = pointF.y;
        if (f < f2) {
            if (a.c[duMixOutput.getScaleType().ordinal()] == 1) {
                float f5 = 1.0f / f2;
                f4 = ((((f4 * 2.0f) - 1.0f) * (1.0f / f)) + f5) / (f5 * 2.0f);
            }
        } else if (a.c[duMixOutput.getScaleType().ordinal()] == 1) {
            f3 = ((((f3 * 2.0f) - 1.0f) * f) + f2) / (f2 * 2.0f);
        }
        pointF.set(f3, f4);
    }

    public static Size b(int i, int i2, int i3, int i4) {
        Size size = new Size(i, i2);
        if (i > 0 && i2 > 0 && i3 > 0 && i4 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            float f4 = i3 / i4;
            if (f3 > f4) {
                size.setWidth((int) (f2 * f4));
                size.setHeight(i2);
                return size;
            }
            if (f3 < f4) {
                size.setWidth(i);
                size.setHeight((int) (f / f4));
            }
        }
        return size;
    }
}
