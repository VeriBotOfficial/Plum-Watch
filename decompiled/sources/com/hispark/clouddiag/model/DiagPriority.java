package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiagData.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/hispark/clouddiag/model/DiagPriority;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LOW", "NORMAL", "HIGH", "URGENT", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiagPriority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiagPriority[] $VALUES;
    private final int value;
    public static final DiagPriority LOW = new DiagPriority("LOW", 0, 0);
    public static final DiagPriority NORMAL = new DiagPriority("NORMAL", 1, 1);
    public static final DiagPriority HIGH = new DiagPriority("HIGH", 2, 2);
    public static final DiagPriority URGENT = new DiagPriority("URGENT", 3, 3);

    private static final /* synthetic */ DiagPriority[] $values() {
        return new DiagPriority[]{LOW, NORMAL, HIGH, URGENT};
    }

    public static EnumEntries<DiagPriority> getEntries() {
        return $ENTRIES;
    }

    private DiagPriority(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        DiagPriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DiagPriority valueOf(String str) {
        return (DiagPriority) Enum.valueOf(DiagPriority.class, str);
    }

    public static DiagPriority[] values() {
        return (DiagPriority[]) $VALUES.clone();
    }
}
