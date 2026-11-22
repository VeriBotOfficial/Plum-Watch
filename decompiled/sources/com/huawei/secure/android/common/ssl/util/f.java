package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageManager;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10829a = "f";

    public static String a(String str) {
        Context contextUtil = ContextUtil.getInstance();
        if (contextUtil == null) {
            return "";
        }
        try {
            return contextUtil.getPackageManager().getPackageInfo(str, 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.b(f10829a, "getVersion NameNotFoundException : " + e.getMessage());
            return "";
        } catch (Exception e2) {
            e.b(f10829a, "getVersion: " + e2.getMessage());
            return "";
        } catch (Throwable unused) {
            e.b(f10829a, "throwable");
            return "";
        }
    }

    public static int b(String str) {
        Context contextUtil = ContextUtil.getInstance();
        if (contextUtil == null) {
            return 0;
        }
        try {
            return contextUtil.getPackageManager().getPackageInfo(str, 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            e.b(f10829a, "getVersion NameNotFoundException");
            return 0;
        } catch (Exception e) {
            e.b(f10829a, "getVersion: " + e.getMessage());
            return 0;
        }
    }
}
