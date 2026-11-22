package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.translate.TranslateModuleServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$featuretranslate implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.device.translate.TranslateModuleService", RouteMeta.build(RouteType.PROVIDER, TranslateModuleServiceImpl.class, ServicePathKt.TRANSLATE_SERVICE, "translate", null, -1, Integer.MIN_VALUE));
    }
}
