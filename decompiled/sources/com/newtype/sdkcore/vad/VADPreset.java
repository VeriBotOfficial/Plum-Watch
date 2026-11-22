package com.newtype.sdkcore.vad;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: VADTypes.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/vad/VADPreset;", "", "<init>", "(Ljava/lang/String;I)V", "SENSITIVE", "NATURAL", "CHILD", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class VADPreset {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ VADPreset[] $VALUES;
    public static final VADPreset SENSITIVE = new VADPreset("SENSITIVE", 0);
    public static final VADPreset NATURAL = new VADPreset("NATURAL", 1);
    public static final VADPreset CHILD = new VADPreset("CHILD", 2);

    private static final /* synthetic */ VADPreset[] $values() {
        return new VADPreset[]{SENSITIVE, NATURAL, CHILD};
    }

    public static EnumEntries<VADPreset> getEntries() {
        return $ENTRIES;
    }

    private VADPreset(String str, int i) {
    }

    static {
        VADPreset[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static VADPreset valueOf(String str) {
        return (VADPreset) Enum.valueOf(VADPreset.class, str);
    }

    public static VADPreset[] values() {
        return (VADPreset[]) $VALUES.clone();
    }
}
