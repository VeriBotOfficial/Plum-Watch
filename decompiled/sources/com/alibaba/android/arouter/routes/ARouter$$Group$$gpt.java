package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.gpt.GptServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$gpt implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.GPT_SERVICE, RouteMeta.build(RouteType.PROVIDER, GptServiceImpl.class, ServicePathKt.GPT_SERVICE, "gpt", null, -1, Integer.MIN_VALUE));
    }
}
