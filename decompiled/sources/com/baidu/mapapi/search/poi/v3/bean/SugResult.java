package com.baidu.mapapi.search.poi.v3.bean;

import com.autonavi.aps.amapapi.config.Const;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.List;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class SugResult extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi名称", name = "name")
    private String f8148a;

    @Properties(desc = "poi经纬度坐标", name = "location")
    private String b;

    @Properties(desc = "poi的唯一标示", name = "uid")
    private String c;

    @Properties(desc = "poi所属省份", name = "province")
    private String d;

    @Properties(desc = "poi所属城市", name = "city")
    private String e;

    @Properties(name = "district")
    private String f;

    @Properties(desc = "poi所属乡镇街道", name = "town")
    private String g;

    @Properties(desc = "poi所属乡镇街道编码", name = "town_code")
    private int h;

    @Properties(desc = "poi所属区域代码", name = Const.JSON_KEY_ADCODE)
    private int i;

    @Properties(desc = "poi所在地址", name = Const.JSON_KEY_ADDRESS)
    private String j;

    @Properties(desc = "poi分类标签", name = "tag")
    private String k;

    @Properties(desc = "poi子点", name = DOMConstants.TAG_CHILDREN)
    private List<ChildrenPoi> l;

    public int getAdcode() {
        return this.i;
    }

    public String getAddress() {
        return this.j;
    }

    public List<ChildrenPoi> getChildren() {
        return this.l;
    }

    public String getCity() {
        return this.e;
    }

    public String getDistrict() {
        return this.f;
    }

    public LatLng getLocation() {
        String decodeCoordHash = AppMD5.decodeCoordHash(this.b);
        if (decodeCoordHash.isEmpty()) {
            return null;
        }
        String[] split = decodeCoordHash.split(",");
        return new LatLng(Double.parseDouble(split[1]), Double.parseDouble(split[0]));
    }

    public String getName() {
        return this.f8148a;
    }

    public String getProvince() {
        return this.d;
    }

    public String getTag() {
        return this.k;
    }

    public String getTown() {
        return this.g;
    }

    public int getTownCode() {
        return this.h;
    }

    public String getUid() {
        return this.c;
    }

    public void setAdcode(int i) {
        this.i = i;
    }

    public void setAddress(String str) {
        this.j = str;
    }

    public void setChildren(List<ChildrenPoi> list) {
        this.l = list;
    }

    public void setCity(String str) {
        this.e = str;
    }

    public void setDistrict(String str) {
        this.f = str;
    }

    public void setLocation(LatLng latLng) {
        if (latLng != null) {
            this.b = AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude);
        }
    }

    public void setName(String str) {
        this.f8148a = str;
    }

    public void setProvince(String str) {
        this.d = str;
    }

    public void setTag(String str) {
        this.k = str;
    }

    public void setTown(String str) {
        this.g = str;
    }

    public void setTownCode(int i) {
        this.h = i;
    }

    public void setUid(String str) {
        this.c = str;
    }
}
