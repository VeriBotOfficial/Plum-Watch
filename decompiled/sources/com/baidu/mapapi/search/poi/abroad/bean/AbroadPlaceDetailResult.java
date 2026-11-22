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
public class AbroadPlaceDetailResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "name")
    private String f8119a;

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

    @Properties(name = "detail_info")
    private AbroadPlaceDetailInfo h;

    public String getAddress() {
        return this.b;
    }

    public int getDetail() {
        return this.e;
    }

    public AbroadPlaceDetailInfo getDetailInfo() {
        return this.h;
    }

    public LatLng getLocation() {
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            throw null;
        }
        throw null;
    }

    public String getName() {
        return this.f8119a;
    }

    public String getStatus() {
        return this.g;
    }

    public String getStreetId() {
        return this.f;
    }

    public String getTelephone() {
        return this.c;
    }

    public String getUid() {
        return this.d;
    }

    public void setAddress(String str) {
        this.b = str;
    }

    public void setDetail(int i) {
        this.e = i;
    }

    public void setDetailInfo(AbroadPlaceDetailInfo abroadPlaceDetailInfo) {
        this.h = abroadPlaceDetailInfo;
    }

    public void setLocation(a aVar) {
    }

    public void setName(String str) {
        this.f8119a = str;
    }

    public void setStatus(String str) {
        this.g = str;
    }

    public void setStreetId(String str) {
        this.f = str;
    }

    public void setTelephone(String str) {
        this.c = str;
    }

    public void setUid(String str) {
        this.d = str;
    }
}
