package com.wakeup.feature.aimusic.network;

import com.wakeup.common.network.host.AcAdapterHosts;
import kotlin.Metadata;

/* compiled from: AsmrConfig.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/aimusic/network/AsmrConfig;", "", "<init>", "()V", "AUTH_HEADER", "", "baseUrl", "getBaseUrl", "()Ljava/lang/String;", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AsmrConfig {
    public static final String AUTH_HEADER = "Basic bGxtOlJtZjQjTGNHKGlGWnJqVTsySg==";
    public static final AsmrConfig INSTANCE = new AsmrConfig();

    private AsmrConfig() {
    }

    public final String getBaseUrl() {
        return AcAdapterHosts.httpBase$default("asmr/", false, 2, null);
    }
}
