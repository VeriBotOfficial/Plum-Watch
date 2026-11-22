package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeviceFileCommand.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandType;", "", "wireValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getWireValue", "()Ljava/lang/String;", "LIST", "DOWNLOAD_FILE", "DOWNLOAD_ALL", "UPLOAD_FILE", "DELETE_FILE", "DELETE_ALL", "UNKNOWN", "Companion", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceFileCommandType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DeviceFileCommandType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String wireValue;
    public static final DeviceFileCommandType LIST = new DeviceFileCommandType("LIST", 0, "DEVICE_FILE_LIST");
    public static final DeviceFileCommandType DOWNLOAD_FILE = new DeviceFileCommandType("DOWNLOAD_FILE", 1, "DEVICE_FILE_DOWNLOAD_FILE");
    public static final DeviceFileCommandType DOWNLOAD_ALL = new DeviceFileCommandType("DOWNLOAD_ALL", 2, "DEVICE_FILE_DOWNLOAD_ALL");
    public static final DeviceFileCommandType UPLOAD_FILE = new DeviceFileCommandType("UPLOAD_FILE", 3, "DEVICE_FILE_UPLOAD_FILE");
    public static final DeviceFileCommandType DELETE_FILE = new DeviceFileCommandType("DELETE_FILE", 4, "DEVICE_FILE_DELETE_FILE");
    public static final DeviceFileCommandType DELETE_ALL = new DeviceFileCommandType("DELETE_ALL", 5, "DEVICE_FILE_DELETE_ALL");
    public static final DeviceFileCommandType UNKNOWN = new DeviceFileCommandType("UNKNOWN", 6, "");

    private static final /* synthetic */ DeviceFileCommandType[] $values() {
        return new DeviceFileCommandType[]{LIST, DOWNLOAD_FILE, DOWNLOAD_ALL, UPLOAD_FILE, DELETE_FILE, DELETE_ALL, UNKNOWN};
    }

    public static EnumEntries<DeviceFileCommandType> getEntries() {
        return $ENTRIES;
    }

    private DeviceFileCommandType(String str, int i, String str2) {
        this.wireValue = str2;
    }

    public final String getWireValue() {
        return this.wireValue;
    }

    static {
        DeviceFileCommandType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: DeviceFileCommand.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/hispark/clouddiag/model/DeviceFileCommandType$Companion;", "", "<init>", "()V", "fromWireValue", "Lcom/hispark/clouddiag/model/DeviceFileCommandType;", "value", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final DeviceFileCommandType fromWireValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            for (DeviceFileCommandType deviceFileCommandType : DeviceFileCommandType.values()) {
                if (deviceFileCommandType != DeviceFileCommandType.UNKNOWN && Intrinsics.areEqual(deviceFileCommandType.getWireValue(), value)) {
                    return deviceFileCommandType;
                }
            }
            return null;
        }
    }

    public static DeviceFileCommandType valueOf(String str) {
        return (DeviceFileCommandType) Enum.valueOf(DeviceFileCommandType.class, str);
    }

    public static DeviceFileCommandType[] values() {
        return (DeviceFileCommandType[]) $VALUES.clone();
    }
}
