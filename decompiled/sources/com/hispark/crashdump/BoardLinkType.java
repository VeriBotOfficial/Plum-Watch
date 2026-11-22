package com.hispark.crashdump;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CrashDumpModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/hispark/crashdump/BoardLinkType;", "", "<init>", "(Ljava/lang/String;I)V", "CLASSIC_BT", "BLE", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardLinkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BoardLinkType[] $VALUES;
    public static final BoardLinkType CLASSIC_BT = new BoardLinkType("CLASSIC_BT", 0);
    public static final BoardLinkType BLE = new BoardLinkType("BLE", 1);

    private static final /* synthetic */ BoardLinkType[] $values() {
        return new BoardLinkType[]{CLASSIC_BT, BLE};
    }

    public static EnumEntries<BoardLinkType> getEntries() {
        return $ENTRIES;
    }

    private BoardLinkType(String str, int i) {
    }

    static {
        BoardLinkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BoardLinkType valueOf(String str) {
        return (BoardLinkType) Enum.valueOf(BoardLinkType.class, str);
    }

    public static BoardLinkType[] values() {
        return (BoardLinkType[]) $VALUES.clone();
    }
}
