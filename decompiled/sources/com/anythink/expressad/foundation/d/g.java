package com.anythink.expressad.foundation.d;

import java.util.List;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4788a = "cid";
    public static final String b = "click_type";
    public static final String c = "network_type";
    public static final String d = "network_str";
    public static final String e = "click_duration";
    public static final String f = "last_url";
    public static final String g = "type";
    public static final String h = "code";
    public static final String i = "exception";
    public static final String j = "header";
    public static final String k = "content";
    public static final String l = "network_type";
    public static final String m = "rid";
    public static final String n = "key";
    public static final String o = "rid_n";
    public static final String p = "unit_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f4789q = "landing_type";
    public static final String r = "link_type";
    public static final String s = "click_time";
    public static final String t = "market_result";
    public static final String u = "2000013";
    public static final String v = "2000012";
    private String A;
    private int B;
    private String C;
    private String D;
    private String E;
    private int F;
    private int G;
    private String H;
    private int I;
    private int J;
    private String K;
    private int L;
    private String M;
    private int N;
    private int w;
    private String x;
    private String y;
    private String z;

    public g() {
    }

    private g(String str, String str2, String str3, String str4, int i2, String str5, String str6, String str7, int i3, int i4, String str8, int i5, int i6, String str9, int i7, int i8, String str10) {
        this.x = str;
        this.y = str2;
        this.z = str3;
        this.A = str4;
        this.B = i2;
        this.C = str5;
        this.D = str6;
        this.E = str7;
        this.F = i3;
        this.G = i4;
        this.H = str8;
        this.I = i5;
        this.J = i6;
        this.K = str9;
        this.L = i7;
        this.M = str10;
        this.N = i8;
    }

    private int a() {
        return this.N;
    }

    private void f(int i2) {
        this.N = i2;
    }

    private int b() {
        return this.L;
    }

    private void g(int i2) {
        this.L = i2;
    }

    private String c() {
        return this.M;
    }

    private void j(String str) {
        this.M = str;
    }

    private String d() {
        return this.H;
    }

    public final void a(String str) {
        this.H = str;
    }

    private int e() {
        return this.I;
    }

    public final void a(int i2) {
        this.I = i2;
    }

    private int f() {
        return this.J;
    }

    public final void b(int i2) {
        this.J = i2;
    }

    private String g() {
        return this.K;
    }

    public final void b(String str) {
        this.K = str;
    }

    private int h() {
        return this.G;
    }

    public final void c(int i2) {
        this.G = i2;
    }

    private String i() {
        return this.C;
    }

    public final void c(String str) {
        this.C = str;
    }

    private int j() {
        return this.B;
    }

    public final void d(int i2) {
        this.B = i2;
    }

    private String k() {
        return this.D;
    }

    public final void d(String str) {
        this.D = str;
    }

    private String l() {
        return this.E;
    }

    public final void e(String str) {
        this.E = str;
    }

    private int m() {
        return this.F;
    }

    public final void e(int i2) {
        this.F = i2;
    }

    private String n() {
        return this.A;
    }

    public final void f(String str) {
        this.A = str;
    }

    private String o() {
        return this.y;
    }

    public final void g(String str) {
        this.y = str;
    }

    private String p() {
        return this.z;
    }

    public final void h(String str) {
        this.z = str;
    }

    private int q() {
        return this.w;
    }

    private void h(int i2) {
        this.w = i2;
    }

    private String r() {
        return this.x;
    }

    public final void i(String str) {
        this.x = str;
    }

    public static String a(List<g> list) {
        if (list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (g gVar : list) {
            sb.append("rid_n=" + gVar.x).append("&cid=" + gVar.y).append("&click_type=" + gVar.G).append("&type=" + gVar.F).append("&click_duration=" + gVar.z).append("&key=2000013").append("&unit_id=" + gVar.H).append("&last_url=" + gVar.A).append("&content=" + gVar.E).append("&code=" + gVar.B).append("&exception=" + gVar.C).append("&header=" + gVar.D).append("&landing_type=" + gVar.I).append("&link_type=" + gVar.J).append("&click_time=" + gVar.K + "\n");
        }
        return sb.toString();
    }

    private static String a(g gVar) {
        if (gVar == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("rid_n=" + gVar.x).append("&click_type=" + gVar.G).append("&type=" + gVar.F).append("&cid=" + gVar.y).append("&click_duration=" + gVar.z).append("&key=2000012").append("&unit_id=" + gVar.H).append("&last_url=".concat(String.valueOf(gVar.A))).append("&code=" + gVar.B).append("&exception=" + gVar.C).append("&landing_type=" + gVar.I).append("&link_type=" + gVar.J).append("&click_time=" + gVar.K + "\n");
        return sb.toString();
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.y + ", click_duration=" + this.z + ", lastUrl=" + this.A + ", code=" + this.B + ", excepiton=" + this.C + ", header=" + this.D + ", content=" + this.E + ", type=" + this.F + ", click_type=" + this.G + "]";
    }
}
