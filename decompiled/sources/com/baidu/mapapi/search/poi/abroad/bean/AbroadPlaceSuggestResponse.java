package com.baidu.mapapi.search.poi.abroad.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.util.List;

/* loaded from: classes13.dex */
public class AbroadPlaceSuggestResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private int f8123a;

    @Properties(name = "message")
    private String b;

    @Properties(name = "result")
    private List<AbroadPlaceSuggestResult> c;

    public String getMessage() {
        return this.b;
    }

    public List<AbroadPlaceSuggestResult> getResult() {
        return this.c;
    }

    public int getStatus() {
        return this.f8123a;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setResult(List<AbroadPlaceSuggestResult> list) {
        this.c = list;
    }

    public void setStatus(int i) {
        this.f8123a = i;
    }
}
