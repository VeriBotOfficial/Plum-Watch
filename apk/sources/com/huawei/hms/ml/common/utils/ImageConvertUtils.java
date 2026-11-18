package com.huawei.hms.ml.common.utils;

import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public final class ImageConvertUtils {
    public static final int INDEX_PLANE_U = 1;
    public static final int INDEX_PLANE_V = 2;
    public static final int INDEX_PLANE_Y = 0;
    private static final ImageConvertUtils INSTANCE = new ImageConvertUtils();
    public static final int YUV_FORMAT_I420 = 1;
    public static final int YUV_FORMAT_NV21 = 2;

    private static int getChannelOffset(int r2, int r3, int r4) {
        if (r2 == 0) {
            return 0;
        }
        if (r2 != 1) {
            return r3 == 1 ? (int) (((double) r4) * 1.25d) : r4;
        }
        return r3 == 1 ? r4 : r4 + 1;
    }

    private static int getOutputStride(int r1, int r2) {
        return (r1 == 0 || r2 == 1) ? 1 : 2;
    }

    private ImageConvertUtils() {
    }

    public static ImageConvertUtils getInstance() {
        return INSTANCE;
    }

    public static byte[] buffer2Byte(ByteBuffer byteBuffer) {
        byteBuffer.rewind();
        int r0 = byteBuffer.limit();
        byte[] bArr = new byte[r0];
        byteBuffer.get(bArr, 0, r0);
        return bArr;
    }

    public static byte[] nv21ToJpeg(byte[] bArr, int r10, int r11) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                new YuvImage(bArr, 17, r10, r11, null).compressToJpeg(new Rect(0, 0, r10, r11), 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static byte[] bitmap2Jpeg(Bitmap bitmap, int r3) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, r3, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return new byte[0];
        }
    }

    public static byte[] yuv2Buffer(Image image) {
        Image.Plane[] planes = image.getPlanes();
        ByteBuffer buffer = planes[0].getBuffer();
        ByteBuffer buffer2 = planes[1].getBuffer();
        ByteBuffer buffer3 = planes[2].getBuffer();
        int r3 = buffer.remaining();
        int r4 = buffer2.remaining();
        int r5 = buffer3.remaining();
        int r6 = r3 + r4 + r5;
        byte[] bArr = new byte[r6];
        buffer.get(bArr, 0, r3);
        buffer3.get(bArr, r3, r5);
        buffer2.get(bArr, r6 - r4, r4);
        return bArr;
    }

    public static byte[] byteToNv21(byte[] bArr) {
        int length = bArr.length;
        int r1 = (length * 2) / 3;
        int r2 = length - r1;
        int r3 = length / 6;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, r1);
        for (int r4 = 0; r4 < r2; r4++) {
            if (r4 % 2 == 0) {
                bArr2[r1 + r4] = bArr[(r4 / 2) + r1];
            } else {
                bArr2[r1 + r4] = bArr[r1 + r3 + (r4 / 2)];
            }
        }
        return bArr2;
    }

    public static byte[] bitmapToNv21(Bitmap bitmap, int r10, int r11) {
        if (bitmap != null && bitmap.getWidth() >= r10 && bitmap.getHeight() >= r11) {
            int[] r0 = new int[r10 * r11];
            bitmap.getPixels(r0, 0, r10, 0, 0, r10, r11);
            return argbToNv21(r0, r10, r11);
        }
        return new byte[0];
    }

    private static byte[] argbToNv21(int[] r17, int r18, int r19) {
        int r2 = r18 * r19;
        int r3 = (r2 * 3) / 2;
        byte[] bArr = new byte[r3];
        int r7 = 0;
        int r8 = 0;
        for (int r6 = 0; r6 < r19; r6++) {
            int r9 = 0;
            while (r9 < r18) {
                int r10 = r17[r8];
                int r11 = (16711680 & r10) >> 16;
                int r12 = (65280 & r10) >> 8;
                int r13 = 255;
                int r14 = r10 & 255;
                int r15 = (((((r11 * 66) + (r12 * 129)) + (r14 * 25)) + 128) >> 8) + 16;
                int r16 = (((((r11 * (-38)) - (r12 * 74)) + (r14 * 112)) + 128) >> 8) + 128;
                int r110 = (((((r11 * 112) - (r12 * 94)) - (r14 * 18)) + 128) >> 8) + 128;
                int r111 = r7 + 1;
                if (r15 < 0) {
                    r15 = 0;
                } else if (r15 > 255) {
                    r15 = 255;
                }
                bArr[r7] = (byte) r15;
                if (r6 % 2 == 0 && r8 % 2 == 0 && r2 < r3 - 2) {
                    int r20 = r2 + 1;
                    if (r110 < 0) {
                        r110 = 0;
                    } else if (r110 > 255) {
                        r110 = 255;
                    }
                    bArr[r2] = (byte) r110;
                    r2 += 2;
                    if (r16 < 0) {
                        r13 = 0;
                    } else if (r16 <= 255) {
                        r13 = r16;
                    }
                    bArr[r20] = (byte) r13;
                }
                r8++;
                r9++;
                r7 = r111;
            }
        }
        return bArr;
    }

    public static byte[] nv21ToGray(byte[] bArr, int r3, int r4) {
        int r5 = r3 * r4;
        int r6 = r5 / 2;
        byte[] bArr2 = new byte[r6];
        Arrays.fill(bArr2, (byte) -128);
        System.arraycopy(bArr2, 0, bArr, r5, r6);
        return bArr;
    }

    private static boolean isImageFormatSupported(Image image) {
        int format = image.getFormat();
        return format == 35 || format == 17 || format == 842094169;
    }

    public static byte[] getDataFromImage(Image image, int r21) {
        int r1;
        checkFormat(image, r21);
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int r3 = cropRect.width();
        int r4 = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int r6 = r3 * r4;
        byte[] bArr = new byte[(ImageFormat.getBitsPerPixel(format) * r6) / 8];
        int r7 = 0;
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int r9 = 0;
        while (r9 < planes.length) {
            ByteBuffer buffer = planes[r9].getBuffer();
            int rowStride = planes[r9].getRowStride();
            int pixelStride = planes[r9].getPixelStride();
            int channelOffset = getChannelOffset(r9, r21, r6);
            int outputStride = getOutputStride(r9, r21);
            int r16 = r9 == 0 ? r7 : 1;
            int r8 = r3 >> r16;
            int r15 = r4 >> r16;
            int r18 = r3;
            buffer.position(((cropRect.top >> r16) * rowStride) + ((cropRect.left >> r16) * pixelStride));
            int r0 = 0;
            while (r0 < r15) {
                if (pixelStride != 1 || outputStride != 1) {
                    r1 = ((r8 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, r1);
                    for (int r5 = 0; r5 < r8; r5++) {
                        bArr[channelOffset] = bArr2[r5 * pixelStride];
                        channelOffset += outputStride;
                    }
                } else {
                    buffer.get(bArr, channelOffset, r8);
                    channelOffset += r8;
                    r1 = r8;
                }
                if (r0 < r15 - 1) {
                    buffer.position((buffer.position() + rowStride) - r1);
                }
                r0++;
                cropRect = cropRect;
            }
            r9++;
            r3 = r18;
            r7 = 0;
        }
        return bArr;
    }

    private static void checkFormat(Image image, int r3) {
        if (r3 != 1 && r3 != 2) {
            throw new IllegalArgumentException("only support YUV_FORMAT_I420 and YUV_FORMAT_NV21");
        }
        if (!isImageFormatSupported(image)) {
            throw new RuntimeException("can't convert Image to byte array, format " + image.getFormat());
        }
    }
}
