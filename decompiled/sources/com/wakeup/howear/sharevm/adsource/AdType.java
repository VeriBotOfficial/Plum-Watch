package com.wakeup.howear.sharevm.adsource;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/howear/sharevm/adsource/AdType;", "", "<init>", "(Ljava/lang/String;I)V", "SIGMOB", "TAKU", "ADSEYE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    public static final AdType SIGMOB = new AdType("SIGMOB", 0);
    public static final AdType TAKU = new AdType("TAKU", 1);
    public static final AdType ADSEYE = new AdType("ADSEYE", 2);

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{SIGMOB, TAKU, ADSEYE};
    }

    public static EnumEntries<AdType> getEntries() {
        return $ENTRIES;
    }

    private AdType(String str, int i) {
    }

    static {
        AdType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AdType valueOf(String str) {
        return (AdType) Enum.valueOf(AdType.class, str);
    }

    public static AdType[] values() {
        return (AdType[]) $VALUES.clone();
    }
}
