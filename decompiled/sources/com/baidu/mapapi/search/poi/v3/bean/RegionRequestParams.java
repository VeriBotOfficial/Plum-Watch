package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.RegionOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class RegionRequestParams extends BaseParams {

    @Properties(name = "tag")
    private String A;

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = "query")
    private String f8145a;

    @Properties(desc = "检索行政区划区域", name = "region")
    private String b;

    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String e;

    @Properties(desc = "传入poi坐标", name = "center")
    private String f;

    @Properties(desc = "检索排序条件", name = "filter")
    private String i;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f8146q;

    @Properties(desc = "开发者密钥", name = "token")
    private String s;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String t;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long u;

    @Properties(name = "view_distance")
    private int v;

    @Properties(name = "view_bound")
    private String w;

    @Properties(name = "search_bound")
    private String x;

    @Properties(name = "extensions_child_poi")
    private boolean y;

    @Properties(name = "homonym")
    private boolean z;

    @Properties(desc = "区域数据召回限制", name = "region_limit")
    private boolean c = false;

    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean d = false;

    @Properties(desc = "检索结果详细程度", name = Constants.PARAM_SCOPE)
    private int g = 1;

    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int h = 3;

    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean j = false;

    @Properties(desc = "query传入结构化地址", name = "address_result")
    private boolean k = false;

    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean l = false;

    @Properties(desc = "query的语言类型", name = "from_language")
    private String m = "zh";

    @Properties(desc = "多语言检索", name = "language")
    private String n = "zh";

    @Properties(desc = "分页页码", name = "page_num")
    private int o = 0;

    @Properties(desc = "单次召回的数量", name = "page_size")
    private int p = 10;

    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String r = BodyData.TYPE_JSON;

    @Properties(name = "ce")
    private final int B = 1;

    public void apply(RegionOption regionOption) {
        if (regionOption != null) {
            if (!TextUtils.isEmpty(regionOption.getQuery())) {
                setQuery(regionOption.getQuery());
            }
            if (!TextUtils.isEmpty(regionOption.getRegion())) {
                setRegion(regionOption.getRegion());
            }
            setRegionLimit(regionOption.isRegionLimit());
            setLightVersion(regionOption.isLightVersion());
            if (!TextUtils.isEmpty(regionOption.getType())) {
                setType(regionOption.getType());
            }
            if (regionOption.getCenter() != null) {
                setCenter(regionOption.getCenter().latitude + "," + regionOption.getCenter().longitude);
            }
            setScope(regionOption.getScope());
            setCoordType(regionOption.getCoordType());
            if (!TextUtils.isEmpty(regionOption.getFilter())) {
                setFilter(regionOption.getFilter());
            }
            setExtensionsAdcode(regionOption.isExtensionsAdcode());
            setAddressResult(regionOption.isAddressResult());
            setPhotoShow(regionOption.isPhotoShow());
            if (!TextUtils.isEmpty(regionOption.getFromLanguage())) {
                setFromLanguage(regionOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(regionOption.getLanguage())) {
                setLanguage(regionOption.getLanguage());
            }
            setPageNum(regionOption.getPageNum());
            setPageSize(regionOption.getPageSize());
            if (!TextUtils.isEmpty(regionOption.getRetCoordType())) {
                setRetCoordType(regionOption.getRetCoordType());
            }
            setViewDistance(regionOption.getViewDistance());
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            if (regionOption.getViewBound() != null && !regionOption.getViewBound().isEmpty()) {
                for (int i = 0; i < regionOption.getViewBound().size(); i++) {
                    LatLng latLng = regionOption.getViewBound().get(i);
                    sb.append(latLng.latitude).append(",").append(latLng.longitude).append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
            }
            if (regionOption.getSearchBound() != null && !regionOption.getSearchBound().isEmpty()) {
                for (int i2 = 0; i2 < regionOption.getSearchBound().size(); i2++) {
                    LatLng latLng2 = regionOption.getSearchBound().get(i2);
                    sb2.append(latLng2.latitude).append(",").append(latLng2.longitude).append(",");
                }
                sb2.deleteCharAt(sb2.length() - 1);
            }
            setViewBound(sb.toString());
            setSearchBound(sb2.toString());
            setExtensionsChildPoi(regionOption.isExtensionsChildPoi());
            setHomonym(regionOption.isHomonym());
            if (TextUtils.isEmpty(regionOption.getTag())) {
                return;
            }
            setTag(regionOption.getTag());
        }
    }

    public int getCe() {
        return 1;
    }

    public String getCenter() {
        return this.f;
    }

    public int getCoordType() {
        return this.h;
    }

    public String getFilter() {
        return this.i;
    }

    public String getFromLanguage() {
        return this.m;
    }

    public String getLanguage() {
        return this.n;
    }

    public String getOutput() {
        return this.r;
    }

    public int getPageNum() {
        return this.o;
    }

    public int getPageSize() {
        return this.p;
    }

    public String getQuery() {
        return this.f8145a;
    }

    public String getRegion() {
        return this.b;
    }

    public String getRetCoordType() {
        return this.f8146q;
    }

    public int getScope() {
        return this.g;
    }

    public String getSearchBound() {
        return this.x;
    }

    public String getSign() {
        return this.t;
    }

    public String getTag() {
        return this.A;
    }

    public Long getTimestamp() {
        return this.u;
    }

    public String getToken() {
        return this.s;
    }

    public String getType() {
        return this.e;
    }

    public String getViewBound() {
        return this.w;
    }

    public int getViewDistance() {
        return this.v;
    }

    public boolean isAddressResult() {
        return this.k;
    }

    public boolean isExtensionsAdcode() {
        return this.j;
    }

    public boolean isExtensionsChildPoi() {
        return this.y;
    }

    public boolean isHomonym() {
        return this.z;
    }

    public boolean isLightVersion() {
        return this.d;
    }

    public boolean isPhotoShow() {
        return this.l;
    }

    public boolean isRegionLimit() {
        return this.c;
    }

    public RegionRequestParams setAddressResult(boolean z) {
        this.k = z;
        return this;
    }

    public RegionRequestParams setCenter(String str) {
        this.f = str;
        return this;
    }

    public RegionRequestParams setCoordType(int i) {
        this.h = i;
        return this;
    }

    public RegionRequestParams setExtensionsAdcode(boolean z) {
        this.j = z;
        return this;
    }

    public RegionRequestParams setExtensionsChildPoi(boolean z) {
        this.y = z;
        return this;
    }

    public RegionRequestParams setFilter(String str) {
        this.i = str;
        return this;
    }

    public RegionRequestParams setFromLanguage(String str) {
        this.m = str;
        return this;
    }

    public RegionRequestParams setHomonym(boolean z) {
        this.z = z;
        return this;
    }

    public RegionRequestParams setLanguage(String str) {
        this.n = str;
        return this;
    }

    public RegionRequestParams setLightVersion(boolean z) {
        this.d = z;
        return this;
    }

    public RegionRequestParams setOutput(String str) {
        this.r = str;
        return this;
    }

    public RegionRequestParams setPageNum(int i) {
        this.o = i;
        return this;
    }

    public RegionRequestParams setPageSize(int i) {
        this.p = i;
        return this;
    }

    public RegionRequestParams setPhotoShow(boolean z) {
        this.l = z;
        return this;
    }

    public RegionRequestParams setQuery(String str) {
        this.f8145a = str;
        return this;
    }

    public RegionRequestParams setRegion(String str) {
        this.b = str;
        return this;
    }

    public RegionRequestParams setRegionLimit(boolean z) {
        this.c = z;
        return this;
    }

    public RegionRequestParams setRetCoordType(String str) {
        this.f8146q = str;
        return this;
    }

    public RegionRequestParams setScope(int i) {
        this.g = i;
        return this;
    }

    public RegionRequestParams setSearchBound(String str) {
        this.x = str;
        return this;
    }

    public void setSign(String str) {
        this.t = str;
    }

    public RegionRequestParams setTag(String str) {
        this.A = str;
        return this;
    }

    public void setTimestamp(Long l) {
        this.u = l;
    }

    public void setToken(String str) {
        this.s = str;
    }

    public RegionRequestParams setType(String str) {
        this.e = str;
        return this;
    }

    public RegionRequestParams setViewBound(String str) {
        this.w = str;
        return this;
    }

    public RegionRequestParams setViewDistance(int i) {
        this.v = i;
        return this;
    }
}
