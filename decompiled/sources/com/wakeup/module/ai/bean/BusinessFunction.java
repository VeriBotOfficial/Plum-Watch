package com.wakeup.module.ai.bean;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ASRBean.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/wakeup/module/ai/bean/BusinessFunction;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "REAL_TIME_INTERPRETATION", "SIMULTANEOUS_INTERPRETATION", "MEETING_TRANSLATION", "REAL_TIME_TRANSLATION", "PURE_TTS_BUSINESS_FUNCTION", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BusinessFunction {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BusinessFunction[] $VALUES;
    private final int value;
    public static final BusinessFunction REAL_TIME_INTERPRETATION = new BusinessFunction("REAL_TIME_INTERPRETATION", 0, 4);
    public static final BusinessFunction SIMULTANEOUS_INTERPRETATION = new BusinessFunction("SIMULTANEOUS_INTERPRETATION", 1, 5);
    public static final BusinessFunction MEETING_TRANSLATION = new BusinessFunction("MEETING_TRANSLATION", 2, 6);
    public static final BusinessFunction REAL_TIME_TRANSLATION = new BusinessFunction("REAL_TIME_TRANSLATION", 3, 7);
    public static final BusinessFunction PURE_TTS_BUSINESS_FUNCTION = new BusinessFunction("PURE_TTS_BUSINESS_FUNCTION", 4, 8);

    private static final /* synthetic */ BusinessFunction[] $values() {
        return new BusinessFunction[]{REAL_TIME_INTERPRETATION, SIMULTANEOUS_INTERPRETATION, MEETING_TRANSLATION, REAL_TIME_TRANSLATION, PURE_TTS_BUSINESS_FUNCTION};
    }

    public static EnumEntries<BusinessFunction> getEntries() {
        return $ENTRIES;
    }

    private BusinessFunction(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        BusinessFunction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static BusinessFunction valueOf(String str) {
        return (BusinessFunction) Enum.valueOf(BusinessFunction.class, str);
    }

    public static BusinessFunction[] values() {
        return (BusinessFunction[]) $VALUES.clone();
    }
}
