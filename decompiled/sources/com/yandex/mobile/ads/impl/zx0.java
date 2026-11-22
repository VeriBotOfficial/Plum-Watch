package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.base.a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zx0<T extends com.monetization.ads.mediation.base.a> {

    /* renamed from: a, reason: collision with root package name */
    private final List<lz0> f17566a;
    private final e80 b;
    private final cy0<T> c;
    private final ux0 d;
    private int e;

    public final qx0<T> a(Context context, Class<T> clazz) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        while (this.e < this.f17566a.size()) {
            List<lz0> list = this.f17566a;
            int i = this.e;
            this.e = i + 1;
            lz0 lz0Var = list.get(i);
            T mediatedAdapter = this.c.a(context, lz0Var, clazz);
            if (mediatedAdapter != null) {
                this.d.getClass();
                Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
                return new qx0<>(mediatedAdapter, lz0Var, new tx0(mediatedAdapter), this.b);
            }
        }
        return null;
    }

    public /* synthetic */ zx0(List list, ly0 ly0Var, gy0 gy0Var) {
        this(list, ly0Var, gy0Var, new cy0(gy0Var), new ux0());
    }

    public zx0(List mediationNetworks, ly0 extrasCreator, gy0 mediatedAdapterReporter, cy0 mediatedAdapterCreator, ux0 mediatedAdDataFactory) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdapterCreator, "mediatedAdapterCreator");
        Intrinsics.checkNotNullParameter(mediatedAdDataFactory, "mediatedAdDataFactory");
        this.f17566a = mediationNetworks;
        this.b = extrasCreator;
        this.c = mediatedAdapterCreator;
        this.d = mediatedAdDataFactory;
    }
}
