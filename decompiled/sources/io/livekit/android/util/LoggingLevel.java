package io.livekit.android.util;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LoggingLevel.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lio/livekit/android/util/LoggingLevel;", "", "(Ljava/lang/String;I)V", "toAndroidLogPriority", "", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "WTF", "OFF", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggingLevel {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LoggingLevel[] $VALUES;
    public static final LoggingLevel VERBOSE = new LoggingLevel("VERBOSE", 0);
    public static final LoggingLevel DEBUG = new LoggingLevel("DEBUG", 1);
    public static final LoggingLevel INFO = new LoggingLevel("INFO", 2);
    public static final LoggingLevel WARN = new LoggingLevel("WARN", 3);
    public static final LoggingLevel ERROR = new LoggingLevel("ERROR", 4);
    public static final LoggingLevel WTF = new LoggingLevel("WTF", 5);
    public static final LoggingLevel OFF = new LoggingLevel("OFF", 6);

    /* compiled from: LoggingLevel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LoggingLevel.values().length];
            try {
                iArr[LoggingLevel.VERBOSE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LoggingLevel.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LoggingLevel.DEBUG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LoggingLevel.WARN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LoggingLevel.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LoggingLevel.WTF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LoggingLevel.OFF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ LoggingLevel[] $values() {
        return new LoggingLevel[]{VERBOSE, DEBUG, INFO, WARN, ERROR, WTF, OFF};
    }

    public static EnumEntries<LoggingLevel> getEntries() {
        return $ENTRIES;
    }

    public static LoggingLevel valueOf(String str) {
        return (LoggingLevel) Enum.valueOf(LoggingLevel.class, str);
    }

    public static LoggingLevel[] values() {
        return (LoggingLevel[]) $VALUES.clone();
    }

    private LoggingLevel(String str, int i) {
    }

    static {
        LoggingLevel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public final int toAndroidLogPriority() {
        switch (WhenMappings.$EnumSwitchMapping$0[ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 3;
            case 4:
                return 5;
            case 5:
            case 6:
                return 6;
            case 7:
                return 0;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
