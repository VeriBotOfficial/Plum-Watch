package com.wakeup.feature.health.dashboard;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HdUi.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/health/dashboard/SceneBadge;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENT", "RECOMMEND", DialPromoBanner.NONE, "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneBadge {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SceneBadge[] $VALUES;
    public static final SceneBadge CURRENT = new SceneBadge("CURRENT", 0);
    public static final SceneBadge RECOMMEND = new SceneBadge("RECOMMEND", 1);
    public static final SceneBadge NONE = new SceneBadge(DialPromoBanner.NONE, 2);

    private static final /* synthetic */ SceneBadge[] $values() {
        return new SceneBadge[]{CURRENT, RECOMMEND, NONE};
    }

    public static EnumEntries<SceneBadge> getEntries() {
        return $ENTRIES;
    }

    static {
        SceneBadge[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private SceneBadge(String str, int i) {
    }

    public static SceneBadge valueOf(String str) {
        return (SceneBadge) Enum.valueOf(SceneBadge.class, str);
    }

    public static SceneBadge[] values() {
        return (SceneBadge[]) $VALUES.clone();
    }
}
