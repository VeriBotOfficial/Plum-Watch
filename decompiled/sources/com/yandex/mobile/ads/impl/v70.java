package com.yandex.mobile.ads.impl;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class v70 {

    /* renamed from: a, reason: collision with root package name */
    private final List<u70> f17132a;

    public final boolean a() {
        Intrinsics.checkNotNullParameter("ad_system", "type");
        Intrinsics.checkNotNullParameter("adfox", "value");
        List<u70> list = this.f17132a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (u70 u70Var : list) {
            if (Intrinsics.areEqual(u70Var.a(), "ad_system") && Intrinsics.areEqual(u70Var.b(), "adfox")) {
                return true;
            }
        }
        return false;
    }

    public /* synthetic */ v70(ub2 ub2Var) {
        this(ub2Var, ub2Var.a());
    }

    public v70(ub2 videoAdExtensions, List<u70> extensions) {
        Intrinsics.checkNotNullParameter(videoAdExtensions, "videoAdExtensions");
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f17132a = extensions;
    }
}
