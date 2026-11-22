package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.x7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3665x7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3174de f18576a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3665x7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3640w7 fromModel(C3715z7 c3715z7) {
        C3640w7 c3640w7 = new C3640w7();
        Long l = c3715z7.f18606a;
        if (l != null) {
            c3640w7.f18563a = l.longValue();
        }
        Long l2 = c3715z7.b;
        if (l2 != null) {
            c3640w7.b = l2.longValue();
        }
        Boolean bool = c3715z7.c;
        if (bool != null) {
            c3640w7.c = this.f18576a.fromModel(Boolean.valueOf(bool.booleanValue())).intValue();
        }
        return c3640w7;
    }

    public C3665x7(C3174de c3174de) {
        this.f18576a = c3174de;
    }

    public /* synthetic */ C3665x7(C3174de c3174de, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3174de() : c3174de);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3715z7 toModel(C3640w7 c3640w7) {
        C3640w7 c3640w72 = new C3640w7();
        Long valueOf = Long.valueOf(c3640w7.f18563a);
        if (valueOf.longValue() == c3640w72.f18563a) {
            valueOf = null;
        }
        Long valueOf2 = Long.valueOf(c3640w7.b);
        return new C3715z7(valueOf, valueOf2.longValue() != c3640w72.b ? valueOf2 : null, this.f18576a.a(c3640w7.c));
    }
}
