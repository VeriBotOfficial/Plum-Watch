package com.hispark.clouddiag.devicefile;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFileTaskExecutor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/devicefile/DeviceFileCommandAcceptance;", "", "<init>", "(Ljava/lang/String;I)V", "ACCEPTED", "BUSY", "DUPLICATE", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceFileCommandAcceptance {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFileCommandAcceptance[] $VALUES;
    public static final DeviceFileCommandAcceptance ACCEPTED = new DeviceFileCommandAcceptance("ACCEPTED", 0);
    public static final DeviceFileCommandAcceptance BUSY = new DeviceFileCommandAcceptance("BUSY", 1);
    public static final DeviceFileCommandAcceptance DUPLICATE = new DeviceFileCommandAcceptance("DUPLICATE", 2);

    private static final /* synthetic */ DeviceFileCommandAcceptance[] $values() {
        return new DeviceFileCommandAcceptance[]{ACCEPTED, BUSY, DUPLICATE};
    }

    public static EnumEntries<DeviceFileCommandAcceptance> getEntries() {
        return $ENTRIES;
    }

    private DeviceFileCommandAcceptance(String str, int i) {
    }

    static {
        DeviceFileCommandAcceptance[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceFileCommandAcceptance valueOf(String str) {
        return (DeviceFileCommandAcceptance) Enum.valueOf(DeviceFileCommandAcceptance.class, str);
    }

    public static DeviceFileCommandAcceptance[] values() {
        return (DeviceFileCommandAcceptance[]) $VALUES.clone();
    }
}
