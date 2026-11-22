package com.fulongbin.decoder;

import android.text.TextUtils;
import android.util.Log;
import java.io.File;

/* loaded from: classes14.dex */
public class Silk {
    static final String TAG = "Silk_v3_decoder";
    static String cacheDir;

    public static native int mp3ToSilk(String str, String str2, String str3, int i);

    public static native int silkToMp3(String str, String str2, String str3, int i);

    public static native int silkToWav(String str, String str2, String str3, int i);

    public static native int wavToSilk(String str, String str2, String str3, int i);

    static {
        System.loadLibrary("silk_v3_decoder");
        if (App.INSTANCE != null) {
            cacheDir = App.INSTANCE.getCacheDir().getAbsolutePath();
        }
    }

    public static void setCacheDir(String str) {
        cacheDir = str;
    }

    public static String getCacheDir() {
        return cacheDir;
    }

    public static boolean checkCacheDir() {
        if (cacheDir == null) {
            Log.e(TAG, "cacheDir is null , please setCacheDir");
            return false;
        }
        if (new File(cacheDir).canWrite()) {
            return true;
        }
        Log.e(TAG, "cacheDir[" + cacheDir + "]  cat not write please set anther");
        return true;
    }

    private static String createPcmFileName(String str) {
        String str2 = cacheDir + str.substring(str.lastIndexOf(47), str.length()) + ".pcm";
        Log.e(TAG, "pmc temp " + str2);
        return str2;
    }

    private static void deleteTempFile(String str) {
        File file = new File(str);
        if (file.exists()) {
            file.delete();
        }
    }

    public static boolean convertMp3ToSilk(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "src or dest is empty");
            return false;
        }
        if (!checkCacheDir()) {
            return false;
        }
        String createPcmFileName = createPcmFileName(str);
        boolean z = mp3ToSilk(str, str2, createPcmFileName, i) == 0;
        deleteTempFile(createPcmFileName);
        return z;
    }

    public static boolean convertSilkToMp3(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "src or dest is empty");
            return false;
        }
        if (!checkCacheDir()) {
            return false;
        }
        String createPcmFileName = createPcmFileName(str);
        boolean z = silkToMp3(str, str2, createPcmFileName, i) == 0;
        deleteTempFile(createPcmFileName);
        return z;
    }

    public static boolean convertWavToSilk(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "src or dest is empty");
            return false;
        }
        if (!checkCacheDir()) {
            return false;
        }
        String createPcmFileName = createPcmFileName(str);
        boolean z = wavToSilk(str, str2, createPcmFileName, i) == 0;
        deleteTempFile(createPcmFileName);
        return z;
    }

    public static boolean convertSilkToWav(String str, String str2, int i) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "src or dest is empty");
            return false;
        }
        if (!checkCacheDir()) {
            return false;
        }
        String createPcmFileName = createPcmFileName(str);
        boolean z = silkToWav(str, str2, createPcmFileName, i) == 0;
        deleteTempFile(createPcmFileName);
        return z;
    }
}
