package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: io.appmetrica.analytics.impl.y7, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3690y7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3665x7 f18590a;

    /* JADX WARN: Multi-variable type inference failed */
    public C3690y7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final byte[] a(C3715z7 c3715z7) {
        return MessageNano.toByteArray(this.f18590a.fromModel(c3715z7));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object fromModel(Object obj) {
        return MessageNano.toByteArray(this.f18590a.fromModel((C3715z7) obj));
    }

    public C3690y7(C3665x7 c3665x7) {
        this.f18590a = c3665x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x000d, code lost:
    
        if (r2 == null) goto L5;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.impl.C3715z7 toModel(byte[] r2) {
        /*
            r1 = this;
            if (r2 == 0) goto Lf
            io.appmetrica.analytics.impl.w7 r0 = new io.appmetrica.analytics.impl.w7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r0.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.protobuf.nano.MessageNano r2 = io.appmetrica.analytics.protobuf.nano.MessageNano.mergeFrom(r0, r2)     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            io.appmetrica.analytics.impl.w7 r2 = (io.appmetrica.analytics.impl.C3640w7) r2     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            if (r2 != 0) goto L1a
        Lf:
            io.appmetrica.analytics.impl.w7 r2 = new io.appmetrica.analytics.impl.w7     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            r2.<init>()     // Catch: io.appmetrica.analytics.protobuf.nano.InvalidProtocolBufferNanoException -> L15
            goto L1a
        L15:
            io.appmetrica.analytics.impl.w7 r2 = new io.appmetrica.analytics.impl.w7
            r2.<init>()
        L1a:
            io.appmetrica.analytics.impl.x7 r0 = r1.f18590a
            io.appmetrica.analytics.impl.z7 r2 = r0.toModel(r2)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.impl.C3690y7.toModel(byte[]):io.appmetrica.analytics.impl.z7");
    }

    public /* synthetic */ C3690y7(C3665x7 c3665x7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3665x7(null, 1, null) : c3665x7);
    }
}
