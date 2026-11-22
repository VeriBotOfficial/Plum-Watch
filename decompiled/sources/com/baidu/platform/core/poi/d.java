package com.baidu.platform.core.poi;

import android.util.Log;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.poi.PoiDetailSearchOption;
import com.baidu.mapapi.search.poi.PoiServerType;
import com.tencent.connect.common.Constants;
import io.livekit.android.room.util.MediaConstraintKeys;

/* compiled from: PoiDetailSearchRequest.java */
/* loaded from: classes13.dex */
public class d extends com.baidu.platform.base.c {
    private PoiServerType e = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    d(PoiDetailSearchOption poiDetailSearchOption) {
        a(poiDetailSearchOption);
    }

    private void a(PoiDetailSearchOption poiDetailSearchOption) {
        if (poiDetailSearchOption == null) {
            Log.e("d", "Option is null");
            return;
        }
        this.e = poiDetailSearchOption.mServerType;
        if (!poiDetailSearchOption.isSearchByUids()) {
            poiDetailSearchOption.poiUids(poiDetailSearchOption.getUid());
        }
        if (poiDetailSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.d.a("language", "en");
        }
        com.baidu.platform.util.a aVar = this.d;
        boolean isShowPhoto = poiDetailSearchOption.isShowPhoto();
        String str = MediaConstraintKeys.TRUE;
        aVar.a("photo_show", isShowPhoto ? MediaConstraintKeys.TRUE : "false");
        this.d.a("uids", poiDetailSearchOption.getUids());
        com.baidu.platform.util.a aVar2 = this.d;
        if (!poiDetailSearchOption.isExtendAdcode()) {
            str = "false";
        }
        aVar2.a("extensions_adcode", str);
        this.d.a("output", BodyData.TYPE_JSON);
        this.d.a(Constants.PARAM_SCOPE, "2");
    }

    @Override // com.baidu.platform.base.c
    public String a(com.baidu.platform.domain.c cVar) {
        if (this.e == PoiServerType.POI_SERVER_TYPE_ABROAD) {
            return cVar.n();
        }
        return cVar.o();
    }
}
