package com.baidu.mapapi.search.poi.v3;

/* loaded from: classes13.dex */
public class DetailOption {

    /* renamed from: a, reason: collision with root package name */
    private String f8128a;
    private String b;
    private String d;
    private String f;
    private boolean c = false;
    private int e = 1;
    private boolean g = false;

    public String getLanguage() {
        return this.f;
    }

    public String getRetCoordType() {
        return this.d;
    }

    public int getScope() {
        return this.e;
    }

    public String getUid() {
        return this.f8128a;
    }

    public String getUids() {
        return this.b;
    }

    public boolean isExtensionsAdcode() {
        return this.c;
    }

    public boolean isPhotoShow() {
        return this.g;
    }

    public DetailOption setExtensionsAdcode(boolean z) {
        this.c = z;
        return this;
    }

    public DetailOption setLanguage(String str) {
        this.f = str;
        return this;
    }

    public DetailOption setPhotoShow(boolean z) {
        this.g = z;
        return this;
    }

    public DetailOption setRetCoordType(String str) {
        this.d = str;
        return this;
    }

    public DetailOption setScope(int i) {
        this.e = i;
        return this;
    }

    public DetailOption setUid(String str) {
        this.f8128a = str;
        return this;
    }

    public DetailOption setUids(String str) {
        this.b = str;
        return this;
    }
}
