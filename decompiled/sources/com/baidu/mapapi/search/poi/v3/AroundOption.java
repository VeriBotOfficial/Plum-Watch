package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class AroundOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8126a;
    private String b;
    private LatLng d;
    private String h;
    private String j;
    private String m;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8127q;
    private boolean r;
    private String s;
    private int c = 1;
    private int e = 500;
    private boolean f = false;
    private int g = 3;
    private boolean i = false;
    private int k = 0;
    private int l = 10;
    private String n = "zh";
    private String o = "zh";
    private boolean p = false;
    private boolean t = false;

    public String getAddressResult() {
        return this.j;
    }

    public int getCoordType() {
        return this.g;
    }

    public String getFilter() {
        return this.h;
    }

    public String getFromLanguage() {
        return this.n;
    }

    public String getLanguage() {
        return this.o;
    }

    public LatLng getLocation() {
        return this.d;
    }

    public int getPageNum() {
        return this.k;
    }

    public int getPageSize() {
        return this.l;
    }

    public String getQuery() {
        return this.f8126a;
    }

    public int getRadius() {
        return this.e;
    }

    public String getRetCoordType() {
        return this.m;
    }

    public int getScope() {
        return this.c;
    }

    public String getTag() {
        return this.s;
    }

    public String getType() {
        return this.b;
    }

    public boolean isExtensionsAdcode() {
        return this.i;
    }

    public boolean isExtensionsChildPoi() {
        return this.f8127q;
    }

    public boolean isHomonym() {
        return this.r;
    }

    public boolean isLightVersion() {
        return this.t;
    }

    public boolean isPhotoShow() {
        return this.p;
    }

    public boolean isRadiusLimit() {
        return this.f;
    }

    public AroundOption setAddressResult(String str) {
        this.j = str;
        return this;
    }

    public AroundOption setCoordType(int i) {
        this.g = i;
        return this;
    }

    public AroundOption setExtensionsAdcode(boolean z) {
        this.i = z;
        return this;
    }

    public AroundOption setExtensionsChildPoi(boolean z) {
        this.f8127q = z;
        return this;
    }

    public AroundOption setFilter(String str) {
        this.h = str;
        return this;
    }

    public AroundOption setFromLanguage(String str) {
        this.n = str;
        return this;
    }

    public AroundOption setHomonym(boolean z) {
        this.r = z;
        return this;
    }

    public AroundOption setLanguage(String str) {
        this.o = str;
        return this;
    }

    public AroundOption setLightVersion(boolean z) {
        this.t = z;
        return this;
    }

    public AroundOption setLocation(LatLng latLng) {
        this.d = latLng;
        return this;
    }

    public AroundOption setPageNum(int i) {
        this.k = i;
        return this;
    }

    public AroundOption setPageSize(int i) {
        this.l = i;
        return this;
    }

    public AroundOption setPhotoShow(boolean z) {
        this.p = z;
        return this;
    }

    public AroundOption setQuery(String str) {
        this.f8126a = str;
        return this;
    }

    public AroundOption setRadius(int i) {
        this.e = i;
        return this;
    }

    public AroundOption setRadiusLimit(boolean z) {
        this.f = z;
        return this;
    }

    public AroundOption setRetCoordType(String str) {
        this.m = str;
        return this;
    }

    public AroundOption setScope(int i) {
        this.c = i;
        return this;
    }

    public AroundOption setTag(String str) {
        this.s = str;
        return this;
    }

    public AroundOption setType(String str) {
        this.b = str;
        return this;
    }
}
