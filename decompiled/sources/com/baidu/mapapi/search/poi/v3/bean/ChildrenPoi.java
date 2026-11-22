package com.baidu.mapapi.search.poi.v3.bean;

import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;

/* loaded from: classes13.dex */
public class ChildrenPoi extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi子点ID", name = "uid")
    private String f8136a;

    @Properties(desc = "poi子点简称", name = "show_name")
    private String b;

    @Properties(desc = "poi子点全称", name = "name")
    private String c;

    @Properties(desc = "poi子点分类标签", name = "classified_poi_tag")
    private String d;

    @Properties(desc = "poi子点坐标", name = "location")
    private String e;

    @Properties(desc = "poi子点地址", name = Const.JSON_KEY_ADDRESS)
    private String f;

    public String getAddress() {
        return this.f;
    }

    public String getClassifiedPoiTag() {
        return this.d;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.e);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(",");
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.c;
    }

    public String getShowName() {
        return this.b;
    }

    public String getUid() {
        return this.f8136a;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    public void setClassifiedPoiTag(String str) {
        this.d = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.e = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.c = str;
    }

    public void setShowName(String str) {
        this.b = str;
    }

    public void setUid(String str) {
        this.f8136a = str;
    }
}
