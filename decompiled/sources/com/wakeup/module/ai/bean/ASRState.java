package com.wakeup.module.ai.bean;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/wakeup/module/ai/bean/ASRState;", "", "<init>", "(Ljava/lang/String;I)V", "IDLE", "CONNECTING", "AUTHENTICATED", "ARREARS", "CLOSED", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ASRState {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ASRState[] $VALUES;
    public static final ASRState IDLE = new ASRState("IDLE", 0);
    public static final ASRState CONNECTING = new ASRState("CONNECTING", 1);
    public static final ASRState AUTHENTICATED = new ASRState("AUTHENTICATED", 2);
    public static final ASRState ARREARS = new ASRState("ARREARS", 3);
    public static final ASRState CLOSED = new ASRState("CLOSED", 4);

    private static final /* synthetic */ ASRState[] $values() {
        return new ASRState[]{IDLE, CONNECTING, AUTHENTICATED, ARREARS, CLOSED};
    }

    public static EnumEntries<ASRState> getEntries() {
        return $ENTRIES;
    }

    private ASRState(String str, int i) {
    }

    static {
        ASRState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ASRState valueOf(String str) {
        return (ASRState) Enum.valueOf(ASRState.class, str);
    }

    public static ASRState[] values() {
        return (ASRState[]) $VALUES.clone();
    }
}
