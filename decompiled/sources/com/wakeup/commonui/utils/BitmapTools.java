package com.wakeup.commonui.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public class BitmapTools {
    private static final String TAG = "BitmapUtil";

    public static Bitmap scaleImage(byte[] bArr, float f) {
        int i;
        int i2;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        options.inPurgeable = true;
        options.inInputShareable = true;
        float f2 = options.outWidth / f;
        if (options.outWidth < options.outHeight) {
            f2 = options.outHeight / f;
        }
        if (f2 <= 1.0f) {
            if (options.outWidth > options.outHeight) {
                i2 = (int) f;
                i = (options.outHeight * i2) / options.outWidth;
            } else {
                i = (int) f;
                i2 = (options.outWidth * i) / options.outHeight;
            }
            Bitmap scaleImage = scaleImage(BitmapFactory.decodeByteArray(bArr, 0, bArr.length), i2, i);
            if (scaleImage != null) {
                return scaleImage;
            }
            Log.e(TAG, "convertToThumb, decode fail:null");
            return null;
        }
        options.inJustDecodeBounds = false;
        options.inSampleSize = (int) f2;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        if (decodeByteArray != null) {
            return decodeByteArray;
        }
        Log.e(TAG, "convertToThumb, decode fail:null");
        return null;
    }

    public static Bitmap scaleImage(Bitmap bitmap, int i, int i2) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
        if ((true ^ bitmap.isRecycled()) & (bitmap != null)) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static Bitmap compressImage(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
        int i = 100;
        while (byteArrayOutputStream.toByteArray().length / 1024 > 100) {
            byteArrayOutputStream.reset();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= 10;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        Bitmap decodeStream = BitmapFactory.decodeStream(byteArrayInputStream, null, null);
        try {
            byteArrayOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        if (bitmap != null && !bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return decodeStream;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(1:3)|4|(1:(8:29|(1:11)|12|13|14|(1:18)|19|20)(1:28))(1:8)|9|(0)|12|13|14|(2:16|18)|19|20) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0071, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        r1.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap getImage(android.graphics.Bitmap r8) {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 100
            r8.compress(r1, r2, r0)
            byte[] r1 = r0.toByteArray()
            int r1 = r1.length
            r2 = 1024(0x400, float:1.435E-42)
            int r1 = r1 / r2
            if (r1 <= r2) goto L20
            r0.reset()
            android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG
            r2 = 50
            r8.compress(r1, r2, r0)
        L20:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r2 = r0.toByteArray()
            r1.<init>(r2)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options
            r2.<init>()
            r3 = 1
            r2.inJustDecodeBounds = r3
            r4 = 0
            android.graphics.BitmapFactory.decodeStream(r1, r4, r2)
            r1 = 0
            r2.inJustDecodeBounds = r1
            int r1 = r2.outWidth
            int r5 = r2.outHeight
            if (r1 <= r5) goto L4b
            float r6 = (float) r1
            r7 = 1139802112(0x43f00000, float:480.0)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L4b
            int r1 = r2.outWidth
            float r1 = (float) r1
            float r1 = r1 / r7
        L49:
            int r1 = (int) r1
            goto L5a
        L4b:
            if (r1 >= r5) goto L59
            float r1 = (float) r5
            r5 = 1145569280(0x44480000, float:800.0)
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L59
            int r1 = r2.outHeight
            float r1 = (float) r1
            float r1 = r1 / r5
            goto L49
        L59:
            r1 = r3
        L5a:
            if (r1 > 0) goto L5d
            goto L5e
        L5d:
            r3 = r1
        L5e:
            r2.inSampleSize = r3
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r1.<init>(r0)
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeStream(r1, r4, r2)
            r1.close()     // Catch: java.io.IOException -> L71
            goto L75
        L71:
            r1 = move-exception
            r1.printStackTrace()
        L75:
            if (r8 == 0) goto L80
            boolean r1 = r8.isRecycled()
            if (r1 != 0) goto L80
            r8.recycle()
        L80:
            android.graphics.Bitmap r8 = compressImage(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.utils.BitmapTools.getImage(android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public static Bitmap convertViewToBitmap(View view) {
        try {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.buildDrawingCache();
            return view.getDrawingCache();
        } catch (Exception e) {
            Log.e("liu1113", "convertViewToBitmap    Exception:" + e.getMessage());
            return null;
        }
    }
}
