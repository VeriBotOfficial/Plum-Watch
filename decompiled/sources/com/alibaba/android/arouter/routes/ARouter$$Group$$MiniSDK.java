package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.phancy.mini.service.builtin.BuiltinAnalytics;
import com.phancy.mini.service.builtin.BuiltinAppInfoService;
import com.phancy.mini.service.builtin.BuiltinAppService;
import com.phancy.mini.service.builtin.BuiltinGatewayService;
import com.phancy.mini.service.builtin.BuiltinHttpServerService;
import com.phancy.mini.service.builtin.BuiltinImageService;
import com.phancy.mini.service.builtin.BuiltinLocationService;
import com.phancy.mini.service.builtin.BuiltinMediaService;
import com.phancy.mini.service.builtin.BuiltinRemoteConfig;
import com.phancy.mini.service.builtin.BuiltinRequestInterceptor;
import com.phancy.mini.service.builtin.BuiltinScanCodeService;
import com.phancy.mini.service.builtin.BuiltinShareAppDispatcher;
import com.phancy.mini.service.builtin.BuiltinUserService;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$MiniSDK implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("/PhancyMini/analytics@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinAnalytics.class, "/phancymini/analytics@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/appInfo@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinAppInfoService.class, "/phancymini/appinfo@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/builtinApp@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinAppService.class, "/phancymini/builtinapp@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/gateway@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinGatewayService.class, "/phancymini/gateway@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/httpServer@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinHttpServerService.class, "/phancymini/httpserver@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/image@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinImageService.class, "/phancymini/image@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/location@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinLocationService.class, "/phancymini/location@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/media@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinMediaService.class, "/phancymini/media@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/remoteConfig@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinRemoteConfig.class, "/phancymini/remoteconfig@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/requestInterceptor@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinRequestInterceptor.class, "/phancymini/requestinterceptor@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/scanCode@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinScanCodeService.class, "/phancymini/scancode@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/shareAppDispatcher@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinShareAppDispatcher.class, "/phancymini/shareappdispatcher@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
        map.put("/PhancyMini/user@builtin", RouteMeta.build(RouteType.PROVIDER, BuiltinUserService.class, "/phancymini/user@builtin", "minisdk", null, -1, Integer.MIN_VALUE));
    }
}
