package com.huawei.secure.android.common.util;

import android.util.Base64;
import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public class SafeBase64 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f10839a = "SafeBase64";

    private SafeBase64() {
    }

    public static byte[] decode(byte[] bArr, int r3) {
        try {
            return Base64.decode(bArr, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message0 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int r3) {
        try {
            return Base64.encode(bArr, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message3 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static String encodeToString(byte[] bArr, int r3) {
        try {
            return Base64.encodeToString(bArr, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message5 : " + e.getMessage());
            return "";
        }
    }

    public static String encodeToString(byte[] bArr, int r1, int r2, int r3) {
        try {
            return Base64.encodeToString(bArr, r1, r2, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message6 : " + e.getMessage());
            return "";
        }
    }

    public static byte[] decode(byte[] bArr, int r1, int r2, int r3) {
        try {
            return Base64.decode(bArr, r1, r2, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message1 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] encode(byte[] bArr, int r1, int r2, int r3) {
        try {
            return Base64.encode(bArr, r1, r2, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message4 : " + e.getMessage());
            return new byte[0];
        }
    }

    public static byte[] decode(String str, int r3) {
        try {
            return Base64.decode(str, r3);
        } catch (Exception e) {
            Log.e(f10839a, e.getClass().getSimpleName() + " , message2 : " + e.getMessage());
            return new byte[0];
        }
    }
}
