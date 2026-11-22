package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.data.EventDataServiceImpl;
import com.wakeup.module.data.HealthDataServiceImpl;
import com.wakeup.module.data.SportDataServiceImpl;
import com.wakeup.module.data.UserDataServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$data implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> atlas) {
        atlas.put(ServicePathKt.EVENT_DATA_SERVICE, RouteMeta.build(RouteType.PROVIDER, EventDataServiceImpl.class, ServicePathKt.EVENT_DATA_SERVICE, "data", null, -1, Integer.MIN_VALUE));
        atlas.put(ServicePathKt.HEALTH_DATA_SERVICE, RouteMeta.build(RouteType.PROVIDER, HealthDataServiceImpl.class, ServicePathKt.HEALTH_DATA_SERVICE, "data", null, -1, Integer.MIN_VALUE));
        atlas.put(ServicePathKt.SPORT_DATA_SERVICE, RouteMeta.build(RouteType.PROVIDER, SportDataServiceImpl.class, ServicePathKt.SPORT_DATA_SERVICE, "data", null, -1, Integer.MIN_VALUE));
        atlas.put(ServicePathKt.USER_DATA_SERVICE, RouteMeta.build(RouteType.PROVIDER, UserDataServiceImpl.class, ServicePathKt.USER_DATA_SERVICE, "data", null, -1, Integer.MIN_VALUE));
    }
}
