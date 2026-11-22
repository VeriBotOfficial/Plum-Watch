package com.yandex.mobile.ads.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.StartupParamsItem;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rf implements StartupParamsCallback {

    /* renamed from: a, reason: collision with root package name */
    private final nf f16760a;

    public rf(nf appMetricaStartupParamsCallback) {
        Intrinsics.checkNotNullParameter(appMetricaStartupParamsCallback, "appMetricaStartupParamsCallback");
        this.f16760a = appMetricaStartupParamsCallback;
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onRequestError(StartupParamsCallback.Reason reason, StartupParamsCallback.Result result) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.f16760a.a(Intrinsics.areEqual(reason, StartupParamsCallback.Reason.NETWORK) ? mf.c : Intrinsics.areEqual(reason, StartupParamsCallback.Reason.INVALID_RESPONSE) ? mf.d : mf.b);
    }

    @Override // io.appmetrica.analytics.StartupParamsCallback
    public final void onReceive(StartupParamsCallback.Result result) {
        Map<String, StartupParamsItem> map;
        StartupParamsItem startupParamsItem;
        Map<String, StartupParamsItem> map2;
        StartupParamsItem startupParamsItem2;
        Map<String, StartupParamsItem> map3;
        StartupParamsItem startupParamsItem3;
        nf nfVar = this.f16760a;
        String str = null;
        String id2 = (result == null || (map3 = result.parameters) == null || (startupParamsItem3 = map3.get(StartupParamsCallback.APPMETRICA_UUID)) == null) ? null : startupParamsItem3.getId();
        String id3 = (result == null || (map2 = result.parameters) == null || (startupParamsItem2 = map2.get(StartupParamsCallback.APPMETRICA_DEVICE_ID)) == null) ? null : startupParamsItem2.getId();
        if (result != null && (map = result.parameters) != null && (startupParamsItem = map.get("appmetrica_get_ad_url")) != null) {
            str = startupParamsItem.getId();
        }
        nfVar.a(new lf(id2, id3, str));
    }
}
