package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.cu0;

/* loaded from: classes5.dex */
public final class g62 {

    /* renamed from: a, reason: collision with root package name */
    public final int f15557a;
    public final ap1[] b;
    public final h70[] c;
    public final b72 d;
    public final Object e;

    public g62(ap1[] ap1VarArr, h70[] h70VarArr, b72 b72Var, cu0.a aVar) {
        this.b = ap1VarArr;
        this.c = (h70[]) h70VarArr.clone();
        this.d = b72Var;
        this.e = aVar;
        this.f15557a = ap1VarArr.length;
    }

    public final boolean a(int i) {
        return this.b[i] != null;
    }
}
