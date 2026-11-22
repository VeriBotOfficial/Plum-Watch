package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.device.music.MusicLibraryModuleServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$music implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.MUSIC_LIBRARY_SERVICE, RouteMeta.build(RouteType.PROVIDER, MusicLibraryModuleServiceImpl.class, ServicePathKt.MUSIC_LIBRARY_SERVICE, DeviceFeatures.MINI_MUSIC_APP_ID, null, -1, Integer.MIN_VALUE));
    }
}
