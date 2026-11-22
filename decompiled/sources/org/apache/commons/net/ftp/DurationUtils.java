package org.apache.commons.net.ftp;

import java.time.Duration;

/* loaded from: classes8.dex */
final class DurationUtils {
    DurationUtils() {
    }

    static boolean isPositive(Duration duration) {
        return (duration == null || duration.isNegative() || duration.isZero()) ? false : true;
    }

    static int toMillisInt(Duration duration) {
        long millis = duration.toMillis();
        return (int) (millis > 0 ? Math.min(millis, 2147483647L) : Math.max(millis, -2147483648L));
    }

    static Duration zeroIfNull(Duration duration) {
        return duration == null ? Duration.ZERO : duration;
    }
}
