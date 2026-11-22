package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.friend.activity.FriendHomeActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$friend implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_APP_FRIEND, RouteMeta.build(RouteType.ACTIVITY, FriendHomeActivity.class, PagePath.PAGE_APP_FRIEND, "friend", null, -1, Integer.MIN_VALUE));
    }
}
