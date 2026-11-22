package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.jacket.JacketServiceImpl;
import com.wakeup.module.jacket.face.FaceTransActivity;
import com.wakeup.module.jacket.meeting.JacketMeetingActivity;
import com.wakeup.module.jacket.oneTrans.OneTransActivity;
import com.wakeup.module.jacket.robot.JacketRobotActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$jacket implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(ServicePathKt.JACKET_SERVICE, RouteMeta.build(RouteType.PROVIDER, JacketServiceImpl.class, ServicePathKt.JACKET_SERVICE, "jacket", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_JACKET_FACE_TO_FACE, RouteMeta.build(RouteType.ACTIVITY, FaceTransActivity.class, "/jacket/facetoface", "jacket", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_JACKET_MEETING, RouteMeta.build(RouteType.ACTIVITY, JacketMeetingActivity.class, PagePath.PAGE_JACKET_MEETING, "jacket", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_JACKET_ONE_TRANS, RouteMeta.build(RouteType.ACTIVITY, OneTransActivity.class, "/jacket/onetrans", "jacket", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_JACKET_ROBOT, RouteMeta.build(RouteType.ACTIVITY, JacketRobotActivity.class, PagePath.PAGE_JACKET_ROBOT, "jacket", null, -1, Integer.MIN_VALUE));
    }
}
