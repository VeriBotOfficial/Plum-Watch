package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.ap.ApServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$moduleap implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.api.ApService", RouteMeta.build(RouteType.PROVIDER, ApServiceImpl.class, ServicePathKt.AP_SERVICE, "ap", null, -1, Integer.MIN_VALUE));
    }
}
