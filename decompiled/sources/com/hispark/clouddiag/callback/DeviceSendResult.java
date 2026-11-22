package com.hispark.clouddiag.callback;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceSender.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/callback/DeviceSendResult;", "", "<init>", "(Ljava/lang/String;I)V", "SENT", "BUSY", "RETRYING", "FAILED", "accepted", "", "getAccepted", "()Z", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceSendResult {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceSendResult[] $VALUES;
    public static final DeviceSendResult SENT = new DeviceSendResult("SENT", 0);
    public static final DeviceSendResult BUSY = new DeviceSendResult("BUSY", 1);
    public static final DeviceSendResult RETRYING = new DeviceSendResult("RETRYING", 2);
    public static final DeviceSendResult FAILED = new DeviceSendResult("FAILED", 3);

    private static final /* synthetic */ DeviceSendResult[] $values() {
        return new DeviceSendResult[]{SENT, BUSY, RETRYING, FAILED};
    }

    public static EnumEntries<DeviceSendResult> getEntries() {
        return $ENTRIES;
    }

    private DeviceSendResult(String str, int i) {
    }

    static {
        DeviceSendResult[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final boolean getAccepted() {
        return this == SENT || this == RETRYING;
    }

    public static DeviceSendResult valueOf(String str) {
        return (DeviceSendResult) Enum.valueOf(DeviceSendResult.class, str);
    }

    public static DeviceSendResult[] values() {
        return (DeviceSendResult[]) $VALUES.clone();
    }
}
