package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LocalVideoTrackOptions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/track/CameraPosition;", "", "(Ljava/lang/String;I)V", "FRONT", "BACK", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraPosition {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CameraPosition[] $VALUES;
    public static final CameraPosition FRONT = new CameraPosition("FRONT", 0);
    public static final CameraPosition BACK = new CameraPosition("BACK", 1);

    private static final /* synthetic */ CameraPosition[] $values() {
        return new CameraPosition[]{FRONT, BACK};
    }

    public static EnumEntries<CameraPosition> getEntries() {
        return $ENTRIES;
    }

    public static CameraPosition valueOf(String str) {
        return (CameraPosition) Enum.valueOf(CameraPosition.class, str);
    }

    public static CameraPosition[] values() {
        return (CameraPosition[]) $VALUES.clone();
    }

    private CameraPosition(String str, int i) {
    }

    static {
        CameraPosition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
