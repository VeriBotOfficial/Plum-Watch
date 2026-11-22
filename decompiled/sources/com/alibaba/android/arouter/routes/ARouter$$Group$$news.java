package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.newsdaily.ui.NewsDetailActivity;
import com.wakeup.feature.newsdaily.ui.NewsPlayerActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$news implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_NEWS_DAILY_DETAIL, RouteMeta.build(RouteType.ACTIVITY, NewsDetailActivity.class, PagePath.PAGE_NEWS_DAILY_DETAIL, "news", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_NEWS_DAILY_PLAYER, RouteMeta.build(RouteType.ACTIVITY, NewsPlayerActivity.class, PagePath.PAGE_NEWS_DAILY_PLAYER, "news", null, -1, Integer.MIN_VALUE));
    }
}
