package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.h5.H5ServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$h5 implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.H5_SERVICE, RouteMeta.build(RouteType.PROVIDER, H5ServiceImpl.class, ServicePathKt.H5_SERVICE, "h5", null, -1, Integer.MIN_VALUE));
    }
}
