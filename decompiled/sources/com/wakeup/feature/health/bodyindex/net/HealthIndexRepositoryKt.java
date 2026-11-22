package com.wakeup.feature.health.bodyindex.net;

import com.anythink.core.common.e.a;
import com.anythink.expressad.f.a.b;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTimeConstants;

/* compiled from: HealthIndexRepository.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0006\u0010\u0007\u001a\u00020\u0006\u001a\u0006\u0010\b\u001a\u00020\u0006\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\f\u001a&\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006\u001a2\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006\u001a\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\"\u0017\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0017"}, d2 = {"HEALTH_INDEX_LIST_TYPES", "", "", "getHEALTH_INDEX_LIST_TYPES", "()Ljava/util/List;", "todayDayNo", "", "recoveryDayNo", "strainDayNo", "syncClock", "syncAtMs", "", "(Ljava/lang/Long;)Ljava/lang/String;", "sleepStartSec", "sleepHour", "sleepMinute", "wakeHour", "wakeMinute", "manualSleepDay", "Lkotlin/Pair;", "calendarDayNo", b.ar, "Ljava/util/Calendar;", "feature-health_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthIndexRepositoryKt {
    private static final List<String> HEALTH_INDEX_LIST_TYPES = CollectionsKt.listOf((Object[]) new String[]{"week", a.C0193a.j, "halfYear", "year"});

    public static final List<String> getHEALTH_INDEX_LIST_TYPES() {
        return HEALTH_INDEX_LIST_TYPES;
    }

    public static final int todayDayNo() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "getInstance(...)");
        return calendarDayNo(calendar);
    }

    public static final int recoveryDayNo() {
        Calendar calendar = Calendar.getInstance();
        calendar.add(6, -1);
        Intrinsics.checkNotNull(calendar);
        return calendarDayNo(calendar);
    }

    public static final int strainDayNo() {
        return todayDayNo();
    }

    public static final String syncClock(Long l) {
        if (l == null || l.longValue() <= 0) {
            return null;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(l.longValue());
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final long sleepStartSec(int i, int i2, int i3, int i4) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, i);
        calendar.set(12, i2);
        calendar.set(13, 0);
        calendar.set(14, 0);
        if ((i3 * 60) + i4 < (i * 60) + i2) {
            calendar.add(6, -1);
        }
        return calendar.getTimeInMillis() / 1000;
    }

    public static final Pair<Integer, Integer> manualSleepDay(int i, int i2, int i3, int i4) {
        int i5 = (i * 60) + i2;
        int i6 = (i3 * 60) + i4;
        if (i6 < i5) {
            i6 += DateTimeConstants.MINUTES_PER_DAY;
        }
        int i7 = i6 - i5;
        Calendar calendar = Calendar.getInstance();
        if (i3 <= 12) {
            calendar.add(6, -1);
        }
        Intrinsics.checkNotNull(calendar);
        return TuplesKt.to(Integer.valueOf(calendarDayNo(calendar)), Integer.valueOf(i7));
    }

    private static final int calendarDayNo(Calendar calendar) {
        return (calendar.get(1) * 10000) + ((calendar.get(2) + 1) * 100) + calendar.get(5);
    }
}
