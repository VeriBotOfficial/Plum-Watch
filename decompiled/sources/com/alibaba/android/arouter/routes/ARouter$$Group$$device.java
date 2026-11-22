package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.device.DeviceOtaServiceImpl;
import com.wakeup.module.device.DeviceServiceImpl;
import com.wakeup.module.device.DeviceTransServiceImpl;
import com.wakeup.module.device.HeadsetServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$device implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.DEVICE_HEADSET_SERVICE, RouteMeta.build(RouteType.PROVIDER, HeadsetServiceImpl.class, ServicePathKt.DEVICE_HEADSET_SERVICE, "device", null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.DEVICE_MANAGER_SERVICE, RouteMeta.build(RouteType.PROVIDER, DeviceServiceImpl.class, ServicePathKt.DEVICE_MANAGER_SERVICE, "device", null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.DEVICE_OTA_SERVICE, RouteMeta.build(RouteType.PROVIDER, DeviceOtaServiceImpl.class, ServicePathKt.DEVICE_OTA_SERVICE, "device", null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.DEVICE_TRANSFER_SERVICE, RouteMeta.build(RouteType.PROVIDER, DeviceTransServiceImpl.class, ServicePathKt.DEVICE_TRANSFER_SERVICE, "device", null, -1, Integer.MIN_VALUE));
    }
}
