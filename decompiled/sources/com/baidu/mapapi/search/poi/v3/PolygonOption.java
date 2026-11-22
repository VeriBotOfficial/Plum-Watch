package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes13.dex */
public class PolygonOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8129a;
    private List<LatLng> b;
    private String c;
    private String f;
    private String h;
    private String k;
    private boolean n;
    private boolean o;
    private String p;
    private int d = 1;
    private int e = 3;
    private boolean g = false;
    private int i = 0;
    private int j = 10;
    private String l = "zh";
    private String m = "zh";

    /* renamed from: q, reason: collision with root package name */
    private boolean f8130q = false;
    private boolean r = false;

    public String getAddressResult() {
        return this.h;
    }

    public List<LatLng> getBounds() {
        return this.b;
    }

    public int getCoordType() {
        return this.e;
    }

    public String getFilter() {
        return this.f;
    }

    public String getFromLanguage() {
        return this.l;
    }

    public String getLanguage() {
        return this.m;
    }

    public int getPageNum() {
        return this.i;
    }

    public int getPageSize() {
        return this.j;
    }

    public String getQuery() {
        return this.f8129a;
    }

    public String getRetCoordType() {
        return this.k;
    }

    public int getScope() {
        return this.d;
    }

    public String getTag() {
        return this.p;
    }

    public String getType() {
        return this.c;
    }

    public boolean isExtensionsAdcode() {
        return this.g;
    }

    public boolean isExtensionsChildPoi() {
        return this.n;
    }

    public boolean isHomonym() {
        return this.o;
    }

    public boolean isLightVersion() {
        return this.r;
    }

    public boolean isPhotoShow() {
        return this.f8130q;
    }

    public PolygonOption setAddressResult(String str) {
        this.h = str;
        return this;
    }

    public PolygonOption setBounds(List<LatLng> list) {
        this.b = list;
        return this;
    }

    public PolygonOption setCoordType(int i) {
        this.e = i;
        return this;
    }

    public PolygonOption setExtensionsAdcode(boolean z) {
        this.g = z;
        return this;
    }

    public PolygonOption setExtensionsChildPoi(boolean z) {
        this.n = z;
        return this;
    }

    public PolygonOption setFilter(String str) {
        this.f = str;
        return this;
    }

    public PolygonOption setFromLanguage(String str) {
        this.l = str;
        return this;
    }

    public PolygonOption setHomonym(boolean z) {
        this.o = z;
        return this;
    }

    public PolygonOption setLanguage(String str) {
        this.m = str;
        return this;
    }

    public PolygonOption setLightVersion(boolean z) {
        this.r = z;
        return this;
    }

    public PolygonOption setPageNum(int i) {
        this.i = i;
        return this;
    }

    public PolygonOption setPageSize(int i) {
        this.j = i;
        return this;
    }

    public PolygonOption setPhotoShow(boolean z) {
        this.f8130q = z;
        return this;
    }

    public PolygonOption setQuery(String str) {
        this.f8129a = str;
        return this;
    }

    public PolygonOption setRetCoordType(String str) {
        this.k = str;
        return this;
    }

    public PolygonOption setScope(int i) {
        this.d = i;
        return this;
    }

    public PolygonOption setTag(String str) {
        this.p = str;
        return this;
    }

    public PolygonOption setType(String str) {
        this.c = str;
        return this;
    }
}
