package com.newtype.sdkcore.vad;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VADTypes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/vad/VADState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "LISTENING", "SPEAKING", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VADState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VADState[] $VALUES;
    public static final VADState IDLE = new VADState("IDLE", 0);
    public static final VADState LISTENING = new VADState("LISTENING", 1);
    public static final VADState SPEAKING = new VADState("SPEAKING", 2);

    private static final /* synthetic */ VADState[] $values() {
        return new VADState[]{IDLE, LISTENING, SPEAKING};
    }

    public static EnumEntries<VADState> getEntries() {
        return $ENTRIES;
    }

    static {
        VADState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VADState(String str, int i) {
    }

    public static VADState valueOf(String str) {
        return (VADState) Enum.valueOf(VADState.class, str);
    }

    public static VADState[] values() {
        return (VADState[]) $VALUES.clone();
    }
}
