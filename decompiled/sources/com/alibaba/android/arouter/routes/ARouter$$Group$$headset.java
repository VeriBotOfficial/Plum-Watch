package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.module.bt.headset.activity.HeadsetAncActivity;
import com.wakeup.module.bt.headset.activity.HeadsetEQActivity;
import com.wakeup.module.bt.headset.activity.HeadsetFindActivity;
import com.wakeup.module.bt.headset.activity.HeadsetKeyActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$headset implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_HEADSET_ANC, RouteMeta.build(RouteType.ACTIVITY, HeadsetAncActivity.class, PagePath.PAGE_HEADSET_ANC, "headset", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEADSET_EQ, RouteMeta.build(RouteType.ACTIVITY, HeadsetEQActivity.class, PagePath.PAGE_HEADSET_EQ, "headset", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEADSET_FIND, RouteMeta.build(RouteType.ACTIVITY, HeadsetFindActivity.class, PagePath.PAGE_HEADSET_FIND, "headset", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_HEADSET_KEY, RouteMeta.build(RouteType.ACTIVITY, HeadsetKeyActivity.class, PagePath.PAGE_HEADSET_KEY, "headset", null, -1, Integer.MIN_VALUE));
    }
}
