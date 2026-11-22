package io.livekit.android.room;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RTCEngine.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/ReconnectType;", "", "(Ljava/lang/String;I)V", "DEFAULT", "FORCE_SOFT_RECONNECT", "FORCE_FULL_RECONNECT", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReconnectType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ReconnectType[] $VALUES;
    public static final ReconnectType DEFAULT = new ReconnectType("DEFAULT", 0);
    public static final ReconnectType FORCE_SOFT_RECONNECT = new ReconnectType("FORCE_SOFT_RECONNECT", 1);
    public static final ReconnectType FORCE_FULL_RECONNECT = new ReconnectType("FORCE_FULL_RECONNECT", 2);

    private static final /* synthetic */ ReconnectType[] $values() {
        return new ReconnectType[]{DEFAULT, FORCE_SOFT_RECONNECT, FORCE_FULL_RECONNECT};
    }

    public static EnumEntries<ReconnectType> getEntries() {
        return $ENTRIES;
    }

    public static ReconnectType valueOf(String str) {
        return (ReconnectType) Enum.valueOf(ReconnectType.class, str);
    }

    public static ReconnectType[] values() {
        return (ReconnectType[]) $VALUES.clone();
    }

    private ReconnectType(String str, int i) {
    }

    static {
        ReconnectType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
