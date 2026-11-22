package io.livekit.android.room;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ConnectionState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lio/livekit/android/room/ConnectionState;", "", "(Ljava/lang/String;I)V", "CONNECTING", "CONNECTED", "DISCONNECTED", "RECONNECTING", "RESUMING", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectionState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConnectionState[] $VALUES;
    public static final ConnectionState CONNECTING = new ConnectionState("CONNECTING", 0);
    public static final ConnectionState CONNECTED = new ConnectionState("CONNECTED", 1);
    public static final ConnectionState DISCONNECTED = new ConnectionState("DISCONNECTED", 2);
    public static final ConnectionState RECONNECTING = new ConnectionState("RECONNECTING", 3);
    public static final ConnectionState RESUMING = new ConnectionState("RESUMING", 4);

    private static final /* synthetic */ ConnectionState[] $values() {
        return new ConnectionState[]{CONNECTING, CONNECTED, DISCONNECTED, RECONNECTING, RESUMING};
    }

    public static EnumEntries<ConnectionState> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionState valueOf(String str) {
        return (ConnectionState) Enum.valueOf(ConnectionState.class, str);
    }

    public static ConnectionState[] values() {
        return (ConnectionState[]) $VALUES.clone();
    }

    private ConnectionState(String str, int i) {
    }

    static {
        ConnectionState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
