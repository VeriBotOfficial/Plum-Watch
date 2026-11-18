package com.baidu.ar;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes16.dex */
public class k1 {
    public static Bitmap a(Context context, String str) {
        Bitmap bitmapDecodeStream = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream inputStreamOpen = context.getAssets().open(str);
            bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpen);
            inputStreamOpen.close();
            return bitmapDecodeStream;
        } catch (IOException e) {
            e.printStackTrace();
            return bitmapDecodeStream;
        }
    }

    public static Bitmap a(Bitmap bitmap, int r8) {
        float f;
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        float f2 = width / 2.0f;
        float f3 = height / 2.0f;
        matrix.setRotate(r8, f2, f3);
        float f4 = 0.0f;
        if (r8 != 90 && r8 != 270) {
            f = 0.0f;
        } else if (width > height) {
            float f5 = f3 - f2;
            f = 0.0f - f5;
            f4 = f5;
        } else {
            f = f2 - f3;
            f4 = 0.0f - f;
        }
        matrix.postTranslate(f4, f);
        try {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getHeight(), bitmap.getWidth(), Bitmap.Config.ARGB_8888);
        } catch (Exception e) {
            e.printStackTrace();
            bitmapCreateBitmap = null;
        }
        new Canvas(bitmapCreateBitmap).drawBitmap(bitmap, matrix, new Paint());
        return bitmapCreateBitmap;
    }
}
