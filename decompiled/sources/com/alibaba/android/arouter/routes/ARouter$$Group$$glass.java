package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.module.glasses.activity.GlassesLive2Activity;
import com.wakeup.module.glasses.activity.GlassesLiveActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$glass implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_GLASS_LIVE, RouteMeta.build(RouteType.ACTIVITY, GlassesLiveActivity.class, PagePath.PAGE_GLASS_LIVE, "glass", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASS_LIVE2, RouteMeta.build(RouteType.ACTIVITY, GlassesLive2Activity.class, PagePath.PAGE_GLASS_LIVE2, "glass", null, -1, Integer.MIN_VALUE));
    }
}
