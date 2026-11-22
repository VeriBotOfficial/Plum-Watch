package com.baidu.mapapi.search.poi.abroad.bean;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.util.List;

/* loaded from: classes13.dex */
public class AbroadPlaceResponse extends BaseParams {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "status")
    private int f8120a;

    @Properties(name = "message")
    private String b;

    @Properties(name = "total")
    private int c;

    @Properties(name = "results")
    private List<AbroadPlaceResult> d;

    public String getMessage() {
        return this.b;
    }

    public List<AbroadPlaceResult> getResults() {
        return this.d;
    }

    public int getStatus() {
        return this.f8120a;
    }

    public int getTotal() {
        return this.c;
    }

    public void setMessage(String str) {
        this.b = str;
    }

    public void setResults(List<AbroadPlaceResult> list) {
        this.d = list;
    }

    public void setStatus(int i) {
        this.f8120a = i;
    }

    public void setTotal(int i) {
        this.c = i;
    }
}
