package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlinx.coroutines.debug.internal.DebugCoroutineInfoImplKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/hispark/crashdump/DumpFileTransferStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", DebugCoroutineInfoImplKt.RUNNING, "FINISHED", "FAILED", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DumpFileTransferStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DumpFileTransferStatus[] $VALUES;
    public static final DumpFileTransferStatus PENDING = new DumpFileTransferStatus("PENDING", 0);
    public static final DumpFileTransferStatus RUNNING = new DumpFileTransferStatus(DebugCoroutineInfoImplKt.RUNNING, 1);
    public static final DumpFileTransferStatus FINISHED = new DumpFileTransferStatus("FINISHED", 2);
    public static final DumpFileTransferStatus FAILED = new DumpFileTransferStatus("FAILED", 3);

    private static final /* synthetic */ DumpFileTransferStatus[] $values() {
        return new DumpFileTransferStatus[]{PENDING, RUNNING, FINISHED, FAILED};
    }

    public static EnumEntries<DumpFileTransferStatus> getEntries() {
        return $ENTRIES;
    }

    private DumpFileTransferStatus(String str, int i) {
    }

    static {
        DumpFileTransferStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DumpFileTransferStatus valueOf(String str) {
        return (DumpFileTransferStatus) Enum.valueOf(DumpFileTransferStatus.class, str);
    }

    public static DumpFileTransferStatus[] values() {
        return (DumpFileTransferStatus[]) $VALUES.clone();
    }
}
