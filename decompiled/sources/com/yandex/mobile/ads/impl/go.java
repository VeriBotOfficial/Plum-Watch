package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class go {

    /* renamed from: a, reason: collision with root package name */
    private final String f15616a;
    private final Map<String, String> b;

    public go(String scheme, Map<String, String> authParams) {
        String str;
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(authParams, "authParams");
        this.f15616a = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                str = key.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            linkedHashMap.put(str, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap(...)");
        this.b = unmodifiableMap;
    }

    public final String c() {
        return this.f15616a;
    }

    public final String b() {
        return this.b.get("realm");
    }

    public final Charset a() {
        String str = this.b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return Intrinsics.areEqual(goVar.f15616a, this.f15616a) && Intrinsics.areEqual(goVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + v3.a(this.f15616a, 899, 31);
    }

    public final String toString() {
        return this.f15616a + " authParams=" + this.b;
    }
}
