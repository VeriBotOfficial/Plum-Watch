package com.sifli.watchfacesdk.util;

/* loaded from: classes17.dex */
public class NativeLibrary {
    public static native void yuv420p2rgba(byte[] bArr, int i, int i2, byte[] bArr2);

    static {
        System.loadLibrary("sfwatchface");
    }
}
