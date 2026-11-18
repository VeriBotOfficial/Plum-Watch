package com.baidu.mapapi.search.poi.abroad;

/* JADX INFO: loaded from: classes15.dex */
public class AbroadPlaceDetailOption {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8108a;
    private String b = "bd09ll";
    private int c = 1;

    public String getRetCoordtype() {
        return this.b;
    }

    public int getScope() {
        return this.c;
    }

    public String getUids() {
        return this.f8108a;
    }

    public AbroadPlaceDetailOption setRetCoordtype(String str) {
        this.b = str;
        return this;
    }

    public AbroadPlaceDetailOption setScope(int r1) {
        this.c = r1;
        return this;
    }

    public AbroadPlaceDetailOption setUids(String str) {
        this.f8108a = str;
        return this;
    }
}
