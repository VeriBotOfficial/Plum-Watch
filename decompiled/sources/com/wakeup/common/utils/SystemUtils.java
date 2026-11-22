package com.wakeup.common.utils;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Process;
import android.telephony.TelephonyManager;
import com.hjq.permissions.Permission;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.permissions.PermissionsManager;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes2.dex */
public class SystemUtils {
    private SystemUtils() {
    }

    public static boolean hasNetwork() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) BaseApplication.getContext().getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
    }

    public static Locale getLanguage() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    public static boolean isTelephonyCalling(Context context) {
        try {
            if (!PermissionsManager.checkPermission(Permission.READ_PHONE_STATE)) {
                return false;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (2 != telephonyManager.getCallState()) {
                if (1 != telephonyManager.getCallState()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean isSupportArm64() {
        String str;
        String[] strArr = Build.SUPPORTED_64_BIT_ABIS;
        LogUtils.d("SystemUtils", "abis64" + Arrays.toString(strArr));
        if (strArr != null) {
            for (String str2 : strArr) {
                if (str2 != null && str2.startsWith("arm64")) {
                    try {
                        return Process.is64Bit();
                    } catch (Throwable unused) {
                        String[] strArr2 = Build.SUPPORTED_ABIS;
                        return strArr2 != null && strArr2.length > 0 && (str = strArr2[0]) != null && str.contains("64");
                    }
                }
            }
        }
        return false;
    }
}
