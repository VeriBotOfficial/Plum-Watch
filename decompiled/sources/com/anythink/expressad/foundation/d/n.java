package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4798a = "key";
    public static final String b = "time";
    public static final String c = "ad_source_id";
    public static final String d = "num";
    public static final String e = "unit_id";
    public static final String f = "fb";
    public static final String g = "timeout";
    public static final String h = "network_type";
    public static final String i = "network_str";
    public static final String j = "2000006";
    public static final String k = "hb";
    private int l;
    private String m;
    private int n;
    private String o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private int f4799q;
    private int r;
    private String s;
    private int t;
    private String u;

    private int a() {
        return this.t;
    }

    private void a(int i2) {
        this.t = i2;
    }

    private n(int i2, String str, int i3, String str2, int i4, int i5, int i6) {
        this.l = i2;
        this.m = str;
        this.n = i3;
        this.o = str2;
        this.p = i4;
        this.f4799q = i5;
        this.r = i6;
    }

    public n() {
    }

    private int b() {
        return this.l;
    }

    private void b(int i2) {
        this.l = i2;
    }

    private String c() {
        return this.m;
    }

    private void a(String str) {
        this.m = str;
    }

    private String d() {
        return this.u;
    }

    private void b(String str) {
        this.u = str;
    }

    private int e() {
        return this.n;
    }

    private void c(int i2) {
        this.n = i2;
    }

    private String f() {
        return this.o;
    }

    private void c(String str) {
        this.o = str;
    }

    private int g() {
        return this.p;
    }

    private void d(int i2) {
        this.p = i2;
    }

    private int h() {
        return this.f4799q;
    }

    private void e(int i2) {
        this.f4799q = i2;
    }

    private int i() {
        return this.r;
    }

    private void f(int i2) {
        this.r = i2;
    }

    private String j() {
        return this.s;
    }

    private void d(String str) {
        this.s = str;
    }

    private static String a(List<n> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (n nVar : list) {
            stringBuffer.append("ad_source_id=" + nVar.l).append("&time=" + nVar.m).append("&num=" + nVar.n).append("&unit_id=" + nVar.o).append("&key=2000006").append("&fb=" + nVar.p);
            if (nVar.t == 1) {
                stringBuffer.append("&hb=1");
            }
            stringBuffer.append("&timeout=" + nVar.f4799q + "\n");
        }
        return stringBuffer.toString();
    }
}
