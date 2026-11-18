package com.anyka.neural.ncnn;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class MyImageUtils {
    public static ByteBuffer bitmapToRgbBuffer(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int r8 = width * height;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r8 * 3).order(ByteOrder.nativeOrder());
        int[] r10 = new int[r8];
        bitmap.getPixels(r10, 0, width, 0, 0, width, height);
        for (int r0 = 0; r0 < r8; r0++) {
            byteBufferOrder.put((byte) ((r10[r0] >> 16) & 255));
        }
        for (int r1 = 0; r1 < r8; r1++) {
            byteBufferOrder.put((byte) ((r10[r1] >> 8) & 255));
        }
        for (int r11 = 0; r11 < r8; r11++) {
            byteBufferOrder.put((byte) (r10[r11] & 255));
        }
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    private static FloatBuffer bitmapToRgbBufferFloat(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int r9 = width * height;
        int r1 = r9 * 12;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r1).order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferOrder.asFloatBuffer();
        if (byteBufferOrder.capacity() != r1) {
            Log.e("Mety0208", "ByteBuffer 容量不匹配: expected=" + r1 + ", actual=" + byteBufferOrder.capacity());
            return null;
        }
        int[] r0 = new int[r9];
        bitmap.getPixels(r0, 0, width, 0, 0, width, height);
        for (int r2 = 0; r2 < r9; r2++) {
            floatBufferAsFloatBuffer.put(((r0[r2] >> 16) & 255) / 255.0f);
        }
        for (int r3 = 0; r3 < r9; r3++) {
            floatBufferAsFloatBuffer.put(((r0[r3] >> 8) & 255) / 255.0f);
        }
        for (int r11 = 0; r11 < r9; r11++) {
            floatBufferAsFloatBuffer.put((r0[r11] & 255) / 255.0f);
        }
        floatBufferAsFloatBuffer.rewind();
        return floatBufferAsFloatBuffer;
    }

    private static ByteBuffer bitmapToRgbBufferHwc(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int r8 = width * height;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r8 * 3).order(ByteOrder.nativeOrder());
        int[] r10 = new int[r8];
        bitmap.getPixels(r10, 0, width, 0, 0, width, height);
        for (int r11 = 0; r11 < r8; r11++) {
            int r0 = r10[r11];
            byteBufferOrder.put((byte) ((r0 >> 16) & 255));
            byteBufferOrder.put((byte) ((r0 >> 8) & 255));
            byteBufferOrder.put((byte) (r0 & 255));
        }
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    public static ByteBuffer imagePathToRgbBuffer(String str, boolean z) {
        Bitmap bitmapDecodeFile;
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists() || !file.isFile() || (bitmapDecodeFile = BitmapFactory.decodeFile(str)) == null) {
                return null;
            }
            try {
                return bitmapToRgbBuffer(bitmapDecodeFile, z);
            } finally {
                if (!bitmapDecodeFile.isRecycled()) {
                    bitmapDecodeFile.recycle();
                }
            }
        }
        return null;
    }

    public static Bitmap rgbBufferToBitmap(FloatBuffer floatBuffer, int r11, int r12) {
        if (floatBuffer == null) {
            return null;
        }
        int r1 = r11 * r12;
        if (floatBuffer.capacity() < r1 * 3) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r11, r12, Bitmap.Config.ARGB_8888);
        int[] r3 = new int[r1];
        floatBuffer.rewind();
        for (int r4 = 0; r4 < r1; r4++) {
            r3[r4] = Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) << 16;
        }
        for (int r5 = 0; r5 < r1; r5++) {
            r3[r5] = (Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) << 8) | r3[r5];
        }
        for (int r6 = 0; r6 < r1; r6++) {
            r3[r6] = Math.max(0, Math.min(255, Math.round(floatBuffer.get() * 255.0f))) | (-16777216) | r3[r6];
        }
        bitmapCreateBitmap.setPixels(r3, 0, r11, 0, 0, r11, r12);
        return bitmapCreateBitmap;
    }

    public static FloatBuffer imagePathToRgbBuffer(String str) {
        Bitmap bitmapDecodeFile;
        if (str != null && !str.isEmpty()) {
            File file = new File(str);
            if (!file.exists() || !file.isFile() || (bitmapDecodeFile = BitmapFactory.decodeFile(str)) == null) {
                return null;
            }
            try {
                return bitmapToRgbBufferFloat(bitmapDecodeFile);
            } finally {
                if (!bitmapDecodeFile.isRecycled()) {
                    bitmapDecodeFile.recycle();
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

    public static Bitmap rgbBufferToBitmap(ByteBuffer byteBuffer, int r11, int r12, boolean z) {
        if (byteBuffer == null) {
            return null;
        }
        int r1 = r11 * r12;
        if (byteBuffer.capacity() < r1 * 3) {
            return null;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r11, r12, Bitmap.Config.ARGB_8888);
        int[] r3 = new int[r1];
        byteBuffer.rewind();
        int r4 = 0;
        if (z) {
            while (r4 < r1) {
                r3[r4] = ((byteBuffer.get() & 255) << 16) | (-16777216) | ((byteBuffer.get() & 255) << 8) | (byteBuffer.get() & 255);
                r4++;
            }
        } else {
            byte[] bArr = new byte[r1];
            byteBuffer.get(bArr);
            byte[] bArr2 = new byte[r1];
            byteBuffer.get(bArr2);
            byte[] bArr3 = new byte[r1];
            byteBuffer.get(bArr3);
            while (r4 < r1) {
                r3[r4] = ((bArr[r4] & 255) << 16) | (-16777216) | ((bArr2[r4] & 255) << 8) | (bArr3[r4] & 255);
                r4++;
            }
        }
        bitmapCreateBitmap.setPixels(r3, 0, r11, 0, 0, r11, r12);
        return bitmapCreateBitmap;
    }

    public static Bitmap rgbBufferToBitmap(ByteBuffer byteBuffer, int r2, int r3) {
        return rgbBufferToBitmap(byteBuffer, r2, r3, true);
    }
}
