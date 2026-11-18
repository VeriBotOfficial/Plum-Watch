package com.alipay.sdk.m.e;

import android.util.Log;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.xiaomi.mipush.sdk.Constants;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1375a = "OpenId";
    public static boolean b = false;

    public static void a(boolean z) {
        Log.d(f1375a, "setDebug:" + z);
        b = z;
    }

    public static void b(String str, Object... objArr) {
        if (b) {
            Log.d(f1375a, a(str, objArr));
        }
    }

    public static void c(String str, Object... objArr) {
        if (b) {
            Log.e(f1375a, a(str, objArr));
        }
    }

    public static void d(String str, Object... objArr) {
        if (b) {
            Log.i(f1375a, a(str, objArr));
        }
    }

    public static void e(String str, Object... objArr) {
        if (b) {
            Log.w(f1375a, a(str, objArr));
        }
    }

    public static String a(String str, Object... objArr) {
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
            int r1 = 0;
            while (true) {
                int r2 = r1 + 1;
                if (r2 >= objArr.length) {
                    break;
                }
                sb.append(a(objArr[r1], objArr[r2]));
                if (r2 < length - 1) {
                    sb.append(",");
                }
                r1 += 2;
            }
            if (r1 == objArr.length - 1) {
                sb.append(objArr[r1]);
            }
        }
        return sb.toString();
    }

    public static String a(Object obj, Object obj2) {
        if (obj == null) {
            obj = "";
        }
        if (obj2 == null) {
            obj2 = "";
        }
        return String.format(ScarConstants.TOKEN_WITH_SCAR_FORMAT, obj, obj2);
    }
}
