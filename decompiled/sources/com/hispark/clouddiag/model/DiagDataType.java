package com.hispark.clouddiag.model;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DiagData.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/hispark/clouddiag/model/DiagDataType;", "", "code", "", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", "LOG", "PERFORMANCE", "FAULT", "STATUS", "CONFIG", "CUSTOM", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DiagDataType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DiagDataType[] $VALUES;
    private final String code;
    private final String description;
    public static final DiagDataType LOG = new DiagDataType("LOG", 0, "log", "设备日志");
    public static final DiagDataType PERFORMANCE = new DiagDataType("PERFORMANCE", 1, "performance", "性能指标");
    public static final DiagDataType FAULT = new DiagDataType("FAULT", 2, "fault", "故障信息");
    public static final DiagDataType STATUS = new DiagDataType("STATUS", 3, "status", "设备状态");
    public static final DiagDataType CONFIG = new DiagDataType("CONFIG", 4, "config", "配置数据");
    public static final DiagDataType CUSTOM = new DiagDataType("CUSTOM", 5, "custom", "自定义数据");

    private static final /* synthetic */ DiagDataType[] $values() {
        return new DiagDataType[]{LOG, PERFORMANCE, FAULT, STATUS, CONFIG, CUSTOM};
    }

    public static EnumEntries<DiagDataType> getEntries() {
        return $ENTRIES;
    }

    private DiagDataType(String str, int i, String str2, String str3) {
        this.code = str2;
        this.description = str3;
    }

    public final String getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    static {
        DiagDataType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static DiagDataType valueOf(String str) {
        return (DiagDataType) Enum.valueOf(DiagDataType.class, str);
    }

    public static DiagDataType[] values() {
        return (DiagDataType[]) $VALUES.clone();
    }
}
