package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.translate.TranslateHomeActivity;
import com.wakeup.feature.translate.TranslateModuleServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$translate implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.TRANSLATE_SERVICE, RouteMeta.build(RouteType.PROVIDER, TranslateModuleServiceImpl.class, ServicePathKt.TRANSLATE_SERVICE, "translate", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_TRANSLATE, RouteMeta.build(RouteType.ACTIVITY, TranslateHomeActivity.class, PagePath.PAGE_TRANSLATE, "translate", null, -1, Integer.MIN_VALUE));
    }
}
