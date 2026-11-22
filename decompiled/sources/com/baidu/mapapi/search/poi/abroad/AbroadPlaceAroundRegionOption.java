package com.baidu.mapapi.search.poi.abroad;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class AbroadPlaceAroundRegionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8107a;
    private LatLng b;
    private String j;
    private String k;
    private String l;
    private int c = 1000;
    private String d = "false";
    private String e = "bd09ll";
    private String f = "bd09ll";
    private int g = 1;
    private int h = 10;
    private int i = 0;
    private String m = "false";

    public String getCityLimit() {
        return this.m;
    }

    public String getCoordtype() {
        return this.e;
    }

    public String getFilter() {
        return this.l;
    }

    public LatLng getLocation() {
        return this.b;
    }

    public int getPageNum() {
        return this.i;
    }

    public int getPageSize() {
        return this.h;
    }

    public String getQuery() {
        return this.f8107a;
    }

    public int getRadius() {
        return this.c;
    }

    public String getRadiusLimit() {
        return this.d;
    }

    public String getRetCoordtype() {
        return this.f;
    }

    public int getScope() {
        return this.g;
    }

    public String getTag() {
        return this.j;
    }

    public String getType() {
        return this.k;
    }

    public AbroadPlaceAroundRegionOption setCityLimit(String str) {
        this.m = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setCoordtype(String str) {
        this.e = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setFilter(String str) {
        this.l = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setLocation(LatLng latLng) {
        this.b = latLng;
        return this;
    }

    public AbroadPlaceAroundRegionOption setPageNum(int i) {
        this.i = i;
        return this;
    }

    public AbroadPlaceAroundRegionOption setPageSize(int i) {
        this.h = i;
        return this;
    }

    public AbroadPlaceAroundRegionOption setQuery(String str) {
        this.f8107a = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setRadius(int i) {
        this.c = i;
        return this;
    }

    public AbroadPlaceAroundRegionOption setRadiusLimit(String str) {
        this.d = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setRetCoordtype(String str) {
        this.f = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setScope(int i) {
        this.g = i;
        return this;
    }

    public AbroadPlaceAroundRegionOption setTag(String str) {
        this.j = str;
        return this;
    }

    public AbroadPlaceAroundRegionOption setType(String str) {
        this.k = str;
        return this;
    }
}
