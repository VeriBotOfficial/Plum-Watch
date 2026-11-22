package com.wakeup.feature.health.bloodGlucose.diabetes;

import kotlin.Metadata;

/* compiled from: DiabetesReportAccess.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesReportAccess;", "", "<init>", "()V", "REQUIRE_AI_VIP_FOR_REPORT", "", "isFullReportUnlocked", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiabetesReportAccess {
    public static final int $stable = 0;
    public static final DiabetesReportAccess INSTANCE = new DiabetesReportAccess();
    private static final boolean REQUIRE_AI_VIP_FOR_REPORT = false;

    public final boolean isFullReportUnlocked() {
        return true;
    }

    private DiabetesReportAccess() {
    }
}
