package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.wakeup.common.DeviceFeatures;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.device.DevicePageServiceImpl;
import com.wakeup.feature.device.music.MusicLibraryModuleServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$featuredevice implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.device.music.MusicLibraryModuleService", RouteMeta.build(RouteType.PROVIDER, MusicLibraryModuleServiceImpl.class, ServicePathKt.MUSIC_LIBRARY_SERVICE, DeviceFeatures.MINI_MUSIC_APP_ID, null, -1, Integer.MIN_VALUE));
        map.put("com.wakeup.commponent.api.DevicePageService", RouteMeta.build(RouteType.PROVIDER, DevicePageServiceImpl.class, ServicePathKt.DEVICE_PAGE_SERVICE, "devicePage", null, -1, Integer.MIN_VALUE));
    }
}
