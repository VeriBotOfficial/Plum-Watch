package com.anythink.expressad.foundation.g.d;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.anythink.core.common.v.h;
import com.anythink.expressad.foundation.h.p;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class a {
    private static Drawable a(Resources resources, Bitmap bitmap) {
        return new BitmapDrawable(resources, bitmap);
    }

    public static Bitmap a(String str) {
        Bitmap bitmap = null;
        if (!p.a(str)) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        try {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inJustDecodeBounds = false;
            options.inPurgeable = true;
            options.inInputShareable = true;
            options.inDither = true;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            System.gc();
            b.a();
            try {
                options.inPreferredConfig = Bitmap.Config.ARGB_4444;
                bitmap = BitmapFactory.decodeFile(str, options);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                return bitmap;
            } catch (OutOfMemoryError e2) {
                e2.printStackTrace();
                return bitmap;
            }
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int min;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / i2));
        if (i == -1) {
            min = 128;
        } else {
            double d3 = i;
            min = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (min >= ceil) {
            if (i2 == -1 && i == -1) {
                return 1;
            }
            if (i != -1) {
                return min;
            }
        }
        return ceil;
    }

    private static Bitmap a(Bitmap bitmap) {
        float f;
        float f2;
        float f3;
        float f4;
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            f4 = width / 2;
            f3 = width;
            f = 0.0f;
            f2 = f3;
        } else {
            f = (width - height) / 2;
            f2 = height;
            f3 = width - f;
            width = height;
            f4 = height / 2;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(width, width, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            int i = (int) f2;
            Rect rect = new Rect((int) f, 0, (int) f3, i);
            Rect rect2 = new Rect(0, 0, i, i);
            RectF rectF = new RectF(rect2);
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-12434878);
            canvas.drawRoundRect(rectF, f4, f4, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, rect, rect2, paint);
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f  */
    /* JADX WARN: Removed duplicated region for block: B:7:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap a(android.content.Context r0, int r1) {
        /*
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.OutOfMemoryError -> L9 java.lang.Exception -> Lc
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeResource(r0, r1)     // Catch: java.lang.OutOfMemoryError -> L9 java.lang.Exception -> Lc
            goto Ld
        L9:
            java.lang.System.gc()
        Lc:
            r0 = 0
        Ld:
            if (r0 != 0) goto L16
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ALPHA_8
            r1 = 1
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r1, r1, r0)
        L16:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.foundation.g.d.a.a(android.content.Context, int):android.graphics.Bitmap");
    }

    private static InputStream b(Bitmap bitmap) {
        return h.a(bitmap);
    }
}
