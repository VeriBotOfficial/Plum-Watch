package com.qumeng.overseas.advlib.__remote__.framework.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes17.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12977a = "ImageUtils";

    public static boolean a(InputStream inputStream) {
        try {
            int read = inputStream.read();
            int read2 = inputStream.read();
            int read3 = inputStream.read();
            int read4 = inputStream.read();
            inputStream.skip(inputStream.available() - 1);
            int[] iArr = {read, read2, read3, read4, inputStream.read()};
            inputStream.close();
            if (iArr[0] == 71 && iArr[1] == 73 && iArr[2] == 70) {
                if (iArr[3] == 56) {
                    return true;
                }
            }
            return false;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        } catch (Exception e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static Bitmap a(byte[] bArr, int i, int i2) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(new ByteArrayInputStream(bArr), null, options);
        options.inSampleSize = a(options, i, i2);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeStream(new ByteArrayInputStream(bArr), null, options);
    }

    private static int a(BitmapFactory.Options options, int i, int i2) {
        int round;
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (i3 > i || i4 > i2) {
            round = (int) Math.round((i3 * 1.0d) / i);
            int round2 = (int) Math.round((i4 * 1.0d) / i2);
            if (round > round2) {
                round = round2;
            }
        } else {
            round = 1;
        }
        if (round <= 0) {
            return 1;
        }
        return round;
    }

    public static double a(Bitmap bitmap, boolean z) {
        String str;
        if (!com.qumeng.overseas.advlib.__remote__.core.coreutils.a.f12826a) {
            return 0.0d;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int byteCount = bitmap.getByteCount();
        if (!z) {
            str = "origin";
        } else {
            str = "compress";
        }
        StringBuilder append = new StringBuilder().append(str).append(" bitmap width=").append(width).append(",height=").append(height).append(",byteCount mb=");
        double d = (byteCount / 1024.0d) / 1024.0d;
        com.qumeng.overseas.advlib.__remote__.utils.n.a(f12977a, append.append(d).toString(), new Object[0]);
        return d;
    }
}
