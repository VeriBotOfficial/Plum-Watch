package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/hispark/crashdump/DumpFileTransferKind;", "", "<init>", "(Ljava/lang/String;I)V", "BOARD_DOWNLOAD", "CLOUD_UPLOAD", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DumpFileTransferKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DumpFileTransferKind[] $VALUES;
    public static final DumpFileTransferKind BOARD_DOWNLOAD = new DumpFileTransferKind("BOARD_DOWNLOAD", 0);
    public static final DumpFileTransferKind CLOUD_UPLOAD = new DumpFileTransferKind("CLOUD_UPLOAD", 1);

    private static final /* synthetic */ DumpFileTransferKind[] $values() {
        return new DumpFileTransferKind[]{BOARD_DOWNLOAD, CLOUD_UPLOAD};
    }

    public static EnumEntries<DumpFileTransferKind> getEntries() {
        return $ENTRIES;
    }

    private DumpFileTransferKind(String str, int i) {
    }

    static {
        DumpFileTransferKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DumpFileTransferKind valueOf(String str) {
        return (DumpFileTransferKind) Enum.valueOf(DumpFileTransferKind.class, str);
    }

    public static DumpFileTransferKind[] values() {
        return (DumpFileTransferKind[]) $VALUES.clone();
    }
}
