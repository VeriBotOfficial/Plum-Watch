package io.appmetrica.analytics.impl;

import com.autonavi.aps.amapapi.config.Const;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public abstract class I5 {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f17899a;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(AndroidStaticDeviceInfoDataSource.STORE_GOOGLE, AdTrackingInfo.Provider.GOOGLE);
        hashMap.put(Const.BRAND_HUAWEI, AdTrackingInfo.Provider.HMS);
        hashMap.put("yandex", AdTrackingInfo.Provider.YANDEX);
        f17899a = Collections.unmodifiableMap(hashMap);
    }
}
