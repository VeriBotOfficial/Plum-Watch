package com.sifli.watchfacesdk.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import com.sifli.siflicore.log.SFLog;
import java.io.ByteArrayOutputStream;
import java.lang.ref.SoftReference;
import java.nio.ByteBuffer;

/* loaded from: classes17.dex */
public class ColorConvertUtil {
    private static final String TAG = "ColorConvertUtil";
    private static SoftReference<byte[]> sSoftBuffer;

    private static byte[] getFrameBuffer(int i) {
        SoftReference<byte[]> softReference = sSoftBuffer;
        byte[] bArr = softReference != null ? softReference.get() : null;
        if (bArr != null && bArr.length == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i];
        sSoftBuffer = new SoftReference<>(bArr2);
        return bArr2;
    }

    public static Bitmap yuv420pToBitmap(byte[] bArr, int i, int i2) {
        if (bArr == null || i < 0 || i2 < 0) {
            Log.e(TAG, "cropNv21ToBitmap failed: illegal para !");
            return null;
        }
        byte[] frameBuffer = getFrameBuffer(i * i2 * 4);
        yuv420pToRGBA(bArr, i, i2, frameBuffer);
        Bitmap byteArrayToBitmap = byteArrayToBitmap(frameBuffer, i, i2);
        SFLog.i(TAG, "yuv420pToBitmap success %d * %d", Integer.valueOf(i), Integer.valueOf(i2));
        return byteArrayToBitmap;
    }

    public static void yuv420pToRGBA(byte[] bArr, int i, int i2, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            Log.e(TAG, "yuv420pToRGBA failed: yuv420p or rgba is null ");
        } else if (bArr.length != ((i * i2) * 3) / 2) {
            Log.e(TAG, "yuv420p length: " + bArr.length);
            Log.e(TAG, "yuv420pToRGBA failed: yuv420p length error!");
        } else {
            NativeLibrary.yuv420p2rgba(bArr, i, i2, bArr2);
        }
    }

    public static Bitmap byteArrayToBitmap(byte[] bArr, int i, int i2) {
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(wrap);
        return createBitmap;
    }

    public static Bitmap rotateBitmap(Bitmap bitmap, int i, boolean z) {
        Matrix matrix = new Matrix();
        matrix.postRotate(i);
        if (z) {
            matrix.postScale(-1.0f, 1.0f);
        }
        if (bitmap == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, false);
        bitmap.recycle();
        return createBitmap;
    }

    public static void getI420FromImage(Image image, byte[] bArr) {
        int i;
        Rect cropRect = image.getCropRect();
        int width = cropRect.width();
        int height = cropRect.height();
        Log.d(TAG, "getI420FromImage crop width: " + width + ", height: " + height);
        int i2 = width * height;
        if (bArr != null) {
            int i3 = i2 * 3;
            if (bArr.length == i3 / 2) {
                Image.Plane[] planes = image.getPlanes();
                ByteBuffer buffer = planes[0].getBuffer();
                ByteBuffer buffer2 = planes[1].getBuffer();
                ByteBuffer buffer3 = planes[2].getBuffer();
                int rowStride = planes[0].getRowStride();
                int rowStride2 = planes[1].getRowStride();
                int pixelStride = planes[1].getPixelStride();
                int rowStride3 = planes[2].getRowStride();
                int pixelStride2 = planes[2].getPixelStride();
                Log.d(TAG, "Y stride/pixelStride: " + rowStride + "/0");
                Log.d(TAG, "U stride/pixelStride: " + rowStride2 + "/" + pixelStride);
                Log.d(TAG, "V stride/pixelStride: " + rowStride3 + "/" + pixelStride2);
                Log.d(TAG, "UV Buffer capacity: U=" + buffer2.capacity() + " V=" + buffer3.capacity());
                synchronized (bArr) {
                    if (rowStride == width) {
                        i = 0;
                        buffer.get(bArr, 0, i2);
                    } else {
                        i = 0;
                        Log.d(TAG, "Y plane stride != width, copying row by row");
                        for (int i4 = 0; i4 < height; i4++) {
                            buffer.position(i4 * rowStride);
                            buffer.get(bArr, i4 * width, width);
                        }
                    }
                    int i5 = i;
                    while (i5 < height / 2) {
                        int i6 = i5 * rowStride2;
                        int i7 = i;
                        while (true) {
                            if (i7 >= width) {
                                break;
                            }
                            int i8 = i6 + i7;
                            if (i8 >= buffer2.capacity()) {
                                Log.e(TAG, "U buffer overflow: offset=" + i8 + ", capacity=" + buffer2.capacity());
                                break;
                            } else {
                                bArr[i2] = buffer2.get(i8);
                                i7 += pixelStride;
                                i2++;
                            }
                        }
                        i5++;
                        i = 0;
                    }
                    for (int i9 = 0; i9 < height / 2; i9++) {
                        int i10 = i9 * rowStride3;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= width) {
                                break;
                            }
                            int i12 = i10 + i11;
                            if (i12 >= buffer3.capacity()) {
                                Log.e(TAG, "V buffer overflow: offset=" + i12 + ", capacity=" + buffer3.capacity());
                                break;
                            } else {
                                bArr[i2] = buffer3.get(i12);
                                i11 += pixelStride2;
                                i2++;
                            }
                        }
                    }
                    Log.d(TAG, "Final index: " + i2 + ", expected: " + (i3 / 2));
                }
                return;
            }
        }
        Log.e(TAG, "outBuffer size error");
    }

    public static Bitmap aspectToSize(Bitmap bitmap, int i, int i2, int i3, boolean z) {
        int i4;
        SFLog.i(TAG, "aspectToSize newWidth=%d,newHeight=%d", Integer.valueOf(i), Integer.valueOf(i2));
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postRotate(i3);
        if (z) {
            matrix.postScale(-1.0f, 1.0f, width / 2.0f, height / 2.0f);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        int width2 = createBitmap.getWidth();
        int height2 = createBitmap.getHeight();
        float f = width2;
        float f2 = i / f;
        float f3 = height2;
        float f4 = i2 / f3;
        Matrix matrix2 = new Matrix();
        int i5 = 0;
        if (f2 > f4) {
            i4 = (Math.round(f3 * f2) - i2) / 2;
        } else {
            int round = (Math.round(f * f4) - i) / 2;
            i4 = 0;
            i5 = round;
            f2 = f4;
        }
        matrix2.postScale(f2, f2);
        Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, width2, height2, matrix2, true);
        Bitmap createBitmap3 = Bitmap.createBitmap(createBitmap2, i5, i4, i, i2);
        createBitmap2.recycle();
        createBitmap.recycle();
        return createBitmap3;
    }

    public static byte[] makeYCbCrJpg(Bitmap bitmap, int i) {
        SFLog.i(TAG, "makeYCbCrJpg");
        try {
            return convertBitmapToJPG(yuvImageToBitmap(getNV21(bitmap), bitmap.getWidth(), bitmap.getHeight()), i);
        } catch (Exception e) {
            SFLog.e(TAG, "makeYCbCrJpg error" + e.toString());
            e.printStackTrace();
            return null;
        }
    }

    private static Bitmap yuvImageToBitmap(byte[] bArr, int i, int i2) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, null);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
    }

    private static byte[] convertBitmapToJPG(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    private static byte[] getNV21(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width % 2 != 0) {
            width--;
        }
        int i = width;
        if (height % 2 != 0) {
            height--;
        }
        int i2 = height;
        int i3 = i * i2;
        int[] iArr = new int[i3];
        bitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        byte[] bArr = new byte[(i3 * 3) / 2];
        encodeYUV420SP(bArr, iArr, i, i2);
        bitmap.recycle();
        return bArr;
    }

    private static void encodeYUV420SP(byte[] bArr, int[] iArr, int i, int i2) {
        int i3 = i * i2;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = 0;
            while (i7 < i) {
                int i8 = iArr[i5];
                int i9 = (16711680 & i8) >> 16;
                int i10 = (65280 & i8) >> 8;
                int i11 = 255;
                int i12 = i8 & 255;
                int i13 = (((((i9 * 66) + (i10 * 129)) + (i12 * 25)) + 128) >> 8) + 16;
                int i14 = (((((i9 * (-38)) - (i10 * 74)) + (i12 * 112)) + 128) >> 8) + 128;
                int i15 = (((((i9 * 112) - (i10 * 94)) - (i12 * 18)) + 128) >> 8) + 128;
                int i16 = i4 + 1;
                if (i13 < 0) {
                    i13 = 0;
                } else if (i13 > 255) {
                    i13 = 255;
                }
                bArr[i4] = (byte) i13;
                if (i6 % 2 == 0 && i5 % 2 == 0) {
                    int i17 = i3 + 1;
                    if (i15 < 0) {
                        i15 = 0;
                    } else if (i15 > 255) {
                        i15 = 255;
                    }
                    bArr[i3] = (byte) i15;
                    i3 += 2;
                    if (i14 < 0) {
                        i11 = 0;
                    } else if (i14 <= 255) {
                        i11 = i14;
                    }
                    bArr[i17] = (byte) i11;
                }
                i5++;
                i7++;
                i4 = i16;
            }
        }
    }
}
