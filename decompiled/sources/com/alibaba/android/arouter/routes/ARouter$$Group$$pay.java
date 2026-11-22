package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.pay.PayServiceImpl;
import com.xmly.businesssdk.network.constant.HttpConst;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$pay implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.PAY_SERVICE, RouteMeta.build(RouteType.PROVIDER, PayServiceImpl.class, ServicePathKt.PAY_SERVICE, HttpConst.PAY_HEADER_KEY, null, -1, Integer.MIN_VALUE));
    }
}
