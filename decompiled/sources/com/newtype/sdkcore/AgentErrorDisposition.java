package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NewTypeSessionClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/newtype/sdkcore/AgentErrorDisposition;", "", "<init>", "(Ljava/lang/String;I)V", "RECOVERABLE", "FATAL", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AgentErrorDisposition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AgentErrorDisposition[] $VALUES;
    public static final AgentErrorDisposition RECOVERABLE = new AgentErrorDisposition("RECOVERABLE", 0);
    public static final AgentErrorDisposition FATAL = new AgentErrorDisposition("FATAL", 1);

    private static final /* synthetic */ AgentErrorDisposition[] $values() {
        return new AgentErrorDisposition[]{RECOVERABLE, FATAL};
    }

    public static EnumEntries<AgentErrorDisposition> getEntries() {
        return $ENTRIES;
    }

    private AgentErrorDisposition(String str, int i) {
    }

    static {
        AgentErrorDisposition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AgentErrorDisposition valueOf(String str) {
        return (AgentErrorDisposition) Enum.valueOf(AgentErrorDisposition.class, str);
    }

    public static AgentErrorDisposition[] values() {
        return (AgentErrorDisposition[]) $VALUES.clone();
    }
}
