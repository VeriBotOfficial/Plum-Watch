package io.appmetrica.analytics.impl;

import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public final class Se implements V7 {

    /* renamed from: a, reason: collision with root package name */
    public final C3225ff f18066a;
    public final List<Re> b;

    public Se(C3225ff c3225ff, List<Re> list) {
        this.f18066a = c3225ff;
        this.b = list;
    }

    @Override // io.appmetrica.analytics.impl.V7
    public final List<Re> a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.V7
    public final Object b() {
        return this.f18066a;
    }

    public final C3225ff c() {
        return this.f18066a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f18066a + ", candidates=" + this.b + AbstractJsonLexerKt.END_OBJ;
    }
}
