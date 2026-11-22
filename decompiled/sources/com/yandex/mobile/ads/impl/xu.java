package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xu {

    /* renamed from: a, reason: collision with root package name */
    private final m80 f17366a;
    private final List<l62> b;
    private final qr0 c;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private m80 f17367a;
        private List<l62> b;
        private qr0 c;

        public final void a(m80 m80Var) {
            this.f17367a = m80Var;
        }

        public final void a(qr0 qr0Var) {
            this.c = qr0Var;
        }

        public final void a(List list) {
            this.b = list;
        }

        public final xu a() {
            return new xu(this.f17367a, this.b, this.c);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xu)) {
            return false;
        }
        xu xuVar = (xu) obj;
        return Intrinsics.areEqual(this.f17366a, xuVar.f17366a) && Intrinsics.areEqual(this.b, xuVar.b) && Intrinsics.areEqual(this.c, xuVar.c);
    }

    public final int hashCode() {
        m80 m80Var = this.f17366a;
        int hashCode = (m80Var == null ? 0 : m80Var.hashCode()) * 31;
        List<l62> list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        qr0 qr0Var = this.c;
        return hashCode2 + (qr0Var != null ? qr0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CreativeExtensions(falseClick=" + this.f17366a + ", trackingEvents=" + this.b + ", linearCreativeInfo=" + this.c + Separators.RPAREN;
    }

    public xu(m80 m80Var, List<l62> list, qr0 qr0Var) {
        this.f17366a = m80Var;
        this.b = list;
        this.c = qr0Var;
    }

    public final m80 a() {
        return this.f17366a;
    }

    public final List<l62> c() {
        return this.b;
    }

    public final qr0 b() {
        return this.c;
    }
}
