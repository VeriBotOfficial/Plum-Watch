package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Root$$featurewechat implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, ARouter$$Group$$wechat.class);
    }
}
