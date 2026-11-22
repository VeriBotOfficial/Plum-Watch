package io.appmetrica.analytics.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Re {

    /* renamed from: a, reason: collision with root package name */
    public final String f18048a;
    public final JSONObject b;
    public final X7 c;

    public Re(String str, JSONObject jSONObject, X7 x7) {
        this.f18048a = str;
        this.b = jSONObject;
        this.c = x7;
    }

    public final String toString() {
        return "Candidate{trackingId='" + this.f18048a + "', additionalParams=" + this.b + ", source=" + this.c + AbstractJsonLexerKt.END_OBJ;
    }
}
