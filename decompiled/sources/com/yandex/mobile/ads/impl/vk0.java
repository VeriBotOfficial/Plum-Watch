package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.op1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vk0 {

    /* renamed from: a, reason: collision with root package name */
    private final op1.b f17170a;
    private final op1.b b;
    private final op1.b c;
    private final op1.b d;

    public vk0(op1.b impressionTrackingSuccessReportType, op1.b impressionTrackingStartReportType, op1.b impressionTrackingFailureReportType, op1.b forcedImpressionTrackingFailureReportType) {
        Intrinsics.checkNotNullParameter(impressionTrackingSuccessReportType, "impressionTrackingSuccessReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingStartReportType, "impressionTrackingStartReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingFailureReportType, "impressionTrackingFailureReportType");
        Intrinsics.checkNotNullParameter(forcedImpressionTrackingFailureReportType, "forcedImpressionTrackingFailureReportType");
        this.f17170a = impressionTrackingSuccessReportType;
        this.b = impressionTrackingStartReportType;
        this.c = impressionTrackingFailureReportType;
        this.d = forcedImpressionTrackingFailureReportType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vk0)) {
            return false;
        }
        vk0 vk0Var = (vk0) obj;
        return this.f17170a == vk0Var.f17170a && this.b == vk0Var.b && this.c == vk0Var.c && this.d == vk0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f17170a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f17170a + ", impressionTrackingStartReportType=" + this.b + ", impressionTrackingFailureReportType=" + this.c + ", forcedImpressionTrackingFailureReportType=" + this.d + Separators.RPAREN;
    }

    public final op1.b d() {
        return this.f17170a;
    }

    public final op1.b c() {
        return this.b;
    }

    public final op1.b b() {
        return this.c;
    }

    public final op1.b a() {
        return this.d;
    }
}
