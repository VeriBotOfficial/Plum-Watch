package com.baidu.platform.core.district;

import com.facebook.common.util.UriUtil;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.tencent.connect.common.Constants;

/* compiled from: DistrictRequest.java */
/* loaded from: classes13.dex */
public class c extends com.baidu.platform.base.c {
    public c(String str) {
        b(str);
    }

    private void b(String str) {
        this.d.a(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "ext");
        this.d.a("num", Constants.DEFAULT_UIN);
        this.d.a("l", "10");
        this.d.a("ie", "utf-8");
        this.d.a("oue", "1");
        this.d.a(UriUtil.LOCAL_RESOURCE_SCHEME, "api");
        this.d.a("fromproduct", "android_map_sdk");
        this.d.a("uid", str);
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.j();
    }
}
