package com.anythink.expressad.foundation.d;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f4799q;
    private int r;
    private String s;
    private int t;
    private String u;

    private int a() {
        return this.t;
    }

    private void a(int r1) {
        this.t = r1;
    }

    private n(int r1, String str, int r3, String str2, int r5, int r6, int r7) {
        this.l = r1;
        this.m = str;
        this.n = r3;
        this.o = str2;
        this.p = r5;
        this.f4799q = r6;
        this.r = r7;
    }

    public n() {
    }

    private int b() {
        return this.l;
    }

    private void b(int r1) {
        this.l = r1;
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

    private void c(int r1) {
        this.n = r1;
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

    private void d(int r1) {
        this.p = r1;
    }

    private int h() {
        return this.f4799q;
    }

    private void e(int r1) {
        this.f4799q = r1;
    }

    private int i() {
        return this.r;
    }

    private void f(int r1) {
        this.r = r1;
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
