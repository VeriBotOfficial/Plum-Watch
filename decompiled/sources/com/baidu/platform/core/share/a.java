package com.baidu.platform.core.share;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.share.LocationShareURLOption;
import com.baidu.platform.comapi.basestruct.Point;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.umeng.analytics.pro.ak;

/* compiled from: LocationShareRequest.java */
/* loaded from: classes13.dex */
public class a extends com.baidu.platform.base.c {
    public a(LocationShareURLOption locationShareURLOption) {
        a(locationShareURLOption);
    }

    private void a(LocationShareURLOption locationShareURLOption) {
        this.d.a(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "cs");
        Point ll2point = CoordUtil.ll2point(locationShareURLOption.mLocation);
        this.d.a(MapBundleKey.MapObjKey.OBJ_GEO, ll2point.x + "|" + ll2point.y);
        this.d.a(ak.aH, locationShareURLOption.mName);
        this.d.a("cnt", locationShareURLOption.mSnippet);
        b(false);
        a(false);
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.e();
    }
}
