package com.amap.api.col.p0003sl;

import android.content.Context;
import com.amap.api.col.p0003sl.l9;
import com.amap.api.services.core.ServiceSettings;

/* compiled from: ConfigableConst.java */
/* loaded from: classes11.dex */
public class k6 {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f1724a = {"com.amap.api.services", "com.amap.api.search.admic"};

    public static String a(Context context) {
        e9 b = e9.b(context);
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://" + b.a(62) : "https://" + b.a(62);
    }

    public static String b(Context context) {
        int protocol = ServiceSettings.getInstance().getProtocol();
        e9 b = e9.b(context);
        return protocol == 1 ? "http://" + b.a(60) + "/v3" : "https://" + b.a(60) + "/v3";
    }

    public static String c(Context context) {
        e9 b = e9.b(context);
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://" + b.a(60) + "/v4" : "https://" + b.a(60) + "/v4";
    }

    public static String d(Context context) {
        ServiceSettings serviceSettings = ServiceSettings.getInstance();
        e9 b = e9.b(context);
        return serviceSettings.getProtocol() == 1 ? "http://" + b.a(60) + "/v5" : "https://" + b.a(60) + "/v5";
    }

    public static String e(Context context) {
        e9 b = e9.b(context);
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://" + b.a(60) + "/rest/me/cpoint" : "https://" + b.a(60) + "/rest/me/cpoint";
    }

    public static String f(Context context) {
        e9 b = e9.b(context);
        return ServiceSettings.getInstance().getProtocol() == 1 ? "http://" + b.a(61) : "https://" + b.a(61);
    }

    public static l9 a(boolean z) {
        try {
            return new l9.a("sea", "9.7.4", "AMAP SDK Android Search 9.7.4").a(f1724a).a(z).a("9.7.4").a();
        } catch (y8 e) {
            b6.a(e, "ConfigableConst", "getSDKInfo");
            return null;
        }
    }
}
