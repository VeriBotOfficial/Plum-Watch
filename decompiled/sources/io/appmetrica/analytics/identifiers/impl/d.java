package io.appmetrica.analytics.identifiers.impl;

import com.autonavi.aps.amapapi.config.Const;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Map f17745a;

    public d(Map map) {
        this.f17745a = map;
    }

    public /* synthetic */ d() {
        this(MapsKt.mapOf(TuplesKt.to(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, new h()), TuplesKt.to(Const.BRAND_HUAWEI, new j()), TuplesKt.to("yandex", new q())));
    }
}
