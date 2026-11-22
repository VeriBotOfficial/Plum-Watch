package io.livekit.android.room;

import com.alipay.sdk.m.c0.c;
import com.anythink.expressad.foundation.g.a;
import com.autonavi.aps.amapapi.AMapLocationStaticsEntity;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SignalClient.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0014"}, d2 = {"Lio/livekit/android/room/ProtocolVersion;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "v1", c.d, a.k, AMapLocationStaticsEntity.IPV4, a.j, AMapLocationStaticsEntity.IPV6, "v7", "v8", "v9", "v10", "v11", "v12", "v13", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProtocolVersion {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProtocolVersion[] $VALUES;
    private final int value;
    public static final ProtocolVersion v1 = new ProtocolVersion("v1", 0, 1);
    public static final ProtocolVersion v2 = new ProtocolVersion(c.d, 1, 2);
    public static final ProtocolVersion v3 = new ProtocolVersion(a.k, 2, 3);
    public static final ProtocolVersion v4 = new ProtocolVersion(AMapLocationStaticsEntity.IPV4, 3, 4);
    public static final ProtocolVersion v5 = new ProtocolVersion(a.j, 4, 5);
    public static final ProtocolVersion v6 = new ProtocolVersion(AMapLocationStaticsEntity.IPV6, 5, 6);
    public static final ProtocolVersion v7 = new ProtocolVersion("v7", 6, 7);
    public static final ProtocolVersion v8 = new ProtocolVersion("v8", 7, 8);
    public static final ProtocolVersion v9 = new ProtocolVersion("v9", 8, 9);
    public static final ProtocolVersion v10 = new ProtocolVersion("v10", 9, 10);
    public static final ProtocolVersion v11 = new ProtocolVersion("v11", 10, 11);
    public static final ProtocolVersion v12 = new ProtocolVersion("v12", 11, 12);
    public static final ProtocolVersion v13 = new ProtocolVersion("v13", 12, 13);

    private static final /* synthetic */ ProtocolVersion[] $values() {
        return new ProtocolVersion[]{v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11, v12, v13};
    }

    public static EnumEntries<ProtocolVersion> getEntries() {
        return $ENTRIES;
    }

    public static ProtocolVersion valueOf(String str) {
        return (ProtocolVersion) Enum.valueOf(ProtocolVersion.class, str);
    }

    public static ProtocolVersion[] values() {
        return (ProtocolVersion[]) $VALUES.clone();
    }

    private ProtocolVersion(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        ProtocolVersion[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
