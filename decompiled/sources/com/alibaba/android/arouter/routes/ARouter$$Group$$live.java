package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.module.jacket.comm.LiveAudioActivity;
import com.wakeup.module.jacket.comm.LiveVideoActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$live implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_LIVE_AUDIO, RouteMeta.build(RouteType.ACTIVITY, LiveAudioActivity.class, PagePath.PAGE_LIVE_AUDIO, "live", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_LIVE_VIDEO, RouteMeta.build(RouteType.ACTIVITY, LiveVideoActivity.class, PagePath.PAGE_LIVE_VIDEO, "live", null, -1, Integer.MIN_VALUE));
    }
}
