package com.baidu.mapapi.search.poi.abroad;

import android.util.Pair;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class AbroadPlacePolygonRegionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8109a;
    private Pair<LatLng, LatLng> b;
    private String h;
    private String i;
    private String j;
    private String c = "bd09ll";
    private String d = "bd09ll";
    private int e = 1;
    private int f = 10;
    private int g = 0;
    private String k = "false";

    public Pair<LatLng, LatLng> getBounds() {
        return this.b;
    }

    public String getCityLimit() {
        return this.k;
    }

    public String getCoordtype() {
        return this.c;
    }

    public String getFilter() {
        return this.j;
    }

    public int getPageNum() {
        return this.g;
    }

    public int getPageSize() {
        return this.f;
    }

    public String getQuery() {
        return this.f8109a;
    }

    public String getRetCoordtype() {
        return this.d;
    }

    public int getScope() {
        return this.e;
    }

    public String getTag() {
        return this.h;
    }

    public String getType() {
        return this.i;
    }

    public AbroadPlacePolygonRegionOption setBounds(Pair<LatLng, LatLng> pair) {
        this.b = pair;
        return this;
    }

    public AbroadPlacePolygonRegionOption setCityLimit(String str) {
        this.k = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setCoordtype(String str) {
        this.c = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setFilter(String str) {
        this.j = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setPageNum(int i) {
        this.g = i;
        return this;
    }

    public AbroadPlacePolygonRegionOption setPageSize(int i) {
        this.f = i;
        return this;
    }

    public AbroadPlacePolygonRegionOption setQuery(String str) {
        this.f8109a = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setRetCoordtype(String str) {
        this.d = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setScope(int i) {
        this.e = i;
        return this;
    }

    public AbroadPlacePolygonRegionOption setTag(String str) {
        this.h = str;
        return this;
    }

    public AbroadPlacePolygonRegionOption setType(String str) {
        this.i = str;
        return this;
    }
}
