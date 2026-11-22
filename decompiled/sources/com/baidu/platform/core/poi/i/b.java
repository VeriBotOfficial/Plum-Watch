package com.baidu.platform.core.poi.i;

import com.baidu.mapapi.http.wrapper.AsyncResponse;
import com.baidu.mapapi.http.wrapper.annotation.GET;
import com.baidu.mapapi.http.wrapper.annotation.QueryString;
import com.baidu.mapapi.search.poi.v3.bean.AroundRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.DetailRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.PoiResponse;
import com.baidu.mapapi.search.poi.v3.bean.PolygonRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.RegionRequestParams;
import com.baidu.mapapi.search.poi.v3.bean.SugResponse;
import com.baidu.mapapi.search.poi.v3.bean.SuggestionRequestParams;
import java.util.Map;

/* compiled from: PoiSearchApi.java */
/* loaded from: classes13.dex */
public interface b {
    @GET("/place/v3/around")
    AsyncResponse<PoiResponse> a(@QueryString AroundRequestParams aroundRequestParams, @QueryString Map<String, String> map);

    @GET("/place/v3/detail")
    AsyncResponse<PoiResponse> a(@QueryString DetailRequestParams detailRequestParams, @QueryString Map<String, String> map);

    @GET("/place/v3/polygon")
    AsyncResponse<PoiResponse> a(@QueryString PolygonRequestParams polygonRequestParams, @QueryString Map<String, String> map);

    @GET("/place/v3/region")
    AsyncResponse<PoiResponse> a(@QueryString RegionRequestParams regionRequestParams, @QueryString Map<String, String> map);

    @GET("/place/v3/suggestion")
    AsyncResponse<SugResponse> a(@QueryString SuggestionRequestParams suggestionRequestParams, @QueryString Map<String, String> map);
}
