package com.facebook.yoga;

/* JADX INFO: loaded from: classes11.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);

    private final int mIntValue;

    YogaLogLevel(int r3) {
        this.mIntValue = r3;
    }

    public int intValue() {
        return this.mIntValue;
    }

    public static YogaLogLevel fromInt(int r3) {
        if (r3 == 0) {
            return ERROR;
        }
        if (r3 == 1) {
            return WARN;
        }
        if (r3 == 2) {
            return INFO;
        }
        if (r3 == 3) {
            return DEBUG;
        }
        if (r3 == 4) {
            return VERBOSE;
        }
        if (r3 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: " + r3);
    }
}
