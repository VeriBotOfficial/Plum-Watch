package com.otaliastudios.cameraview;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.hardware.Camera;
import android.os.Handler;
import com.otaliastudios.cameraview.controls.Facing;
import com.otaliastudios.cameraview.engine.mappers.Camera1Mapper;
import com.otaliastudios.cameraview.internal.WorkerHandler;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes17.dex */
public class CameraUtils {
    private static final String TAG = "CameraUtils";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public static boolean hasCameras(Context context) {
        PackageManager packageManager = context.getPackageManager();
        return packageManager.hasSystemFeature("android.hardware.camera") || packageManager.hasSystemFeature("android.hardware.camera.front");
    }

    public static boolean hasCameraFacing(Context context, Facing facing) {
        int mapFacing = Camera1Mapper.get().mapFacing(facing);
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.getCameraInfo(i, cameraInfo);
            if (cameraInfo.facing == mapFacing) {
                return true;
            }
        }
        return false;
    }

    public static File writeToFile(byte[] bArr, File file) {
        if (file.exists() && !file.delete()) {
            return null;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
            try {
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                return file;
            } finally {
            }
        } catch (IOException e) {
            LOG.e("writeToFile:", "could not write file.", e);
            return null;
        }
    }

    public static void writeToFile(final byte[] bArr, final File file, final FileCallback fileCallback) {
        final Handler handler = new Handler();
        WorkerHandler.execute(new Runnable() { // from class: com.otaliastudios.cameraview.CameraUtils.1
            @Override // java.lang.Runnable
            public void run() {
                final File writeToFile = CameraUtils.writeToFile(bArr, file);
                handler.post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraUtils.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        fileCallback.onFileReady(writeToFile);
                    }
                });
            }
        });
    }

    public static Bitmap decodeBitmap(byte[] bArr) {
        return decodeBitmap(bArr, Integer.MAX_VALUE, Integer.MAX_VALUE);
    }

    public static void decodeBitmap(byte[] bArr, BitmapCallback bitmapCallback) {
        decodeBitmap(bArr, Integer.MAX_VALUE, Integer.MAX_VALUE, bitmapCallback);
    }

    public static void decodeBitmap(byte[] bArr, int i, int i2, BitmapCallback bitmapCallback) {
        decodeBitmap(bArr, i, i2, new BitmapFactory.Options(), bitmapCallback);
    }

    public static void decodeBitmap(byte[] bArr, int i, int i2, BitmapFactory.Options options, BitmapCallback bitmapCallback) {
        decodeBitmap(bArr, i, i2, options, -1, bitmapCallback);
    }

    static void decodeBitmap(final byte[] bArr, final int i, final int i2, final BitmapFactory.Options options, final int i3, final BitmapCallback bitmapCallback) {
        final Handler handler = new Handler();
        WorkerHandler.execute(new Runnable() { // from class: com.otaliastudios.cameraview.CameraUtils.2
            @Override // java.lang.Runnable
            public void run() {
                final Bitmap decodeBitmap = CameraUtils.decodeBitmap(bArr, i, i2, options, i3);
                handler.post(new Runnable() { // from class: com.otaliastudios.cameraview.CameraUtils.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        bitmapCallback.onBitmapReady(decodeBitmap);
                    }
                });
            }
        });
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2) {
        return decodeBitmap(bArr, i, i2, new BitmapFactory.Options());
    }

    public static Bitmap decodeBitmap(byte[] bArr, int i, int i2, BitmapFactory.Options options) {
        return decodeBitmap(bArr, i, i2, options, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:30|31|32|33|(5:42|43|45|46|47)|50|43|45|46|47) */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[Catch: OutOfMemoryError -> 0x00cb, TryCatch #4 {OutOfMemoryError -> 0x00cb, blocks: (B:12:0x0081, B:20:0x00af, B:24:0x0088, B:26:0x0096, B:27:0x009a), top: B:9:0x007c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap decodeBitmap(byte[] r10, int r11, int r12, android.graphics.BitmapFactory.Options r13, int r14) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.otaliastudios.cameraview.CameraUtils.decodeBitmap(byte[], int, int, android.graphics.BitmapFactory$Options, int):android.graphics.Bitmap");
    }

    private static int computeSampleSize(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 <= i4 && i <= i3) {
            return 1;
        }
        while (true) {
            if (i2 / i5 < i4 && i / i5 < i3) {
                return i5;
            }
            i5 *= 2;
        }
    }
}
