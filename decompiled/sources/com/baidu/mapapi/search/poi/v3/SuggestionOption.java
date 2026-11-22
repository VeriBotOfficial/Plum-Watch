package com.baidu.mapapi.search.poi.v3;

import com.baidu.mapapi.model.LatLng;
import java.util.List;

/* loaded from: classes13.dex */
public class SuggestionOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8133a;
    private String b;
    private String d;
    private boolean g;
    private LatLng i;
    private List<LatLng> k;
    private int c = 3;
    private String e = "zh";
    private String f = "zh";
    private boolean h = false;
    private int j = 500;

    public List<LatLng> getBounds() {
        return this.k;
    }

    public int getCoordType() {
        return this.c;
    }

    public String getFromLanguage() {
        return this.f;
    }

    public String getLanguage() {
        return this.e;
    }

    public LatLng getLocation() {
        return this.i;
    }

    public String getQuery() {
        return this.f8133a;
    }

    public int getRadius() {
        return this.j;
    }

    public String getRegion() {
        return this.b;
    }

    public String getRetCoordType() {
        return this.d;
    }

    public boolean isHotword() {
        return this.g;
    }

    public boolean isRegionLimit() {
        return this.h;
    }

    public SuggestionOption setBounds(List<LatLng> list) {
        this.k = list;
        return this;
    }

    public SuggestionOption setCoordType(int i) {
        this.c = i;
        return this;
    }

    public SuggestionOption setFromLanguage(String str) {
        this.f = str;
        return this;
    }

    public SuggestionOption setHotword(boolean z) {
        this.g = z;
        return this;
    }

    public SuggestionOption setLanguage(String str) {
        this.e = str;
        return this;
    }

    public SuggestionOption setLocation(LatLng latLng) {
        this.i = latLng;
        return this;
    }

    public SuggestionOption setQuery(String str) {
        this.f8133a = str;
        return this;
    }

    public SuggestionOption setRadius(int i) {
        this.j = i;
        return this;
    }

    public SuggestionOption setRegion(String str) {
        this.b = str;
        return this;
    }

    public SuggestionOption setRegionLimit(boolean z) {
        this.h = z;
        return this;
    }

    public SuggestionOption setRetCoordType(String str) {
        this.d = str;
        return this;
    }
}
