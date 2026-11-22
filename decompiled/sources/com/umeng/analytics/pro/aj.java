package com.umeng.analytics.pro;

import android.util.Log;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.xiaomi.mipush.sdk.Constants;

/* compiled from: Logger.java */
/* loaded from: classes2.dex */
public class aj {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13783a = "OpenId";
    private static boolean b = false;

    public static void a(boolean z) {
        Log.d("OpenId", "setDebug:" + z);
        b = z;
    }

    public static void a(String str, Object... objArr) {
        if (b) {
            Log.d("OpenId", e(str, objArr));
        }
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            Log.i("OpenId", e(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (b) {
            Log.w("OpenId", e(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            Log.e("OpenId", e(str, objArr));
        }
    }

    private static String e(String str, Object... objArr) {
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
        sb.append(String.format("[%s] ", str));
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[i], objArr[i2]));
                if (i2 < length - 1) {
                    sb.append(",");
                }
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static String a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, obj, obj2);
    }
}
