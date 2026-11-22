package com.baidu.mapapi.search.poi.abroad.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceAdministrativeRegionOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class AbroadAdministrativeRegionParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "query")
    private String f8111a;

    @Properties(name = "region")
    private String b;

    @Properties(desc = "开发者密钥", name = "token")
    private String c;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String d;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long e;

    @Properties(name = "type")
    private String f;

    @Properties(name = "tag")
    private String g;

    @Properties(name = Constants.PARAM_SCOPE)
    private int h = 1;

    @Properties(name = "page_size")
    private int i = 10;

    @Properties(name = "page_num")
    private int j = 0;

    @Properties(name = "output")
    private String k = BodyData.TYPE_JSON;

    @Properties(name = "city_limit")
    private String l = "false";

    @Properties(name = "coord_type")
    private int m = 3;

    @Properties(name = "ret_coordtype")
    private String n;

    @Properties(name = "filter")
    private String o;

    @Properties(name = "illegal")
    private String p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(name = "homonym")
    private String f8112q;

    public void apply(AbroadPlaceAdministrativeRegionOption abroadPlaceAdministrativeRegionOption) {
        if (abroadPlaceAdministrativeRegionOption != null) {
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getQuery())) {
                setQuery(abroadPlaceAdministrativeRegionOption.getQuery());
            }
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getRegion())) {
                setRegion(abroadPlaceAdministrativeRegionOption.getRegion());
            }
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getType())) {
                setType(abroadPlaceAdministrativeRegionOption.getType());
            }
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getTag())) {
                setTag(abroadPlaceAdministrativeRegionOption.getTag());
            }
            setScope(abroadPlaceAdministrativeRegionOption.getScope());
            setPageSize(abroadPlaceAdministrativeRegionOption.getPageSize());
            setPageNum(abroadPlaceAdministrativeRegionOption.getPageNum());
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getCityLimit())) {
                setCityLimit(abroadPlaceAdministrativeRegionOption.getCityLimit());
            }
            setCoordType(abroadPlaceAdministrativeRegionOption.getCoordType());
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getRetCoordtype())) {
                setRetCoordtype(abroadPlaceAdministrativeRegionOption.getRetCoordtype());
            }
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getFilter())) {
                setFilter(abroadPlaceAdministrativeRegionOption.getFilter());
            }
            if (!TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getIllegal())) {
                setIllegal(abroadPlaceAdministrativeRegionOption.getIllegal());
            }
            if (TextUtils.isEmpty(abroadPlaceAdministrativeRegionOption.getHomonym())) {
                return;
            }
            setHomonym(abroadPlaceAdministrativeRegionOption.getHomonym());
        }
    }

    public String getCityLimit() {
        return this.l;
    }

    public int getCoordType() {
        return this.m;
    }

    public String getFilter() {
        return this.o;
    }

    public String getHomonym() {
        return this.f8112q;
    }

    public String getIllegal() {
        return this.p;
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
        return this.f8111a;
    }

    public String getRegion() {
        return this.b;
    }

    public String getRetCoordtype() {
        return this.n;
    }

    public int getScope() {
        return this.h;
    }

    public String getSign() {
        return this.d;
    }

    public String getTag() {
        return this.g;
    }

    public Long getTimestamp() {
        return this.e;
    }

    public String getToken() {
        return this.c;
    }

    public String getType() {
        return this.f;
    }

    public void setCityLimit(String str) {
        this.l = str;
    }

    public void setCoordType(int i) {
        this.m = i;
    }

    public void setFilter(String str) {
        this.o = str;
    }

    public void setHomonym(String str) {
        this.f8112q = str;
    }

    public void setIllegal(String str) {
        this.p = str;
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
        this.f8111a = str;
    }

    public void setRegion(String str) {
        this.b = str;
    }

    public void setRetCoordtype(String str) {
        this.n = str;
    }

    public void setScope(int i) {
        this.h = i;
    }

    public void setSign(String str) {
        this.d = str;
    }

    public void setTag(String str) {
        this.g = str;
    }

    public void setTimestamp(Long l) {
        this.e = l;
    }

    public void setToken(String str) {
        this.c = str;
    }

    public void setType(String str) {
        this.f = str;
    }
}
