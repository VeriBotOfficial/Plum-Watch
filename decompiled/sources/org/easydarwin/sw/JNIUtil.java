package org.easydarwin.sw;

/* loaded from: classes6.dex */
public class JNIUtil {
    public static native void ConvertFromI420(byte[] bArr, byte[] bArr2, int i, int i2, int i3);

    public static native void ConvertToI420(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8);

    public static native void I420Scale(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5);

    private static native void callMethod(String str, Object[] objArr, Object... objArr2);

    public static native void yuvConvert(byte[] bArr, int i, int i2, int i3);

    static {
        System.loadLibrary("yuv_android");
    }

    public static void rotateMatrix(byte[] bArr, int i, int i2, int i3, int i4) {
        callMethod("RotateByteMatrix", null, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    public static void rotateShortMatrix(byte[] bArr, int i, int i2, int i3, int i4) {
        callMethod("RotateShortMatrix", null, bArr, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }
}
