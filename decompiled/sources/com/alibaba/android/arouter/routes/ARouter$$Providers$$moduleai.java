package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.anythink.expressad.f.a.b;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.ai.AiServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$moduleai implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.api.AiService", RouteMeta.build(RouteType.PROVIDER, AiServiceImpl.class, ServicePathKt.AI_SERVICE, b.da, null, -1, Integer.MIN_VALUE));
    }
}
