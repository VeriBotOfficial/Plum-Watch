package com.hispark.clouddiag.callback;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceWriteStartStatus;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "BUSY", "UNSUPPORTED", "FAILED", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceWriteStartStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceWriteStartStatus[] $VALUES;
    public static final DeviceWriteStartStatus ACCEPTED = new DeviceWriteStartStatus("ACCEPTED", 0);
    public static final DeviceWriteStartStatus BUSY = new DeviceWriteStartStatus("BUSY", 1);
    public static final DeviceWriteStartStatus UNSUPPORTED = new DeviceWriteStartStatus("UNSUPPORTED", 2);
    public static final DeviceWriteStartStatus FAILED = new DeviceWriteStartStatus("FAILED", 3);

    private static final /* synthetic */ DeviceWriteStartStatus[] $values() {
        return new DeviceWriteStartStatus[]{ACCEPTED, BUSY, UNSUPPORTED, FAILED};
    }

    public static EnumEntries<DeviceWriteStartStatus> getEntries() {
        return $ENTRIES;
    }

    private DeviceWriteStartStatus(String str, int i) {
    }

    static {
        DeviceWriteStartStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceWriteStartStatus valueOf(String str) {
        return (DeviceWriteStartStatus) Enum.valueOf(DeviceWriteStartStatus.class, str);
    }

    public static DeviceWriteStartStatus[] values() {
        return (DeviceWriteStartStatus[]) $VALUES.clone();
    }
}
