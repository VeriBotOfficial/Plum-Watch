package com.anythink.expressad.foundation.d;

import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class h {
    private static final String A = "template download error";
    private static final String B = "endcard template download error";
    private static final String C = "big template render error";
    private static final String D = "template render error";
    private static final String E = " isready false error";
    private static final String F = " load time out error";
    private static final String G = " no fill";
    private static final String H = "current unit is loading";
    private static final String I = "app already install";
    private static final String J = "adn no offer fill";
    private static final String K = "ad over cap ";
    private static final String L = " unknown error";
    private static final String M = "load exception";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4790a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 15;
    public static final int n = 16;
    public static final int o = 18;
    public static final int p = 17;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f4791q = 19;
    public static final int r = 20;
    public static final int s = 21;
    private static final String t = "candidate failed";
    private static final String u = "v3 params invalid";
    private static final String v = "v3 request error";
    private static final String w = "v3 time out";
    private static final String x = "v3 response error";
    private static final String y = "video download error";
    private static final String z = "big template download error";
    private String N;
    private int O;
    private String P;
    private int Q;
    private Map<String, String> R;
    private String S;
    private int T = -1;

    private h(int r2, String str, Map<String, String> map) {
        this.O = r2;
        this.P = str;
        this.R = map;
        b();
    }

    private h(int r2, String str, boolean z2) {
        this.O = 0;
        if (z2) {
            if (r2 == 200) {
                this.O = 4;
            } else if (r2 == 201) {
                this.O = 7;
            } else if (r2 == 203) {
                this.O = 6;
            } else if (r2 == 205) {
                this.O = 5;
            }
        }
        this.P = str;
        b();
    }

    private void b() {
        try {
            switch (this.O) {
                case 0:
                    this.N = u;
                    break;
                case 1:
                    this.N = v;
                    break;
                case 2:
                    this.N = w;
                    break;
                case 3:
                    this.N = x;
                    break;
                case 4:
                    this.N = y;
                    break;
                case 5:
                    this.N = z;
                    break;
                case 6:
                    this.N = A;
                    break;
                case 7:
                    this.N = B;
                    break;
                case 8:
                    this.N = C;
                    break;
                case 9:
                    this.N = D;
                    break;
                case 10:
                    this.N = F;
                    break;
                case 11:
                    this.N = G;
                    break;
                case 12:
                case 13:
                case 14:
                default:
                    break;
                case 15:
                    this.N = E;
                    break;
                case 16:
                    this.N = H;
                    break;
                case 17:
                    this.N = J;
                    break;
                case 18:
                    this.N = I;
                    break;
                case 19:
                    this.N = K;
                    break;
                case 20:
                    this.N = M;
                    break;
                case 21:
                    this.N = t;
                    break;
            }
        } catch (Exception unused) {
            this.N = L;
        }
    }

    private h(int r2, String str) {
        this.O = r2;
        this.P = str;
        b();
    }

    private String c() {
        return this.S;
    }

    private void a(String str) {
        this.S = str;
    }

    private int d() {
        return this.T;
    }

    private void a(int r1) {
        this.T = r1;
    }

    private void b(int r1) {
        this.O = r1;
    }

    private int e() {
        return this.O;
    }

    public final String a() {
        return this.P;
    }

    private void b(String str) {
        this.P = str;
    }

    private int f() {
        return this.Q;
    }

    private void c(int r1) {
        this.Q = r1;
    }

    private Map<String, String> g() {
        return this.R;
    }
}
