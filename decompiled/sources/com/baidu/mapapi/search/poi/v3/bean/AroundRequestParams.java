package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.v3.AroundOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class AroundRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = "query")
    private String f8134a;

    @Properties(desc = "圆形区域检索中心点，不支持多个点", name = "location")
    private String b;

    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String f;

    @Properties(desc = "检索排序条件", name = "filter")
    private String i;

    @Properties(name = "address_result")
    private String k;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f8135q;

    @Properties(desc = "开发者密钥", name = "token")
    private String s;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String t;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long u;

    @Properties(name = "extensions_child_poi")
    private boolean v;

    @Properties(name = "homonym")
    private boolean w;

    @Properties(name = "tag")
    private String x;

    @Properties(desc = "检索半径，单位米，默认500米", name = "radius")
    private int c = 500;

    @Properties(desc = "是否严格限定召回结果在设置检索半径范围内。", name = "radius_limit")
    private boolean d = false;

    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean e = false;

    @Properties(desc = "检索结果详细程度", name = Constants.PARAM_SCOPE)
    private int g = 1;

    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int h = 3;

    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean j = false;

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
    private final int y = 1;

    public void apply(AroundOption aroundOption) {
        if (aroundOption != null) {
            if (!TextUtils.isEmpty(aroundOption.getQuery())) {
                setQuery(aroundOption.getQuery());
            }
            if (aroundOption.getLocation() != null) {
                setLocation(AppMD5.encodeCoordHash(aroundOption.getLocation().longitude, aroundOption.getLocation().latitude));
            }
            setRadius(aroundOption.getRadius());
            setRadiusLimit(aroundOption.isRadiusLimit());
            setLightVersion(aroundOption.isLightVersion());
            if (!TextUtils.isEmpty(aroundOption.getType())) {
                setType(aroundOption.getType());
            }
            setScope(aroundOption.getScope());
            setCoordType(aroundOption.getCoordType());
            if (!TextUtils.isEmpty(aroundOption.getFilter())) {
                setFilter(aroundOption.getFilter());
            }
            setExtensionsAdcode(aroundOption.isExtensionsAdcode());
            if (!TextUtils.isEmpty(aroundOption.getAddressResult())) {
                setAddressResult(aroundOption.getAddressResult());
            }
            setPhotoShow(aroundOption.isPhotoShow());
            if (!TextUtils.isEmpty(aroundOption.getFromLanguage())) {
                setFromLanguage(aroundOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(aroundOption.getLanguage())) {
                setLanguage(aroundOption.getLanguage());
            }
            setPageNum(aroundOption.getPageNum());
            setPageSize(aroundOption.getPageSize());
            if (!TextUtils.isEmpty(aroundOption.getRetCoordType())) {
                setRetCoordType(aroundOption.getRetCoordType());
            }
            setExtensionsAdcode(aroundOption.isExtensionsChildPoi());
            setHomonym(aroundOption.isHomonym());
            if (TextUtils.isEmpty(aroundOption.getTag())) {
                return;
            }
            setTag(aroundOption.getTag());
        }
    }

    public String getAddressResult() {
        return this.k;
    }

    public int getCe() {
        return 1;
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

    public String getLocation() {
        return this.b;
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
        return this.f8134a;
    }

    public int getRadius() {
        return this.c;
    }

    public String getRetCoordType() {
        return this.f8135q;
    }

    public int getScope() {
        return this.g;
    }

    public String getSign() {
        return this.t;
    }

    public String getTag() {
        return this.x;
    }

    public Long getTimestamp() {
        return this.u;
    }

    public String getToken() {
        return this.s;
    }

    public String getType() {
        return this.f;
    }

    public boolean isExtensionsAdcode() {
        return this.j;
    }

    public boolean isExtensionsChildPoi() {
        return this.v;
    }

    public boolean isHomonym() {
        return this.w;
    }

    public boolean isLightVersion() {
        return this.e;
    }

    public boolean isPhotoShow() {
        return this.l;
    }

    public boolean isRadiusLimit() {
        return this.d;
    }

    public AroundRequestParams setAddressResult(String str) {
        this.k = str;
        return this;
    }

    public AroundRequestParams setCoordType(int i) {
        this.h = i;
        return this;
    }

    public AroundRequestParams setExtensionsAdcode(boolean z) {
        this.j = z;
        return this;
    }

    public AroundRequestParams setExtensionsChildPoi(boolean z) {
        this.v = z;
        return this;
    }

    public AroundRequestParams setFilter(String str) {
        this.i = str;
        return this;
    }

    public AroundRequestParams setFromLanguage(String str) {
        this.m = str;
        return this;
    }

    public AroundRequestParams setHomonym(boolean z) {
        this.w = z;
        return this;
    }

    public AroundRequestParams setLanguage(String str) {
        this.n = str;
        return this;
    }

    public AroundRequestParams setLightVersion(boolean z) {
        this.e = z;
        return this;
    }

    public AroundRequestParams setLocation(String str) {
        this.b = str;
        return this;
    }

    public AroundRequestParams setOutput(String str) {
        this.r = str;
        return this;
    }

    public AroundRequestParams setPageNum(int i) {
        this.o = i;
        return this;
    }

    public AroundRequestParams setPageSize(int i) {
        this.p = i;
        return this;
    }

    public AroundRequestParams setPhotoShow(boolean z) {
        this.l = z;
        return this;
    }

    public AroundRequestParams setQuery(String str) {
        this.f8134a = str;
        return this;
    }

    public AroundRequestParams setRadius(int i) {
        this.c = i;
        return this;
    }

    public AroundRequestParams setRadiusLimit(boolean z) {
        this.d = z;
        return this;
    }

    public AroundRequestParams setRetCoordType(String str) {
        this.f8135q = str;
        return this;
    }

    public AroundRequestParams setScope(int i) {
        this.g = i;
        return this;
    }

    public AroundRequestParams setSign(String str) {
        this.t = str;
        return this;
    }

    public AroundRequestParams setTag(String str) {
        this.x = str;
        return this;
    }

    public AroundRequestParams setTimestamp(Long l) {
        this.u = l;
        return this;
    }

    public AroundRequestParams setToken(String str) {
        this.s = str;
        return this;
    }

    public AroundRequestParams setType(String str) {
        this.f = str;
        return this;
    }
}
