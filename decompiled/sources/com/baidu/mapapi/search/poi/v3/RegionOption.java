package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes13.dex */
public class RegionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8131a;
    private String b;
    private String c;
    private LatLng e;
    private String h;
    private String m;

    /* renamed from: q, reason: collision with root package name */
    private int f8132q;
    private List<LatLng> r;
    private List<LatLng> s;
    private boolean t;
    private boolean u;
    private String v;
    private boolean d = false;
    private int f = 1;
    private int g = 3;
    private boolean i = false;
    private boolean j = false;
    private int k = 0;
    private int l = 10;
    private String n = "zh";
    private String o = "zh";
    private boolean p = false;
    private boolean w = false;

    public LatLng getCenter() {
        return this.e;
    }

    public int getCoordType() {
        return this.g;
    }

    public String getFilter() {
        return this.h;
    }

    public String getFromLanguage() {
        return this.o;
    }

    public String getLanguage() {
        return this.n;
    }

    public int getPageNum() {
        return this.k;
    }

    public int getPageSize() {
        return this.l;
    }

    public String getQuery() {
        return this.f8131a;
    }

    public String getRegion() {
        return this.c;
    }

    public String getRetCoordType() {
        return this.m;
    }

    public int getScope() {
        return this.f;
    }

    public List<LatLng> getSearchBound() {
        return this.s;
    }

    public String getTag() {
        return this.v;
    }

    public String getType() {
        return this.b;
    }

    public List<LatLng> getViewBound() {
        return this.r;
    }

    public int getViewDistance() {
        return this.f8132q;
    }

    public boolean isAddressResult() {
        return this.j;
    }

    public boolean isExtensionsAdcode() {
        return this.i;
    }

    public boolean isExtensionsChildPoi() {
        return this.t;
    }

    public boolean isHomonym() {
        return this.u;
    }

    public boolean isLightVersion() {
        return this.w;
    }

    public boolean isPhotoShow() {
        return this.p;
    }

    public boolean isRegionLimit() {
        return this.d;
    }

    public RegionOption setAddressResult(boolean z) {
        this.j = z;
        return this;
    }

    public RegionOption setCenter(LatLng latLng) {
        this.e = latLng;
        return this;
    }

    public RegionOption setCoordType(int i) {
        this.g = i;
        return this;
    }

    public RegionOption setExtensionsAdcode(boolean z) {
        this.i = z;
        return this;
    }

    public RegionOption setExtensionsChildPoi(boolean z) {
        this.t = z;
        return this;
    }

    public RegionOption setFilter(String str) {
        this.h = str;
        return this;
    }

    public RegionOption setFromLanguage(String str) {
        this.o = str;
        return this;
    }

    public RegionOption setHomonym(boolean z) {
        this.u = z;
        return this;
    }

    public RegionOption setLanguage(String str) {
        this.n = str;
        return this;
    }

    public RegionOption setLightVersion(boolean z) {
        this.w = z;
        return this;
    }

    public RegionOption setPageNum(int i) {
        this.k = i;
        return this;
    }

    public RegionOption setPageSize(int i) {
        this.l = i;
        return this;
    }

    public RegionOption setPhotoShow(boolean z) {
        this.p = z;
        return this;
    }

    public RegionOption setQuery(String str) {
        this.f8131a = str;
        return this;
    }

    public RegionOption setRegion(String str) {
        this.c = str;
        return this;
    }

    public RegionOption setRegionLimit(boolean z) {
        this.d = z;
        return this;
    }

    public RegionOption setRetCoordType(String str) {
        this.m = str;
        return this;
    }

    public RegionOption setScope(int i) {
        this.f = i;
        return this;
    }

    public RegionOption setSearchBound(List<LatLng> list) {
        this.s = list;
        return this;
    }

    public RegionOption setTag(String str) {
        this.v = str;
        return this;
    }

    public RegionOption setType(String str) {
        this.b = str;
        return this;
    }

    public RegionOption setViewBound(List<LatLng> list) {
        this.r = list;
        return this;
    }

    public RegionOption setViewDistance(int i) {
        this.f8132q = i;
        return this;
    }
}
