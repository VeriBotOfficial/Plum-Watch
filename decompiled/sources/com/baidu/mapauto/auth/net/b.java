package com.baidu.mapauto.auth.net;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public Integer f8250a;
    public String b;
    public String c;
    public Exception d = null;

    public final String toString() {
        return com.baidu.mapauto.auth.b.a("NetBodyStringResponse{httpCode=").append(this.f8250a).append(", httpMessage='").append(this.b).append('\'').append(", body='").append(this.c).append('\'').append(", httpException=").append(this.d).append(AbstractJsonLexerKt.END_OBJ).toString();
    }
}
