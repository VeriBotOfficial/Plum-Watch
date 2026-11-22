package com.hispark.crashdump.protocol;

import com.baidu.ar.dumixhuman.dumix.DumixConstance;
import com.baidu.mapapi.http.wrapper.HttpManager;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/hispark/crashdump/protocol/ProtocolFrameType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "NEGOTIATION", "REQUEST", DumixConstance.SUBTITLE_TYPE_REPLY, "NOTIFY", "FINISH", "QUERY", HttpManager.HTTP_DELETE, "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProtocolFrameType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProtocolFrameType[] $VALUES;
    private final String value;
    public static final ProtocolFrameType NEGOTIATION = new ProtocolFrameType("NEGOTIATION", 0, "0602");
    public static final ProtocolFrameType REQUEST = new ProtocolFrameType("REQUEST", 1, "0603");
    public static final ProtocolFrameType REPLY = new ProtocolFrameType(DumixConstance.SUBTITLE_TYPE_REPLY, 2, "0604");
    public static final ProtocolFrameType NOTIFY = new ProtocolFrameType("NOTIFY", 3, "0605");
    public static final ProtocolFrameType FINISH = new ProtocolFrameType("FINISH", 4, "0606");
    public static final ProtocolFrameType QUERY = new ProtocolFrameType("QUERY", 5, "0607");
    public static final ProtocolFrameType DELETE = new ProtocolFrameType(HttpManager.HTTP_DELETE, 6, "0608");

    private static final /* synthetic */ ProtocolFrameType[] $values() {
        return new ProtocolFrameType[]{NEGOTIATION, REQUEST, REPLY, NOTIFY, FINISH, QUERY, DELETE};
    }

    public static EnumEntries<ProtocolFrameType> getEntries() {
        return $ENTRIES;
    }

    private ProtocolFrameType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        ProtocolFrameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ProtocolFrameType valueOf(String str) {
        return (ProtocolFrameType) Enum.valueOf(ProtocolFrameType.class, str);
    }

    public static ProtocolFrameType[] values() {
        return (ProtocolFrameType[]) $VALUES.clone();
    }
}
