package com.wakeup.common.common.constants.nativead;

import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdZoneConfig.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/SdkType;", "", "<init>", "(Ljava/lang/String;I)V", "SIGMOB", h.f, "REDWHALE", "ADSEYE", "UNKNOWN", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SdkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdkType[] $VALUES;
    public static final SdkType SIGMOB = new SdkType("SIGMOB", 0);
    public static final SdkType TOPON = new SdkType(h.f, 1);
    public static final SdkType REDWHALE = new SdkType("REDWHALE", 2);
    public static final SdkType ADSEYE = new SdkType("ADSEYE", 3);
    public static final SdkType UNKNOWN = new SdkType("UNKNOWN", 4);

    private static final /* synthetic */ SdkType[] $values() {
        return new SdkType[]{SIGMOB, TOPON, REDWHALE, ADSEYE, UNKNOWN};
    }

    public static EnumEntries<SdkType> getEntries() {
        return $ENTRIES;
    }

    private SdkType(String str, int i) {
    }

    static {
        SdkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static SdkType valueOf(String str) {
        return (SdkType) Enum.valueOf(SdkType.class, str);
    }

    public static SdkType[] values() {
        return (SdkType[]) $VALUES.clone();
    }
}
