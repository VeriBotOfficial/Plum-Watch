package com.wakeup.module.ai.bean;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CacheDomain.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/ai/bean/ChannelType;", "", "code", "", "description", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "getDescription", GrsBaseInfo.CountryCodeSource.APP, "HEADSET", "GLASSES", "SOUND", "WATCH", "WATCH_4G", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChannelType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChannelType[] $VALUES;
    private final String code;
    private final String description;
    public static final ChannelType APP = new ChannelType(GrsBaseInfo.CountryCodeSource.APP, 0, "1", "App");
    public static final ChannelType HEADSET = new ChannelType("HEADSET", 1, "2", "耳机");
    public static final ChannelType GLASSES = new ChannelType("GLASSES", 2, "3", "眼镜");
    public static final ChannelType SOUND = new ChannelType("SOUND", 3, "4", "音响");
    public static final ChannelType WATCH = new ChannelType("WATCH", 4, "5", "中科手表");
    public static final ChannelType WATCH_4G = new ChannelType("WATCH_4G", 5, "6", "4G手表");

    private static final /* synthetic */ ChannelType[] $values() {
        return new ChannelType[]{APP, HEADSET, GLASSES, SOUND, WATCH, WATCH_4G};
    }

    public static EnumEntries<ChannelType> getEntries() {
        return $ENTRIES;
    }

    private ChannelType(String str, int i, String str2, String str3) {
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
        ChannelType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ChannelType valueOf(String str) {
        return (ChannelType) Enum.valueOf(ChannelType.class, str);
    }

    public static ChannelType[] values() {
        return (ChannelType[]) $VALUES.clone();
    }
}
