package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TransferArbiter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/crashdump/TransferKind;", "", "<init>", "(Ljava/lang/String;I)V", "MANUAL_UPLOAD", "MANUAL_DOWNLOAD", "DUMP_EXPORT", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TransferKind {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferKind[] $VALUES;
    public static final TransferKind MANUAL_UPLOAD = new TransferKind("MANUAL_UPLOAD", 0);
    public static final TransferKind MANUAL_DOWNLOAD = new TransferKind("MANUAL_DOWNLOAD", 1);
    public static final TransferKind DUMP_EXPORT = new TransferKind("DUMP_EXPORT", 2);

    private static final /* synthetic */ TransferKind[] $values() {
        return new TransferKind[]{MANUAL_UPLOAD, MANUAL_DOWNLOAD, DUMP_EXPORT};
    }

    public static EnumEntries<TransferKind> getEntries() {
        return $ENTRIES;
    }

    private TransferKind(String str, int i) {
    }

    static {
        TransferKind[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static TransferKind valueOf(String str) {
        return (TransferKind) Enum.valueOf(TransferKind.class, str);
    }

    public static TransferKind[] values() {
        return (TransferKind[]) $VALUES.clone();
    }
}
