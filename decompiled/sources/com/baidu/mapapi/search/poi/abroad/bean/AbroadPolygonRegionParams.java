package com.baidu.mapapi.search.poi.abroad.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.abroad.AbroadPlacePolygonRegionOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class AbroadPolygonRegionParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "query")
    private String f8125a;

    @Properties(name = "bounds")
    private String b;

    @Properties(desc = "开发者密钥", name = "token")
    private String c;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String d;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long e;

    @Properties(name = "tag")
    private String l;

    @Properties(name = "type")
    private String m;

    @Properties(name = "filter")
    private String n;

    @Properties(name = "coordtype")
    private String f = "bd09ll";

    @Properties(name = "ret_coordtype")
    private String g = "bd09ll";

    @Properties(name = Constants.PARAM_SCOPE)
    private int h = 1;

    @Properties(name = "page_size")
    private int i = 10;

    @Properties(name = "page_num")
    private int j = 0;

    @Properties(name = "output")
    private String k = BodyData.TYPE_JSON;

    @Properties(name = "city_limit")
    private String o = "false";

    public void apply(AbroadPlacePolygonRegionOption abroadPlacePolygonRegionOption) {
        if (abroadPlacePolygonRegionOption != null) {
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getQuery())) {
                setQuery(abroadPlacePolygonRegionOption.getQuery());
            }
            if (abroadPlacePolygonRegionOption.getBounds() != null && abroadPlacePolygonRegionOption.getBounds().first != null && abroadPlacePolygonRegionOption.getBounds().second != null) {
                setBounds(((LatLng) abroadPlacePolygonRegionOption.getBounds().first).latitude + "," + ((LatLng) abroadPlacePolygonRegionOption.getBounds().first).longitude + "," + ((LatLng) abroadPlacePolygonRegionOption.getBounds().second).latitude + "," + ((LatLng) abroadPlacePolygonRegionOption.getBounds().second).longitude);
            }
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getCoordtype())) {
                setCoordtype(abroadPlacePolygonRegionOption.getCoordtype());
            }
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getRetCoordtype())) {
                setRetCoordtype(abroadPlacePolygonRegionOption.getRetCoordtype());
            }
            setScope(abroadPlacePolygonRegionOption.getScope());
            setPageSize(abroadPlacePolygonRegionOption.getPageSize());
            setPageNum(abroadPlacePolygonRegionOption.getPageNum());
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getTag())) {
                setTag(abroadPlacePolygonRegionOption.getTag());
            }
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getType())) {
                setType(abroadPlacePolygonRegionOption.getType());
            }
            if (!TextUtils.isEmpty(abroadPlacePolygonRegionOption.getFilter())) {
                setFilter(abroadPlacePolygonRegionOption.getFilter());
            }
            if (TextUtils.isEmpty(abroadPlacePolygonRegionOption.getCityLimit())) {
                return;
            }
            setCityLimit(abroadPlacePolygonRegionOption.getCityLimit());
        }
    }

    public String getBounds() {
        return this.b;
    }

    public String getCityLimit() {
        return this.o;
    }

    public String getCoordtype() {
        return this.f;
    }

    public String getFilter() {
        return this.n;
    }

    public String getOutput() {
        return this.k;
    }

    public int getPageNum() {
        return this.j;
    }

    public int getPageSize() {
        return this.i;
    }

    public String getQuery() {
        return this.f8125a;
    }

    public String getRetCoordtype() {
        return this.g;
    }

    public int getScope() {
        return this.h;
    }

    public String getSign() {
        return this.d;
    }

    public String getTag() {
        return this.l;
    }

    public Long getTimestamp() {
        return this.e;
    }

    public String getToken() {
        return this.c;
    }

    public String getType() {
        return this.m;
    }

    public void setBounds(String str) {
        this.b = str;
    }

    public void setCityLimit(String str) {
        this.o = str;
    }

    public void setCoordtype(String str) {
        this.f = str;
    }

    public void setFilter(String str) {
        this.n = str;
    }

    public void setOutput(String str) {
        this.k = str;
    }

    public void setPageNum(int i) {
        this.j = i;
    }

    public void setPageSize(int i) {
        this.i = i;
    }

    public void setQuery(String str) {
        this.f8125a = str;
    }

    public void setRetCoordtype(String str) {
        this.g = str;
    }

    public void setScope(int i) {
        this.h = i;
    }

    public void setSign(String str) {
        this.d = str;
    }

    public void setTag(String str) {
        this.l = str;
    }

    public void setTimestamp(Long l) {
        this.e = l;
    }

    public void setToken(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.m = str;
    }
}
