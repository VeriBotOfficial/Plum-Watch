package com.wakeup.commonui.chart;

import com.github.mikephil.charting.data.Entry;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/* loaded from: classes2.dex */
public class ChartUtils {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("M/dd");
    public static final int TYPE_DAY = 0;
    public static final int TYPE_DAY_5_MINUTE = 5;
    public static final int TYPE_DAY_ACTIVE_TIME = 7;
    public static final int TYPE_DAY_HALF_HOUR = 4;
    public static final int TYPE_DAY_HEART = 8;
    public static final int TYPE_DAY_MINUTE = 6;
    public static final int TYPE_MONTH = 2;
    public static final int TYPE_WEEK = 1;
    public static final int TYPE_YEAR = 3;

    public static int reverseWithinRange(int i, int i2, int i3) {
        return (i2 + i3) - i;
    }

    private ChartUtils() {
    }

    public static int timeToIndexFrom30(long j) {
        return timeToIndex(j) / 30;
    }

    public static int timeTo5IndexFrom5(long j) {
        return timeToIndex(j) / 5;
    }

    public static int timeToIndex(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return (calendar.get(11) * 60) + calendar.get(12);
    }

    public static int timeToIndexHour(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(11);
    }

    public static int timeToIndexFromWeek(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(7);
        if (i == 1) {
            return 7;
        }
        return i - 1;
    }

    public static int timeToIndexFromMonth(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(5);
    }

    public static int timeToIndexFromYear(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(2) + 1;
    }

    public static String indexToTime(int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, i);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        return (i2 < 10 ? "0" + i2 : String.valueOf(i2)) + ":" + (i3 < 10 ? "0" + i3 : String.valueOf(i3));
    }

    public static int getDayCount(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.getActualMaximum(5);
    }

    public static int getDayFromMonth(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(5);
    }

    public static String getDayFromTime(long j) {
        return DATE_FORMAT.format(new Date(j * 1000));
    }

    public static int getYearFromTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        return calendar.get(1);
    }

    public static long getWeekFirst(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        calendar.set(7, 2);
        return calendar.getTimeInMillis() / 1000;
    }

    public static List<List<Entry>> heartListGrouping(List<Entry> list) {
        ArrayList arrayList = new ArrayList();
        if (list.size() == 1) {
            arrayList.add(list);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(list.get(0));
        arrayList.add(arrayList2);
        for (int i = 1; i < list.size(); i++) {
            Entry entry = list.get(i - 1);
            Entry entry2 = list.get(i);
            if (entry2.getX() - entry.getX() > 60.0f) {
                arrayList2 = new ArrayList();
                arrayList.add(arrayList2);
            }
            arrayList2.add(entry2);
        }
        return arrayList;
    }
}
