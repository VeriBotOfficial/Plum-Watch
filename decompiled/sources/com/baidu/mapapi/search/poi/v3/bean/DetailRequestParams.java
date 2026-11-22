package com.baidu.mapapi.search.poi.v3.bean;

import android.text.TextUtils;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.search.poi.v3.DetailOption;
import com.tencent.connect.common.Constants;

/* loaded from: classes13.dex */
public class DetailRequestParams extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(desc = "poi的uid", name = "uid")
    private String f8137a;

    @Properties(desc = "uid的集合，最多可以传入10个uid，多个uid之间用英文逗号分隔。", name = "uids")
    private String b;

    @Properties(desc = "返回的坐标类型", name = "ret_coordtype")
    private String f;

    @Properties(desc = "开发者密钥", name = "token")
    private String i;

    @Properties(desc = "用户的权限签名，当AK设置为SN校验时，该参数必填SN计算方法", name = "sign")
    private String j;

    @Properties(desc = "时间戳，与SN配合使用", name = "timestamp")
    private Long k;

    @Properties(desc = "检索结果详细程度", name = Constants.PARAM_SCOPE)
    private int c = 1;

    @Properties(desc = "是否召回国标行政区划编码", name = "extensions_adcode")
    private boolean d = false;

    @Properties(desc = "是否输出图片信息", name = "photo_show")
    private boolean e = false;

    @Properties(desc = "多语言检索", name = "language")
    private String g = "zh";

    @Properties(desc = "输出数据格式，仅支持json", name = "output")
    private String h = BodyData.TYPE_JSON;

    @Properties(name = "ce")
    private final int l = 1;

    public void apply(DetailOption detailOption) {
        if (detailOption != null) {
            if (!TextUtils.isEmpty(detailOption.getUid())) {
                setUid(detailOption.getUid());
            }
            if (!TextUtils.isEmpty(detailOption.getUids())) {
                setUid(detailOption.getUids());
            }
            setScope(detailOption.getScope());
            setExtensionsAdcode(detailOption.isExtensionsAdcode());
            setPhotoShow(detailOption.isPhotoShow());
            if (!TextUtils.isEmpty(detailOption.getRetCoordType())) {
                setRetCoordType(detailOption.getRetCoordType());
            }
            if (TextUtils.isEmpty(detailOption.getLanguage())) {
                return;
            }
            setLanguage(detailOption.getLanguage());
        }
    }

    public int getCe() {
        return 1;
    }

    public String getLanguage() {
        return this.g;
    }

    public String getOutput() {
        return this.h;
    }

    public String getRetCoordType() {
        return this.f;
    }

    public int getScope() {
        return this.c;
    }

    public String getSign() {
        return this.j;
    }

    public Long getTimestamp() {
        return this.k;
    }

    public String getToken() {
        return this.i;
    }

    public String getUid() {
        return this.f8137a;
    }

    public String getUids() {
        return this.b;
    }

    public boolean isExtensionsAdcode() {
        return this.d;
    }

    public boolean isPhotoShow() {
        return this.e;
    }

    public DetailRequestParams setExtensionsAdcode(boolean z) {
        this.d = z;
        return this;
    }

    public DetailRequestParams setLanguage(String str) {
        this.g = str;
        return this;
    }

    public DetailRequestParams setOutput(String str) {
        this.h = str;
        return this;
    }

    public DetailRequestParams setPhotoShow(boolean z) {
        this.e = z;
        return this;
    }

    public DetailRequestParams setRetCoordType(String str) {
        this.f = str;
        return this;
    }

    public DetailRequestParams setScope(int i) {
        this.c = i;
        return this;
    }

    public DetailRequestParams setSign(String str) {
        this.j = str;
        return this;
    }

    public DetailRequestParams setTimestamp(Long l) {
        this.k = l;
        return this;
    }

    public DetailRequestParams setToken(String str) {
        this.i = str;
        return this;
    }

    public DetailRequestParams setUid(String str) {
        this.f8137a = str;
        return this;
    }

    public DetailRequestParams setUids(String str) {
        this.b = str;
        return this;
    }
}
