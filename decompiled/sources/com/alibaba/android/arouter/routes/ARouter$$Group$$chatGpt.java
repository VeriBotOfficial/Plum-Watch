package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.module.gpt.activity.CollectActivity;
import com.wakeup.module.gpt.activity.GptActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$chatGpt implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_CHAT_HOME, RouteMeta.build(RouteType.ACTIVITY, GptActivity.class, "/chatgpt/home", "chatgpt", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_CHAT_TODO, RouteMeta.build(RouteType.ACTIVITY, CollectActivity.class, "/chatgpt/todo", "chatgpt", null, -1, Integer.MIN_VALUE));
    }
}
