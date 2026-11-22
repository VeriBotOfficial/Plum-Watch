package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileTaskStatus;", "", "<init>", "(Ljava/lang/String;I)V", DebugCoroutineInfoImplKt.RUNNING, "SUCCESS", "FAILED", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceFileTaskStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFileTaskStatus[] $VALUES;
    public static final DeviceFileTaskStatus RUNNING = new DeviceFileTaskStatus(DebugCoroutineInfoImplKt.RUNNING, 0);
    public static final DeviceFileTaskStatus SUCCESS = new DeviceFileTaskStatus("SUCCESS", 1);
    public static final DeviceFileTaskStatus FAILED = new DeviceFileTaskStatus("FAILED", 2);

    private static final /* synthetic */ DeviceFileTaskStatus[] $values() {
        return new DeviceFileTaskStatus[]{RUNNING, SUCCESS, FAILED};
    }

    public static EnumEntries<DeviceFileTaskStatus> getEntries() {
        return $ENTRIES;
    }

    private DeviceFileTaskStatus(String str, int i) {
    }

    static {
        DeviceFileTaskStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceFileTaskStatus valueOf(String str) {
        return (DeviceFileTaskStatus) Enum.valueOf(DeviceFileTaskStatus.class, str);
    }

    public static DeviceFileTaskStatus[] values() {
        return (DeviceFileTaskStatus[]) $VALUES.clone();
    }
}
