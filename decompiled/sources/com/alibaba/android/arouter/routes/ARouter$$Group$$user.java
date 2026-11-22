package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.user.mall.PointsMallActivity;
import com.wakeup.feature.user.medal.MedalActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$user implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_USER_MEDAL, RouteMeta.build(RouteType.ACTIVITY, MedalActivity.class, PagePath.PAGE_USER_MEDAL, "user", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_MY_INTEGRAL_SHOPPING_MALL, RouteMeta.build(RouteType.ACTIVITY, PointsMallActivity.class, "/user/shoppingamall", "user", null, -1, Integer.MIN_VALUE));
    }
}
