package com.mbridge.msdk.mbbanner.common.data;

/* JADX INFO: compiled from: BannerUnitData.java */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11746a;
    private String b;
    private String c = "";
    private int d;
    private int e;

    public b(String str, String str2, int r4, int r5) {
        this.f11746a = str;
        this.b = str2;
        this.d = r4;
        this.e = r5;
    }

    public void a(int r1) {
        this.d = r1;
    }

    public void b(String str) {
        this.b = str;
    }

    public int c() {
        return this.d;
    }

    public String d() {
        return this.b;
    }

    public String a() {
        return this.c;
    }

    public int b() {
        return this.e;
    }

    public void a(String str) {
        this.c = str;
    }
}
