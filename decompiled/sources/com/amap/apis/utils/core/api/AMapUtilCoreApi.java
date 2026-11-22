package com.amap.apis.utils.core.api;

import android.content.Context;
import com.amap.api.col.p0003sl.c9;
import com.amap.api.col.p0003sl.d9;

/* loaded from: classes11.dex */
public class AMapUtilCoreApi {

    /* renamed from: a, reason: collision with root package name */
    private static NetProxy f2229a = null;
    private static boolean b = true;

    public static boolean getCollectIPEnable() {
        return b;
    }

    public static NetProxy getNetProxy() {
        return f2229a;
    }

    public static void setCollectIPEnable(boolean z) {
        b = z;
    }

    public static void setCollectInfoEnable(boolean z) {
        d9.a(z);
    }

    public static void setNetProxy(NetProxy netProxy) {
        f2229a = netProxy;
    }

    public static void updateAnalysisAgree(Context context, boolean z) {
        c9.a(z);
    }

    public static void updateSecurityAgree(Context context, boolean z) {
        c9.b(z);
    }
}
