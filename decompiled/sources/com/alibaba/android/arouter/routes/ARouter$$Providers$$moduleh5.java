package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.h5.H5ServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$moduleh5 implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.h5.H5Service", RouteMeta.build(RouteType.PROVIDER, H5ServiceImpl.class, ServicePathKt.H5_SERVICE, "h5", null, -1, Integer.MIN_VALUE));
    }
}
