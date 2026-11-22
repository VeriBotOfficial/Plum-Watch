package com.wakeup.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes2.dex */
public class DateUtil {
    private static int weekIndexToWeek(int index) {
        switch (index) {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            default:
                return 1;
        }
    }

    public static long getDayStartTime() {
        return getDayStartTime(System.currentTimeMillis() / 1000);
    }

    public static long getDayStartTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getDayEndTime() {
        return getDayEndTime(System.currentTimeMillis() / 1000);
    }

    public static long getDayEndTime(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    public static Date String2Data(String dateString, String Type) {
        try {
            return new SimpleDateFormat(Type).parse(dateString);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String toString(long unix, String type) {
        return new SimpleDateFormat(type).format(new Date(unix));
    }

    public static String toString(Date date, String type) {
        return new SimpleDateFormat(type).format(date);
    }

    public static int getDaysOfMonth(int year, int month) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        return calendar.getActualMaximum(5);
    }

    public static long addDay(long currentTime, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.add(5, day);
        return calendar.getTimeInMillis();
    }

    public static long addHour(long currentTime, int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime * 1000);
        calendar.add(11, hour);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long addWeek(long currentTime, int week) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.add(4, week);
        return calendar.getTimeInMillis();
    }

    public static long addMonth(long currentTime, int monthCount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.add(2, monthCount);
        return calendar.getTimeInMillis();
    }

    public static long addYear(long currentTime, int year) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.add(1, year);
        return calendar.getTimeInMillis();
    }

    public static Calendar String2Calendar(String str, String Type) {
        Date date;
        try {
            date = new SimpleDateFormat(Type).parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
            date = new Date();
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar;
    }

    public static String timestampConvertDate(Long timestamp, String type) {
        return new SimpleDateFormat(type).format(new Date(timestamp.longValue() * 1000));
    }

    public static String getDateString(String string, String type) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            return new SimpleDateFormat(type).format(simpleDateFormat.parse(string));
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    public static boolean isSameDay(int time1, int time2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(time1 * 1000));
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(time2 * 1000));
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(5) == calendar2.get(5);
    }

    public static int getCurrentTimestamp() {
        return ((int) Calendar.getInstance().getTimeInMillis()) / 1000;
    }

    public static long timeSection(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(12);
        calendar.set(12, i - (i % 5));
        return calendar.getTimeInMillis() / 1000;
    }

    public static long timeHourSection(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long timeMinuteSection(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(12);
        calendar.set(12, i - (i % 10));
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static int getHour(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(11);
    }

    public static int getMinute(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(12);
    }

    public static long setHour(int hour) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(11, hour);
        return calendar.getTime().getTime() / 1000;
    }

    public static int getCurrentHour() {
        return Calendar.getInstance().get(11);
    }

    public static int getDay(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(5);
    }

    public static int getMonth(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(2);
    }

    public static int getYear(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(1);
    }

    public static int getWeek(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        return calendar.get(4);
    }

    public static long getFirstDayOfWeek(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        if (firstDayOfWeek != 1) {
            firstDayOfWeek = 1;
        }
        calendar.set(7, firstDayOfWeek);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfWeekMonday(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setFirstDayOfWeek(2);
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(7, calendar.getFirstDayOfWeek());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfWeekFromMonDay(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        if (firstDayOfWeek != 2) {
            firstDayOfWeek = 2;
        }
        calendar.set(7, firstDayOfWeek);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfWeekFromMonDay() {
        Calendar calendar = Calendar.getInstance();
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        if (firstDayOfWeek != 2) {
            firstDayOfWeek = 2;
        }
        calendar.set(7, firstDayOfWeek);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getEndDayOfWeek(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        if (firstDayOfWeek != 1) {
            firstDayOfWeek = 1;
        }
        calendar.set(7, firstDayOfWeek + 6);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getEndDayOfWeekFromMonDay(long timeStamp) {
        return getDayEndTime(addDay(getFirstDayOfWeekFromMonDay(timeStamp) * 1000, 6) / 1000);
    }

    public static long getEndDayOfWeekFromMonDay() {
        return getDayEndTime(addDay(getFirstDayOfWeekFromMonDay() * 1000, 6) / 1000);
    }

    public static long getFirstDayOfMonth(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(5, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getEndDayOfMonth(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(5, calendar.getActualMaximum(5));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfYear(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(6, 1);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getEndDayOfYear(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(2, calendar.getActualMaximum(2));
        calendar.set(5, 31);
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getTimeSectionBegin(long time, int diff) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(12);
        calendar.set(12, i - (i % diff));
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getTimeSectionEnd(long time, int diff) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(12);
        calendar.set(12, (i - (i % diff)) + diff);
        return calendar.getTimeInMillis() / 1000;
    }

    public static String getDayTime(int m) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, m);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        return (i < 10 ? "0" + i : String.valueOf(i)) + ":" + (i2 < 10 ? "0" + i2 : String.valueOf(i2));
    }

    public static String getDayHourTime(int h) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, h);
        calendar.set(12, 0);
        int i = calendar.get(11);
        int i2 = calendar.get(12);
        return (i < 10 ? "0" + i : String.valueOf(i)) + ":" + (i2 < 10 ? "0" + i2 : String.valueOf(i2));
    }

    public static long getTimeByWeekIndex(long time, int index) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        calendar.setFirstDayOfWeek(1);
        if (index == 7) {
            calendar.add(4, 1);
            calendar.set(7, weekIndexToWeek(index));
        } else {
            calendar.set(7, weekIndexToWeek(index));
        }
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getTimeByMonthIndex(long time, int index) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        calendar.set(5, index);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long parseStrTime(String time, String type) {
        try {
            return new SimpleDateFormat(type).parse(time).getTime();
        } catch (ParseException unused) {
            return 0L;
        }
    }

    public static int getTimeDifferenceDays(long startTime, long endTime) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startTime * 1000);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(endTime * 1000);
        return (int) ((calendar2.getTimeInMillis() - calendar.getTimeInMillis()) / 86400000);
    }

    public static String timeStamp2Date(long time, String format) {
        if (format == null || format.isEmpty()) {
            format = "yyyy-MM-dd HH:mm";
        }
        return new SimpleDateFormat(format).format(new Date(time));
    }

    public static long getDifferMonth(long fromDate, long toDate) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.setTimeInMillis(fromDate * 1000);
        calendar2.setTimeInMillis(toDate * 1000);
        if (calendar.get(1) == calendar2.get(1)) {
            return Math.abs(calendar.get(2) - calendar2.get(2));
        }
        return (Math.abs((r6 - r5) - 1) * 12) + (12 - (calendar.get(2) + 1)) + calendar2.get(2) + 1;
    }

    public static Long getTime(int year, int month, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1, year);
        calendar.set(2, month - 1);
        calendar.set(5, day);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        return Long.valueOf(calendar.getTimeInMillis() / 1000);
    }

    public static long getFirstDayOfWeekFromDay(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        if (firstDayOfWeek != 1) {
            firstDayOfWeek = 1;
        }
        calendar.set(7, firstDayOfWeek);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfMonthFromDay(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(5, 1);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long getFirstDayOfNextMonthFromDay(long timeStamp, int monthNumber) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.set(5, 1);
        calendar.add(2, monthNumber);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long setWeekNumberAndWeek(long timeStamp, int week, int weeNumber) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        calendar.add(4, weeNumber);
        calendar.set(7, week);
        return calendar.getTimeInMillis() / 1000;
    }

    public static int getWeekOfDayIndex(long timeStamp) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        return calendar.get(7);
    }

    public static long minutesToTimeStamp(int minutes) {
        if (minutes <= 0) {
            return getDayStartTime();
        }
        int i = (minutes / 60) * 3600000;
        return ((getDayStartTime() * 1000) + (((minutes % 60) * 60000) + i)) / 1000;
    }
}
