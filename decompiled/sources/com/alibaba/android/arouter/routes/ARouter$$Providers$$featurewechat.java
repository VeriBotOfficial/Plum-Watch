package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IProviderGroup;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.wakeup.commponent.constant.ServicePathKt;
import com.wakeup.module.wechat.WechatReplyServiceImpl;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Providers$$featurewechat implements IProviderGroup {
    @Override // com.alibaba.android.arouter.facade.template.IProviderGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put("com.wakeup.commponent.module.device.wechat.WechatReplyService", RouteMeta.build(RouteType.PROVIDER, WechatReplyServiceImpl.class, ServicePathKt.WECHAT_REPLY_SERVICE, ConstantsAPI.Token.WX_TOKEN_PLATFORMID_VALUE, null, -1, Integer.MIN_VALUE));
    }
}
