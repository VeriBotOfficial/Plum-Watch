package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.sport.activity.SportActivity;
import com.wakeup.feature.sport.activity.SportGoActivity;
import com.wakeup.feature.sport.activity.SportListActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$sportPage implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_SPORT_LIST, RouteMeta.build(RouteType.ACTIVITY, SportListActivity.class, "/sportpage/list", "sportpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SPORT, RouteMeta.build(RouteType.ACTIVITY, SportActivity.class, "/sportpage/sport", "sportpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SPORT_GO, RouteMeta.build(RouteType.ACTIVITY, SportGoActivity.class, "/sportpage/sportgo", "sportpage", null, -1, Integer.MIN_VALUE));
    }
}
