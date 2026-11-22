package com.compress.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import android.widget.Toast;
import com.compress.api.CompressParam;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipApi;
import com.compress.api.PicZipEventCallback;
import com.compress.nativelib.FileLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* loaded from: classes14.dex */
public class WatchFaceImageUtil {
    private static final String TAG = "WatchCompressUtil";
    private static WatchFaceImageUtil instance;
    private OnWatchFaceImageListener onWatchFaceImageListener;

    public void setOnWatchOnclickListener(OnWatchFaceImageListener onWatchFaceImageListener) {
        this.onWatchFaceImageListener = onWatchFaceImageListener;
    }

    public static synchronized WatchFaceImageUtil getInstance() {
        WatchFaceImageUtil watchFaceImageUtil;
        synchronized (WatchFaceImageUtil.class) {
            if (instance == null) {
                instance = new WatchFaceImageUtil();
            }
            watchFaceImageUtil = instance;
        }
        return watchFaceImageUtil;
    }

    WatchFaceImageUtil() {
    }

    public void initWatchFaceImageData(Context context) {
        FileLogger.init(context);
        PicZipApi.getInstance().init();
        setWatchFaceImageCallback();
    }

    public void setWatchFaceImageCallback() {
        PicZipApi.getInstance().setCallback(new PicZipEventCallback() { // from class: com.compress.utils.WatchFaceImageUtil.1
            @Override // com.compress.api.PicZipEventCallback
            public void compressRets(int i, int i2, int i3, byte[] bArr) {
                File writeBuffer = FileLogger.writeBuffer("ComRets" + i3, bArr, 0, bArr.length);
                Log.i("WatchFaceImageActivity", "compressRets success id: " + i + ", state: " + i2 + ", tileWidth: " + i3 + ", data: " + bArr.length + ", compressedFile" + writeBuffer);
                WatchFaceImageUtil.this.onWatchFaceImageListener.compressRets(i, i2, i3, bArr, writeBuffer);
            }

            @Override // com.compress.api.PicZipEventCallback
            public void deCompressRets(int i, int i2, DecompressRet decompressRet) {
                int i3;
                Log.i(WatchFaceImageUtil.TAG, "deCompressRets success");
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                if (decompressRet.getFormat() == 8) {
                    config = Bitmap.Config.RGB_565;
                }
                Bitmap createBitmap = Bitmap.createBitmap(decompressRet.getWidth(), decompressRet.getHeight(), config);
                for (int i4 = 0; i4 < decompressRet.getHeight(); i4++) {
                    for (int i5 = 0; i5 < decompressRet.getWidth(); i5++) {
                        int width = (decompressRet.getWidth() * i4) + i5;
                        if (decompressRet.getFormat() == 8) {
                            i3 = Color.rgb(decompressRet.getRedChannel()[width] << 3, decompressRet.getGreenChannel()[width] << 2, decompressRet.getBlueChannel()[width] << 3);
                        } else {
                            i3 = (decompressRet.getBlueChannel()[width] & 255) | ((decompressRet.getAlphaChannel()[width] & 255) << 24) | ((decompressRet.getRedChannel()[width] & 255) << 16) | ((decompressRet.getGreenChannel()[width] & 255) << 8);
                        }
                        createBitmap.setPixel(i5, i4, i3);
                    }
                }
                DecompressRet2 decompressRet2 = new DecompressRet2();
                decompressRet2.setWidth(decompressRet.getWidth());
                decompressRet2.setHeight(decompressRet.getHeight());
                decompressRet2.setFormat(decompressRet.getFormat());
                decompressRet2.setRedChannel(decompressRet.getRedChannel());
                decompressRet2.setGreenChannel(decompressRet.getGreenChannel());
                decompressRet2.setBlueChannel(decompressRet.getBlueChannel());
                decompressRet2.setAlphaChannel(decompressRet.getAlphaChannel());
                WatchFaceImageUtil.this.onWatchFaceImageListener.deCompressRets(i, i2, decompressRet2, createBitmap);
            }
        });
    }

    public static void compress(Bitmap bitmap) {
        Bitmap.Config config = bitmap.getConfig();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i = width * height;
        byte[] bArr = new byte[i];
        byte[] bArr2 = new byte[i];
        byte[] bArr3 = new byte[i];
        byte[] bArr4 = new byte[i];
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int pixel = bitmap.getPixel(i3, i2);
                int i4 = (i2 * width) + i3;
                int i5 = (pixel >> 24) & 255;
                int i6 = (pixel >> 16) & 255;
                int i7 = (pixel >> 8) & 255;
                int i8 = pixel & 255;
                if (config == Bitmap.Config.RGB_565) {
                    bArr[i4] = (byte) (i6 >> 3);
                    bArr2[i4] = (byte) (i7 >> 2);
                    bArr3[i4] = (byte) (i8 >> 3);
                } else {
                    bArr[i4] = (byte) i6;
                    bArr2[i4] = (byte) i7;
                    bArr3[i4] = (byte) i8;
                }
                bArr4[i4] = (byte) i5;
            }
        }
        CompressParam compressParam = new CompressParam();
        compressParam.setWidth(width);
        compressParam.setHeight(height);
        compressParam.setStride(width);
        compressParam.setModeRgb(1);
        compressParam.setModeAlpha(1);
        compressParam.setCmpMode(0);
        compressParam.setTileWidth(6);
        compressParam.setAlphaChannel(bArr4);
        compressParam.setRedChannel(bArr);
        compressParam.setGreenChannel(bArr2);
        compressParam.setBlueChannel(bArr3);
        if (config == Bitmap.Config.ARGB_8888) {
            compressParam.setPixelFormat(1);
        } else if (config == Bitmap.Config.RGB_565) {
            compressParam.setPixelFormat(2);
        } else {
            compressParam.setPixelFormat(0);
        }
        PicZipApi.getInstance().compress(compressParam);
    }

    public static void decompress(Context context, File file) {
        if (file == null) {
            Toast.makeText(context, "解压文件不存在", 0).show();
            return;
        }
        final byte[] bArr = new byte[(int) file.length()];
        try {
            new FileInputStream(file).read(bArr);
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(new Runnable() { // from class: com.compress.utils.WatchFaceImageUtil$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                PicZipApi.getInstance().decompress(3, bArr);
            }
        }).start();
    }
}
