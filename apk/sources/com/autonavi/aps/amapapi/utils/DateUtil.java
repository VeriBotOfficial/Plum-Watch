package com.autonavi.aps.amapapi.utils;

import com.autonavi.aps.amapapi.config.Const;
import java.util.Calendar;
import java.util.Date;

/* JADX INFO: loaded from: classes16.dex */
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

    public static long getCorrectedGpsTime(long j, long j2, int r10) {
        if (r10 > 0) {
            try {
                if (Math.abs(j - j2) > ((long) r10) * Const.YEAR_IN_MILLIS) {
                    long jA = a(j2) + (j - a(j));
                    long jAbs = Math.abs(jA - j2);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(new Date(jA));
                    int r6 = calendar.get(11);
                    if (r6 == 23 && jAbs >= 82800000) {
                        jA -= 86400000;
                    }
                    return (r6 != 0 || jAbs < 82800000) ? jA : jA + 86400000;
                }
            } catch (Throwable unused) {
            }
        }
        return j;
    }
}
