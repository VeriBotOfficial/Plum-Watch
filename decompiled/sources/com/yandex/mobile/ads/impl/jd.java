package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ms0;
import kotlin.jvm.JvmStatic;

/* loaded from: classes5.dex */
public final class jd {

    /* renamed from: a, reason: collision with root package name */
    private static volatile hd f15903a;

    @JvmStatic
    public static final le a() {
        Object obj;
        hd hdVar;
        hd hdVar2 = f15903a;
        if (hdVar2 != null) {
            return hdVar2;
        }
        obj = hd.b;
        synchronized (obj) {
            hdVar = f15903a;
            if (hdVar == null) {
                int i = ms0.f;
                hdVar = new hd(ms0.a.a().c());
                f15903a = hdVar;
            }
        }
        return hdVar;
    }
}
