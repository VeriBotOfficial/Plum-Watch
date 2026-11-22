package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class wa2 implements jg2 {

    /* renamed from: a, reason: collision with root package name */
    private final String f17233a;
    private final oq0 b;
    private final String c;
    private final Map<String, List<String>> d;

    public wa2(String vendor, oq0 oq0Var, String str, HashMap events) {
        Intrinsics.checkNotNullParameter(vendor, "vendor");
        Intrinsics.checkNotNullParameter(events, "events");
        this.f17233a = vendor;
        this.b = oq0Var;
        this.c = str;
        this.d = events;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa2)) {
            return false;
        }
        wa2 wa2Var = (wa2) obj;
        return Intrinsics.areEqual(this.f17233a, wa2Var.f17233a) && Intrinsics.areEqual(this.b, wa2Var.b) && Intrinsics.areEqual(this.c, wa2Var.c) && Intrinsics.areEqual(this.d, wa2Var.d);
    }

    public final int hashCode() {
        int hashCode = this.f17233a.hashCode() * 31;
        oq0 oq0Var = this.b;
        int hashCode2 = (hashCode + (oq0Var == null ? 0 : oq0Var.hashCode())) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Verification(vendor=" + this.f17233a + ", javaScriptResource=" + this.b + ", parameters=" + this.c + ", events=" + this.d + Separators.RPAREN;
    }

    public final String d() {
        return this.f17233a;
    }

    public final oq0 b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    @Override // com.yandex.mobile.ads.impl.jg2
    public final Map<String, List<String>> a() {
        Map<String, List<String>> unmodifiableMap = Collections.unmodifiableMap(this.d);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        return unmodifiableMap;
    }
}
