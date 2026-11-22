package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.p82;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class o3 {

    /* renamed from: a, reason: collision with root package name */
    private final ts f16403a;
    private final bv1 b;
    private final uq c;
    private final ca d;
    private final hz1 e;
    private v7 f;
    private fa1 g;
    private ca1 h;
    private p82.a i;
    private String j;
    private String k;
    private String l;
    private Integer m;
    private lz0 n;
    private String o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private int f16404q;
    private int r;

    public /* synthetic */ o3(ts tsVar, bv1 bv1Var) {
        this(tsVar, bv1Var, new uq(), new ca(), new hz1());
    }

    public o3(ts adType, bv1 sdkEnvironmentModule, uq commonAdRequestConfiguration, ca adUnitIdConfigurator, hz1 sizeInfoConfigurator) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(commonAdRequestConfiguration, "commonAdRequestConfiguration");
        Intrinsics.checkNotNullParameter(adUnitIdConfigurator, "adUnitIdConfigurator");
        Intrinsics.checkNotNullParameter(sizeInfoConfigurator, "sizeInfoConfigurator");
        this.f16403a = adType;
        this.b = sdkEnvironmentModule;
        this.c = commonAdRequestConfiguration;
        this.d = adUnitIdConfigurator;
        this.e = sizeInfoConfigurator;
        this.p = true;
        this.r = bi0.b;
    }

    public final ts b() {
        return this.f16403a;
    }

    public final bv1 q() {
        return this.b;
    }

    public final uq g() {
        return this.c;
    }

    public final v7 a() {
        return this.f;
    }

    public final fa1 s() {
        return this.g;
    }

    public final ca1 p() {
        return this.h;
    }

    public final p82.a t() {
        return this.i;
    }

    public final String f() {
        return this.j;
    }

    public final String l() {
        return this.k;
    }

    public final String n() {
        return this.l;
    }

    public final Integer d() {
        return this.m;
    }

    public final lz0 i() {
        return this.n;
    }

    public final String j() {
        return this.o;
    }

    public final boolean u() {
        return this.p;
    }

    public final int o() {
        return this.f16404q;
    }

    public final int h() {
        return this.r;
    }

    public final gz1 r() {
        return this.e.a();
    }

    public final String c() {
        return this.d.a();
    }

    public final void b(String str) {
        this.j = str;
    }

    public final void a(v7 v7Var) {
        this.f = v7Var;
    }

    public final jc e() {
        return this.c.a();
    }

    public final o50 k() {
        return this.c.b();
    }

    public final List<String> m() {
        return this.c.c();
    }

    public final void d(String str) {
        this.k = str;
    }

    public final void c(String str) {
        this.o = str;
    }

    public final void e(String str) {
        this.l = str;
    }

    public final void a(String str) {
        this.d.a(str);
    }

    public final void a(Integer num) {
        this.m = num;
    }

    public final void a(jc configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.a(configuration);
    }

    public final void a(lz0 lz0Var) {
        this.n = lz0Var;
    }

    public final void a(o50 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.c.a(configuration);
    }

    public final void a(int i) {
        this.f16404q = i;
    }

    public final void a(ca1 ca1Var) {
        this.h = ca1Var;
    }

    public final void a(boolean z) {
        this.p = z;
    }

    public final void a(gz1 gz1Var) {
        this.e.a(gz1Var);
    }

    public final void a(fa1 fa1Var) {
        this.g = fa1Var;
    }

    public final void a(p82.a aVar) {
        this.i = aVar;
    }
}
