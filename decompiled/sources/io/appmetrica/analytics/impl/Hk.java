package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class Hk extends ECommerceEvent {

    /* renamed from: a, reason: collision with root package name */
    public final Si f17890a;
    public final InterfaceC3268h8 b;

    public Hk(ECommerceScreen eCommerceScreen) {
        this(new Si(eCommerceScreen), new Ik());
    }

    public final InterfaceC3268h8 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC3673xf
    public final List<C3576ti> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.f17890a + ", converter=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }

    public Hk(Si si, InterfaceC3268h8 interfaceC3268h8) {
        this.f17890a = si;
        this.b = interfaceC3268h8;
    }
}
