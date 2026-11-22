package com.wakeup.common.device;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceLevel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/common/device/DeviceTier;", "", "<init>", "(Ljava/lang/String;I)V", "LOW", "MID", "HIGH", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceTier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceTier[] $VALUES;
    public static final DeviceTier LOW = new DeviceTier("LOW", 0);
    public static final DeviceTier MID = new DeviceTier("MID", 1);
    public static final DeviceTier HIGH = new DeviceTier("HIGH", 2);

    private static final /* synthetic */ DeviceTier[] $values() {
        return new DeviceTier[]{LOW, MID, HIGH};
    }

    public static EnumEntries<DeviceTier> getEntries() {
        return $ENTRIES;
    }

    private DeviceTier(String str, int i) {
    }

    static {
        DeviceTier[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceTier valueOf(String str) {
        return (DeviceTier) Enum.valueOf(DeviceTier.class, str);
    }

    public static DeviceTier[] values() {
        return (DeviceTier[]) $VALUES.clone();
    }
}
