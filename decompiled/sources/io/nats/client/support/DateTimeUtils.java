package io.nats.client.support;

import java.time.Duration;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

/* loaded from: classes6.dex */
public abstract class DateTimeUtils {
    public static final ZonedDateTime DEFAULT_TIME;
    public static final DateTimeFormatter RFC3339_FORMATTER;
    public static final ZoneId ZONE_ID_GMT;

    private DateTimeUtils() {
    }

    static {
        ZoneId of = ZoneId.of("GMT");
        ZONE_ID_GMT = of;
        DEFAULT_TIME = ZonedDateTime.of(1, 1, 1, 0, 0, 0, 0, of);
        RFC3339_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.nnnnnnnnn'Z'");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.time.ZonedDateTime] */
    public static ZonedDateTime toGmt(ZonedDateTime zonedDateTime) {
        return zonedDateTime.withZoneSameInstant(ZONE_ID_GMT);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.time.ZonedDateTime] */
    public static ZonedDateTime gmtNow() {
        return ZonedDateTime.now().withZoneSameInstant(ZONE_ID_GMT);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.time.ZonedDateTime] */
    public static boolean equals(ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2) {
        if (zonedDateTime == zonedDateTime2) {
            return true;
        }
        if (zonedDateTime == null || zonedDateTime2 == null) {
            return false;
        }
        ZoneId zoneId = ZONE_ID_GMT;
        return zonedDateTime.withZoneSameInstant(zoneId).equals(zonedDateTime2.withZoneSameInstant(zoneId));
    }

    public static String toRfc3339(ZonedDateTime zonedDateTime) {
        return RFC3339_FORMATTER.format(toGmt(zonedDateTime));
    }

    public static ZonedDateTime parseDateTime(String str) {
        return parseDateTime(str, DEFAULT_TIME);
    }

    public static ZonedDateTime parseDateTime(String str, ZonedDateTime zonedDateTime) {
        try {
            return toGmt(ZonedDateTime.parse(str));
        } catch (DateTimeParseException unused) {
            return zonedDateTime;
        }
    }

    public static ZonedDateTime parseDateTimeThrowParseError(String str) {
        return toGmt(ZonedDateTime.parse(str));
    }

    public static ZonedDateTime fromNow(long j) {
        return ZonedDateTime.ofInstant(Instant.now().plusMillis(j), ZONE_ID_GMT);
    }

    public static ZonedDateTime fromNow(Duration duration) {
        return ZonedDateTime.ofInstant(Instant.now().plusMillis(duration.toMillis()), ZONE_ID_GMT);
    }
}
