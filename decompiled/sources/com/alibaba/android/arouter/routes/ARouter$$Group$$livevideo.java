package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.livevideo.LiveServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$livevideo implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.LIVE_SERVICE, RouteMeta.build(RouteType.PROVIDER, LiveServiceImpl.class, ServicePathKt.LIVE_SERVICE, "livevideo", null, -1, Integer.MIN_VALUE));
    }
}
