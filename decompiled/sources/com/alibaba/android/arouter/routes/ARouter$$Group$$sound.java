package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.sound.SoundServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$sound implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.SOUND_SERVICE, RouteMeta.build(RouteType.PROVIDER, SoundServiceImpl.class, ServicePathKt.SOUND_SERVICE, RemoteMessageConst.Notification.SOUND, null, -1, Integer.MIN_VALUE));
    }
}
