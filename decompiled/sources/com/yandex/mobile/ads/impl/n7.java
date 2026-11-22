package com.yandex.mobile.ads.impl;

import com.monetization.ads.quality.base.model.AdQualityVerificationError;
import com.monetization.ads.quality.base.model.configuration.AdQualityVerificationAdConfiguration;
import com.monetization.ads.quality.base.result.AdQualityVerificationResult;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;

/* loaded from: classes5.dex */
public final class n7 {

    /* renamed from: a, reason: collision with root package name */
    private final d7 f16312a;

    public n7(d7 verificationPolicy) {
        Intrinsics.checkNotNullParameter(verificationPolicy, "verificationPolicy");
        this.f16312a = verificationPolicy;
    }

    public final AdQualityVerificationResult.NotVerified a(AdQualityVerificationAdConfiguration adConfiguration) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        m7 m7Var = this.f16312a.a().get(adConfiguration.getVerifiableAdNetwork());
        int b = m7Var != null ? m7Var.b() : this.f16312a.e();
        boolean z = true;
        boolean c = m7Var != null ? !m7Var.a() : this.f16312a.c();
        if (!this.f16312a.d().contains(adConfiguration.getAdUnitId()) && !this.f16312a.d().isEmpty()) {
            z = false;
        }
        if (!c || !z) {
            return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.DisabledError());
        }
        if (Random.INSTANCE.nextInt(0, 100) < b) {
            return null;
        }
        return new AdQualityVerificationResult.NotVerified(new AdQualityVerificationError.LowUsagePercent());
    }
}
