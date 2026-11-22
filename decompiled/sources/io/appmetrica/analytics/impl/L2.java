package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ExternalAttribution;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public class L2 implements ExternalAttribution {

    /* renamed from: a, reason: collision with root package name */
    public final H9 f17949a;

    public L2(H9 h9) {
        this.f17949a = h9;
    }

    @Override // io.appmetrica.analytics.ExternalAttribution
    public final byte[] toBytes() {
        return MessageNano.toByteArray(this.f17949a);
    }

    public final String toString() {
        return "ExternalAttribution(type=`" + R9.a(this.f17949a.f17884a) + "`value=`" + new String(this.f17949a.b, Charsets.UTF_8) + "`)";
    }
}
