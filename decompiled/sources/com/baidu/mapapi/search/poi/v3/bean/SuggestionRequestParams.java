package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.poi.v3.SuggestionOption;
import com.baidu.mapsdkplatform.comjni.util.AppMD5;

/* loaded from: classes13.dex */
public class SuggestionRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "检索关键字", name = "query")
    private String f8149a;

    @Properties(desc = "检索行政区划区域", name = "region")
    private String b;

    @Properties(desc = "圆形区域检索中心点，不支持多个点", name = "location")
    private String d;

    @Properties(desc = "检索多边形区域", name = "bounds")
    private String f;

    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String i;

    @Properties(desc = "开发者密钥", name = "token")
    private String k;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String l;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long m;

    @Properties(name = "from_language")
    private String n;

    @Properties(name = "hotword")
    private boolean o;

    @Properties(desc = "区域数据召回限制", name = "region_limit")
    private boolean c = false;

    @Properties(desc = "检索半径，单位米，默认500米", name = "radius")
    private int e = 500;

    @Properties(desc = "传入的坐标类型", name = "coord_type")
    private int g = 3;

    @Properties(desc = "多语言检索", name = "language")
    private String h = "zh";

    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String j = BodyData.TYPE_JSON;

    @Properties(name = "ce")
    private final int p = 1;

    public void apply(SuggestionOption suggestionOption) {
        if (suggestionOption != null) {
            if (!TextUtils.isEmpty(suggestionOption.getQuery())) {
                setQuery(suggestionOption.getQuery());
            }
            if (!TextUtils.isEmpty(suggestionOption.getRegion())) {
                setRegion(suggestionOption.getRegion());
            }
            setRegionLimit(suggestionOption.isRegionLimit());
            if (suggestionOption.getLocation() != null) {
                setLocation(AppMD5.encodeCoordHash(suggestionOption.getLocation().longitude, suggestionOption.getLocation().latitude));
            }
            setRadius(suggestionOption.getRadius());
            if (suggestionOption.getBounds() != null && !suggestionOption.getBounds().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < suggestionOption.getBounds().size(); i++) {
                    LatLng latLng = suggestionOption.getBounds().get(i);
                    sb.append(AppMD5.encodeCoordHash(latLng.longitude, latLng.latitude)).append(",");
                }
                sb.deleteCharAt(sb.length() - 1);
                setBounds(sb.toString());
            }
            setCoordType(suggestionOption.getCoordType());
            if (!TextUtils.isEmpty(suggestionOption.getLanguage())) {
                setLanguage(suggestionOption.getLanguage());
            }
            if (!TextUtils.isEmpty(suggestionOption.getRetCoordType())) {
                setRetCoordType(suggestionOption.getRetCoordType());
            }
            if (!TextUtils.isEmpty(suggestionOption.getFromLanguage())) {
                setFromLanguage(suggestionOption.getFromLanguage());
            }
            setHotword(suggestionOption.isHotword());
        }
    }

    public String getBounds() {
        return this.f;
    }

    public int getCe() {
        return 1;
    }

    public int getCoordType() {
        return this.g;
    }

    public String getFromLanguage() {
        return this.n;
    }

    public String getLanguage() {
        return this.h;
    }

    public String getLocation() {
        return this.d;
    }

    public String getOutput() {
        return this.j;
    }

    public String getQuery() {
        return this.f8149a;
    }

    public int getRadius() {
        return this.e;
    }

    public String getRegion() {
        return this.b;
    }

    public String getRetCoordType() {
        return this.i;
    }

    public String getSign() {
        return this.l;
    }

    public Long getTimestamp() {
        return this.m;
    }

    public String getToken() {
        return this.k;
    }

    public boolean isHotword() {
        return this.o;
    }

    public boolean isRegionLimit() {
        return this.c;
    }

    public SuggestionRequestParams setBounds(String str) {
        this.f = str;
        return this;
    }

    public SuggestionRequestParams setCoordType(int i) {
        this.g = i;
        return this;
    }

    public SuggestionRequestParams setFromLanguage(String str) {
        this.n = str;
        return this;
    }

    public SuggestionRequestParams setHotword(boolean z) {
        this.o = z;
        return this;
    }

    public SuggestionRequestParams setLanguage(String str) {
        this.h = str;
        return this;
    }

    public SuggestionRequestParams setLocation(String str) {
        this.d = str;
        return this;
    }

    public SuggestionRequestParams setOutput(String str) {
        this.j = str;
        return this;
    }

    public SuggestionRequestParams setQuery(String str) {
        this.f8149a = str;
        return this;
    }

    public SuggestionRequestParams setRadius(int i) {
        this.e = i;
        return this;
    }

    public SuggestionRequestParams setRegion(String str) {
        this.b = str;
        return this;
    }

    public SuggestionRequestParams setRegionLimit(boolean z) {
        this.c = z;
        return this;
    }

    public SuggestionRequestParams setRetCoordType(String str) {
        this.i = str;
        return this;
    }

    public SuggestionRequestParams setSign(String str) {
        this.l = str;
        return this;
    }

    public SuggestionRequestParams setTimestamp(Long l) {
        this.m = l;
        return this;
    }

    public SuggestionRequestParams setToken(String str) {
        this.k = str;
        return this;
    }
}
