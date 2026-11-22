package com.wakeup.feature.health.bloodGlucose.diabetes;

import com.wakeup.module.ai.port.MoeAgiThinkingFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiabetesThinkingFilter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/health/bloodGlucose/diabetes/DiabetesThinkingFilter;", "", "<init>", "()V", "strip", "", "content", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiabetesThinkingFilter {
    public static final int $stable = 0;
    public static final DiabetesThinkingFilter INSTANCE = new DiabetesThinkingFilter();

    private DiabetesThinkingFilter() {
    }

    public final String strip(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return MoeAgiThinkingFilter.INSTANCE.strip(content);
    }
}
