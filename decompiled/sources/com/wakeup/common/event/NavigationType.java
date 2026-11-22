package com.wakeup.common.event;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationType.kt */
@Deprecated(message = "此类已废弃 大部分页面路径已修改")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/event/NavigationType;", "", "<init>", "(Ljava/lang/String;I)V", "GO_SPORT", "GO_RUN", "GO_KEEP", "GO_OUTDOOR_RUN_FROM_DEVICE", "GO_INDOOR_RUN_FROM_DEVICE", "GO_WALKING_FROM_DEVICE", "GO_RIDE_FROM_DEVICE", "GO_COURSE_PLAN", "LOOK_HEALTH_REPORT", "CONNECT_DEVICE", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavigationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationType[] $VALUES;
    public static final NavigationType GO_SPORT = new NavigationType("GO_SPORT", 0);
    public static final NavigationType GO_RUN = new NavigationType("GO_RUN", 1);
    public static final NavigationType GO_KEEP = new NavigationType("GO_KEEP", 2);
    public static final NavigationType GO_OUTDOOR_RUN_FROM_DEVICE = new NavigationType("GO_OUTDOOR_RUN_FROM_DEVICE", 3);
    public static final NavigationType GO_INDOOR_RUN_FROM_DEVICE = new NavigationType("GO_INDOOR_RUN_FROM_DEVICE", 4);
    public static final NavigationType GO_WALKING_FROM_DEVICE = new NavigationType("GO_WALKING_FROM_DEVICE", 5);
    public static final NavigationType GO_RIDE_FROM_DEVICE = new NavigationType("GO_RIDE_FROM_DEVICE", 6);
    public static final NavigationType GO_COURSE_PLAN = new NavigationType("GO_COURSE_PLAN", 7);
    public static final NavigationType LOOK_HEALTH_REPORT = new NavigationType("LOOK_HEALTH_REPORT", 8);
    public static final NavigationType CONNECT_DEVICE = new NavigationType("CONNECT_DEVICE", 9);

    private static final /* synthetic */ NavigationType[] $values() {
        return new NavigationType[]{GO_SPORT, GO_RUN, GO_KEEP, GO_OUTDOOR_RUN_FROM_DEVICE, GO_INDOOR_RUN_FROM_DEVICE, GO_WALKING_FROM_DEVICE, GO_RIDE_FROM_DEVICE, GO_COURSE_PLAN, LOOK_HEALTH_REPORT, CONNECT_DEVICE};
    }

    public static EnumEntries<NavigationType> getEntries() {
        return $ENTRIES;
    }

    private NavigationType(String str, int i) {
    }

    static {
        NavigationType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static NavigationType valueOf(String str) {
        return (NavigationType) Enum.valueOf(NavigationType.class, str);
    }

    public static NavigationType[] values() {
        return (NavigationType[]) $VALUES.clone();
    }
}
