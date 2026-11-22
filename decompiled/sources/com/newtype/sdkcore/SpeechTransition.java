package com.newtype.sdkcore;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/SpeechTransition;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "CLOSE", DialPromoBanner.NONE, "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SpeechTransition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SpeechTransition[] $VALUES;
    public static final SpeechTransition OPEN = new SpeechTransition("OPEN", 0);
    public static final SpeechTransition CLOSE = new SpeechTransition("CLOSE", 1);
    public static final SpeechTransition NONE = new SpeechTransition(DialPromoBanner.NONE, 2);

    private static final /* synthetic */ SpeechTransition[] $values() {
        return new SpeechTransition[]{OPEN, CLOSE, NONE};
    }

    public static EnumEntries<SpeechTransition> getEntries() {
        return $ENTRIES;
    }

    private SpeechTransition(String str, int i) {
    }

    static {
        SpeechTransition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SpeechTransition valueOf(String str) {
        return (SpeechTransition) Enum.valueOf(SpeechTransition.class, str);
    }

    public static SpeechTransition[] values() {
        return (SpeechTransition[]) $VALUES.clone();
    }
}
