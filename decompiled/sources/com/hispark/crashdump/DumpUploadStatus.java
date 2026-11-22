package com.hispark.crashdump;

import com.hispark.clouddiag.model.DeviceFileErrorCodes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashDumpRepository.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/hispark/crashdump/DumpUploadStatus;", "", "<init>", "(Ljava/lang/String;I)V", "STAGED", "UPLOADING", "UPLOADED", DeviceFileErrorCodes.EXPORT_FAILED, DeviceFileErrorCodes.UPLOAD_FAILED, "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DumpUploadStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DumpUploadStatus[] $VALUES;
    public static final DumpUploadStatus STAGED = new DumpUploadStatus("STAGED", 0);
    public static final DumpUploadStatus UPLOADING = new DumpUploadStatus("UPLOADING", 1);
    public static final DumpUploadStatus UPLOADED = new DumpUploadStatus("UPLOADED", 2);
    public static final DumpUploadStatus EXPORT_FAILED = new DumpUploadStatus(DeviceFileErrorCodes.EXPORT_FAILED, 3);
    public static final DumpUploadStatus UPLOAD_FAILED = new DumpUploadStatus(DeviceFileErrorCodes.UPLOAD_FAILED, 4);

    private static final /* synthetic */ DumpUploadStatus[] $values() {
        return new DumpUploadStatus[]{STAGED, UPLOADING, UPLOADED, EXPORT_FAILED, UPLOAD_FAILED};
    }

    public static EnumEntries<DumpUploadStatus> getEntries() {
        return $ENTRIES;
    }

    private DumpUploadStatus(String str, int i) {
    }

    static {
        DumpUploadStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DumpUploadStatus valueOf(String str) {
        return (DumpUploadStatus) Enum.valueOf(DumpUploadStatus.class, str);
    }

    public static DumpUploadStatus[] values() {
        return (DumpUploadStatus[]) $VALUES.clone();
    }
}
