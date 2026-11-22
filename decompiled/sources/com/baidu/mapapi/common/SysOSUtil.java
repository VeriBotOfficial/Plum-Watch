package com.baidu.mapapi.common;

import android.text.TextUtils;
import com.baidu.mapsdkplatform.comapi.util.g;

/* loaded from: classes13.dex */
public class SysOSUtil {
    public static String getAuthToken() {
        return g.a();
    }

    public static float getDensity() {
        return g.y;
    }

    public static int getDensityDpi() {
        return g.d();
    }

    public static String getDeviceID() {
        String c = g.c();
        return TextUtils.isEmpty(c) ? c : c.substring(0, c.indexOf("|"));
    }

    public static String getModuleFileName() {
        return g.e();
    }

    public static String getNetType() {
        return g.f();
    }

    public static String getPhoneType() {
        return g.l();
    }

    public static int getScreenSizeX() {
        return g.m();
    }

    public static int getScreenSizeY() {
        return g.n();
    }

    public static void updateCuid() {
        g.c();
    }
}
