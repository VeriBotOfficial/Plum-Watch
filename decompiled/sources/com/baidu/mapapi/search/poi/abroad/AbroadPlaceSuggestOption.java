package com.baidu.mapapi.search.poi.abroad;

import android.util.Pair;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class AbroadPlaceSuggestOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8110a;
    private String b;
    private LatLng c;
    private Pair<LatLng, LatLng> d;
    private String e = "3";
    private int f = 1000;
    private String g = "false";

    public Pair<LatLng, LatLng> getBounds() {
        return this.d;
    }

    public String getCityLimit() {
        return this.g;
    }

    public String getCoordType() {
        return this.e;
    }

    public LatLng getLocation() {
        return this.c;
    }

    public String getQuery() {
        return this.f8110a;
    }

    public int getRadius() {
        return this.f;
    }

    public String getRegion() {
        return this.b;
    }

    public AbroadPlaceSuggestOption setBounds(Pair<LatLng, LatLng> pair) {
        this.d = pair;
        return this;
    }

    public AbroadPlaceSuggestOption setCityLimit(String str) {
        this.g = str;
        return this;
    }

    public AbroadPlaceSuggestOption setCoordType(String str) {
        this.e = str;
        return this;
    }

    public AbroadPlaceSuggestOption setLocation(LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public AbroadPlaceSuggestOption setQuery(String str) {
        this.f8110a = str;
        return this;
    }

    public AbroadPlaceSuggestOption setRadius(int i) {
        this.f = i;
        return this;
    }

    public AbroadPlaceSuggestOption setRegion(String str) {
        this.b = str;
        return this;
    }
}
