package com.baidu.platform.core.geocode;

import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.geocode.GeoCodeOption;

/* compiled from: GeoCoderRequest.java */
/* loaded from: classes13.dex */
public class c extends com.baidu.platform.base.c {
    public c(GeoCodeOption geoCodeOption) {
        a(geoCodeOption);
    }

    private void a(GeoCodeOption geoCodeOption) {
        this.d.a("city", geoCodeOption.mCity);
        this.d.a(Const.JSON_KEY_ADDRESS, geoCodeOption.mAddress);
        this.d.a("output", BodyData.TYPE_JSON);
        this.d.a("ret_coordtype", "bd09ll");
        this.d.a("from", "android_map_sdk");
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.h();
    }
}
