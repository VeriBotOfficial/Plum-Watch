package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.health.HealthServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$featurehealth implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.health.HealthService", RouteMeta.build(RouteType.PROVIDER, HealthServiceImpl.class, ServicePathKt.HEALTH_SERVICE, "health", null, -1, Integer.MIN_VALUE));
    }
}
