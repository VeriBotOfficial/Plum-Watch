package com.baidu.location;

import androidx.camera.video.AudioStats;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes15.dex */
public class Jni {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f7506a = 0;
    private static int b = 1;
    private static int c = 2;
    private static int d = 11;
    private static int e = 12;
    private static int f = 13;
    private static int g = 14;
    private static int h = 15;
    private static int i = 1024;
    private static boolean j = false;

    static {
        try {
            System.loadLibrary("locSDK8b");
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            j = true;
        }
    }

    private static native String a(byte[] bArr, int r1);

    static boolean a(double d2, double d3, String str) {
        if (BDLocation.BDLOCATION_BD09LL_TO_GCJ02.equals(str) || BDLocation.BDLOCATION_BD09_TO_GCJ02.equals(str)) {
            double[] dArrCoorEncrypt = coorEncrypt(d2, d3, str);
            double d4 = dArrCoorEncrypt[0];
            double d5 = dArrCoorEncrypt[1];
            d2 = d4;
            d3 = d5;
        }
        return isInChina(d2, d3, 0);
    }

    private static native String b(double d2, double d3, int r4, int r5);

    private static native String c(byte[] bArr, int r1);

    public static double[] coorEncrypt(double d2, double d3, String str) {
        int r6;
        double[] dArr = {AudioStats.AUDIO_AMPLITUDE_NONE, AudioStats.AUDIO_AMPLITUDE_NONE};
        if (j) {
            return dArr;
        }
        if (str.equals("bd09")) {
            r6 = f7506a;
        } else if (str.equals("bd09ll")) {
            r6 = b;
        } else if (str.equals("gcj02")) {
            r6 = c;
        } else if (str.equals(BDLocation.BDLOCATION_WGS84_TO_GCJ02)) {
            r6 = d;
        } else if (str.equals(BDLocation.BDLOCATION_BD09_TO_GCJ02)) {
            r6 = e;
        } else if (str.equals(BDLocation.BDLOCATION_BD09LL_TO_GCJ02)) {
            r6 = f;
        } else {
            r6 = str.equals("wgs842mc") ? h : -1;
        }
        if (str.equals("gcj2wgs")) {
            r6 = 16;
        }
        try {
            String[] strArrSplit = b(d2, d3, r6, 132456).split(":");
            dArr[0] = Double.parseDouble(strArrSplit[0]);
            dArr[1] = Double.parseDouble(strArrSplit[1]);
        } catch (Throwable unused) {
            dArr[0] = 0.0d;
            dArr[1] = 0.0d;
        }
        return dArr;
    }

    private static native String ee(String str, int r1);

    public static String en1(String str) {
        if (j) {
            return "err!";
        }
        if (str == null) {
            return AbstractJsonLexerKt.NULL;
        }
        byte[] bytes = str.getBytes();
        byte[] bArr = new byte[i];
        int length = bytes.length;
        if (length > 740) {
            length = 740;
        }
        int r4 = 0;
        for (int r3 = 0; r3 < length; r3++) {
            byte b2 = bytes[r3];
            if (b2 != 0) {
                bArr[r4] = b2;
                r4++;
            }
        }
        try {
            return a(bArr, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static String encode(String str) {
        return j ? "err!" : en1(str) + "|tp=3";
    }

    public static String encode2(String str) {
        if (j) {
            return "err!";
        }
        if (str == null) {
            return AbstractJsonLexerKt.NULL;
        }
        try {
            return c(str.getBytes(), 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static Long encode3(String str) {
        String str2;
        if (j) {
            return null;
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return Long.valueOf(murmur(str2));
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static native String encodeNotLimit(String str, int r1);

    public static String encodeOfflineLocationUpdateRequest(String str) {
        String str2;
        String strEncodeNotLimit = "err!";
        if (j) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEncodeNotLimit = encodeNotLimit(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEncodeNotLimit + "|tp=3";
    }

    public static String encodeTp4(String str) {
        String str2;
        String strEe = "err!";
        if (j) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            strEe = ee(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
        }
        return strEe + "|tp=4";
    }

    public static String encodeTp4NoTag(String str) {
        String str2;
        if (j) {
            return "err!";
        }
        try {
            str2 = new String(str.getBytes(), "UTF-8");
        } catch (Exception unused) {
            str2 = "";
        }
        try {
            return ee(str2, 132456);
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return "err!";
        }
    }

    public static double getGpsSwiftRadius(float f2, double d2, double d3) {
        if (j) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
        try {
            return gsr(f2, d2, d3);
        } catch (UnsatisfiedLinkError unused) {
            return AudioStats.AUDIO_AMPLITUDE_NONE;
        }
    }

    public static String getldkaiv() {
        if (j) {
            return null;
        }
        try {
            return ldkaiv();
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private static native double gsr(float f2, double d2, double d3);

    private static native boolean isInChina(double d2, double d3, int r4);

    private static native String ldkaiv();

    private static native long murmur(String str);
}
