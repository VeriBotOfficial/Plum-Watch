package com.baidu.platform.core.poi;

import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.search.poi.PoiIndoorOption;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;

/* compiled from: IndoorPoiSearchRequest.java */
/* loaded from: classes13.dex */
public class b extends com.baidu.platform.base.c {
    public b(PoiIndoorOption poiIndoorOption) {
        a(poiIndoorOption);
    }

    private void a(PoiIndoorOption poiIndoorOption) {
        this.d.a(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "indoor_s");
        this.d.a("x", "0");
        this.d.a("y", "0");
        this.d.a("from", "android_map_sdk");
        String str = poiIndoorOption.bid;
        if (str != null && !str.equals("")) {
            this.d.a("bid", str);
        }
        String str2 = poiIndoorOption.wd;
        if (str2 != null && !str2.equals("")) {
            this.d.a("wd", str2);
        }
        String str3 = poiIndoorOption.floor;
        if (str3 != null && !str3.equals("")) {
            this.d.a(Const.JSON_KEY_FLOOR, str3);
        }
        this.d.a("current", poiIndoorOption.currentPage + "");
        this.d.a("pageSize", poiIndoorOption.pageSize + "");
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.b();
    }
}
