package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.module.gpt.activity.SingGptActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$lenovoChatGpt implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.LENOVO_PAGE_CHAT_HOME, RouteMeta.build(RouteType.ACTIVITY, SingGptActivity.class, "/lenovochatgpt/home", "lenovochatgpt", null, -1, Integer.MIN_VALUE));
    }
}
