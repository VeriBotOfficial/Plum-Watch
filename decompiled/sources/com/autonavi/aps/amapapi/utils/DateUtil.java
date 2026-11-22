package com.autonavi.aps.amapapi.utils;

import com.autonavi.aps.amapapi.config.Const;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes12.dex */
public class DateUtil {
    private static long a(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static long getCorrectedGpsTime(long j, long j2, int i) {
        if (i > 0) {
            try {
                if (Math.abs(j - j2) > i * Const.YEAR_IN_MILLIS) {
                    long a2 = a(j2) + (j - a(j));
                    long abs = Math.abs(a2 - j2);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(a2));
                    int i2 = calendar.get(11);
                    if (i2 == 23 && abs >= 82800000) {
                        a2 -= 86400000;
                    }
                    return (i2 != 0 || abs < 82800000) ? a2 : a2 + 86400000;
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }
}
