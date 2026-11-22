package com.baidu.mapapi.search.poi.abroad.bean;

import a.a.a.a.a.b.a;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class AbroadPlaceSuggestResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f8124a;

    @Properties(name = "uid")
    private String b;

    @Properties(name = "city")
    private String c;

    @Properties(name = "district")
    private String d;

    @Properties(name = "business")
    private String e;

    @Properties(name = "cityid")
    private String f;

    @Properties(name = "tag")
    private String g;

    @Properties(name = Const.JSON_KEY_ADDRESS)
    private String h;

    public String getAddress() {
        return this.h;
    }

    public String getBusiness() {
        return this.e;
    }

    public String getCity() {
        return this.c;
    }

    public String getCityid() {
        return this.f;
    }

    public String getDistrict() {
        return this.d;
    }

    public LatLng getLocation() {
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            throw null;
        }
        throw null;
    }

    public String getName() {
        return this.f8124a;
    }

    public String getTag() {
        return this.g;
    }

    public String getUid() {
        return this.b;
    }

    public void setAddress(String str) {
        this.h = str;
    }

    public void setBusiness(String str) {
        this.e = str;
    }

    public void setCity(String str) {
        this.c = str;
    }

    public void setCityid(String str) {
        this.f = str;
    }

    public void setDistrict(String str) {
        this.d = str;
    }

    public void setLocation(a aVar) {
    }

    public void setName(String str) {
        this.f8124a = str;
    }

    public void setTag(String str) {
        this.g = str;
    }

    public void setUid(String str) {
        this.b = str;
    }
}
