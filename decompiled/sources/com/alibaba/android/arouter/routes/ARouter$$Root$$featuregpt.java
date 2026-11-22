package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.alibaba.android.arouter.facade.template.IRouteRoot;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Root$$featuregpt implements IRouteRoot {
    @Override // com.alibaba.android.arouter.facade.template.IRouteRoot
    public void loadInto(Map<String, Class<? extends IRouteGroup>> map) {
        map.put("chatGpt", ARouter$$Group$$chatGpt.class);
        map.put("gpt", ARouter$$Group$$gpt.class);
        map.put("lenovoChatGpt", ARouter$$Group$$lenovoChatGpt.class);
    }
}
