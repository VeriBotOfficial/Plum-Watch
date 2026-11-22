package com.baidu.mapapi.search.poi.abroad.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.util.List;

/* loaded from: classes13.dex */
public class AbroadPlaceDetailResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private int f8118a;

    @Properties(name = "message")
    private String b;

    @Properties(name = "result")
    private List<AbroadPlaceDetailResult> c;

    public String getMessage() {
        return this.b;
    }

    public List<AbroadPlaceDetailResult> getResult() {
        return this.c;
    }

    public int getStatus() {
        return this.f8118a;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setResult(List<AbroadPlaceDetailResult> list) {
        this.c = list;
    }

    public void setStatus(int i) {
        this.f8118a = i;
    }
}
