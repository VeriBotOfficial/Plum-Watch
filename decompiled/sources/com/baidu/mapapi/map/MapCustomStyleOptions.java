package com.baidu.mapapi.map;

/* loaded from: classes13.dex */
public class MapCustomStyleOptions {

    /* renamed from: a, reason: collision with root package name */
    private String f7931a;
    private String b;

    public MapCustomStyleOptions customStyleId(String str) {
        this.b = str;
        return this;
    }

    public String getCustomMapStyleId() {
        return this.b;
    }

    public String getLocalCustomStyleFilePath() {
        return this.f7931a;
    }

    public MapCustomStyleOptions localCustomStylePath(String str) {
        this.f7931a = str;
        return this;
    }
}
