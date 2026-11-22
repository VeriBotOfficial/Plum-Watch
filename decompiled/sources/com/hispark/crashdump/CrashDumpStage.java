package com.hispark.crashdump;

import com.hispark.clouddiag.model.DeviceFileErrorCodes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/hispark/crashdump/CrashDumpStage;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "PENDING_EXPORT", "EXPORTING", "STAGED", "UPLOADING", "UPLOADED", DeviceFileErrorCodes.EXPORT_FAILED, DeviceFileErrorCodes.UPLOAD_FAILED, "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CrashDumpStage {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CrashDumpStage[] $VALUES;
    public static final CrashDumpStage IDLE = new CrashDumpStage("IDLE", 0);
    public static final CrashDumpStage PENDING_EXPORT = new CrashDumpStage("PENDING_EXPORT", 1);
    public static final CrashDumpStage EXPORTING = new CrashDumpStage("EXPORTING", 2);
    public static final CrashDumpStage STAGED = new CrashDumpStage("STAGED", 3);
    public static final CrashDumpStage UPLOADING = new CrashDumpStage("UPLOADING", 4);
    public static final CrashDumpStage UPLOADED = new CrashDumpStage("UPLOADED", 5);
    public static final CrashDumpStage EXPORT_FAILED = new CrashDumpStage(DeviceFileErrorCodes.EXPORT_FAILED, 6);
    public static final CrashDumpStage UPLOAD_FAILED = new CrashDumpStage(DeviceFileErrorCodes.UPLOAD_FAILED, 7);

    private static final /* synthetic */ CrashDumpStage[] $values() {
        return new CrashDumpStage[]{IDLE, PENDING_EXPORT, EXPORTING, STAGED, UPLOADING, UPLOADED, EXPORT_FAILED, UPLOAD_FAILED};
    }

    public static EnumEntries<CrashDumpStage> getEntries() {
        return $ENTRIES;
    }

    private CrashDumpStage(String str, int i) {
    }

    static {
        CrashDumpStage[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static CrashDumpStage valueOf(String str) {
        return (CrashDumpStage) Enum.valueOf(CrashDumpStage.class, str);
    }

    public static CrashDumpStage[] values() {
        return (CrashDumpStage[]) $VALUES.clone();
    }
}
