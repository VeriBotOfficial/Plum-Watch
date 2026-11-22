package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zx {

    /* renamed from: a, reason: collision with root package name */
    private final String f17565a;
    private final ay b;

    public zx(String sdkVersion, ay sdkIntegrationStatusData) {
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sdkIntegrationStatusData, "sdkIntegrationStatusData");
        this.f17565a = sdkVersion;
        this.b = sdkIntegrationStatusData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx)) {
            return false;
        }
        zx zxVar = (zx) obj;
        return Intrinsics.areEqual(this.f17565a, zxVar.f17565a) && Intrinsics.areEqual(this.b, zxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f17565a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationData(sdkVersion=" + this.f17565a + ", sdkIntegrationStatusData=" + this.b + Separators.RPAREN;
    }

    public final String b() {
        return this.f17565a;
    }

    public final ay a() {
        return this.b;
    }
}
