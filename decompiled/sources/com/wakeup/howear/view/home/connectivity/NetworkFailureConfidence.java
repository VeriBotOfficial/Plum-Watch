package com.wakeup.howear.view.home.connectivity;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceContainerConnectivityPolicy.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/wakeup/howear/view/home/connectivity/NetworkFailureConfidence;", "", "<init>", "(Ljava/lang/String;I)V", DialPromoBanner.NONE, "SUSPECTED_OFFLINE", "CONFIRMED_OFFLINE", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NetworkFailureConfidence {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkFailureConfidence[] $VALUES;
    public static final NetworkFailureConfidence NONE = new NetworkFailureConfidence(DialPromoBanner.NONE, 0);
    public static final NetworkFailureConfidence SUSPECTED_OFFLINE = new NetworkFailureConfidence("SUSPECTED_OFFLINE", 1);
    public static final NetworkFailureConfidence CONFIRMED_OFFLINE = new NetworkFailureConfidence("CONFIRMED_OFFLINE", 2);

    private static final /* synthetic */ NetworkFailureConfidence[] $values() {
        return new NetworkFailureConfidence[]{NONE, SUSPECTED_OFFLINE, CONFIRMED_OFFLINE};
    }

    public static EnumEntries<NetworkFailureConfidence> getEntries() {
        return $ENTRIES;
    }

    private NetworkFailureConfidence(String str, int i) {
    }

    static {
        NetworkFailureConfidence[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static NetworkFailureConfidence valueOf(String str) {
        return (NetworkFailureConfidence) Enum.valueOf(NetworkFailureConfidence.class, str);
    }

    public static NetworkFailureConfidence[] values() {
        return (NetworkFailureConfidence[]) $VALUES.clone();
    }
}
