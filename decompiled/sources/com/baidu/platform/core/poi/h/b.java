package com.baidu.platform.core.poi.h;

import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.annotation.GET;
import com.baidu.mapapi.http.wrapper.annotation.QueryString;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadAdministrativeRegionParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadAroundRegionParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceDetailParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceDetailResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceSuggestParams;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPlaceSuggestResponse;
import com.baidu.mapapi.search.poi.abroad.bean.AbroadPolygonRegionParams;
import java.util.Map;

/* compiled from: PlaceAbroadApi.java */
/* loaded from: classes13.dex */
public interface b {
    @GET("/place_abroad/v1/search")
    AsyncResponse<AbroadPlaceResponse> a(@QueryString AbroadAdministrativeRegionParams abroadAdministrativeRegionParams, @QueryString Map<String, String> map);

    @GET("/place_abroad/v1/search")
    AsyncResponse<AbroadPlaceResponse> a(@QueryString AbroadAroundRegionParams abroadAroundRegionParams, @QueryString Map<String, String> map);

    @GET("/place_abroad/v1/detail")
    AsyncResponse<AbroadPlaceDetailResponse> a(@QueryString AbroadPlaceDetailParams abroadPlaceDetailParams, @QueryString Map<String, String> map);

    @GET("/place_abroad/v1/suggestion")
    AsyncResponse<AbroadPlaceSuggestResponse> a(@QueryString AbroadPlaceSuggestParams abroadPlaceSuggestParams, @QueryString Map<String, String> map);

    @GET("/place_abroad/v1/search")
    AsyncResponse<AbroadPlaceResponse> a(@QueryString AbroadPolygonRegionParams abroadPolygonRegionParams, @QueryString Map<String, String> map);
}
