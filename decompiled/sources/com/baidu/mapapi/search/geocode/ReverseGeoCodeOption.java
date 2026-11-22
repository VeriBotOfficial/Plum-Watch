package com.baidu.mapapi.search.geocode;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;

/* loaded from: classes13.dex */
public class ReverseGeoCodeOption {

    /* renamed from: a, reason: collision with root package name */
    private int f8086a = 10;
    private int b = 0;
    private LatLng c = null;
    private int d = 1;
    private int e = 1000;
    private String f = null;
    private boolean g = false;
    private LanguageType h = LanguageType.LanguageTypeChinese;
    private int i = 0;
    private SortStrategyType j = SortStrategyType.DEFAULT;

    public enum SortStrategyType {
        DISTANCE("distance"),
        RANK("rank"),
        DEFAULT("default");

        private String b;

        SortStrategyType(String str) {
            this.b = str;
        }

        public String getDescription() {
            return this.b;
        }
    }

    public ReverseGeoCodeOption entirePoi(int i) {
        this.i = i;
        return this;
    }

    public ReverseGeoCodeOption extensionsRoad(boolean z) {
        this.g = z;
        return this;
    }

    public int getEntirePoi() {
        return this.i;
    }

    public boolean getExtensionsRoad() {
        return this.g;
    }

    public LanguageType getLanguage() {
        return this.h;
    }

    public int getLatestAdmin() {
        return this.d;
    }

    public LatLng getLocation() {
        return this.c;
    }

    public int getPageNum() {
        return this.b;
    }

    public int getPageSize() {
        return this.f8086a;
    }

    public String getPoiType() {
        return this.f;
    }

    public int getRadius() {
        return this.e;
    }

    public SortStrategyType getSortStrategy() {
        return this.j;
    }

    public ReverseGeoCodeOption language(LanguageType languageType) {
        this.h = languageType;
        return this;
    }

    public ReverseGeoCodeOption location(LatLng latLng) {
        this.c = latLng;
        return this;
    }

    public ReverseGeoCodeOption newVersion(int i) {
        this.d = i;
        return this;
    }

    public ReverseGeoCodeOption pageNum(int i) {
        if (i < 0) {
            i = 0;
        }
        this.b = i;
        return this;
    }

    public ReverseGeoCodeOption pageSize(int i) {
        if (i <= 0) {
            this.f8086a = 10;
            return this;
        }
        if (i > 100) {
            this.f8086a = 100;
            return this;
        }
        this.f8086a = i;
        return this;
    }

    public ReverseGeoCodeOption poiType(String str) {
        this.f = str;
        return this;
    }

    public ReverseGeoCodeOption radius(int i) {
        if (i < 0) {
            this.e = 0;
            return this;
        }
        if (i > 1000) {
            this.e = 1000;
            return this;
        }
        this.e = i;
        return this;
    }

    public ReverseGeoCodeOption sortStrategy(SortStrategyType sortStrategyType) {
        this.j = sortStrategyType;
        return this;
    }
}
