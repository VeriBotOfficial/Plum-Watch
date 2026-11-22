package com.compress.api;

import com.compress.nativelib.NativeLib;

/* loaded from: classes14.dex */
public class PicZipApi {
    private static PicZipApi instance;
    private PicZipEventCallback callback;
    private NativeLib nativeLib;

    public static PicZipApi getInstance() {
        if (instance == null) {
            instance = new PicZipApi();
        }
        return instance;
    }

    private PicZipApi() {
    }

    public void setCallback(PicZipEventCallback picZipEventCallback) {
        this.callback = picZipEventCallback;
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib != null) {
            nativeLib.setCallback(picZipEventCallback);
        }
    }

    public void init() {
        this.nativeLib = new NativeLib();
        try {
            System.loadLibrary("nativelib");
        } catch (UnsatisfiedLinkError unused) {
            System.load("/data/app/com.compress/lib/arm64/libnativelib.so");
        }
    }

    public void compress(CompressParam compressParam) {
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib == null) {
            PicZipEventCallback picZipEventCallback = this.callback;
            if (picZipEventCallback != null) {
                picZipEventCallback.compressRets(compressParam.getId(), 4097, compressParam.getTileWidth(), null);
                return;
            }
            return;
        }
        if (compressParam == null) {
            PicZipEventCallback picZipEventCallback2 = this.callback;
            if (picZipEventCallback2 != null) {
                picZipEventCallback2.compressRets(-1, 4098, -1, null);
                return;
            }
            return;
        }
        nativeLib.CompressInJNI(compressParam);
    }

    public void decompress(int i, byte[] bArr) {
        NativeLib nativeLib = this.nativeLib;
        if (nativeLib == null) {
            PicZipEventCallback picZipEventCallback = this.callback;
            if (picZipEventCallback != null) {
                picZipEventCallback.deCompressRets(i, 4097, null);
                return;
            }
            return;
        }
        if (bArr == null) {
            PicZipEventCallback picZipEventCallback2 = this.callback;
            if (picZipEventCallback2 != null) {
                picZipEventCallback2.deCompressRets(i, 4099, null);
                return;
            }
            return;
        }
        nativeLib.DecompressInJNI(i, bArr);
    }
}
