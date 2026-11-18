package com.huawei.hms.ml.common.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicYuvToRGB;
import android.renderscript.Type;
import java.util.Locale;

/* JADX INFO: loaded from: classes11.dex */
public class NV21ToBitmapConverter1 {
    private Context applicationContext;
    private Allocation in;
    private Allocation out;
    private RenderScript renderScript;
    private Type.Builder rgbaType;
    private ScriptIntrinsicYuvToRGB yuvToRgbIntrinsic;
    private Type.Builder yuvType;
    private int width = -1;
    private int height = -1;
    private int length = -1;

    public NV21ToBitmapConverter1(Context context) {
        if (context == null) {
            throw new IllegalArgumentException("context can't be null");
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            this.applicationContext = context;
        } else {
            this.applicationContext = applicationContext;
        }
        RenderScript renderScriptCreate = RenderScript.create(this.applicationContext);
        this.renderScript = renderScriptCreate;
        this.yuvToRgbIntrinsic = ScriptIntrinsicYuvToRGB.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
    }

    public Context getApplicationContext() {
        Context context = this.applicationContext;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("initial must be called first");
    }

    public Bitmap convertYUVtoRGB(byte[] bArr, int r6, int r7) {
        if (this.yuvType == null) {
            RenderScript renderScript = this.renderScript;
            Type.Builder x = new Type.Builder(renderScript, Element.U8(renderScript)).setX(bArr.length);
            this.yuvType = x;
            this.in = Allocation.createTyped(this.renderScript, x.create(), 1);
            RenderScript renderScript2 = this.renderScript;
            Type.Builder y = new Type.Builder(renderScript2, Element.RGBA_8888(renderScript2)).setX(r6).setY(r7);
            this.rgbaType = y;
            this.out = Allocation.createTyped(this.renderScript, y.create(), 1);
        }
        this.in.copyFrom(bArr);
        this.yuvToRgbIntrinsic.setInput(this.in);
        this.yuvToRgbIntrinsic.forEach(this.out);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r6, r7, Bitmap.Config.ARGB_8888);
        this.out.copyTo(bitmapCreateBitmap);
        return bitmapCreateBitmap;
    }

    public Matrix getTransformationMatrix(int r6, int r7, int r8, int r9, int r10, boolean z, boolean z2, boolean z3) {
        Matrix matrix = new Matrix();
        if (r10 != 0) {
            if (r10 % 90 != 0) {
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Rotation of %d", Integer.valueOf(r10)));
            }
            matrix.postTranslate((-r6) / 2.0f, (-r7) / 2.0f);
            matrix.postRotate(r10);
        }
        boolean z4 = (Math.abs(r10) + 90) % 180 == 0;
        int r4 = z4 ? r7 : r6;
        if (!z4) {
            r6 = r7;
        }
        int r11 = z ? -1 : 1;
        int r3 = z2 ? -1 : 1;
        if (r4 != r8 || r6 != r9) {
            float f = (r11 * r8) / r4;
            float f2 = (r3 * r9) / r6;
            if (z3) {
                float fMax = Math.max(Math.abs(f), Math.abs(f2));
                matrix.postScale(fMax, fMax);
            } else {
                matrix.postScale(f, f2);
            }
        }
        if (r10 != 0) {
            float f3 = r8 / 2.0f;
            float f4 = r9 / 2.0f;
            matrix.postTranslate(f3, f4);
            matrix.postScale(r11, r3, f3, f4);
        }
        return matrix;
    }

    public Bitmap convert(byte[] bArr, int r15, int r16, int r17, int r18, int r19, boolean z, boolean z2, boolean z3) {
        recreateIfNeed(bArr, r15, r16, r19);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r17, r18, Bitmap.Config.ARGB_8888);
        new Canvas(bitmapCreateBitmap).drawBitmap(convertYUVtoRGB(bArr, r15, r16), getTransformationMatrix(r15, r16, r17, r18, r19, z, z2, z3), null);
        return bitmapCreateBitmap;
    }

    public Bitmap convert(byte[] bArr, int r12, int r13, int r14, int r15, int r16) {
        return convert(bArr, r12, r13, r14, r15, r16, false, false, false);
    }

    private void recreateIfNeed(byte[] bArr, int r3, int r4, int r5) {
        if (this.width == r3 && this.height == r4 && this.length == bArr.length) {
            return;
        }
        this.width = r3;
        this.height = r4;
        this.length = bArr.length;
        this.yuvType = null;
        this.rgbaType = null;
    }
}
