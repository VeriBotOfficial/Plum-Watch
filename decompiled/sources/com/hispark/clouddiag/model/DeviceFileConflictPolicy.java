package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileConflictPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "OVERWRITE", "SKIP", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceFileConflictPolicy {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFileConflictPolicy[] $VALUES;
    public static final DeviceFileConflictPolicy OVERWRITE = new DeviceFileConflictPolicy("OVERWRITE", 0);
    public static final DeviceFileConflictPolicy SKIP = new DeviceFileConflictPolicy("SKIP", 1);

    private static final /* synthetic */ DeviceFileConflictPolicy[] $values() {
        return new DeviceFileConflictPolicy[]{OVERWRITE, SKIP};
    }

    public static EnumEntries<DeviceFileConflictPolicy> getEntries() {
        return $ENTRIES;
    }

    private DeviceFileConflictPolicy(String str, int i) {
    }

    static {
        DeviceFileConflictPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceFileConflictPolicy valueOf(String str) {
        return (DeviceFileConflictPolicy) Enum.valueOf(DeviceFileConflictPolicy.class, str);
    }

    public static DeviceFileConflictPolicy[] values() {
        return (DeviceFileConflictPolicy[]) $VALUES.clone();
    }
}
