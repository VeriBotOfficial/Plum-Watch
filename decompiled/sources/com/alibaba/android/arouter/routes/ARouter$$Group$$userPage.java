package com.alibaba.android.arouter.routes;

import com.alibaba.android.arouter.facade.enums.RouteType;
import com.alibaba.android.arouter.facade.model.RouteMeta;
import com.alibaba.android.arouter.facade.template.IRouteGroup;
import com.wakeup.commponent.constant.PagePath;
import com.wakeup.feature.user.QrActivity;
import com.wakeup.feature.user.exchangeCode.DialExchangeActivity;
import com.wakeup.feature.user.info.UserInfoActivity;
import com.wakeup.feature.user.medal.MedalShareActivity;
import com.wakeup.feature.user.order.MyOrderActivity;
import java.util.Map;

/* loaded from: classes11.dex */
public class ARouter$$Group$$userPage implements IRouteGroup {
    @Override // com.alibaba.android.arouter.facade.template.IRouteGroup
    public void loadInto(Map<String, RouteMeta> map) {
        map.put(PagePath.PAGE_DIAL_EXCHANGE, RouteMeta.build(RouteType.ACTIVITY, DialExchangeActivity.class, "/userpage/dialexchange", "userpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_USER_INFO, RouteMeta.build(RouteType.ACTIVITY, UserInfoActivity.class, "/userpage/info", "userpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_USER_MEDAL_SHARE, RouteMeta.build(RouteType.ACTIVITY, MedalShareActivity.class, "/userpage/medalshare", "userpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_USER_ORDER, RouteMeta.build(RouteType.ACTIVITY, MyOrderActivity.class, "/userpage/order", "userpage", null, -1, Integer.MIN_VALUE));
        map.put(PagePath.PAGE_USER_QR, RouteMeta.build(RouteType.ACTIVITY, QrActivity.class, "/userpage/qr", "userpage", null, -1, Integer.MIN_VALUE));
    }
}
