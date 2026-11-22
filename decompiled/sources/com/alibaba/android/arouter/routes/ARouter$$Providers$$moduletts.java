package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.tts.TtsServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$moduletts implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.api.TtsService", RouteMeta.build(RouteType.PROVIDER, TtsServiceImpl.class, ServicePathKt.TTS_SERVICE, "tts", null, -1, Integer.MIN_VALUE));
    }
}
