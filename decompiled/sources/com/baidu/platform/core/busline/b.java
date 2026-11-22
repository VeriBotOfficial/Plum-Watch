package com.baidu.platform.core.busline;

import android.text.TextUtils;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.busline.BusLineSearchOption;

/* compiled from: BusLineRequest.java */
/* loaded from: classes13.dex */
public class b extends com.baidu.platform.base.c {
    public b(BusLineSearchOption busLineSearchOption) {
        a(busLineSearchOption);
    }

    private void a(BusLineSearchOption busLineSearchOption) {
        this.d.a("uid", busLineSearchOption.mUid);
        if (!TextUtils.isEmpty(busLineSearchOption.mStartUid)) {
            this.d.a("suid", busLineSearchOption.mStartUid);
        }
        if (!TextUtils.isEmpty(busLineSearchOption.mEndUid)) {
            this.d.a("euid", busLineSearchOption.mEndUid);
        }
        if (busLineSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.d.a("language", "en");
        }
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            this.d.a("ret_coordtype", "gcj02ll");
        } else {
            this.d.a("ret_coordtype", "bd09ll");
        }
        Integer num = busLineSearchOption.mCity;
        if (num != null) {
            this.d.a("city_id", num.toString());
        }
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.d();
    }
}
