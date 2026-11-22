package com.qumeng.overseas.advlib.open;

/* loaded from: classes17.dex */
public class AliCheatParams {
    static {
        try {
            System.loadLibrary("qmocheat");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static native String base64Decode(String str);

    public static native String base64Encode(String str, boolean z);

    public static String decodeByBase64(String str) {
        try {
            return base64Decode(str);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String encodeByBase64(String str, boolean z) {
        try {
            return base64Encode(str, z);
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getBootMark() {
        try {
            return stringFromJNI2();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static String getUpdateMark() {
        try {
            return stringFromJNI1();
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }

    public static boolean isSupportBase64() {
        return true;
    }

    public static native String stringFromJNI1();

    public static native String stringFromJNI2();
}
