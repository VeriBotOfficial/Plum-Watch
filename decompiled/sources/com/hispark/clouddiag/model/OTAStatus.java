package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OTAMessage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/hispark/clouddiag/model/OTAStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING", "DOWNLOADING", "UPLOADING", "WAITING_CONFIRMATION", "COMPLETED", "FAILED", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OTAStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OTAStatus[] $VALUES;
    public static final OTAStatus PENDING = new OTAStatus("PENDING", 0);
    public static final OTAStatus DOWNLOADING = new OTAStatus("DOWNLOADING", 1);
    public static final OTAStatus UPLOADING = new OTAStatus("UPLOADING", 2);
    public static final OTAStatus WAITING_CONFIRMATION = new OTAStatus("WAITING_CONFIRMATION", 3);
    public static final OTAStatus COMPLETED = new OTAStatus("COMPLETED", 4);
    public static final OTAStatus FAILED = new OTAStatus("FAILED", 5);

    private static final /* synthetic */ OTAStatus[] $values() {
        return new OTAStatus[]{PENDING, DOWNLOADING, UPLOADING, WAITING_CONFIRMATION, COMPLETED, FAILED};
    }

    public static EnumEntries<OTAStatus> getEntries() {
        return $ENTRIES;
    }

    private OTAStatus(String str, int i) {
    }

    static {
        OTAStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static OTAStatus valueOf(String str) {
        return (OTAStatus) Enum.valueOf(OTAStatus.class, str);
    }

    public static OTAStatus[] values() {
        return (OTAStatus[]) $VALUES.clone();
    }
}
