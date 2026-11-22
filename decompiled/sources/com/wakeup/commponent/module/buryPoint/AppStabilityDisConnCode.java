package com.wakeup.commponent.module.buryPoint;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppStabilityDisConnCode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/buryPoint/AppStabilityDisConnCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "USE_TIMEOUT", "INSUFFICIENT_ENERGY", "SERVER_ERROR", "ACCESS_EXCEPTION", "NORMAL_DISCONNECT", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppStabilityDisConnCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AppStabilityDisConnCode[] $VALUES;
    private final int code;
    public static final AppStabilityDisConnCode USE_TIMEOUT = new AppStabilityDisConnCode("USE_TIMEOUT", 0, 1);
    public static final AppStabilityDisConnCode INSUFFICIENT_ENERGY = new AppStabilityDisConnCode("INSUFFICIENT_ENERGY", 1, 2);
    public static final AppStabilityDisConnCode SERVER_ERROR = new AppStabilityDisConnCode("SERVER_ERROR", 2, 3);
    public static final AppStabilityDisConnCode ACCESS_EXCEPTION = new AppStabilityDisConnCode("ACCESS_EXCEPTION", 3, 4);
    public static final AppStabilityDisConnCode NORMAL_DISCONNECT = new AppStabilityDisConnCode("NORMAL_DISCONNECT", 4, 5);

    private static final /* synthetic */ AppStabilityDisConnCode[] $values() {
        return new AppStabilityDisConnCode[]{USE_TIMEOUT, INSUFFICIENT_ENERGY, SERVER_ERROR, ACCESS_EXCEPTION, NORMAL_DISCONNECT};
    }

    public static EnumEntries<AppStabilityDisConnCode> getEntries() {
        return $ENTRIES;
    }

    private AppStabilityDisConnCode(String str, int i, int i2) {
        this.code = i2;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        AppStabilityDisConnCode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static AppStabilityDisConnCode valueOf(String str) {
        return (AppStabilityDisConnCode) Enum.valueOf(AppStabilityDisConnCode.class, str);
    }

    public static AppStabilityDisConnCode[] values() {
        return (AppStabilityDisConnCode[]) $VALUES.clone();
    }
}
