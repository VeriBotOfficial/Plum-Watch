package com.baidu.platform.comapi.util;

import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.baidu.platform.comjni.base.sdkauth.NASDKAuth;

/* compiled from: MapAuthManager.java */
/* loaded from: classes13.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static volatile h f8681a;
    private NASDKAuth b = new NASDKAuth();

    private h() {
    }

    public static void a() {
        if (f8681a != null) {
            synchronized (h.class) {
                if (f8681a != null) {
                    f8681a.c();
                    f8681a = null;
                }
            }
        }
    }

    public static h b() {
        if (f8681a == null) {
            synchronized (h.class) {
                if (f8681a == null) {
                    f8681a = new h();
                }
            }
        }
        return f8681a;
    }

    private void c() {
        this.b.dispose();
    }

    public boolean a(String str, int i) {
        if (str == null) {
            return false;
        }
        com.baidu.platform.comjni.base.sdkauth.a aVar = com.baidu.platform.comjni.base.sdkauth.a.ParkingSpace;
        if ((aVar.a() & i) != 0) {
            this.b.a(str, aVar.a());
        }
        com.baidu.platform.comjni.base.sdkauth.a aVar2 = com.baidu.platform.comjni.base.sdkauth.a.WaterMark;
        if ((i & aVar2.a()) == 0) {
            return true;
        }
        String str2 = "token=" + AppMD5.encodeUrlParamsValue(str);
        this.b.a("https://api.map.baidu.com/sdkproxy/lbs_androidsdk/api_watermark/sdk_get_auth?" + (str2 + "&sign=" + AppMD5.getSignMD5String(str2)), aVar2.a());
        return true;
    }
}
