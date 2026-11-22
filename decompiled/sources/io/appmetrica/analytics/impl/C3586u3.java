package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* renamed from: io.appmetrica.analytics.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C3586u3 implements InterfaceC3611v3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f18523a;

    public C3586u3(int i) {
        this.f18523a = i;
    }

    public static InterfaceC3611v3 a(InterfaceC3611v3... interfaceC3611v3Arr) {
        return new C3586u3(b(interfaceC3611v3Arr));
    }

    public static int b(InterfaceC3611v3... interfaceC3611v3Arr) {
        int i = 0;
        for (InterfaceC3611v3 interfaceC3611v3 : interfaceC3611v3Arr) {
            if (interfaceC3611v3 != null) {
                i = interfaceC3611v3.getBytesTruncated() + i;
            }
        }
        return i;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3611v3
    public final int getBytesTruncated() {
        return this.f18523a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f18523a + AbstractJsonLexerKt.END_OBJ;
    }
}
