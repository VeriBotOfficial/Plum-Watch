package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.feature.course.CourseServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$course implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.COURSE_SERVICE, RouteMeta.build(RouteType.PROVIDER, CourseServiceImpl.class, ServicePathKt.COURSE_SERVICE, "course", null, -1, Integer.MIN_VALUE));
    }
}
