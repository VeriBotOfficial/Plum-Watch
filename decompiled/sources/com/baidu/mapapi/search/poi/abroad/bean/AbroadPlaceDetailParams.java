package com.baidu.mapapi.search.poi.abroad.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.abroad.AbroadPlaceDetailOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class AbroadPlaceDetailParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "uid")
    private String f8117a;

    @Properties(name = "uids")
    private String b;

    @Properties(desc = "开发者密钥", name = "token")
    private String c;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String d;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long e;

    @Properties(name = Constants.PARAM_SCOPE)
    private int f = 1;

    @Properties(name = "output")
    private String g = BodyData.TYPE_JSON;

    @Properties(name = "ret_coordtype")
    private String h = "bd09ll";

    public void apply(AbroadPlaceDetailOption abroadPlaceDetailOption) {
        if (abroadPlaceDetailOption != null) {
            if (!TextUtils.isEmpty(abroadPlaceDetailOption.getUids())) {
                setUids(abroadPlaceDetailOption.getUids());
            }
            if (!TextUtils.isEmpty(abroadPlaceDetailOption.getRetCoordtype())) {
                setRetCoordtype(abroadPlaceDetailOption.getRetCoordtype());
            }
            setScope(abroadPlaceDetailOption.getScope());
        }
    }

    public String getOutput() {
        return this.g;
    }

    public String getRetCoordtype() {
        return this.h;
    }

    public int getScope() {
        return this.f;
    }

    public String getSign() {
        return this.d;
    }

    public Long getTimestamp() {
        return this.e;
    }

    public String getToken() {
        return this.c;
    }

    public String getUid() {
        return this.f8117a;
    }

    public String getUids() {
        return this.b;
    }

    public void setOutput(String str) {
        this.g = str;
    }

    public void setRetCoordtype(String str) {
        this.h = str;
    }

    public void setScope(int i) {
        this.f = i;
    }

    public void setSign(String str) {
        this.d = str;
    }

    public void setTimestamp(Long l) {
        this.e = l;
    }

    public void setToken(String str) {
        this.c = str;
    }

    public void setUid(String str) {
        this.f8117a = str;
    }

    public void setUids(String str) {
        this.b = str;
    }
}
