package io.appmetrica.analytics.impl;

import android.gov.nist.javax.sip.header.ParameterNames;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Y9 {

    /* renamed from: a, reason: collision with root package name */
    public final String f18151a;
    public final int b;
    public final boolean c;

    public Y9(JSONObject jSONObject) {
        this.f18151a = jSONObject.getString("name");
        this.c = jSONObject.getBoolean(ParameterNames.REQUIRED);
        this.b = jSONObject.optInt("version", -1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Y9.class == obj.getClass()) {
            Y9 y9 = (Y9) obj;
            if (this.b != y9.b || this.c != y9.c) {
                return false;
            }
            String str = this.f18151a;
            String str2 = y9.f18151a;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f18151a;
        return ((((str != null ? str.hashCode() : 0) * 31) + this.b) * 31) + (this.c ? 1 : 0);
    }

    public Y9(String str, int i, boolean z) {
        this.f18151a = str;
        this.b = i;
        this.c = z;
    }
}
