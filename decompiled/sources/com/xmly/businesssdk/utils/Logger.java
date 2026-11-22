package com.xmly.businesssdk.utils;

import android.util.Log;

/* loaded from: classes3.dex */
public class Logger {
    private static boolean MODE_DEVELOPERS = true;

    public static void d(Object... objArr) {
        if (MODE_DEVELOPERS) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj).append(" ");
            }
            d("HIMALAYA_LOG", sb.toString());
        }
    }

    public static void e(Object... objArr) {
        if (MODE_DEVELOPERS) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj).append(" ");
            }
            e("HIMALAYA_LOG", sb.toString());
        }
    }

    public static void i(Object... objArr) {
        if (MODE_DEVELOPERS) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj).append(" ");
            }
            i("HIMALAYA_LOG", sb.toString());
        }
    }

    public static boolean isModeDevelopers() {
        return MODE_DEVELOPERS;
    }

    public static void setModeDevelopers(boolean z) {
        MODE_DEVELOPERS = z;
    }

    public static void v(Object... objArr) {
        if (MODE_DEVELOPERS) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj).append(" ");
            }
            v("HIMALAYA_LOG", sb.toString());
        }
    }

    public static void w(Object... objArr) {
        if (MODE_DEVELOPERS) {
            StringBuilder sb = new StringBuilder();
            for (Object obj : objArr) {
                sb.append(obj).append(" ");
            }
            w("HIMALAYA_LOG", sb.toString());
        }
    }

    public static void d(String str, String str2) {
        if (MODE_DEVELOPERS) {
            Log.d(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (MODE_DEVELOPERS) {
            Log.e(str, str2);
        }
    }

    public static void i(String str, String str2) {
        if (MODE_DEVELOPERS) {
            Log.i(str, str2);
        }
    }

    public static void v(String str, String str2) {
        if (MODE_DEVELOPERS) {
            Log.v(str, str2);
        }
    }

    public static void w(String str, String str2) {
        if (MODE_DEVELOPERS) {
            Log.w(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (MODE_DEVELOPERS) {
            Log.e(str, str2, th);
        }
    }
}
