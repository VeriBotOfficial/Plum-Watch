package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Collection;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.ch, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3152ch extends Y5 {
    public boolean d;
    public boolean e;
    public int f;
    public int g;
    public boolean h;
    public int i;
    public Boolean j;
    public Zg k;
    public final InterfaceC3127bh l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;

    /* renamed from: q, reason: collision with root package name */
    public List f18217q;
    public int r;
    public long s;
    public long t;
    public boolean u;
    public long v;
    public List w;

    public C3152ch(C3389m5 c3389m5) {
        this.l = c3389m5;
    }

    public final void a(int i) {
        this.r = i;
    }

    public final void b(List<String> list) {
        this.f18217q = list;
    }

    public final String c() {
        return this.m;
    }

    public final void d(boolean z) {
        this.d = z;
    }

    public final void e(boolean z) {
        this.h = z;
    }

    public final void f(boolean z) {
        this.n = z;
    }

    public final String g() {
        return (String) WrapUtils.getOrDefault(this.p, "");
    }

    public final boolean h() {
        return this.k.a(this.j);
    }

    public final int i() {
        return this.g;
    }

    public final long j() {
        return this.v;
    }

    public final int k() {
        return this.i;
    }

    public final long l() {
        return this.s;
    }

    public final long m() {
        return this.t;
    }

    public final List<String> n() {
        return this.f18217q;
    }

    public final int o() {
        return this.f;
    }

    public final boolean p() {
        return this.o;
    }

    public final boolean q() {
        return this.e;
    }

    public final boolean r() {
        return this.d;
    }

    public final boolean s() {
        return this.n;
    }

    public final boolean t() {
        return isIdentifiersValid() && !In.a((Collection) this.f18217q) && this.u;
    }

    @Override // io.appmetrica.analytics.impl.Y5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig
    public final String toString() {
        return "ReportRequestConfig{mLocationTracking=" + this.d + ", mFirstActivationAsUpdate=" + this.e + ", mSessionTimeout=" + this.f + ", mDispatchPeriod=" + this.g + ", mLogEnabled=" + this.h + ", mMaxReportsCount=" + this.i + ", dataSendingEnabledFromArguments=" + this.j + ", dataSendingStrategy=" + this.k + ", mPreloadInfoSendingStrategy=" + this.l + ", mApiKey='" + this.m + "', mPermissionsCollectingEnabled=" + this.n + ", mFeaturesCollectingEnabled=" + this.o + ", mClidsFromStartupResponse='" + this.p + "', mReportHosts=" + this.f18217q + ", mAttributionId=" + this.r + ", mPermissionsCollectingIntervalSeconds=" + this.s + ", mPermissionsForceSendIntervalSeconds=" + this.t + ", mClidsFromClientMatchClidsFromStartupRequest=" + this.u + ", mMaxReportsInDbCount=" + this.v + ", mCertificates=" + this.w + "} " + super.toString();
    }

    public final boolean u() {
        return ((C3389m5) this.l).A();
    }

    public final void a(long j) {
        this.v = j;
    }

    public final void b(long j) {
        this.s = j;
    }

    public final void c(long j) {
        this.t = j;
    }

    public final void d(int i) {
        this.f = i;
    }

    public final List<String> e() {
        return this.w;
    }

    public final boolean f() {
        return this.u;
    }

    public final void a(List<String> list) {
        this.w = list;
    }

    public final void b(boolean z) {
        this.o = z;
    }

    public final void c(boolean z) {
        this.e = z;
    }

    public final int d() {
        return this.r;
    }

    public final void a(Boolean bool, Zg zg) {
        this.j = bool;
        this.k = zg;
    }

    public final void b(int i) {
        this.g = i;
    }

    public final void c(int i) {
        this.i = i;
    }

    public final void a(boolean z) {
        this.u = z;
    }
}
