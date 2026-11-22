package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.xmly.businesssdk.network.constant.HttpConst;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Root$$modulepay implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(HttpConst.PAY_HEADER_KEY, ARouter$$Group$$pay.class);
    }
}
