package com.beken.iot.smartsdk.core.gpuimage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes15.dex */
public class GPUImageNativeLibrary {
    public static native void YUVtoARBG(byte[] bArr, int r1, int r2, int[] r3);

    public static native void YUVtoRBGA(byte[] bArr, int r1, int r2, int[] r3);

    public static native void adjustBitmap(Bitmap bitmap);

    static {
        System.loadLibrary("yuv-decoder");
    }
}
