package com.wakeup.module.ai.bean;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/module/ai/bean/SwitchLanguageFieldMode;", "", "<init>", "(Ljava/lang/String;I)V", "STANDARD", "MEETING_DOC_TYPO", "BOTH", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SwitchLanguageFieldMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SwitchLanguageFieldMode[] $VALUES;
    public static final SwitchLanguageFieldMode STANDARD = new SwitchLanguageFieldMode("STANDARD", 0);
    public static final SwitchLanguageFieldMode MEETING_DOC_TYPO = new SwitchLanguageFieldMode("MEETING_DOC_TYPO", 1);
    public static final SwitchLanguageFieldMode BOTH = new SwitchLanguageFieldMode("BOTH", 2);

    private static final /* synthetic */ SwitchLanguageFieldMode[] $values() {
        return new SwitchLanguageFieldMode[]{STANDARD, MEETING_DOC_TYPO, BOTH};
    }

    public static EnumEntries<SwitchLanguageFieldMode> getEntries() {
        return $ENTRIES;
    }

    private SwitchLanguageFieldMode(String str, int i) {
    }

    static {
        SwitchLanguageFieldMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SwitchLanguageFieldMode valueOf(String str) {
        return (SwitchLanguageFieldMode) Enum.valueOf(SwitchLanguageFieldMode.class, str);
    }

    public static SwitchLanguageFieldMode[] values() {
        return (SwitchLanguageFieldMode[]) $VALUES.clone();
    }
}
