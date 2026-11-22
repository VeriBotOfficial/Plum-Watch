package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceIdentityIndex.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/manager/IdentityAliasType;", "", "<init>", "(Ljava/lang/String;I)V", "EXACT", "CASE_INSENSITIVE", "HARDWARE_ID", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class IdentityAliasType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ IdentityAliasType[] $VALUES;
    public static final IdentityAliasType EXACT = new IdentityAliasType("EXACT", 0);
    public static final IdentityAliasType CASE_INSENSITIVE = new IdentityAliasType("CASE_INSENSITIVE", 1);
    public static final IdentityAliasType HARDWARE_ID = new IdentityAliasType("HARDWARE_ID", 2);

    private static final /* synthetic */ IdentityAliasType[] $values() {
        return new IdentityAliasType[]{EXACT, CASE_INSENSITIVE, HARDWARE_ID};
    }

    public static EnumEntries<IdentityAliasType> getEntries() {
        return $ENTRIES;
    }

    private IdentityAliasType(String str, int i) {
    }

    static {
        IdentityAliasType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static IdentityAliasType valueOf(String str) {
        return (IdentityAliasType) Enum.valueOf(IdentityAliasType.class, str);
    }

    public static IdentityAliasType[] values() {
        return (IdentityAliasType[]) $VALUES.clone();
    }
}
