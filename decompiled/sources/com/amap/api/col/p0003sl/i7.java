package com.amap.api.col.p0003sl;

import com.baidu.platform.comapi.map.MapBundleKey;

/* compiled from: RequestCacheConfig.java */
/* loaded from: classes11.dex */
class i7 {

    /* renamed from: a, reason: collision with root package name */
    private static volatile boolean f1687a = false;

    public static synchronized void a() {
        synchronized (i7.class) {
            if (!f1687a) {
                j7.a().a("regeo", new l7("/geocode/regeo"));
                j7.a().a("placeAround", new l7("/place/around"));
                j7.a().a("placeText", new k7("/place/text"));
                j7.a().a(MapBundleKey.MapObjKey.OBJ_GEO, new k7("/geocode/geo"));
                f1687a = true;
            }
        }
    }
}
