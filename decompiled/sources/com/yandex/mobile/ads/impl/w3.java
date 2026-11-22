package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class w3 {

    /* renamed from: a, reason: collision with root package name */
    private final int f17214a;
    private final String b;
    private final String c;
    private final String d;

    public w3(int i, String description, String displayMessage, String str) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(displayMessage, "displayMessage");
        this.f17214a = i;
        this.b = description;
        this.c = displayMessage;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w3)) {
            return false;
        }
        w3 w3Var = (w3) obj;
        return this.f17214a == w3Var.f17214a && Intrinsics.areEqual(this.b, w3Var.b) && Intrinsics.areEqual(this.c, w3Var.c) && Intrinsics.areEqual(this.d, w3Var.d);
    }

    public final int hashCode() {
        int a2 = v3.a(this.c, v3.a(this.b, Integer.hashCode(this.f17214a) * 31, 31), 31);
        String str = this.d;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "AdFetchRequestError (code: %d, description: %s, adUnitId: %s, display_message: %s)", Arrays.copyOf(new Object[]{Integer.valueOf(this.f17214a), this.b, this.d, this.c}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final int b() {
        return this.f17214a;
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String a() {
        return this.d;
    }
}
