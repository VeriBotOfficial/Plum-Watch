package com.anyka.neural.ncnn;

import android.graphics.Bitmap;
import com.alipay.sdk.m.p.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes11.dex */
class YuvProcessor {

    public static class YuvData {
        public ByteBuffer uvPlane;
        public FloatBuffer yFloatPlane;

        public YuvData(FloatBuffer floatBuffer, ByteBuffer byteBuffer) {
            this.yFloatPlane = floatBuffer;
            this.uvPlane = byteBuffer;
        }
    }

    public static YuvData bitmapToYuv420(Bitmap bitmap) {
        if (bitmap == null) {
            throw new IllegalArgumentException("Bitmap cannot be null");
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ByteBuffer order = ByteBuffer.allocateDirect(i / 2).order(ByteOrder.nativeOrder());
        int[] iArr = new int[i];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int i4 = (i2 * width) + i3;
                int i5 = iArr[i4];
                int i6 = ((i5 >> 8) & 255) * 129;
                int i7 = (((((i5 & 255) * 25) + (i6 + (((i5 >> 16) & 255) * 66))) + 128) >> 8) + 16;
                if (i7 < 0) {
                    i7 = 0;
                } else if (i7 > 255) {
                    i7 = 255;
                }
                asFloatBuffer.put(i4, i7 / 255.0f);
            }
        }
        int i8 = 0;
        for (int i9 = 0; i9 < height; i9 += 2) {
            for (int i10 = 0; i10 < width; i10 += 2) {
                int i11 = iArr[(i9 * width) + i10];
                int i12 = (i11 >> 16) & 255;
                int i13 = (i11 >> 8) & 255;
                int i14 = i11 & 255;
                int i15 = ((((i14 * 112) + ((i12 * (-38)) - (i13 * 74))) + 128) >> 8) + 128;
                int i16 = (((((i12 * 112) - (i13 * 94)) - (i14 * 18)) + 128) >> 8) + 128;
                if (i15 < 0) {
                    i15 = 0;
                } else if (i15 > 255) {
                    i15 = 255;
                }
                if (i16 < 0) {
                    i16 = 0;
                } else if (i16 > 255) {
                    i16 = 255;
                }
                int i17 = i8 + 1;
                order.put(i8, (byte) i15);
                i8 += 2;
                order.put(i17, (byte) i16);
            }
        }
        asFloatBuffer.rewind();
        order.rewind();
        return new YuvData(asFloatBuffer, order);
    }

    public static FloatBuffer mergeYChannelFrom4Regions(FloatBuffer[] floatBufferArr, int i, int i2) {
        int i3 = i * 2;
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(i2 * 2 * i3 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int i4 = 0; i4 < 4; i4++) {
            int i5 = (i4 % 2) * i;
            int i6 = (i4 / 2) * i2;
            floatBufferArr[i4].rewind();
            for (int i7 = 0; i7 < i2; i7++) {
                for (int i8 = 0; i8 < i; i8++) {
                    asFloatBuffer.put(i5 + i8 + ((i6 + i7) * i3), floatBufferArr[i4].get((i7 * i) + i8));
                }
            }
        }
        asFloatBuffer.rewind();
        return asFloatBuffer;
    }

    public static boolean saveBitmapAsJpeg(Bitmap bitmap, String str, int i) {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        boolean z = false;
        try {
            try {
                try {
                    File file = new File(str);
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    fileOutputStream = new FileOutputStream(file);
                } catch (IOException e) {
                    e.printStackTrace();
                    return z;
                }
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = fileOutputStream2;
        }
        try {
            z = bitmap.compress(Bitmap.CompressFormat.JPEG, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return z;
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            e.printStackTrace();
            if (fileOutputStream2 != null) {
                fileOutputStream2.close();
            }
            return z;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            throw th;
        }
    }

    public static boolean saveYuvAsJpeg(YuvData yuvData, int i, int i2, String str, int i3) {
        Bitmap yuv420ToBitmap = yuv420ToBitmap(yuvData, i, i2);
        saveBitmapAsJpeg(yuv420ToBitmap, str, i3);
        yuv420ToBitmap.recycle();
        return true;
    }

    public static FloatBuffer[] splitYChannelInto4Regions(FloatBuffer floatBuffer, int i, int i2) {
        int i3 = i / 2;
        int i4 = i2 / 2;
        int i5 = i3 * i4;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        for (int i6 = 0; i6 < 4; i6++) {
            floatBufferArr[i6] = ByteBuffer.allocateDirect(i5 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        floatBuffer.rewind();
        for (int i7 = 0; i7 < 4; i7++) {
            int i8 = (i7 % 2) * i3;
            int i9 = (i7 / 2) * i4;
            for (int i10 = 0; i10 < i4; i10++) {
                for (int i11 = 0; i11 < i3; i11++) {
                    floatBufferArr[i7].put((i10 * i3) + i11, floatBuffer.get(i8 + i11 + ((i9 + i10) * i)));
                }
            }
            floatBufferArr[i7].rewind();
        }
        return floatBufferArr;
    }

    public static ByteBuffer upscaleUvData4x(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = 2;
        int i4 = i / 2;
        int i5 = i2 / 2;
        int i6 = i4 * 2;
        int i7 = i5 * 2;
        ByteBuffer order = ByteBuffer.allocateDirect(i6 * i7 * 2).order(ByteOrder.nativeOrder());
        byteBuffer.rewind();
        int i8 = 0;
        while (i8 < i7) {
            int i9 = 0;
            while (i9 < i6) {
                float f = i9 / 2.0f;
                float f2 = i8 / 2.0f;
                int floor = (int) Math.floor(f);
                int floor2 = (int) Math.floor(f2);
                int min = Math.min(floor + 1, i4 - 1);
                int min2 = Math.min(floor2 + 1, i5 - 1);
                float f3 = f - floor;
                float f4 = f2 - floor2;
                int i10 = 0;
                while (i10 < i3) {
                    int i11 = floor2 * i4;
                    int i12 = i3;
                    byte b = byteBuffer.get(((i11 + floor) * 2) + i10);
                    int i13 = i4;
                    int i14 = i5;
                    int i15 = byteBuffer.get(((i11 + min) * 2) + i10) & 255;
                    int i16 = min2 * i13;
                    int i17 = i6;
                    int i18 = byteBuffer.get(((i16 + floor) * 2) + i10) & 255;
                    int i19 = i7;
                    int i20 = byteBuffer.get(((i16 + min) * 2) + i10) & 255;
                    float f5 = 1.0f - f3;
                    float f6 = 1.0f - f4;
                    order.put((((i8 * i17) + i9) * 2) + i10, (byte) Math.max(0, Math.min(255, (int) ((i20 * f3 * f4) + (i18 * f5 * f4) + (i15 * f3 * f6) + ((b & 255) * f5 * f6)))));
                    i10++;
                    i5 = i14;
                    i4 = i13;
                    i3 = i12;
                    i7 = i19;
                    i6 = i17;
                }
                i9++;
                i4 = i4;
            }
            i8++;
            i4 = i4;
        }
        order.rewind();
        return order;
    }

    public static byte[] upscaleYData4x(byte[] bArr, int i, int i2) {
        int i3 = i * 2;
        int i4 = i2 * 2;
        byte[] bArr2 = new byte[i3 * i4];
        for (int i5 = 0; i5 < i4; i5++) {
            for (int i6 = 0; i6 < i3; i6++) {
                float f = i6 / 2.0f;
                float f2 = i5 / 2.0f;
                int floor = (int) Math.floor(f);
                int floor2 = (int) Math.floor(f2);
                int min = Math.min(floor + 1, i - 1);
                int min2 = Math.min(floor2 + 1, i2 - 1);
                float f3 = f - floor;
                float f4 = f2 - floor2;
                int i7 = floor2 * i;
                int i8 = bArr[i7 + floor] & 255;
                int i9 = bArr[i7 + min] & 255;
                int i10 = min2 * i;
                int i11 = bArr[floor + i10] & 255;
                int i12 = bArr[i10 + min] & 255;
                float f5 = 1.0f - f3;
                float f6 = i8 * f5;
                float f7 = 1.0f - f4;
                bArr2[(i5 * i3) + i6] = (byte) Math.max(0, Math.min(255, (int) ((i12 * f3 * f4) + (i11 * f5 * f4) + (i9 * f3 * f7) + (f6 * f7))));
            }
        }
        return bArr2;
    }

    public static Bitmap yuv420ToBitmap(YuvData yuvData, int i, int i2) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        int[] iArr = new int[i * i2];
        FloatBuffer floatBuffer = yuvData.yFloatPlane;
        ByteBuffer byteBuffer = yuvData.uvPlane;
        floatBuffer.rewind();
        byteBuffer.rewind();
        int i3 = i / 2;
        for (int i4 = 0; i4 < i2; i4++) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = (i4 * i) + i5;
                int i7 = 255;
                int i8 = ((int) (floatBuffer.get(i6) * 255.0f)) & 255;
                int i9 = (((i4 / 2) * i3) + (i5 / 2)) * 2;
                int i10 = (byteBuffer.get(i9) & 255) + a.g;
                float f = (byteBuffer.get(i9 + 1) & 255) + a.g;
                int i11 = ((int) (1.402f * f)) + i8;
                float f2 = i10;
                int i12 = i8 - ((int) ((f * 0.714f) + (0.344f * f2)));
                int i13 = i8 + ((int) (f2 * 1.772f));
                if (i11 < 0) {
                    i11 = 0;
                } else if (i11 > 255) {
                    i11 = 255;
                }
                if (i12 < 0) {
                    i12 = 0;
                } else if (i12 > 255) {
                    i12 = 255;
                }
                if (i13 < 0) {
                    i7 = 0;
                } else if (i13 <= 255) {
                    i7 = i13;
                }
                iArr[i6] = (i11 << 16) | (-16777216) | (i12 << 8) | i7;
            }
        }
        createBitmap.setPixels(iArr, 0, i, 0, 0, i, i2);
        return createBitmap;
    }
}
