package com.baidu.platform.core.route;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.route.PlanNode;
import com.baidu.mapapi.search.route.WalkingRoutePlanOption;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.wakeup.common.utils.AdvConstance;

/* compiled from: WalkRouteRequest.java */
/* loaded from: classes13.dex */
public class p extends com.baidu.platform.base.c {
    public p(WalkingRoutePlanOption walkingRoutePlanOption) {
        a(walkingRoutePlanOption);
    }

    private void a(WalkingRoutePlanOption walkingRoutePlanOption) {
        this.d.a(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "walk2");
        this.d.a("sn", a(walkingRoutePlanOption.mFrom));
        this.d.a("en", a(walkingRoutePlanOption.mTo));
        PlanNode planNode = walkingRoutePlanOption.mFrom;
        if (planNode != null) {
            this.d.a(com.anythink.expressad.f.a.b.bI, planNode.getCity());
        }
        PlanNode planNode2 = walkingRoutePlanOption.mTo;
        if (planNode2 != null) {
            this.d.a("ec", planNode2.getCity());
        }
        this.d.a("ie", "utf-8");
        this.d.a("lrn", AdvConstance.MINE_PAGE);
        this.d.a("version", "3");
        this.d.a("rp_format", BodyData.TYPE_JSON);
        this.d.a("rp_filter", "mobile");
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.s();
    }
}
