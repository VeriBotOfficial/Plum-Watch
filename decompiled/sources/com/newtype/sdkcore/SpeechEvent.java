package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/newtype/sdkcore/SpeechEvent;", "", "<init>", "(Ljava/lang/String;I)V", "PTT_DOWN", "PTT_UP", "VAD_START", "VAD_END", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SpeechEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpeechEvent[] $VALUES;
    public static final SpeechEvent PTT_DOWN = new SpeechEvent("PTT_DOWN", 0);
    public static final SpeechEvent PTT_UP = new SpeechEvent("PTT_UP", 1);
    public static final SpeechEvent VAD_START = new SpeechEvent("VAD_START", 2);
    public static final SpeechEvent VAD_END = new SpeechEvent("VAD_END", 3);

    private static final /* synthetic */ SpeechEvent[] $values() {
        return new SpeechEvent[]{PTT_DOWN, PTT_UP, VAD_START, VAD_END};
    }

    public static EnumEntries<SpeechEvent> getEntries() {
        return $ENTRIES;
    }

    private SpeechEvent(String str, int i) {
    }

    static {
        SpeechEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SpeechEvent valueOf(String str) {
        return (SpeechEvent) Enum.valueOf(SpeechEvent.class, str);
    }

    public static SpeechEvent[] values() {
        return (SpeechEvent[]) $VALUES.clone();
    }
}
