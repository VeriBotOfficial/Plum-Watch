package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class x4 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17308a = "yandex_ad_info";

    public static String a(ub2 videoAdExtensions) {
        Object obj;
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Iterator<T> it = videoAdExtensions.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((u70) obj).a(), f17308a)) {
                break;
            }
        }
        u70 u70Var = (u70) obj;
        if (u70Var != null) {
            return u70Var.b();
        }
        return null;
    }
}
