package com.wakeup.commonui.progress;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CircularProgressView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/commonui/progress/ProgressThumbScaleType;", "", "<init>", "(Ljava/lang/String;I)V", "AUTO", "POINT", "RATE", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProgressThumbScaleType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProgressThumbScaleType[] $VALUES;
    public static final ProgressThumbScaleType AUTO = new ProgressThumbScaleType("AUTO", 0);
    public static final ProgressThumbScaleType POINT = new ProgressThumbScaleType("POINT", 1);
    public static final ProgressThumbScaleType RATE = new ProgressThumbScaleType("RATE", 2);

    private static final /* synthetic */ ProgressThumbScaleType[] $values() {
        return new ProgressThumbScaleType[]{AUTO, POINT, RATE};
    }

    public static EnumEntries<ProgressThumbScaleType> getEntries() {
        return $ENTRIES;
    }

    static {
        ProgressThumbScaleType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private ProgressThumbScaleType(String str, int i) {
    }

    public static ProgressThumbScaleType valueOf(String str) {
        return (ProgressThumbScaleType) Enum.valueOf(ProgressThumbScaleType.class, str);
    }

    public static ProgressThumbScaleType[] values() {
        return (ProgressThumbScaleType[]) $VALUES.clone();
    }
}
