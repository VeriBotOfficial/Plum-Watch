package com.squady.silerovad;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VadAudioGate.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/squady/silerovad/VadAudioEvent;", "", "(Ljava/lang/String;I)V", "START", "AUDIO", "END", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VadAudioEvent {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VadAudioEvent[] $VALUES;
    public static final VadAudioEvent START = new VadAudioEvent("START", 0);
    public static final VadAudioEvent AUDIO = new VadAudioEvent("AUDIO", 1);
    public static final VadAudioEvent END = new VadAudioEvent("END", 2);

    private static final /* synthetic */ VadAudioEvent[] $values() {
        return new VadAudioEvent[]{START, AUDIO, END};
    }

    public static EnumEntries<VadAudioEvent> getEntries() {
        return $ENTRIES;
    }

    public static VadAudioEvent valueOf(String str) {
        return (VadAudioEvent) Enum.valueOf(VadAudioEvent.class, str);
    }

    public static VadAudioEvent[] values() {
        return (VadAudioEvent[]) $VALUES.clone();
    }

    static {
        VadAudioEvent[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private VadAudioEvent(String str, int i) {
    }
}
