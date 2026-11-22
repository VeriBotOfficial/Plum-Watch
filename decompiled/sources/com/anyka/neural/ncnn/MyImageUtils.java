package com.anyka.neural.ncnn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
public class MyImageUtils {
    public static ByteBuffer bitmapToRgbBuffer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        ByteBuffer order = ByteBuffer.allocateDirect(i * 3).order(ByteOrder.nativeOrder());
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            order.put((byte) ((iArr[i2] >> 16) & 255));
        }
        for (int i3 = 0; i3 < i; i3++) {
            order.put((byte) ((iArr[i3] >> 8) & 255));
        }
        for (int i4 = 0; i4 < i; i4++) {
            order.put((byte) (iArr[i4] & 255));
        }
        order.rewind();
        return order;
    }

    private static FloatBuffer bitmapToRgbBufferFloat(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        int i2 = i * 12;
        ByteBuffer order = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = order.asFloatBuffer();
        if (order.capacity() != i2) {
            Log.e("Mety0208", "ByteBuffer 容量不匹配: expected=" + i2 + ", actual=" + order.capacity());
            return null;
        }
        bitmap.getPixels(new int[i], 0, width, 0, 0, width, height);
        for (int i3 = 0; i3 < i; i3++) {
            asFloatBuffer.put(((r2[i3] >> 16) & 255) / 255.0f);
        }
        for (int i4 = 0; i4 < i; i4++) {
            asFloatBuffer.put(((r2[i4] >> 8) & 255) / 255.0f);
        }
        for (int i5 = 0; i5 < i; i5++) {
            asFloatBuffer.put((r2[i5] & 255) / 255.0f);
        }
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    private static ByteBuffer bitmapToRgbBufferHwc(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        ByteBuffer order = ByteBuffer.allocateDirect(i * 3).order(ByteOrder.nativeOrder());
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = iArr[i2];
            order.put((byte) ((i3 >> 16) & 255));
            order.put((byte) ((i3 >> 8) & 255));
            order.put((byte) (i3 & 255));
        }
        order.rewind();
        return order;
    }

    public static ByteBuffer imagePathToRgbBuffer(String str, boolean z) {
        Bitmap decodeFile;
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists() || !file.isFile() || (decodeFile = BitmapFactory.decodeFile(str)) == null) {
                return null;
            }
            try {
                return bitmapToRgbBuffer(decodeFile, z);
            } finally {
                if (!decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
            }
        }
        return null;
    }

    public static Bitmap rgbBufferToBitmap(FloatBuffer floatBuffer, int i, int i2) {
        if (floatBuffer == null) {
            return null;
        }
        int i3 = i * i2;
        if (floatBuffer.capacity() < i3 * 3) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i3];
        floatBuffer.rewind();
        for (int i4 = 0; i4 < i3; i4++) {
            iArr[i4] = Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) << 16;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            iArr[i5] = (Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) << 8) | iArr[i5];
        }
        for (int i6 = 0; i6 < i3; i6++) {
            iArr[i6] = Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) | (-16777216) | iArr[i6];
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    public static FloatBuffer imagePathToRgbBuffer(String str) {
        Bitmap decodeFile;
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists() || !file.isFile() || (decodeFile = BitmapFactory.decodeFile(str)) == null) {
                return null;
            }
            try {
                return bitmapToRgbBufferFloat(decodeFile);
            } finally {
                if (!decodeFile.isRecycled()) {
                    decodeFile.recycle();
                }
            }
        }
        return null;
    }

    public static ByteBuffer bitmapToRgbBuffer(Bitmap bitmap, boolean z) {
        if (z) {
            return bitmapToRgbBufferHwc(bitmap);
        }
        return bitmapToRgbBuffer(bitmap);
    }

    public static Bitmap rgbBufferToBitmap(ByteBuffer byteBuffer, int i, int i2, boolean z) {
        if (byteBuffer == null) {
            return null;
        }
        int i3 = i * i2;
        if (byteBuffer.capacity() < i3 * 3) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i3];
        byteBuffer.rewind();
        int i4 = 0;
        if (z) {
            while (i4 < i3) {
                iArr[i4] = ((byteBuffer.get() & 255) << 16) | (-16777216) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
                i4++;
            }
        } else {
            byte[] bArr = new byte[i3];
            byteBuffer.get(bArr);
            byte[] bArr2 = new byte[i3];
            byteBuffer.get(bArr2);
            byte[] bArr3 = new byte[i3];
            byteBuffer.get(bArr3);
            while (i4 < i3) {
                iArr[i4] = ((bArr[i4] & 255) << 16) | (-16777216) | ((bArr2[i4] & 255) << 8) | (bArr3[i4] & 255);
                i4++;
            }
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }

    public static Bitmap rgbBufferToBitmap(ByteBuffer byteBuffer, int i, int i2) {
        return rgbBufferToBitmap(byteBuffer, i, i2, true);
    }
}
