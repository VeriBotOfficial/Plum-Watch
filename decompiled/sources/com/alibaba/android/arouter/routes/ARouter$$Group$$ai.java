package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.anythink.expressad.f.a.b;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.ai.AiServiceImpl;
import com.wakeup.module.ai.robot.WearFitAiActivity;
import com.wakeup.module.ai.simInter.CommonSimInterActivity;
import com.wakeup.module.ai.subtitles.AiSubtitlesActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$ai implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.AI_SERVICE, RouteMeta.build(RouteType.PROVIDER, AiServiceImpl.class, ServicePathKt.AI_SERVICE, b.da, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_SIMINTER, RouteMeta.build(RouteType.ACTIVITY, CommonSimInterActivity.class, "/ai/siminter", b.da, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_AI_SUBTITLES, RouteMeta.build(RouteType.ACTIVITY, AiSubtitlesActivity.class, PagePath.PAGE_AI_SUBTITLES, b.da, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_WEAR_FIT_AI, RouteMeta.build(RouteType.ACTIVITY, WearFitAiActivity.class, "/ai/wearfitai", b.da, null, -1, Integer.MIN_VALUE));
    }
}
