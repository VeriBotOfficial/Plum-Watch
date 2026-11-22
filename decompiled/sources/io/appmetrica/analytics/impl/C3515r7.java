package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: io.appmetrica.analytics.impl.r7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3515r7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3174de f18476a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3515r7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3615v7 fromModel(C3491q7 c3491q7) {
        C3615v7 c3615v7 = new C3615v7();
        Boolean bool = c3491q7.f18463a;
        if (bool != null) {
            c3615v7.f18547a = this.f18476a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        Double d = c3491q7.c;
        if (d != null) {
            c3615v7.c = d.doubleValue();
        }
        Double d2 = c3491q7.b;
        if (d2 != null) {
            c3615v7.b = d2.doubleValue();
        }
        Long l = c3491q7.h;
        if (l != null) {
            c3615v7.h = l.longValue();
        }
        Integer num = c3491q7.f;
        if (num != null) {
            c3615v7.f = num.intValue();
        }
        Integer num2 = c3491q7.e;
        if (num2 != null) {
            c3615v7.e = num2.intValue();
        }
        Integer num3 = c3491q7.g;
        if (num3 != null) {
            c3615v7.g = num3.intValue();
        }
        Integer num4 = c3491q7.d;
        if (num4 != null) {
            c3615v7.d = num4.intValue();
        }
        String str = c3491q7.i;
        if (str != null) {
            c3615v7.i = str;
        }
        String str2 = c3491q7.j;
        if (str2 != null) {
            c3615v7.j = str2;
        }
        return c3615v7;
    }

    public C3515r7(C3174de c3174de) {
        this.f18476a = c3174de;
    }

    public /* synthetic */ C3515r7(C3174de c3174de, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3174de() : c3174de);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3491q7 toModel(C3615v7 c3615v7) {
        if (c3615v7 == null) {
            return new C3491q7(null, null, null, null, null, null, null, null, null, null);
        }
        C3615v7 c3615v72 = new C3615v7();
        Boolean a2 = this.f18476a.a(c3615v7.f18547a);
        Double valueOf = Double.valueOf(c3615v7.c);
        if (valueOf.doubleValue() == c3615v72.c) {
            valueOf = null;
        }
        Double valueOf2 = Double.valueOf(c3615v7.b);
        Double d = !(valueOf2.doubleValue() == c3615v72.b) ? valueOf2 : null;
        Long valueOf3 = Long.valueOf(c3615v7.h);
        Long l = valueOf3.longValue() != c3615v72.h ? valueOf3 : null;
        Integer valueOf4 = Integer.valueOf(c3615v7.f);
        Integer num = valueOf4.intValue() != c3615v72.f ? valueOf4 : null;
        Integer valueOf5 = Integer.valueOf(c3615v7.e);
        Integer num2 = valueOf5.intValue() != c3615v72.e ? valueOf5 : null;
        Integer valueOf6 = Integer.valueOf(c3615v7.g);
        Integer num3 = valueOf6.intValue() != c3615v72.g ? valueOf6 : null;
        Integer valueOf7 = Integer.valueOf(c3615v7.d);
        Integer num4 = valueOf7.intValue() != c3615v72.d ? valueOf7 : null;
        String str = c3615v7.i;
        String str2 = !Intrinsics.areEqual(str, c3615v72.i) ? str : null;
        String str3 = c3615v7.j;
        return new C3491q7(a2, d, valueOf, num4, num2, num, num3, l, str2, !Intrinsics.areEqual(str3, c3615v72.j) ? str3 : null);
    }
}
