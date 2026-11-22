package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/VadMode;", "", "<init>", "(Ljava/lang/String;I)V", "OFF", "SEMI_AUTO", "FULL_AUTO", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VadMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VadMode[] $VALUES;
    public static final VadMode OFF = new VadMode("OFF", 0);
    public static final VadMode SEMI_AUTO = new VadMode("SEMI_AUTO", 1);
    public static final VadMode FULL_AUTO = new VadMode("FULL_AUTO", 2);

    private static final /* synthetic */ VadMode[] $values() {
        return new VadMode[]{OFF, SEMI_AUTO, FULL_AUTO};
    }

    public static EnumEntries<VadMode> getEntries() {
        return $ENTRIES;
    }

    private VadMode(String str, int i) {
    }

    static {
        VadMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static VadMode valueOf(String str) {
        return (VadMode) Enum.valueOf(VadMode.class, str);
    }

    public static VadMode[] values() {
        return (VadMode[]) $VALUES.clone();
    }
}
