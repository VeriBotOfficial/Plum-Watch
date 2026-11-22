package com.baidu.platform.comapi.walknavi.i;

import java.util.ArrayList;

/* compiled from: WRouteMessageModel.java */
/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private String f8751a;
    private String b;
    private int c;
    private ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> d = new ArrayList<>();
    private ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> e = new ArrayList<>();
    private ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> f = new ArrayList<>();
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private String l;
    private String m;

    public void a(ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> arrayList) {
        this.e = arrayList;
    }

    public void b(String str) {
        this.l = str;
    }

    public void c(int i) {
        this.j = i;
    }

    public String d() {
        return this.l;
    }

    public ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> e() {
        return this.d;
    }

    public String f() {
        return this.f8751a;
    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.h;
    }

    public String toString() {
        return "WRouteMessageModel [iconName=" + this.f8751a + ", guideText=" + this.b + ", stepLength=" + this.g + ", uid=" + this.h + "]";
    }

    public String a() {
        return this.m;
    }

    public void b(int i) {
        this.i = i;
    }

    public int c() {
        return this.i;
    }

    public void d(int i) {
        this.k = i;
    }

    public void e(int i) {
        this.g = i;
    }

    public void f(int i) {
        this.h = i;
    }

    public void a(String str) {
        this.m = str;
    }

    public int b() {
        return this.c;
    }

    public void c(String str) {
        this.b = str;
    }

    public void d(String str) {
        this.f8751a = str;
    }

    public void a(int i) {
        this.c = i;
    }

    public void b(ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> arrayList) {
        this.f = arrayList;
    }

    public void c(ArrayList<com.baidu.platform.comapi.walknavi.segmentbrowse.widget.c> arrayList) {
        this.d = arrayList;
    }
}
