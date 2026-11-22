package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/newtype/sdkcore/SessionPhase;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CONNECTING", "CONNECTED", "RECONNECTING", "DISCONNECTED", "LEAVING", "ERROR", "ENDED", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SessionPhase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SessionPhase[] $VALUES;
    public static final SessionPhase IDLE = new SessionPhase("IDLE", 0);
    public static final SessionPhase CONNECTING = new SessionPhase("CONNECTING", 1);
    public static final SessionPhase CONNECTED = new SessionPhase("CONNECTED", 2);
    public static final SessionPhase RECONNECTING = new SessionPhase("RECONNECTING", 3);
    public static final SessionPhase DISCONNECTED = new SessionPhase("DISCONNECTED", 4);
    public static final SessionPhase LEAVING = new SessionPhase("LEAVING", 5);
    public static final SessionPhase ERROR = new SessionPhase("ERROR", 6);
    public static final SessionPhase ENDED = new SessionPhase("ENDED", 7);

    private static final /* synthetic */ SessionPhase[] $values() {
        return new SessionPhase[]{IDLE, CONNECTING, CONNECTED, RECONNECTING, DISCONNECTED, LEAVING, ERROR, ENDED};
    }

    public static EnumEntries<SessionPhase> getEntries() {
        return $ENTRIES;
    }

    private SessionPhase(String str, int i) {
    }

    static {
        SessionPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SessionPhase valueOf(String str) {
        return (SessionPhase) Enum.valueOf(SessionPhase.class, str);
    }

    public static SessionPhase[] values() {
        return (SessionPhase[]) $VALUES.clone();
    }
}
