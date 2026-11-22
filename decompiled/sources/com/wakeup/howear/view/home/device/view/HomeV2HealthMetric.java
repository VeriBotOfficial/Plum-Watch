package com.wakeup.howear.view.home.device.view;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: HomeV2BelowCardsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/wakeup/howear/view/home/device/view/HomeV2HealthMetric;", "", "<init>", "(Ljava/lang/String;I)V", "HEART", "BLOOD_OXYGEN", "BLOOD_PRESSURE", "BREATHE", "TEMPERATURE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HomeV2HealthMetric {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HomeV2HealthMetric[] $VALUES;
    public static final HomeV2HealthMetric HEART = new HomeV2HealthMetric("HEART", 0);
    public static final HomeV2HealthMetric BLOOD_OXYGEN = new HomeV2HealthMetric("BLOOD_OXYGEN", 1);
    public static final HomeV2HealthMetric BLOOD_PRESSURE = new HomeV2HealthMetric("BLOOD_PRESSURE", 2);
    public static final HomeV2HealthMetric BREATHE = new HomeV2HealthMetric("BREATHE", 3);
    public static final HomeV2HealthMetric TEMPERATURE = new HomeV2HealthMetric("TEMPERATURE", 4);

    private static final /* synthetic */ HomeV2HealthMetric[] $values() {
        return new HomeV2HealthMetric[]{HEART, BLOOD_OXYGEN, BLOOD_PRESSURE, BREATHE, TEMPERATURE};
    }

    public static EnumEntries<HomeV2HealthMetric> getEntries() {
        return $ENTRIES;
    }

    private HomeV2HealthMetric(String str, int i) {
    }

    static {
        HomeV2HealthMetric[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static HomeV2HealthMetric valueOf(String str) {
        return (HomeV2HealthMetric) Enum.valueOf(HomeV2HealthMetric.class, str);
    }

    public static HomeV2HealthMetric[] values() {
        return (HomeV2HealthMetric[]) $VALUES.clone();
    }
}
