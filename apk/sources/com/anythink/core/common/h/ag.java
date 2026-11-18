package com.anythink.core.common.h;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class ag {
    private long A;
    private int B;
    private int C;
    private int D;
    private int E;
    private String F = "";
    private String G;
    private String H;
    private String I;
    private String J;
    private long K;
    private long L;
    private long M;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f3843a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f3844q;
    private String r;
    private int s;
    private String t;
    private String u;
    private String v;
    private String w;
    private int x;
    private boolean y;
    private long z;

    public final int a() {
        return this.D;
    }

    public final void a(int r1) {
        this.D = r1;
    }

    public final int b() {
        return this.E;
    }

    public final void b(int r1) {
        this.E = r1;
    }

    public final String c() {
        return this.F;
    }

    public final void a(String str) {
        this.F = str;
    }

    public final String d() {
        return this.H;
    }

    public final void b(String str) {
        this.H = str;
    }

    public final String e() {
        return this.I;
    }

    public final void c(String str) {
        this.I = str;
    }

    public final String f() {
        return this.J;
    }

    public final void d(String str) {
        this.J = str;
    }

    public final String g() {
        return this.w;
    }

    public final void e(String str) {
        this.w = str;
    }

    public final int h() {
        return this.x;
    }

    public final void c(int r1) {
        this.x = r1;
    }

    public final boolean i() {
        return this.y;
    }

    public final void a(boolean z) {
        this.y = z;
    }

    public final String j() {
        return this.f3843a;
    }

    public final void f(String str) {
        this.f3843a = str;
    }

    public final String k() {
        return this.b;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final String l() {
        return this.c;
    }

    public final void h(String str) {
        this.c = str;
    }

    public final String m() {
        return this.d;
    }

    public final void i(String str) {
        this.d = str;
    }

    public final String n() {
        return this.e;
    }

    public final void j(String str) {
        this.e = str;
    }

    public final String o() {
        return this.f;
    }

    public final void k(String str) {
        this.f = str;
    }

    public final String p() {
        return this.g;
    }

    public final void l(String str) {
        this.g = str;
    }

    public final String q() {
        return this.h;
    }

    public final void m(String str) {
        this.h = str;
    }

    public final int r() {
        return this.j;
    }

    public final void d(int r1) {
        this.j = r1;
    }

    public final int s() {
        return this.k;
    }

    public final void e(int r1) {
        this.k = r1;
    }

    public final int t() {
        return this.l;
    }

    public final void f(int r1) {
        this.l = r1;
    }

    public final int u() {
        return this.m;
    }

    public final void g(int r1) {
        this.m = r1;
    }

    public final String v() {
        return this.f3844q;
    }

    public final void n(String str) {
        this.f3844q = str;
    }

    public final String w() {
        return this.r;
    }

    public final void o(String str) {
        this.r = str;
    }

    public final boolean x() {
        return this.i == 1;
    }

    public final void h(int r1) {
        this.i = r1;
    }

    public final int y() {
        return this.i;
    }

    public final int z() {
        return this.s;
    }

    public final void i(int r1) {
        this.s = r1;
    }

    public final long A() {
        return this.z;
    }

    public final void a(long j) {
        this.z = j;
    }

    public final long B() {
        return this.A;
    }

    public final void b(long j) {
        this.A = j;
    }

    public final int C() {
        return this.n;
    }

    public final void j(int r1) {
        this.n = r1;
    }

    public final int D() {
        return this.B;
    }

    public final void k(int r1) {
        this.B = r1;
    }

    public final int E() {
        return this.C;
    }

    public final void l(int r1) {
        this.C = r1;
    }

    public final long F() {
        return this.K;
    }

    public final void c(long j) {
        this.K = j;
    }

    public final long G() {
        return this.L;
    }

    public final void d(long j) {
        this.L = j;
    }

    public final int H() {
        return this.o;
    }

    public final void m(int r1) {
        this.o = r1;
    }

    public final int I() {
        return this.p;
    }

    public final void n(int r1) {
        this.p = r1;
    }

    public final long J() {
        return this.M;
    }

    public final void e(long j) {
        this.M = j;
    }

    public final void p(String str) {
        this.t = str;
    }

    public final String K() {
        return this.t;
    }

    public final void q(String str) {
        this.u = str;
    }

    public final String L() {
        return this.u;
    }

    public final String M() {
        return this.G;
    }

    public final void r(String str) {
        this.G = str;
    }

    public final String N() {
        return this.v;
    }

    public final void s(String str) {
        this.v = str;
    }

    public final String toString() {
        return "DownloadTaskBean{uniqueID='" + this.f3843a + "', clickId='" + this.b + "', requestId='" + this.c + "', offerId='" + this.d + "', url='" + this.e + "', pkgName='" + this.f + "', title='" + this.g + "', deeplinkClickAction='" + this.h + "', enableUseWebViewUa=" + this.i + ", downloadType=" + this.j + ", notificationType=" + this.k + ", intOpenSwitch=" + this.l + ", intOpenTime=" + this.m + ", apkVerify=" + this.n + ", apkReDownload=" + this.o + ", apkAllowInstallInBg=" + this.p + ", iconUrl='" + this.f3844q + "', deeplinkUrl='" + this.r + "', offerSourceType=" + this.s + ", appName='" + this.t + "', filePath='" + this.w + "', partCount=" + this.x + ", enablePartDownload=" + this.y + ", downloadStartTimeStamp=" + this.z + ", downloadEndTimeStamp=" + this.A + ", status=" + this.B + ", isUploadInstalledAgentEvent=" + this.C + ", downloadingScene=" + this.D + ", recoverDownloadScene=" + this.E + ", downloadFailedSceneList='" + this.F + "', actionOfferDownloadTk='" + this.G + "', placementId='" + this.H + "', adSourceId='" + this.I + "', networkFirmId='" + this.J + "', progress=" + this.K + ", fileSize=" + this.L + ", offerCacheTime=" + this.M + ", dspId=" + this.u + ", desc=" + this.v + AbstractJsonLexerKt.END_OBJ;
    }
}
