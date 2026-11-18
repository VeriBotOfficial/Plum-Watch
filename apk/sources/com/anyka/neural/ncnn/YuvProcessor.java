package com.anyka.neural.ncnn;

import android.graphics.Bitmap;
import com.alipay.sdk.m.p.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
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
        int r0 = width * height;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(r0 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r0 / 2).order(ByteOrder.nativeOrder());
        int[] r12 = new int[r0];
        bitmap.getPixels(r12, 0, width, 0, 0, width, height);
        for (int r1 = 0; r1 < height; r1++) {
            for (int r2 = 0; r2 < width; r2++) {
                int r3 = (r1 * width) + r2;
                int r4 = r12[r3];
                int r6 = ((r4 >> 8) & 255) * 129;
                int r5 = (((((r4 & 255) * 25) + (r6 + (((r4 >> 16) & 255) * 66))) + 128) >> 8) + 16;
                if (r5 < 0) {
                    r5 = 0;
                } else if (r5 > 255) {
                    r5 = 255;
                }
                floatBufferAsFloatBuffer.put(r3, r5 / 255.0f);
            }
        }
        int r7 = 0;
        for (int r8 = 0; r8 < height; r8 += 2) {
            for (int r9 = 0; r9 < width; r9 += 2) {
                int r10 = r12[(r8 * width) + r9];
                int r11 = (r10 >> 16) & 255;
                int r13 = (r10 >> 8) & 255;
                int r14 = r10 & 255;
                int r15 = ((((r14 * 112) + ((r11 * (-38)) - (r13 * 74))) + 128) >> 8) + 128;
                int r16 = (((((r11 * 112) - (r13 * 94)) - (r14 * 18)) + 128) >> 8) + 128;
                if (r15 < 0) {
                    r15 = 0;
                } else if (r15 > 255) {
                    r15 = 255;
                }
                if (r16 < 0) {
                    r16 = 0;
                } else if (r16 > 255) {
                    r16 = 255;
                }
                int r17 = r7 + 1;
                byteBufferOrder.put(r7, (byte) r15);
                r7 += 2;
                byteBufferOrder.put(r17, (byte) r16);
            }
        }
        floatBufferAsFloatBuffer.rewind();
        byteBufferOrder.rewind();
        return new YuvData(floatBufferAsFloatBuffer, byteBufferOrder);
    }

    public static FloatBuffer mergeYChannelFrom4Regions(FloatBuffer[] floatBufferArr, int r13, int r14) {
        int r0 = r13 * 2;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(r14 * 2 * r0 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        for (int r4 = 0; r4 < 4; r4++) {
            int r5 = (r4 % 2) * r13;
            int r6 = (r4 / 2) * r14;
            floatBufferArr[r4].rewind();
            for (int r7 = 0; r7 < r14; r7++) {
                for (int r8 = 0; r8 < r13; r8++) {
                    floatBufferAsFloatBuffer.put(r5 + r8 + ((r6 + r7) * r0), floatBufferArr[r4].get((r7 * r13) + r8));
                }
            }
        }
        floatBufferAsFloatBuffer.rewind();
        return floatBufferAsFloatBuffer;
    }

    public static boolean saveBitmapAsJpeg(Bitmap bitmap, String str, int r6) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2 = null;
        boolean zCompress = false;
        try {
            try {
                try {
                    File file = new File(str);
                    File parentFile = file.getParentFile();
                    if (parentFile != null && !parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        zCompress = bitmap.compress(Bitmap.CompressFormat.JPEG, r6, fileOutputStream);
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e = e;
                        fileOutputStream2 = fileOutputStream;
                        e.printStackTrace();
                        if (fileOutputStream2 != null) {
                            fileOutputStream2.close();
                        }
                        return zCompress;
                    } catch (Throwable th) {
                        th = th;
                        if (fileOutputStream != null) {
                            try {
                                fileOutputStream.close();
                            } catch (IOException e2) {
                                e2.printStackTrace();
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                }
            } catch (IOException e3) {
                e = e3;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        return zCompress;
    }

    public static boolean saveYuvAsJpeg(YuvData yuvData, int r1, int r2, String str, int r4) throws Throwable {
        Bitmap bitmapYuv420ToBitmap = yuv420ToBitmap(yuvData, r1, r2);
        saveBitmapAsJpeg(bitmapYuv420ToBitmap, str, r4);
        bitmapYuv420ToBitmap.recycle();
        return true;
    }

    public static FloatBuffer[] splitYChannelInto4Regions(FloatBuffer floatBuffer, int r13, int r14) {
        int r0 = r13 / 2;
        int r15 = r14 / 2;
        int r1 = r0 * r15;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        for (int r5 = 0; r5 < 4; r5++) {
            floatBufferArr[r5] = ByteBuffer.allocateDirect(r1 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        floatBuffer.rewind();
        for (int r2 = 0; r2 < 4; r2++) {
            int r6 = (r2 % 2) * r0;
            int r7 = (r2 / 2) * r15;
            for (int r8 = 0; r8 < r15; r8++) {
                for (int r9 = 0; r9 < r0; r9++) {
                    floatBufferArr[r2].put((r8 * r0) + r9, floatBuffer.get(r6 + r9 + ((r7 + r8) * r13)));
                }
            }
            floatBufferArr[r2].rewind();
        }
        return floatBufferArr;
    }

    public static ByteBuffer upscaleUvData4x(ByteBuffer byteBuffer, int r23, int r24) {
        int r1 = 2;
        int r2 = r23 / 2;
        int r3 = r24 / 2;
        int r4 = r2 * 2;
        int r5 = r3 * 2;
        ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(r4 * r5 * 2).order(ByteOrder.nativeOrder());
        byteBuffer.rewind();
        int r8 = 0;
        while (r8 < r5) {
            int r9 = 0;
            while (r9 < r4) {
                float f = r9 / 2.0f;
                float f2 = r8 / 2.0f;
                int r11 = (int) Math.floor(f);
                int r13 = (int) Math.floor(f2);
                int r14 = Math.min(r11 + 1, r2 - 1);
                int r7 = Math.min(r13 + 1, r3 - 1);
                float f3 = f - r11;
                float f4 = f2 - r13;
                int r15 = 0;
                while (r15 < r1) {
                    int r16 = r13 * r2;
                    int r6 = byteBuffer.get(((r16 + r11) * 2) + r15) & 255;
                    int r19 = r5;
                    int r10 = byteBuffer.get(((r16 + r14) * 2) + r15) & 255;
                    int r17 = r7 * r2;
                    int r20 = r2;
                    int r12 = byteBuffer.get(((r17 + r11) * 2) + r15) & 255;
                    int r18 = r7;
                    int r21 = byteBuffer.get(((r17 + r14) * 2) + r15) & 255;
                    float f5 = 1.0f - f3;
                    float f6 = 1.0f - f4;
                    byteBufferOrder.put((((r8 * r4) + r9) * 2) + r15, (byte) Math.max(0, Math.min(255, (int) ((r21 * f3 * f4) + (r12 * f5 * f4) + (r10 * f3 * f6) + (r6 * f5 * f6)))));
                    r15++;
                    r3 = r3;
                    r1 = 2;
                    r7 = r18;
                    r5 = r19;
                    r2 = r20;
                }
                r9++;
                r5 = r5;
                r2 = r2;
            }
            r8++;
            r5 = r5;
            r2 = r2;
        }
        byteBufferOrder.rewind();
        return byteBufferOrder;
    }

    public static byte[] upscaleYData4x(byte[] bArr, int r16, int r17) {
        int r0 = r16 * 2;
        int r1 = r17 * 2;
        byte[] bArr2 = new byte[r0 * r1];
        for (int r4 = 0; r4 < r1; r4++) {
            for (int r5 = 0; r5 < r0; r5++) {
                float f = r5 / 2.0f;
                float f2 = r4 / 2.0f;
                int r7 = (int) Math.floor(f);
                int r9 = (int) Math.floor(f2);
                int r10 = Math.min(r7 + 1, r16 - 1);
                int r11 = Math.min(r9 + 1, r17 - 1);
                float f3 = f - r7;
                float f4 = f2 - r9;
                int r12 = r9 * r16;
                int r13 = bArr[r12 + r7] & 255;
                int r14 = bArr[r12 + r10] & 255;
                int r15 = r11 * r16;
                int r8 = bArr[r7 + r15] & 255;
                int r18 = bArr[r15 + r10] & 255;
                float f5 = 1.0f - f3;
                float f6 = r13 * f5;
                float f7 = 1.0f - f4;
                bArr2[(r4 * r0) + r5] = (byte) Math.max(0, Math.min(255, (int) ((r18 * f3 * f4) + (r8 * f5 * f4) + (r14 * f3 * f7) + (f6 * f7))));
            }
        }
        return bArr2;
    }

    public static Bitmap yuv420ToBitmap(YuvData yuvData, int r19, int r20) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(r19, r20, Bitmap.Config.ARGB_8888);
        int[] r1 = new int[r19 * r20];
        FloatBuffer floatBuffer = yuvData.yFloatPlane;
        ByteBuffer byteBuffer = yuvData.uvPlane;
        floatBuffer.rewind();
        byteBuffer.rewind();
        int r3 = r19 / 2;
        for (int r5 = 0; r5 < r20; r5++) {
            for (int r9 = 0; r9 < r19; r9++) {
                int r10 = (r5 * r19) + r9;
                int r12 = 255;
                int r11 = ((int) (floatBuffer.get(r10) * 255.0f)) & 255;
                int r13 = (((r5 / 2) * r3) + (r9 / 2)) * 2;
                int r14 = (byteBuffer.get(r13) & 255) + a.g;
                float f = (byteBuffer.get(r13 + 1) & 255) + a.g;
                int r15 = ((int) (1.402f * f)) + r11;
                float f2 = r14;
                int r16 = r11 - ((int) ((f * 0.714f) + (0.344f * f2)));
                int r17 = r11 + ((int) (f2 * 1.772f));
                if (r15 < 0) {
                    r15 = 0;
                } else if (r15 > 255) {
                    r15 = 255;
                }
                if (r16 < 0) {
                    r16 = 0;
                } else if (r16 > 255) {
                    r16 = 255;
                }
                if (r17 < 0) {
                    r12 = 0;
                } else if (r17 <= 255) {
                    r12 = r17;
                }
                r1[r10] = (r15 << 16) | (-16777216) | (r16 << 8) | r12;
            }
        }
        bitmapCreateBitmap.setPixels(r1, 0, r19, 0, 0, r19, r20);
        return bitmapCreateBitmap;
    }
}
