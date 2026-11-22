package com.baidu.mapapi.search.poi.abroad;

import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceDetailResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceSuggestResponse;
import com.baidu.platform.core.poi.h.a;

/* loaded from: classes13.dex */
public interface IAbroadPlaceSearch {
    static IAbroadPlaceSearch getInstance() {
        return a.a();
    }

    void searchAbroadAdministrativeRegionPlace(AbroadPlaceAdministrativeRegionOption abroadPlaceAdministrativeRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar);

    void searchAbroadAroundRegionPlace(AbroadPlaceAroundRegionOption abroadPlaceAroundRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar);

    void searchAbroadPlaceDetail(AbroadPlaceDetailOption abroadPlaceDetailOption, a.a.a.a.a.a<AbroadPlaceDetailResponse> aVar);

    void searchAbroadPlaceSuggestion(AbroadPlaceSuggestOption abroadPlaceSuggestOption, a.a.a.a.a.a<AbroadPlaceSuggestResponse> aVar);

    void searchAbroadPolygonRegionPlace(AbroadPlacePolygonRegionOption abroadPlacePolygonRegionOption, a.a.a.a.a.a<AbroadPlaceResponse> aVar);
}
