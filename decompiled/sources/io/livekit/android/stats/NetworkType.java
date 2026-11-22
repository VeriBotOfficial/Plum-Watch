package io.livekit.android.stats;

import com.iflytek.cloud.SpeechConstant;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkInfo.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lio/livekit/android/stats/NetworkType;", "", "protoName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getProtoName", "()Ljava/lang/String;", "WIFI", "ETHERNET", "CELLULAR", "VPN", "BLUETOOTH", "OTHER", "UNKNOWN", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NetworkType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkType[] $VALUES;
    private final String protoName;
    public static final NetworkType WIFI = new NetworkType("WIFI", 0, "wifi");
    public static final NetworkType ETHERNET = new NetworkType("ETHERNET", 1, "ethernet");
    public static final NetworkType CELLULAR = new NetworkType("CELLULAR", 2, "cellular");
    public static final NetworkType VPN = new NetworkType("VPN", 3, "vpn");
    public static final NetworkType BLUETOOTH = new NetworkType("BLUETOOTH", 4, SpeechConstant.BLUETOOTH);
    public static final NetworkType OTHER = new NetworkType("OTHER", 5, "other");
    public static final NetworkType UNKNOWN = new NetworkType("UNKNOWN", 6, "");

    private static final /* synthetic */ NetworkType[] $values() {
        return new NetworkType[]{WIFI, ETHERNET, CELLULAR, VPN, BLUETOOTH, OTHER, UNKNOWN};
    }

    public static EnumEntries<NetworkType> getEntries() {
        return $ENTRIES;
    }

    public static NetworkType valueOf(String str) {
        return (NetworkType) Enum.valueOf(NetworkType.class, str);
    }

    public static NetworkType[] values() {
        return (NetworkType[]) $VALUES.clone();
    }

    private NetworkType(String str, int i, String str2) {
        this.protoName = str2;
    }

    public final String getProtoName() {
        return this.protoName;
    }

    static {
        NetworkType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
