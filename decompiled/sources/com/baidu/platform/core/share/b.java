package com.baidu.platform.core.share;

import com.baidu.mapapi.http.HttpClient;
import com.baidu.mapapi.search.share.PoiDetailShareURLOption;

/* compiled from: PoiDetailShareRequest.java */
/* loaded from: classes13.dex */
public class b extends com.baidu.platform.base.c {
    public b(PoiDetailShareURLOption poiDetailShareURLOption) {
        a(poiDetailShareURLOption);
    }

    private void a(PoiDetailShareURLOption poiDetailShareURLOption) {
        this.d.a("url", ("https://wapmap.baidu.com/s?tn=Detail&pid=" + poiDetailShareURLOption.mUid + "&smsf=3") + HttpClient.getPhoneInfo());
        b(false);
        a(false);
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.k();
    }
}
