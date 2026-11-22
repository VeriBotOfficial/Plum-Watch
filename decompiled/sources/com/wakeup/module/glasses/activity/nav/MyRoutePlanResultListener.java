package com.wakeup.module.glasses.activity.nav;

import com.baidu.mapapi.search.route.DrivingRouteResult;
import com.baidu.mapapi.search.route.IndoorRouteResult;
import com.baidu.mapapi.search.route.MassTransitRouteResult;
import com.baidu.mapapi.search.route.OnGetRoutePlanResultListener;
import com.baidu.mapapi.search.route.TransitRouteResult;
import kotlin.Metadata;

/* compiled from: MyRoutePlanResultListener.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\n\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\rH\u0016¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/glasses/activity/nav/MyRoutePlanResultListener;", "Lcom/baidu/mapapi/search/route/OnGetRoutePlanResultListener;", "<init>", "()V", "onGetTransitRouteResult", "", "p0", "Lcom/baidu/mapapi/search/route/TransitRouteResult;", "onGetMassTransitRouteResult", "Lcom/baidu/mapapi/search/route/MassTransitRouteResult;", "onGetDrivingRouteResult", "Lcom/baidu/mapapi/search/route/DrivingRouteResult;", "onGetIndoorRouteResult", "Lcom/baidu/mapapi/search/route/IndoorRouteResult;", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MyRoutePlanResultListener implements OnGetRoutePlanResultListener {
    @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
    public void onGetDrivingRouteResult(DrivingRouteResult p0) {
    }

    @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
    public void onGetIndoorRouteResult(IndoorRouteResult p0) {
    }

    @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
    public void onGetMassTransitRouteResult(MassTransitRouteResult p0) {
    }

    @Override // com.baidu.mapapi.search.route.OnGetRoutePlanResultListener
    public void onGetTransitRouteResult(TransitRouteResult p0) {
    }
}
