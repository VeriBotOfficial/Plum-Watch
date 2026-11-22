package com.anythink.expressad.foundation.e;

import android.text.TextUtils;
import android.util.SparseArray;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes12.dex */
public final class b {
    public static final int A = 880027;
    public static final int B = 880028;
    public static final int C = 880029;
    public static final int D = 880030;
    public static final int E = 880031;
    public static final int F = 880032;
    public static final int G = 880033;
    public static final int H = 880034;
    public static final int I = 880035;
    public static final int J = 880036;
    public static final int K = 880037;
    public static final int L = 880038;
    public static final int M = 880039;
    public static final int N = 880040;
    public static final int O = 880041;
    private static final String P = "v3 params invalid";
    private static final String Q = "v3 request error";
    private static final String R = "v3 time out";
    private static final String S = "v3 response error";
    private static final String T = "video download error";
    private static final String U = "big template download error";
    private static final String V = "template download error";
    private static final String W = "endcard template download error";
    private static final String X = "image download error";
    private static final String Y = "big template render error";
    private static final String Z = "template render error";

    /* renamed from: a, reason: collision with root package name */
    public static final int f4811a = 880000;
    private static final String aA = "view container is null";
    private static final String aB = "AD parameter setting error";
    private static final String aC = "cb is open";
    private static final String aD = "db restore failed";
    private static final String aE = "network no connection error";
    private static final SparseArray<String> aF;
    private static final String aa = "isready false error";
    private static final String ab = "load time out error";
    private static final String ac = "no fill";
    private static final String ad = "render half img fail";
    private static final String ae = "write marid fail";
    private static final String af = "download js file fail";
    private static final String ag = "current unit is loading";
    private static final String ah = "app already install";

    /* renamed from: ai, reason: collision with root package name */
    private static final String f4812ai = "adn no offer fill";
    private static final String aj = "local return empty";
    private static final String ak = "ad over cap";
    private static final String al = "load exception";
    private static final String am = "unknown error";
    private static final String an = "exception when request";
    private static final String ao = "context is null";
    private static final String ap = "auto refresh fail because unitId status is pause or stop";
    private static final String aq = "download resource fail";
    private static final String ar = "has exception happen : ";
    private static final String as = "view width or height is 0 or view size is too small";
    private static final String at = "AD display requires webView but current environment not included";
    private static final String au = "view is null";
    private static final String av = "webView was destroyed";
    private static final String aw = "unitId is null";
    private static final String ax = "campaign is filtered";
    private static final String ay = "render dynamic view fail";
    private static final String az = "bid token is null";
    public static final int b = 880001;
    public static final int c = 880002;
    public static final int d = 880003;
    public static final int e = 880004;
    public static final int f = 880005;
    public static final int g = 880006;
    public static final int h = 880007;
    public static final int i = 880008;
    public static final int j = 880009;
    public static final int k = 880010;
    public static final int l = 880012;
    public static final int m = 880013;
    public static final int n = 880014;
    public static final int o = 880015;
    public static final int p = 880016;

    /* renamed from: q, reason: collision with root package name */
    public static final int f4813q = 880017;
    public static final int r = 880018;
    public static final int s = 880019;
    public static final int t = 880020;
    public static final int u = 880021;
    public static final int v = 880022;
    public static final int w = 880023;
    public static final int x = 880024;
    public static final int y = 880025;
    public static final int z = 880026;

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public static int b(int i2) {
        if (i2 == 880023) {
            return 2;
        }
        if (i2 == 880035) {
            return 0;
        }
        if (i2 == 880038) {
            return 21;
        }
        switch (i2) {
            case b /* 880001 */:
                return 0;
            case c /* 880002 */:
                return 1;
            case d /* 880003 */:
                return 3;
            case e /* 880004 */:
                return 4;
            case f /* 880005 */:
                return 5;
            case g /* 880006 */:
                return 6;
            case h /* 880007 */:
                return 7;
            case i /* 880008 */:
                return 8;
            case j /* 880009 */:
                return 9;
            case k /* 880010 */:
                return 10;
            default:
                switch (i2) {
                    case l /* 880012 */:
                        return 12;
                    case m /* 880013 */:
                        return 13;
                    case n /* 880014 */:
                        return 14;
                    case o /* 880015 */:
                        return 15;
                    case p /* 880016 */:
                        return 16;
                    case f4813q /* 880017 */:
                        return 17;
                    case r /* 880018 */:
                        return 18;
                    case s /* 880019 */:
                        return 19;
                    case t /* 880020 */:
                        return 20;
                    case u /* 880021 */:
                        return 11;
                    default:
                        return x;
                }
        }
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        aF = sparseArray;
        sparseArray.put(v, an);
        sparseArray.put(b, P);
        sparseArray.put(c, Q);
        sparseArray.put(d, S);
        sparseArray.put(e, T);
        sparseArray.put(f, U);
        sparseArray.put(g, V);
        sparseArray.put(h, W);
        sparseArray.put(M, X);
        sparseArray.put(i, Y);
        sparseArray.put(j, Z);
        sparseArray.put(k, ab);
        sparseArray.put(l, ad);
        sparseArray.put(m, ae);
        sparseArray.put(n, af);
        sparseArray.put(o, aa);
        sparseArray.put(p, ag);
        sparseArray.put(f4813q, f4812ai);
        sparseArray.put(r, aj);
        sparseArray.put(u, ah);
        sparseArray.put(s, ak);
        sparseArray.put(t, al);
        sparseArray.put(w, R);
        sparseArray.put(x, am);
        sparseArray.put(y, "context is null");
        sparseArray.put(z, ap);
        sparseArray.put(A, aq);
        sparseArray.put(f4811a, ar);
        sparseArray.put(B, as);
        sparseArray.put(C, at);
        sparseArray.put(D, au);
        sparseArray.put(E, av);
        sparseArray.put(F, aw);
        sparseArray.put(G, ax);
        sparseArray.put(H, ay);
        sparseArray.put(I, az);
        sparseArray.put(J, aA);
        sparseArray.put(K, aB);
        sparseArray.put(L, aC);
        sparseArray.put(N, aD);
        sparseArray.put(O, aE);
    }

    private b() {
    }

    public static String a(int i2) {
        String str = aF.get(i2);
        return TextUtils.isEmpty(str) ? "" : str;
    }

    private static String b(int i2, String str) {
        return i2 + "#" + aF.get(i2) + "#" + str;
    }

    public static c a(int i2, String str) {
        return new c(i2, str);
    }

    private static c a(int i2, int i3, String str) {
        return new c(i2, i3, str);
    }
}
