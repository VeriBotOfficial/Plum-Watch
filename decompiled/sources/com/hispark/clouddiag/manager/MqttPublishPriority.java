package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MqttPublishPriorityQueue.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/hispark/clouddiag/manager/MqttPublishPriority;", "", "<init>", "(Ljava/lang/String;I)V", "CRITICAL", "FILE_PROGRESS", "DEBUG_LOG", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MqttPublishPriority {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MqttPublishPriority[] $VALUES;
    public static final MqttPublishPriority CRITICAL = new MqttPublishPriority("CRITICAL", 0);
    public static final MqttPublishPriority FILE_PROGRESS = new MqttPublishPriority("FILE_PROGRESS", 1);
    public static final MqttPublishPriority DEBUG_LOG = new MqttPublishPriority("DEBUG_LOG", 2);

    private static final /* synthetic */ MqttPublishPriority[] $values() {
        return new MqttPublishPriority[]{CRITICAL, FILE_PROGRESS, DEBUG_LOG};
    }

    public static EnumEntries<MqttPublishPriority> getEntries() {
        return $ENTRIES;
    }

    private MqttPublishPriority(String str, int i) {
    }

    static {
        MqttPublishPriority[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static MqttPublishPriority valueOf(String str) {
        return (MqttPublishPriority) Enum.valueOf(MqttPublishPriority.class, str);
    }

    public static MqttPublishPriority[] values() {
        return (MqttPublishPriority[]) $VALUES.clone();
    }
}
