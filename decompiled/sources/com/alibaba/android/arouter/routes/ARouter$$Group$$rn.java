package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.howear.rn.RnServiceImpl;
import com.wakeup.howear.rn.core.activity.RNSearchActivity;
import com.wakeup.howear.rn.core.activity.StockGameActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$rn implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.RN_SERVICE, RouteMeta.build(RouteType.PROVIDER, RnServiceImpl.class, ServicePathKt.RN_SERVICE, "rn", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_RN_SEARCH, RouteMeta.build(RouteType.ACTIVITY, RNSearchActivity.class, PagePath.PAGE_RN_SEARCH, "rn", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_RN_STOCK_GAME, RouteMeta.build(RouteType.ACTIVITY, StockGameActivity.class, PagePath.PAGE_RN_STOCK_GAME, "rn", null, -1, Integer.MIN_VALUE));
    }
}
