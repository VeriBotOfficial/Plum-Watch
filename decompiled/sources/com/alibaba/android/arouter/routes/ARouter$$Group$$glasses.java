package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.glasses.GlassesImpl;
import com.wakeup.module.glasses.activity.GlassesChatActivity;
import com.wakeup.module.glasses.activity.GlassesDialogActivity;
import com.wakeup.module.glasses.activity.GlassesFeatureEditActivity;
import com.wakeup.module.glasses.activity.GlassesHistoryListActivity;
import com.wakeup.module.glasses.activity.GlassesVPEditActivity;
import com.wakeup.module.glasses.activity.connect.GlassesConnectActivity;
import com.wakeup.module.glasses.activity.connect.GlassesConnectTipActivity;
import com.wakeup.module.glasses.activity.connect.GlassesSearchErrActivity;
import com.wakeup.module.glasses.activity.nav.GlassesNavActivity;
import com.wakeup.module.glasses.activity.nav.GlassesRoutePlanActivity;
import com.wakeup.module.glasses.activity.settings.GlassesSettingsActivity;
import com.wakeup.module.glasses.activity.settings.GlassesWifiListActivity;
import com.wakeup.module.glasses.activity.store.GlassesTimbreActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$glasses implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_GLASSES_AI_TIMBRE, RouteMeta.build(RouteType.ACTIVITY, GlassesTimbreActivity.class, "/glasses/aitimbre", "glasses", null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.GLASSES_SERVICE, RouteMeta.build(RouteType.PROVIDER, GlassesImpl.class, ServicePathKt.GLASSES_SERVICE, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_CHAT, RouteMeta.build(RouteType.ACTIVITY, GlassesChatActivity.class, PagePath.PAGE_GLASSES_CHAT, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_CONNECT, RouteMeta.build(RouteType.ACTIVITY, GlassesConnectActivity.class, PagePath.PAGE_GLASSES_CONNECT, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_DIALOG, RouteMeta.build(RouteType.ACTIVITY, GlassesDialogActivity.class, PagePath.PAGE_GLASSES_DIALOG, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_FEATURE_EDIT, RouteMeta.build(RouteType.ACTIVITY, GlassesFeatureEditActivity.class, PagePath.PAGE_GLASSES_FEATURE_EDIT, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_HISTORY_LIST, RouteMeta.build(RouteType.ACTIVITY, GlassesHistoryListActivity.class, PagePath.PAGE_GLASSES_HISTORY_LIST, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_NAV, RouteMeta.build(RouteType.ACTIVITY, GlassesNavActivity.class, PagePath.PAGE_GLASSES_NAV, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_NAV_PLAN, RouteMeta.build(RouteType.ACTIVITY, GlassesRoutePlanActivity.class, PagePath.PAGE_GLASSES_NAV_PLAN, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_SEARCH_ERRO, RouteMeta.build(RouteType.ACTIVITY, GlassesSearchErrActivity.class, "/glasses/searcherro", "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_SETTING, RouteMeta.build(RouteType.ACTIVITY, GlassesSettingsActivity.class, PagePath.PAGE_GLASSES_SETTING, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_TIP, RouteMeta.build(RouteType.ACTIVITY, GlassesConnectTipActivity.class, PagePath.PAGE_GLASSES_TIP, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_VP_EDIT, RouteMeta.build(RouteType.ACTIVITY, GlassesVPEditActivity.class, PagePath.PAGE_GLASSES_VP_EDIT, "glasses", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_GLASSES_WIFI, RouteMeta.build(RouteType.ACTIVITY, GlassesWifiListActivity.class, PagePath.PAGE_GLASSES_WIFI, "glasses", null, -1, Integer.MIN_VALUE));
    }
}
