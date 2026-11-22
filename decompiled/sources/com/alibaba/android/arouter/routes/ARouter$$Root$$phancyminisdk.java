package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.phancy.mini.MiniSDK;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Root$$phancyminisdk implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(MiniSDK.SERVICE_GROUP, ARouter$$Group$$MiniSDK.class);
    }
}
