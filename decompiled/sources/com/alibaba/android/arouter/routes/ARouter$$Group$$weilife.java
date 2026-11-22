package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.weilife.MyIntegralActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$weilife implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_MY_INTEGRAL, RouteMeta.build(RouteType.ACTIVITY, MyIntegralActivity.class, PagePath.PAGE_MY_INTEGRAL, "weilife", null, -1, Integer.MIN_VALUE));
    }
}
