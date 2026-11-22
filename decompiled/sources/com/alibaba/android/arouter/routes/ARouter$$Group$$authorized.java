package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.phancy.mini.api.device.AppAuthorizeSettingModule;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.howear.WKAuthorizedActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$authorized implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_AUTHORIZED, RouteMeta.build(RouteType.ACTIVITY, WKAuthorizedActivity.class, PagePath.PAGE_AUTHORIZED, AppAuthorizeSettingModule.AUTHORIZED, null, -1, Integer.MIN_VALUE));
    }
}
