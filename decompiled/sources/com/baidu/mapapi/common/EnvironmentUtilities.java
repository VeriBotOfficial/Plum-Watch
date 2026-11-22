package com.baidu.mapapi.common;

import android.content.Context;
import com.anythink.expressad.foundation.g.g.a.b;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapsdkplatform.comapi.util.f;
import java.io.File;

/* loaded from: classes13.dex */
public class EnvironmentUtilities {

    /* renamed from: a, reason: collision with root package name */
    static String f7846a;
    static String b;
    static String c;
    static int d;
    static int e;
    static int f;
    static int g;
    private static f h;

    public static String getAppCachePath() {
        return b;
    }

    public static String getAppSDCardPath() {
        String str = f7846a + "/BaiduMapSDKNew";
        if (str.length() != 0) {
            File file = new File(str);
            if (!file.exists()) {
                file.mkdirs();
            }
        }
        return str;
    }

    public static String getAppSecondCachePath() {
        return c;
    }

    public static int getDomTmpStgMax() {
        return e;
    }

    public static int getItsTmpStgMax() {
        return f;
    }

    public static int getMapTmpStgMax() {
        return d;
    }

    public static String getSDCardPath() {
        return f7846a;
    }

    public static int getSsgTmpStgMax() {
        return g;
    }

    public static void initAppDirectory(Context context) {
        if (h == null) {
            f b2 = f.b();
            h = b2;
            b2.b(context);
        }
        String str = f7846a;
        if (str != null && str.length() > 0) {
            StringBuilder append = new StringBuilder().append(f7846a);
            String str2 = File.separator;
            b = append.append(str2).append("BaiduMapSDKNew").append(str2).append(b.O).toString();
        } else if (h.a() != null) {
            f7846a = h.a().c();
            b = h.a().b();
        }
        if (h.a() != null) {
            c = h.a().d();
        }
        d = Const.MAX_SIZE_EXTERNAL_WRAPDATA;
        e = Const.MAX_SIZE_EXTERNAL_WRAPDATA;
        f = 5242880;
        g = Const.MAX_SIZE_EXTERNAL_WRAPDATA;
    }

    public static void setSDCardPath(String str) {
        f7846a = str;
    }
}
