package com.compress.utils;

import android.graphics.Bitmap;
import java.io.File;

/* loaded from: classes14.dex */
public interface OnWatchFaceImageListener {
    void compressRets(int i, int i2, int i3, byte[] bArr, File file);

    void deCompressRets(int i, int i2, DecompressRet2 decompressRet2, Bitmap bitmap);
}
