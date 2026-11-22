package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class je {

    /* renamed from: a, reason: collision with root package name */
    private final String f15905a;
    private final String b;

    public je(ke appAdAnalyticsReportType, JSONObject payloadJson) {
        Intrinsics.checkNotNullParameter(appAdAnalyticsReportType, "appAdAnalyticsReportType");
        Intrinsics.checkNotNullParameter(payloadJson, "payloadJson");
        this.f15905a = appAdAnalyticsReportType.a();
        String jSONObject = payloadJson.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject, "toString(...)");
        this.b = jSONObject;
    }

    public final String a() {
        return this.f15905a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof je)) {
            return false;
        }
        je jeVar = (je) obj;
        return Intrinsics.areEqual(jeVar.f15905a, this.f15905a) && Intrinsics.areEqual(jeVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f15905a.hashCode() * 31);
    }
}
