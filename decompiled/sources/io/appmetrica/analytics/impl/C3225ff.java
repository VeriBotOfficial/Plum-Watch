package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.ff, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3225ff implements Y7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18273a;
    public final JSONObject b;
    public final boolean c;
    public final boolean d;
    public final X7 e;

    public C3225ff(String str, JSONObject jSONObject, boolean z, boolean z2, X7 x7) {
        this.f18273a = str;
        this.b = jSONObject;
        this.c = z;
        this.d = z2;
        this.e = x7;
    }

    @Override // io.appmetrica.analytics.impl.Y7
    public final X7 a() {
        return this.e;
    }

    public final JSONObject b() {
        if (!this.c) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f18273a);
            if (this.b.length() > 0) {
                jSONObject.put("additionalParams", this.b);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("trackingId", this.f18273a);
            jSONObject.put("additionalParams", this.b);
            jSONObject.put("wasSet", this.c);
            jSONObject.put("autoTracking", this.d);
            jSONObject.put("source", this.e.f18132a);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public final String toString() {
        return "PreloadInfoState{trackingId='" + this.f18273a + "', additionalParameters=" + this.b + ", wasSet=" + this.c + ", autoTrackingEnabled=" + this.d + ", source=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }

    public static C3225ff a(JSONObject jSONObject) {
        X7 x7;
        String optStringOrNull = JsonUtils.optStringOrNull(jSONObject, "trackingId");
        JSONObject optJsonObjectOrDefault = JsonUtils.optJsonObjectOrDefault(jSONObject, "additionalParams", new JSONObject());
        int i = 0;
        boolean optBooleanOrDefault = JsonUtils.optBooleanOrDefault(jSONObject, "wasSet", false);
        boolean optBooleanOrDefault2 = JsonUtils.optBooleanOrDefault(jSONObject, "autoTracking", false);
        String optStringOrNull2 = JsonUtils.optStringOrNull(jSONObject, "source");
        X7[] values = X7.values();
        int length = values.length;
        while (true) {
            if (i >= length) {
                x7 = null;
                break;
            }
            x7 = values[i];
            if (Intrinsics.areEqual(x7.f18132a, optStringOrNull2)) {
                break;
            }
            i++;
        }
        if (x7 == null) {
            x7 = X7.b;
        }
        return new C3225ff(optStringOrNull, optJsonObjectOrDefault, optBooleanOrDefault, optBooleanOrDefault2, x7);
    }
}
