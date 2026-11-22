package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class do1 {

    /* renamed from: a, reason: collision with root package name */
    private final zn1 f15299a;
    private final List<mp0> b;
    private final int c;
    private final b60 d;
    private final vp1 e;
    private final int f;
    private final int g;
    private final int h;
    private int i;

    /* JADX WARN: Multi-variable type inference failed */
    public do1(zn1 call, List<? extends mp0> interceptors, int i, b60 b60Var, vp1 request, int i2, int i3, int i4) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(interceptors, "interceptors");
        Intrinsics.checkNotNullParameter(request, "request");
        this.f15299a = call;
        this.b = interceptors;
        this.c = i;
        this.d = b60Var;
        this.e = request;
        this.f = i2;
        this.g = i3;
        this.h = i4;
    }

    public final zn1 a() {
        return this.f15299a;
    }

    public static do1 a(do1 do1Var, int i, b60 b60Var, vp1 vp1Var, int i2) {
        if ((i2 & 1) != 0) {
            i = do1Var.c;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            b60Var = do1Var.d;
        }
        b60 b60Var2 = b60Var;
        if ((i2 & 4) != 0) {
            vp1Var = do1Var.e;
        }
        vp1 request = vp1Var;
        int i4 = do1Var.f;
        int i5 = do1Var.g;
        int i6 = do1Var.h;
        do1Var.getClass();
        Intrinsics.checkNotNullParameter(request, "request");
        return new do1(do1Var.f15299a, do1Var.b, i3, b60Var2, request, i4, i5, i6);
    }

    public final zn1 b() {
        return this.f15299a;
    }

    public final b60 d() {
        return this.d;
    }

    public final vp1 f() {
        return this.e;
    }

    public final int c() {
        return this.f;
    }

    public final int e() {
        return this.g;
    }

    public final int g() {
        return this.h;
    }

    public final vq1 a(vp1 request) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.c < this.b.size()) {
            this.i++;
            b60 b60Var = this.d;
            if (b60Var != null) {
                if (b60Var.h().a(request.g())) {
                    if (this.i != 1) {
                        throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must call proceed() exactly once").toString());
                    }
                } else {
                    throw new IllegalStateException(("network interceptor " + this.b.get(this.c - 1) + " must retain the same host and port").toString());
                }
            }
            do1 a2 = a(this, this.c + 1, null, request, 58);
            mp0 mp0Var = this.b.get(this.c);
            vq1 a3 = mp0Var.a(a2);
            if (a3 != null) {
                if (this.d != null && this.c + 1 < this.b.size() && a2.i != 1) {
                    throw new IllegalStateException(("network interceptor " + mp0Var + " must call proceed() exactly once").toString());
                }
                if (a3.a() != null) {
                    return a3;
                }
                throw new IllegalStateException(("interceptor " + mp0Var + " returned a response with no body").toString());
            }
            throw new NullPointerException("interceptor " + mp0Var + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    public final int h() {
        return this.g;
    }

    public final vp1 i() {
        return this.e;
    }
}
