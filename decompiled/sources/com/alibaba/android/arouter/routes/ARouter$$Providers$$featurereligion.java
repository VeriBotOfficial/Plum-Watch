package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.religion.ReligionModuleServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$featurereligion implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.device.qibla.ReligionModuleService", RouteMeta.build(RouteType.PROVIDER, ReligionModuleServiceImpl.class, ServicePathKt.RELIGION_SERVICE, "religion", null, -1, Integer.MIN_VALUE));
    }
}
