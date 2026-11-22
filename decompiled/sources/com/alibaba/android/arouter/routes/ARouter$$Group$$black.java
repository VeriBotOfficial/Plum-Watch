package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.howear.module.ad.VideoAdFragment;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$black implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_FRAGMENT_BLACK_VIDEO_AD, RouteMeta.build(RouteType.FRAGMENT, VideoAdFragment.class, PagePath.PAGE_FRAGMENT_BLACK_VIDEO_AD, "black", null, -1, Integer.MIN_VALUE));
    }
}
