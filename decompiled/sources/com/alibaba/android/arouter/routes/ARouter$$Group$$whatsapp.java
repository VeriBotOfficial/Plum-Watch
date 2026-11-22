package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.whatsapp.WhatsAppServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$whatsapp implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.WHATS_APP_SERVICE, RouteMeta.build(RouteType.PROVIDER, WhatsAppServiceImpl.class, ServicePathKt.WHATS_APP_SERVICE, "whatsapp", null, -1, Integer.MIN_VALUE));
    }
}
