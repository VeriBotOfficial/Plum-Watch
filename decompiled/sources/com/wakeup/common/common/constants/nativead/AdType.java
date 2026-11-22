package com.wakeup.common.common.constants.nativead;

import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdZoneConfig.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/common/common/constants/nativead/AdType;", "", "sdkType", "Lcom/wakeup/common/common/constants/nativead/SdkType;", "<init>", "(Ljava/lang/String;ILcom/wakeup/common/common/constants/nativead/SdkType;)V", "getSdkType", "()Lcom/wakeup/common/common/constants/nativead/SdkType;", "SIGMOB", h.f, "REDWHALE", "ADSEYE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdType[] $VALUES;
    private final SdkType sdkType;
    public static final AdType SIGMOB = new AdType("SIGMOB", 0, SdkType.SIGMOB);
    public static final AdType TOPON = new AdType(h.f, 1, SdkType.TOPON);
    public static final AdType REDWHALE = new AdType("REDWHALE", 2, SdkType.REDWHALE);
    public static final AdType ADSEYE = new AdType("ADSEYE", 3, SdkType.ADSEYE);

    private static final /* synthetic */ AdType[] $values() {
        return new AdType[]{SIGMOB, TOPON, REDWHALE, ADSEYE};
    }

    public static EnumEntries<AdType> getEntries() {
        return $ENTRIES;
    }

    private AdType(String str, int i, SdkType sdkType) {
        this.sdkType = sdkType;
    }

    public final SdkType getSdkType() {
        return this.sdkType;
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
