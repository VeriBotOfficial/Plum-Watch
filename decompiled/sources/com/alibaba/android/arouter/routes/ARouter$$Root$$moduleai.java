package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.anythink.expressad.f.a.b;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Root$$moduleai implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(b.da, ARouter$$Group$$ai.class);
    }
}
