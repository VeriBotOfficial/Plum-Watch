package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.wechat.WechatReplyActivity;
import com.wakeup.module.wechat.WechatReplyServiceImpl;
import com.wakeup.module.wechat.WechatReplyVerifyActivity;
import com.wakeup.module.wechat.activity.WechatImgEmoActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$wechat implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_WECHAT_REPLY, RouteMeta.build(RouteType.ACTIVITY, WechatReplyActivity.class, PagePath.PAGE_WECHAT_REPLY, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, null, -1, Integer.MIN_VALUE));
        map.put(ServicePathKt.WECHAT_REPLY_SERVICE, RouteMeta.build(RouteType.PROVIDER, WechatReplyServiceImpl.class, ServicePathKt.WECHAT_REPLY_SERVICE, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_WECHAT_REPLY_IMG, RouteMeta.build(RouteType.ACTIVITY, WechatImgEmoActivity.class, PagePath.PAGE_WECHAT_REPLY_IMG, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_WECHAT_REPLY_SCAN, RouteMeta.build(RouteType.ACTIVITY, WechatReplyVerifyActivity.class, PagePath.PAGE_WECHAT_REPLY_SCAN, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, null, -1, Integer.MIN_VALUE));
    }
}
