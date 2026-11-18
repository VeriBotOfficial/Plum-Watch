package com.bytedance.adsdk.ugeno.yoga;

/* JADX INFO: loaded from: classes15.dex */
public enum YogaLogLevel {
    ERROR(0),
    WARN(1),
    INFO(2),
    DEBUG(3),
    VERBOSE(4),
    FATAL(5);


    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private final int f9302sg;

    YogaLogLevel(int r3) {
        this.f9302sg = r3;
    }

    public static YogaLogLevel fromInt(int r2) {
        if (r2 == 0) {
            return ERROR;
        }
        if (r2 == 1) {
            return WARN;
        }
        if (r2 == 2) {
            return INFO;
        }
        if (r2 == 3) {
            return DEBUG;
        }
        if (r2 == 4) {
            return VERBOSE;
        }
        if (r2 == 5) {
            return FATAL;
        }
        throw new IllegalArgumentException("Unknown enum value: ".concat(String.valueOf(r2)));
    }
}
