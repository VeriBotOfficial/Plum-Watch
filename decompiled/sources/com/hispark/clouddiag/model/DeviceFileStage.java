package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileStage;", "", "<init>", "(Ljava/lang/String;I)V", "LISTING", "CREATING_DIRECTORY", "DOWNLOADING", "COMPRESSING", "UPLOADING", "VERIFYING", "DELETING", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceFileStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFileStage[] $VALUES;
    public static final DeviceFileStage LISTING = new DeviceFileStage("LISTING", 0);
    public static final DeviceFileStage CREATING_DIRECTORY = new DeviceFileStage("CREATING_DIRECTORY", 1);
    public static final DeviceFileStage DOWNLOADING = new DeviceFileStage("DOWNLOADING", 2);
    public static final DeviceFileStage COMPRESSING = new DeviceFileStage("COMPRESSING", 3);
    public static final DeviceFileStage UPLOADING = new DeviceFileStage("UPLOADING", 4);
    public static final DeviceFileStage VERIFYING = new DeviceFileStage("VERIFYING", 5);
    public static final DeviceFileStage DELETING = new DeviceFileStage("DELETING", 6);

    private static final /* synthetic */ DeviceFileStage[] $values() {
        return new DeviceFileStage[]{LISTING, CREATING_DIRECTORY, DOWNLOADING, COMPRESSING, UPLOADING, VERIFYING, DELETING};
    }

    public static EnumEntries<DeviceFileStage> getEntries() {
        return $ENTRIES;
    }

    private DeviceFileStage(String str, int i) {
    }

    static {
        DeviceFileStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DeviceFileStage valueOf(String str) {
        return (DeviceFileStage) Enum.valueOf(DeviceFileStage.class, str);
    }

    public static DeviceFileStage[] values() {
        return (DeviceFileStage[]) $VALUES.clone();
    }
}
