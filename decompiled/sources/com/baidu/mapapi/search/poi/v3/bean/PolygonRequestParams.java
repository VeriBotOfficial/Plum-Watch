package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.PolygonOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class PolygonRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = "query")
    private String f8143a;

    @Properties(desc = "检索多边形区域", name = "bounds")
    private String b;

    @Properties(desc = "对query召回接口进行二次筛选", name = "type")
    private String d;

    @Properties(desc = "检索排序条件", name = "filter")
    private String g;

    @Properties(name = "address_result")
    private String i;

    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String o;

    /* renamed from: q, reason: collision with root package name */
    @Properties(desc = "开发者密钥", name = "token")
    private String f8144q;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String r;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long s;

    @Properties(name = "extensions_child_poi")
    private boolean t;

    @Properties(name = "homonym")
    private boolean u;

    @Properties(name = "tag")
    private String v;

    @Properties(desc = "true: 优先保证检索速度，排序更简单直接，false: 默认", name = "is_light_version")
    private boolean c = false;

    @Properties(desc = "检索结果详细程度", name = Constants.PARAM_SCOPE)
    private int e = 1;

    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int f = 3;

    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean h = false;

    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean j = false;

    @Properties(desc = "query的语言类型", name = "from_language")
    private String k = "zh";

    @Properties(desc = "多语言检索", name = "language")
    private String l = "zh";

    @Properties(desc = "分页页码", name = "page_num")
    private int m = 0;

    @Properties(desc = "单次召回的数量", name = "page_size")
    private int n = 10;

    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String p = BodyData.TYPE_JSON;

    @Properties(name = "ce")
    private final int w = 1;

    public void apply(PolygonOption polygonOption) {
        if (polygonOption != null) {
            if (!TextUtils.isEmpty(polygonOption.getQuery())) {
                setQuery(polygonOption.getQuery());
            }
            if (polygonOption.getBounds() != null && !polygonOption.getBounds().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < polygonOption.getBounds().size(); i++) {
                    LatLng latLng = polygonOption.getBounds().get(i);
                    sb.append(AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude)).append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                setBounds(sb.toString());
            }
            setLightVersion(polygonOption.isLightVersion());
            if (!TextUtils.isEmpty(polygonOption.getType())) {
                setType(polygonOption.getType());
            }
            setScope(polygonOption.getScope());
            setCoordType(polygonOption.getCoordType());
            if (!TextUtils.isEmpty(polygonOption.getFilter())) {
                setFilter(polygonOption.getFilter());
            }
            setExtensionsAdcode(polygonOption.isExtensionsAdcode());
            if (!TextUtils.isEmpty(polygonOption.getAddressResult())) {
                setAddressResult(polygonOption.getAddressResult());
            }
            setPhotoShow(polygonOption.isPhotoShow());
            if (!TextUtils.isEmpty(polygonOption.getFromLanguage())) {
                setFromLanguage(polygonOption.getFromLanguage());
            }
            if (!TextUtils.isEmpty(polygonOption.getLanguage())) {
                setLanguage(polygonOption.getLanguage());
            }
            setPageNum(polygonOption.getPageNum());
            setPageSize(polygonOption.getPageSize());
            if (!TextUtils.isEmpty(polygonOption.getRetCoordType())) {
                setRetCoordType(polygonOption.getRetCoordType());
            }
            setExtensionsAdcode(polygonOption.isExtensionsChildPoi());
            setHomonym(polygonOption.isHomonym());
            if (TextUtils.isEmpty(polygonOption.getTag())) {
                return;
            }
            setTag(polygonOption.getTag());
        }
    }

    public String getAddressResult() {
        return this.i;
    }

    public String getBounds() {
        return this.b;
    }

    public int getCe() {
        return 1;
    }

    public int getCoordType() {
        return this.f;
    }

    public String getFilter() {
        return this.g;
    }

    public String getFromLanguage() {
        return this.k;
    }

    public String getLanguage() {
        return this.l;
    }

    public String getOutput() {
        return this.p;
    }

    public int getPageNum() {
        return this.m;
    }

    public int getPageSize() {
        return this.n;
    }

    public String getQuery() {
        return this.f8143a;
    }

    public String getRetCoordType() {
        return this.o;
    }

    public int getScope() {
        return this.e;
    }

    public String getSign() {
        return this.r;
    }

    public String getTag() {
        return this.v;
    }

    public Long getTimestamp() {
        return this.s;
    }

    public String getToken() {
        return this.f8144q;
    }

    public String getType() {
        return this.d;
    }

    public boolean isExtensionsAdcode() {
        return this.h;
    }

    public boolean isExtensionsChildPoi() {
        return this.t;
    }

    public boolean isHomonym() {
        return this.u;
    }

    public boolean isLightVersion() {
        return this.c;
    }

    public boolean isPhotoShow() {
        return this.j;
    }

    public PolygonRequestParams setAddressResult(String str) {
        this.i = str;
        return this;
    }

    public PolygonRequestParams setBounds(String str) {
        this.b = str;
        return this;
    }

    public PolygonRequestParams setCoordType(int i) {
        this.f = i;
        return this;
    }

    public PolygonRequestParams setExtensionsAdcode(boolean z) {
        this.h = z;
        return this;
    }

    public PolygonRequestParams setExtensionsChildPoi(boolean z) {
        this.t = z;
        return this;
    }

    public PolygonRequestParams setFilter(String str) {
        this.g = str;
        return this;
    }

    public PolygonRequestParams setFromLanguage(String str) {
        this.k = str;
        return this;
    }

    public PolygonRequestParams setHomonym(boolean z) {
        this.u = z;
        return this;
    }

    public PolygonRequestParams setLanguage(String str) {
        this.l = str;
        return this;
    }

    public PolygonRequestParams setLightVersion(boolean z) {
        this.c = z;
        return this;
    }

    public PolygonRequestParams setOutput(String str) {
        this.p = str;
        return this;
    }

    public PolygonRequestParams setPageNum(int i) {
        this.m = i;
        return this;
    }

    public PolygonRequestParams setPageSize(int i) {
        this.n = i;
        return this;
    }

    public PolygonRequestParams setPhotoShow(boolean z) {
        this.j = z;
        return this;
    }

    public PolygonRequestParams setQuery(String str) {
        this.f8143a = str;
        return this;
    }

    public PolygonRequestParams setRetCoordType(String str) {
        this.o = str;
        return this;
    }

    public PolygonRequestParams setScope(int i) {
        this.e = i;
        return this;
    }

    public PolygonRequestParams setSign(String str) {
        this.r = str;
        return this;
    }

    public PolygonRequestParams setTag(String str) {
        this.v = str;
        return this;
    }

    public void setTimestamp(Long l) {
        this.s = l;
    }

    public PolygonRequestParams setToken(String str) {
        this.f8144q = str;
        return this;
    }

    public PolygonRequestParams setType(String str) {
        this.d = str;
        return this;
    }
}
