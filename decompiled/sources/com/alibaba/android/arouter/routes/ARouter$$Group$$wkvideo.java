package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.wkvideo.WKVideoServiceImpl;
import com.wakeup.feature.wkvideo.activity.PlayRangeActivity;
import com.wakeup.feature.wkvideo.activity.VideoPublisherActivity;
import com.wakeup.feature.wkvideo.livecut.LiveCutActivity;
import com.wakeup.feature.wkvideo.search.MediaSearchHomeActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$wkvideo implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.WK_VIDEO_SERVICE, RouteMeta.build(RouteType.PROVIDER, WKVideoServiceImpl.class, ServicePathKt.WK_VIDEO_SERVICE, "wkvideo", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_VIDEO_FULL_PLAY, RouteMeta.build(RouteType.ACTIVITY, PlayRangeActivity.class, PagePath.PAGE_VIDEO_FULL_PLAY, "wkvideo", null, -1, Integer.MIN_VALUE));
        map.put(LiveCutActivity.ROUTE_PATH, RouteMeta.build(RouteType.ACTIVITY, LiveCutActivity.class, LiveCutActivity.ROUTE_PATH, "wkvideo", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_VIDEO_PUBLISHER, RouteMeta.build(RouteType.ACTIVITY, VideoPublisherActivity.class, PagePath.PAGE_VIDEO_PUBLISHER, "wkvideo", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SEARCH, RouteMeta.build(RouteType.ACTIVITY, MediaSearchHomeActivity.class, PagePath.PAGE_SEARCH, "wkvideo", null, -1, Integer.MIN_VALUE));
    }
}
