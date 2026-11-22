package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.plans.ui.create.PlansCreateActivity;
import com.wakeup.feature.plans.ui.detail.PlansDetailActivity;
import com.wakeup.feature.plans.ui.detail.PlansMessageDetailActivity;
import com.wakeup.feature.plans.ui.home.PlansHomeActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$plans implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_PLANS_CREATE, RouteMeta.build(RouteType.ACTIVITY, PlansCreateActivity.class, PagePath.PAGE_PLANS_CREATE, "plans", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_PLANS_DETAIL, RouteMeta.build(RouteType.ACTIVITY, PlansDetailActivity.class, PagePath.PAGE_PLANS_DETAIL, "plans", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_PLANS_HOME, RouteMeta.build(RouteType.ACTIVITY, PlansHomeActivity.class, PagePath.PAGE_PLANS_HOME, "plans", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_PLANS_MESSAGE, RouteMeta.build(RouteType.ACTIVITY, PlansMessageDetailActivity.class, PagePath.PAGE_PLANS_MESSAGE, "plans", null, -1, Integer.MIN_VALUE));
    }
}
