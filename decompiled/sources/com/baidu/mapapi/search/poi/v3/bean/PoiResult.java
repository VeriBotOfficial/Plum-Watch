package com.baidu.mapapi.search.poi.v3.bean;

import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.wakeup.common.burypoint.BuryPointPageId;

/* loaded from: classes13.dex */
public class PoiResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi的唯一标示", name = "uid")
    private String f8141a;

    @Properties(desc = "poi名称", name = "name")
    private String b;

    @Properties(desc = "poi经纬度坐标", name = "location")
    private String c;

    @Properties(desc = "poi所属省份", name = "province")
    private String d;

    @Properties(desc = "poi所属城市", name = "city")
    private String e;

    @Properties(desc = "poi所属区县", name = "area")
    private String f;

    @Properties(desc = "poi所属乡镇街道", name = "town")
    private String g;

    @Properties(desc = "poi所属乡镇街道编码", name = "town_code")
    private int h;

    @Properties(desc = "poi所属区域代码", name = Const.JSON_KEY_ADCODE)
    private int i;

    @Properties(desc = "poi所属商圈", name = "business")
    private String j;

    @Properties(desc = "poi所在地址", name = Const.JSON_KEY_ADDRESS)
    private String k;

    @Properties(desc = "poi营业状态", name = "status")
    private String l;

    @Properties(desc = "poi的电话", name = "telephone")
    private String m;

    @Properties(desc = "poi所在街景图id", name = "street_id")
    private String n;

    @Properties(desc = "是否有详情页", name = BuryPointPageId.PAGE_ID_PLAN_DETAIL)
    private String o;

    @Properties(desc = "详细信息", name = "detail_info")
    private PoiDetailInfo p;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "poi分类标签", name = "tag")
    private String f8142q;

    @Properties(name = "district")
    private String r;

    public int getAdcode() {
        return this.i;
    }

    public String getAddress() {
        return this.k;
    }

    public String getArea() {
        return this.f;
    }

    public String getBusiness() {
        return this.j;
    }

    public String getCity() {
        return this.e;
    }

    public String getDetail() {
        return this.o;
    }

    public PoiDetailInfo getDetailInfo() {
        return this.p;
    }

    public String getDistrict() {
        return this.r;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.c);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(",");
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.b;
    }

    public String getProvince() {
        return this.d;
    }

    public String getStatus() {
        return this.l;
    }

    public String getStreetId() {
        return this.n;
    }

    public String getTag() {
        return this.f8142q;
    }

    public String getTelephone() {
        return this.m;
    }

    public String getTown() {
        return this.g;
    }

    public int getTownCode() {
        return this.h;
    }

    public String getUid() {
        return this.f8141a;
    }

    public void setAdcode(int i) {
        this.i = i;
    }

    public void setAddress(String str) {
        this.k = str;
    }

    public void setArea(String str) {
        this.f = str;
    }

    public void setBusiness(String str) {
        this.j = str;
    }

    public void setCity(String str) {
        this.e = str;
    }

    public void setDetail(String str) {
        this.o = str;
    }

    public void setDetailInfo(PoiDetailInfo poiDetailInfo) {
        this.p = poiDetailInfo;
    }

    public void setDistrict(String str) {
        this.r = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.c = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.b = str;
    }

    public void setProvince(String str) {
        this.d = str;
    }

    public void setStatus(String str) {
        this.l = str;
    }

    public void setStreetId(String str) {
        this.n = str;
    }

    public void setTag(String str) {
        this.f8142q = str;
    }

    public void setTelephone(String str) {
        this.m = str;
    }

    public void setTown(String str) {
        this.g = str;
    }

    public void setTownCode(int i) {
        this.h = i;
    }

    public void setUid(String str) {
        this.f8141a = str;
    }
}
