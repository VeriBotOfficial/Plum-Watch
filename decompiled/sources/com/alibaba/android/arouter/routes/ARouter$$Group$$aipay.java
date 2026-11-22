package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.aipay.AiPayServiceImpl;
import com.wakeup.module.aipay.activity.AiEnergyActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$aipay implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.AI_PAY_SERVICE, RouteMeta.build(RouteType.PROVIDER, AiPayServiceImpl.class, ServicePathKt.AI_PAY_SERVICE, "aipay", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AIPAY_ENERGY, RouteMeta.build(RouteType.ACTIVITY, AiEnergyActivity.class, PagePath.PAGE_AIPAY_ENERGY, "aipay", null, -1, Integer.MIN_VALUE));
    }
}
