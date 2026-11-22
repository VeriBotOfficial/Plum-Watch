package com.wakeup.feature.health.bodyindex.ui;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BodyIndexCommon.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/wakeup/feature/health/bodyindex/ui/ChartStyle;", "", "<init>", "(Ljava/lang/String;I)V", "Bar", "Line", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChartStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChartStyle[] $VALUES;
    public static final ChartStyle Bar = new ChartStyle("Bar", 0);
    public static final ChartStyle Line = new ChartStyle("Line", 1);

    private static final /* synthetic */ ChartStyle[] $values() {
        return new ChartStyle[]{Bar, Line};
    }

    public static EnumEntries<ChartStyle> getEntries() {
        return $ENTRIES;
    }

    static {
        ChartStyle[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ChartStyle(String str, int i) {
    }

    public static ChartStyle valueOf(String str) {
        return (ChartStyle) Enum.valueOf(ChartStyle.class, str);
    }

    public static ChartStyle[] values() {
        return (ChartStyle[]) $VALUES.clone();
    }
}
