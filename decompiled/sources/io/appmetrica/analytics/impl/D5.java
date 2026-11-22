package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class D5 implements Wc {

    /* renamed from: a, reason: collision with root package name */
    public final String f17810a;

    public D5(String str) {
        this.f17810a = str;
    }

    public final D5 a(String str) {
        return new D5(str);
    }

    public final String b() {
        return this.f17810a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof D5) && Intrinsics.areEqual(this.f17810a, ((D5) obj).f17810a);
    }

    public final int hashCode() {
        return this.f17810a.hashCode();
    }

    public final String toString() {
        return "ConstantModuleEntryPointProvider(className=" + this.f17810a + ')';
    }

    public static D5 a(D5 d5, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = d5.f17810a;
        }
        d5.getClass();
        return new D5(str);
    }

    @Override // io.appmetrica.analytics.impl.Wc
    public final String a() {
        return this.f17810a;
    }
}
