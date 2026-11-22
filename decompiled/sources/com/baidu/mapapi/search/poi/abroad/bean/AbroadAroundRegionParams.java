package com.baidu.mapapi.search.poi.abroad.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceAroundRegionOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class AbroadAroundRegionParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "query")
    private String f8113a;

    @Properties(name = "location")
    private String b;

    @Properties(desc = "开发者密钥", name = "token")
    private String c;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String d;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long e;

    @Properties(name = "tag")
    private String n;

    @Properties(name = "type")
    private String o;

    @Properties(name = "filter")
    private String p;

    @Properties(name = "radius")
    private int f = 1000;

    @Properties(name = "radius_limit")
    private String g = "false";

    @Properties(name = "coordtype")
    private String h = "bd09ll";

    @Properties(name = "ret_coordtype")
    private String i = "bd09ll";

    @Properties(name = Constants.PARAM_SCOPE)
    private int j = 1;

    @Properties(name = "page_size")
    private int k = 10;

    @Properties(name = "page_num")
    private int l = 0;

    @Properties(name = "output")
    private String m = BodyData.TYPE_JSON;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "city_limit")
    private String f8114q = "false";

    public void apply(AbroadPlaceAroundRegionOption abroadPlaceAroundRegionOption) {
        if (abroadPlaceAroundRegionOption != null) {
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getQuery())) {
                setQuery(abroadPlaceAroundRegionOption.getQuery());
            }
            if (abroadPlaceAroundRegionOption.getLocation() != null) {
                setLocation(abroadPlaceAroundRegionOption.getLocation().latitude + "," + abroadPlaceAroundRegionOption.getLocation().longitude);
            }
            setRadius(abroadPlaceAroundRegionOption.getRadius());
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getRadiusLimit())) {
                setRadiusLimit(abroadPlaceAroundRegionOption.getRadiusLimit());
            }
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getCoordtype())) {
                setCoordtype(abroadPlaceAroundRegionOption.getCoordtype());
            }
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getRetCoordtype())) {
                setRetCoordtype(abroadPlaceAroundRegionOption.getRetCoordtype());
            }
            setScope(abroadPlaceAroundRegionOption.getScope());
            setPageSize(abroadPlaceAroundRegionOption.getPageSize());
            setPageNum(abroadPlaceAroundRegionOption.getPageNum());
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getTag())) {
                setTag(abroadPlaceAroundRegionOption.getTag());
            }
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getType())) {
                setType(abroadPlaceAroundRegionOption.getType());
            }
            if (!TextUtils.isEmpty(abroadPlaceAroundRegionOption.getFilter())) {
                setFilter(abroadPlaceAroundRegionOption.getFilter());
            }
            if (TextUtils.isEmpty(abroadPlaceAroundRegionOption.getCityLimit())) {
                return;
            }
            setCityLimit(abroadPlaceAroundRegionOption.getCityLimit());
        }
    }

    public String getCityLimit() {
        return this.f8114q;
    }

    public String getCoordtype() {
        return this.h;
    }

    public String getFilter() {
        return this.p;
    }

    public String getLocation() {
        return this.b;
    }

    public String getOutput() {
        return this.m;
    }

    public int getPageNum() {
        return this.l;
    }

    public int getPageSize() {
        return this.k;
    }

    public String getQuery() {
        return this.f8113a;
    }

    public int getRadius() {
        return this.f;
    }

    public String getRadiusLimit() {
        return this.g;
    }

    public String getRetCoordtype() {
        return this.i;
    }

    public int getScope() {
        return this.j;
    }

    public String getSign() {
        return this.d;
    }

    public String getTag() {
        return this.n;
    }

    public Long getTimestamp() {
        return this.e;
    }

    public String getToken() {
        return this.c;
    }

    public String getType() {
        return this.o;
    }

    public void setCityLimit(String str) {
        this.f8114q = str;
    }

    public void setCoordtype(String str) {
        this.h = str;
    }

    public void setFilter(String str) {
        this.p = str;
    }

    public void setLocation(String str) {
        this.b = str;
    }

    public void setOutput(String str) {
        this.m = str;
    }

    public void setPageNum(int i) {
        this.l = i;
    }

    public void setPageSize(int i) {
        this.k = i;
    }

    public void setQuery(String str) {
        this.f8113a = str;
    }

    public void setRadius(int i) {
        this.f = i;
    }

    public void setRadiusLimit(String str) {
        this.g = str;
    }

    public void setRetCoordtype(String str) {
        this.i = str;
    }

    public void setScope(int i) {
        this.j = i;
    }

    public void setSign(String str) {
        this.d = str;
    }

    public void setTag(String str) {
        this.n = str;
    }

    public void setTimestamp(Long l) {
        this.e = l;
    }

    public void setToken(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.o = str;
    }
}
