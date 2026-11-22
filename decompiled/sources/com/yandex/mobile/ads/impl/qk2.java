package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qk2 implements dq1<List<? extends mb2>> {

    /* renamed from: a, reason: collision with root package name */
    private final dq1<List<mb2>> f16677a;
    private final rk2 b;

    public qk2(Context context, mb2 wrapperAd, dq1<List<mb2>> requestListener, rk2 wrapperAdResponseConfigurator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(wrapperAd, "wrapperAd");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        Intrinsics.checkNotNullParameter(wrapperAdResponseConfigurator, "wrapperAdResponseConfigurator");
        this.f16677a = requestListener;
        this.b = wrapperAdResponseConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.dq1
    public final void a(sb2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f16677a.a(error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yandex.mobile.ads.impl.dq1
    public final void a(List<? extends mb2> list) {
        List<? extends mb2> response = list;
        Intrinsics.checkNotNullParameter(response, "response");
        this.f16677a.a((dq1<List<mb2>>) this.b.a(response));
    }
}
