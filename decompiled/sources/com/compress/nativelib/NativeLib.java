package com.compress.nativelib;

import android.util.Log;
import com.compress.api.CompressParam;
import com.compress.api.DecompressRet;
import com.compress.api.PicZipEventCallback;
import java.util.Locale;

/* loaded from: classes14.dex */
public class NativeLib {
    private static final String TAG = "NativeLib";
    private PicZipEventCallback callback;

    public native boolean CompressInJNI(CompressParam compressParam);

    public native void DecompressInJNI(int i, byte[] bArr);

    public void setCallback(PicZipEventCallback picZipEventCallback) {
        this.callback = picZipEventCallback;
    }

    public void compressRetsFromJNI(int i, int i2, int i3, byte[] bArr) {
        PicZipEventCallback picZipEventCallback = this.callback;
        if (picZipEventCallback != null) {
            picZipEventCallback.compressRets(i, i2, i3, bArr);
        }
    }

    public void decompressRetsFromJNI(int i, int i2, int i3, int i4, int i5, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (this.callback != null) {
            DecompressRet decompressRet = new DecompressRet();
            decompressRet.setWidth(i3);
            decompressRet.setHeight(i4);
            decompressRet.setFormat(i5);
            decompressRet.setRedChannel(bArr);
            decompressRet.setGreenChannel(bArr2);
            decompressRet.setBlueChannel(bArr3);
            decompressRet.setAlphaChannel(bArr4);
            Log.i(TAG, "decompressRetsFromJNI: format = " + i5);
            this.callback.deCompressRets(i, i2, decompressRet);
        }
    }

    private static void printHexStr(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i] & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            if (i < bArr.length - 1) {
                char c = (char) (i % 16 == 15 ? 10 : 32);
                sb.append(c);
                if (c == '\n') {
                    FileLogger.write(sb.toString().toUpperCase(Locale.getDefault()));
                    sb = new StringBuilder("");
                }
            }
        }
        FileLogger.write(sb.toString().toUpperCase(Locale.getDefault()));
    }
}
