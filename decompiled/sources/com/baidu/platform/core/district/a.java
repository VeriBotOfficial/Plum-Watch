package com.baidu.platform.core.district;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.district.DistrictSearchOption;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import io.livekit.android.room.util.MediaConstraintKeys;

/* compiled from: DistrictFromPoiRequest.java */
/* loaded from: classes13.dex */
public class a extends com.baidu.platform.base.c {
    a(DistrictSearchOption districtSearchOption) {
        a(districtSearchOption);
    }

    private void a(DistrictSearchOption districtSearchOption) {
        if (districtSearchOption == null) {
            return;
        }
        this.d.a(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "con");
        this.d.a("rp_format", BodyData.TYPE_JSON);
        this.d.a("rp_filter", "mobile");
        this.d.a("area_res", MediaConstraintKeys.TRUE);
        this.d.a("addr_identify", "1");
        this.d.a("ie", "utf-8");
        this.d.a("pn", "0");
        this.d.a("rn", "10");
        this.d.a("c", districtSearchOption.mCityName);
        String str = districtSearchOption.mDistrictName;
        if (str == null || str.equals("")) {
            this.d.a("wd", districtSearchOption.mCityName);
        } else {
            this.d.a("wd", districtSearchOption.mDistrictName);
        }
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.f();
    }
}
