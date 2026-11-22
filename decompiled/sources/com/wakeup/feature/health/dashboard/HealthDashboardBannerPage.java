package com.wakeup.feature.health.dashboard;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HealthDashboardHost.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HealthDashboardBannerPage;", "", "<init>", "(Ljava/lang/String;I)V", "SCENE_SELECT", "SCENE_CONFIRM", "GENERAL_DASHBOARD", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDashboardBannerPage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HealthDashboardBannerPage[] $VALUES;
    public static final HealthDashboardBannerPage SCENE_SELECT = new HealthDashboardBannerPage("SCENE_SELECT", 0);
    public static final HealthDashboardBannerPage SCENE_CONFIRM = new HealthDashboardBannerPage("SCENE_CONFIRM", 1);
    public static final HealthDashboardBannerPage GENERAL_DASHBOARD = new HealthDashboardBannerPage("GENERAL_DASHBOARD", 2);

    private static final /* synthetic */ HealthDashboardBannerPage[] $values() {
        return new HealthDashboardBannerPage[]{SCENE_SELECT, SCENE_CONFIRM, GENERAL_DASHBOARD};
    }

    public static EnumEntries<HealthDashboardBannerPage> getEntries() {
        return $ENTRIES;
    }

    private HealthDashboardBannerPage(String str, int i) {
    }

    static {
        HealthDashboardBannerPage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HealthDashboardBannerPage valueOf(String str) {
        return (HealthDashboardBannerPage) Enum.valueOf(HealthDashboardBannerPage.class, str);
    }

    public static HealthDashboardBannerPage[] values() {
        return (HealthDashboardBannerPage[]) $VALUES.clone();
    }
}
