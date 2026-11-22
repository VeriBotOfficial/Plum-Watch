package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.tts.TtsServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$tts implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.TTS_SERVICE, RouteMeta.build(RouteType.PROVIDER, TtsServiceImpl.class, ServicePathKt.TTS_SERVICE, "tts", null, -1, Integer.MIN_VALUE));
    }
}
