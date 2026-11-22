package com.baidu.mapapi.search.poi.abroad.bean;

import a.a.a.a.a.b.a;
import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.wakeup.common.burypoint.BuryPointPageId;

/* loaded from: classes13.dex */
public class AbroadPlaceResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f8121a;

    @Properties(name = Const.JSON_KEY_ADDRESS)
    private String b;

    @Properties(name = "telephone")
    private String c;

    @Properties(name = "uid")
    private String d;

    @Properties(name = BuryPointPageId.PAGE_ID_PLAN_DETAIL)
    private int e;

    @Properties(name = "street_id")
    private String f;

    @Properties(name = "status")
    private String g;

    @Properties(name = "formatted_address")
    private String h;

    @Properties(name = "country")
    private String i;

    @Properties(name = "province")
    private String j;

    @Properties(name = "city")
    private String k;

    @Properties(name = "district")
    private String l;

    @Properties(name = "town")
    private String m;

    @Properties(name = Const.JSON_KEY_STREET)
    private String n;

    @Properties(name = "detail_info")
    private AbroadPlaceDetailInfo o;

    public String getAddress() {
        return this.b;
    }

    public String getCity() {
        return this.k;
    }

    public String getCountry() {
        return this.i;
    }

    public int getDetail() {
        return this.e;
    }

    public AbroadPlaceDetailInfo getDetailInfo() {
        return this.o;
    }

    public String getDistrict() {
        return this.l;
    }

    public String getFormattedAddress() {
        return this.h;
    }

    public LatLng getLocation() {
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            throw null;
        }
        throw null;
    }

    public String getName() {
        return this.f8121a;
    }

    public String getProvince() {
        return this.j;
    }

    public String getStatus() {
        return this.g;
    }

    public String getStreet() {
        return this.n;
    }

    public String getStreetId() {
        return this.f;
    }

    public String getTelephone() {
        return this.c;
    }

    public String getTown() {
        return this.m;
    }

    public String getUid() {
        return this.d;
    }

    public void setAddress(String str) {
        this.b = str;
    }

    public void setCity(String str) {
        this.k = str;
    }

    public void setCountry(String str) {
        this.i = str;
    }

    public void setDetail(int i) {
        this.e = i;
    }

    public void setDetailInfo(AbroadPlaceDetailInfo abroadPlaceDetailInfo) {
        this.o = abroadPlaceDetailInfo;
    }

    public void setDistrict(String str) {
        this.l = str;
    }

    public void setFormattedAddress(String str) {
        this.h = str;
    }

    public void setLocation(a aVar) {
    }

    public void setName(String str) {
        this.f8121a = str;
    }

    public void setProvince(String str) {
        this.j = str;
    }

    public void setStatus(String str) {
        this.g = str;
    }

    public void setStreet(String str) {
        this.n = str;
    }

    public void setStreetId(String str) {
        this.f = str;
    }

    public void setTelephone(String str) {
        this.c = str;
    }

    public void setTown(String str) {
        this.m = str;
    }

    public void setUid(String str) {
        this.d = str;
    }
}
