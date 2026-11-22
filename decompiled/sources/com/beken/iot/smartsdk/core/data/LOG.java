package com.beken.iot.smartsdk.core.data;

import android.util.Log;

/* loaded from: classes13.dex */
public class LOG {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;

    public static void V(String str, int i, String str2) {
        if (i > 2) {
            return;
        }
        Log.v(str, str2);
    }

    public static void D(String str, int i, String str2) {
        if (i > 3) {
            return;
        }
        Log.d(str, str2);
    }

    public static void I(String str, int i, String str2) {
        if (i > 4) {
            return;
        }
        Log.i(str, str2);
    }

    public static void W(String str, int i, String str2) {
        if (i > 5) {
            return;
        }
        Log.w(str, str2);
    }

    public static void E(String str, int i, String str2) {
        if (i > 6) {
            return;
        }
        Log.e(str, str2);
    }
}
