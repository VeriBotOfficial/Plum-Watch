package io.livekit.android.room.track;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DataPublishReliability.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lio/livekit/android/room/track/DataPublishReliability;", "", "(Ljava/lang/String;I)V", "RELIABLE", "LOSSY", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataPublishReliability {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DataPublishReliability[] $VALUES;
    public static final DataPublishReliability RELIABLE = new DataPublishReliability("RELIABLE", 0);
    public static final DataPublishReliability LOSSY = new DataPublishReliability("LOSSY", 1);

    private static final /* synthetic */ DataPublishReliability[] $values() {
        return new DataPublishReliability[]{RELIABLE, LOSSY};
    }

    public static EnumEntries<DataPublishReliability> getEntries() {
        return $ENTRIES;
    }

    public static DataPublishReliability valueOf(String str) {
        return (DataPublishReliability) Enum.valueOf(DataPublishReliability.class, str);
    }

    public static DataPublishReliability[] values() {
        return (DataPublishReliability[]) $VALUES.clone();
    }

    private DataPublishReliability(String str, int i) {
    }

    static {
        DataPublishReliability[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
