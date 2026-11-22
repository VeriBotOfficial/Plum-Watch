package com.baidu.mapapi.search.poi.abroad.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceSuggestOption;

/* loaded from: classes13.dex */
public class AbroadPlaceSuggestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "query")
    private String f8122a;

    @Properties(desc = "开发者密钥", name = "token")
    private String b;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String c;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long d;

    @Properties(name = "region")
    private String e;

    @Properties(name = "location")
    private String f;

    @Properties(name = "bounds")
    private String g;

    @Properties(name = "coord_type")
    private String h = "3";

    @Properties(name = "radius")
    private int i = 1000;

    @Properties(name = "city_limit")
    private String j = "false";

    @Properties(name = "output")
    private String k = BodyData.TYPE_JSON;

    public void apply(AbroadPlaceSuggestOption abroadPlaceSuggestOption) {
        if (abroadPlaceSuggestOption != null) {
            if (!TextUtils.isEmpty(abroadPlaceSuggestOption.getQuery())) {
                setQuery(abroadPlaceSuggestOption.getQuery());
            }
            if (!TextUtils.isEmpty(abroadPlaceSuggestOption.getRegion())) {
                setRegion(abroadPlaceSuggestOption.getRegion());
            }
            if (abroadPlaceSuggestOption.getLocation() != null) {
                setLocation(abroadPlaceSuggestOption.getLocation().latitude + "," + abroadPlaceSuggestOption.getLocation().longitude);
            }
            if (abroadPlaceSuggestOption.getBounds() != null && abroadPlaceSuggestOption.getBounds().first != null && abroadPlaceSuggestOption.getBounds().second != null) {
                setBounds(((LatLng) abroadPlaceSuggestOption.getBounds().first).latitude + "," + ((LatLng) abroadPlaceSuggestOption.getBounds().first).longitude + "," + ((LatLng) abroadPlaceSuggestOption.getBounds().second).latitude + "," + ((LatLng) abroadPlaceSuggestOption.getBounds().second).longitude);
            }
            if (!TextUtils.isEmpty(abroadPlaceSuggestOption.getCoordType())) {
                setCoordType(abroadPlaceSuggestOption.getCoordType());
            }
            setRadius(abroadPlaceSuggestOption.getRadius());
            if (TextUtils.isEmpty(abroadPlaceSuggestOption.getCityLimit())) {
                return;
            }
            setCityLimit(abroadPlaceSuggestOption.getCityLimit());
        }
    }

    public String getBounds() {
        return this.g;
    }

    public String getCityLimit() {
        return this.j;
    }

    public String getCoordType() {
        return this.h;
    }

    public String getLocation() {
        return this.f;
    }

    public String getOutput() {
        return this.k;
    }

    public String getQuery() {
        return this.f8122a;
    }

    public int getRadius() {
        return this.i;
    }

    public String getRegion() {
        return this.e;
    }

    public String getSign() {
        return this.c;
    }

    public Long getTimestamp() {
        return this.d;
    }

    public String getToken() {
        return this.b;
    }

    public void setBounds(String str) {
        this.g = str;
    }

    public void setCityLimit(String str) {
        this.j = str;
    }

    public void setCoordType(String str) {
        this.h = str;
    }

    public void setLocation(String str) {
        this.f = str;
    }

    public void setOutput(String str) {
        this.k = str;
    }

    public void setQuery(String str) {
        this.f8122a = str;
    }

    public void setRadius(int i) {
        this.i = i;
    }

    public void setRegion(String str) {
        this.e = str;
    }

    public void setSign(String str) {
        this.c = str;
    }

    public void setTimestamp(Long l) {
        this.d = l;
    }

    public void setToken(String str) {
        this.b = str;
    }
}
