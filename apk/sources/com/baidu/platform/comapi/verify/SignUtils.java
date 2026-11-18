package com.baidu.platform.comapi.verify;

import android.content.Context;
import android.content.pm.Signature;
import android.os.Build;

/* JADX INFO: loaded from: classes15.dex */
public class SignUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f8682a = 621133959;

    private static int a(Context context) {
        Signature[] apkContentsSigners;
        try {
            if (Build.VERSION.SDK_INT >= 28) {
                apkContentsSigners = context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 134217728).signingInfo.hasMultipleSigners() ? context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 134217728).signingInfo.getApkContentsSigners() : context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 134217728).signingInfo.getSigningCertificateHistory();
            } else {
                apkContentsSigners = context.getPackageManager().getPackageInfo("com.baidu.BaiduMap", 64).signatures;
            }
            return apkContentsSigners[0].hashCode();
        } catch (Exception unused) {
            return 0;
        }
    }

    private static boolean b(Context context) {
        return a(context) == f8682a;
    }

    public static boolean verifySign(Context context) {
        return b(context);
    }
}
