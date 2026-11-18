package com.baidu.platform.comapi.walknavi.g.i.e;

import java.io.Serializable;

/* JADX INFO: compiled from: ARResource.java */
/* JADX INFO: loaded from: classes15.dex */
public class b implements Serializable {
    private String b;
    private String c;
    private String d;
    private String[] e;
    private String f;
    private String g;
    private int h;
    private String i;
    private String l;
    private String m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8730a = Integer.MIN_VALUE;
    private boolean j = false;
    private boolean k = true;

    public void a(int r1) {
        this.f8730a = r1;
    }

    public int b() {
        return this.f8730a;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.c = str;
    }

    public String e() {
        return this.d;
    }

    public void f(String str) {
        this.d = str;
    }

    public void g(String str) {
        this.g = str;
    }

    public void h(String str) {
        this.i = str;
    }

    public String toString() {
        return "ARResource [ err_code = " + this.f8730a + ", err_msg = " + this.b + ", , version_code = " + this.g + ", ar_resource = " + this.d + " ]";
    }

    public void a(String[] strArr) {
        this.e = strArr;
    }

    public void b(int r1) {
        this.h = r1;
    }

    public String c() {
        return this.b;
    }

    public String d() {
        return this.c;
    }

    public void e(String str) {
        this.f = str;
    }

    public int f() {
        return this.h;
    }

    public boolean g() {
        return this.k;
    }

    public boolean h() {
        return this.j;
    }

    public void a(boolean z) {
        this.k = z;
    }

    public void b(boolean z) {
        this.j = z;
    }

    public void a(String str) {
        this.l = str;
    }

    public void b(String str) {
        this.m = str;
    }

    public String a() {
        return this.m;
    }
}
