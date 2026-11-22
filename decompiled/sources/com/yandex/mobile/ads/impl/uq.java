package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class uq {

    /* renamed from: a, reason: collision with root package name */
    private o50 f17079a;
    private jc b;
    private final List<String> c;

    public /* synthetic */ uq() {
        this(new jc(), new o50());
    }

    public uq(jc advertisingConfiguration, o50 environmentConfiguration) {
        Intrinsics.checkNotNullParameter(environmentConfiguration, "environmentConfiguration");
        Intrinsics.checkNotNullParameter(advertisingConfiguration, "advertisingConfiguration");
        this.f17079a = environmentConfiguration;
        this.b = advertisingConfiguration;
        this.c = CollectionsKt.listOf((Object[]) new String[]{"small", "medium", "large"});
    }

    public final o50 b() {
        return this.f17079a;
    }

    public final jc a() {
        return this.b;
    }

    public final void a(jc jcVar) {
        Intrinsics.checkNotNullParameter(jcVar, "<set-?>");
        this.b = jcVar;
    }

    public final List<String> c() {
        return this.c;
    }

    public final void a(o50 o50Var) {
        Intrinsics.checkNotNullParameter(o50Var, "<set-?>");
        this.f17079a = o50Var;
    }
}
