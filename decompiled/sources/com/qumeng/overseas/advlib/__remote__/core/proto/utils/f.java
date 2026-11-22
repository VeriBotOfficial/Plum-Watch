package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.text.TextUtils;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/* loaded from: classes17.dex */
public class f {
    public static boolean a(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        a(calendar, 11, 12, 13, 14);
        calendar.add(5, -i);
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance();
        a(calendar2, 11, 12, 13, 14);
        calendar2.add(5, -1);
        long timeInMillis2 = calendar2.getTimeInMillis();
        calendar2.setTimeInMillis(j);
        a(calendar2, 11, 12, 13, 14);
        long timeInMillis3 = calendar2.getTimeInMillis();
        return timeInMillis3 >= timeInMillis && timeInMillis3 <= timeInMillis2;
    }

    public static boolean b(long j) {
        return a(j, 1);
    }

    public static boolean a(long j) {
        Calendar calendar = Calendar.getInstance();
        a(calendar, 11, 12, 13, 14);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.setTimeInMillis(j);
        a(calendar, 11, 12, 13, 14);
        return timeInMillis == calendar.getTimeInMillis();
    }

    public static int a(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date(j));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(new Date(j2));
        calendar2.set(11, 0);
        calendar2.set(12, 0);
        calendar2.set(13, 0);
        calendar2.set(14, 0);
        return (int) ((calendar2.getTime().getTime() - calendar.getTime().getTime()) / 86400000);
    }

    private static void a(Calendar calendar, int... iArr) {
        for (int i : iArr) {
            calendar.set(i, 0);
        }
    }

    public static String a(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        return (i2 < 10 ? new StringBuilder("0") : new StringBuilder("")).append(i2).toString() + ":" + (i3 < 10 ? new StringBuilder("0").append(i3) : new StringBuilder("").append(i3)).toString();
    }

    public static boolean a(String str, boolean z) {
        if (!z) {
            str = oqme.a.h + str;
        }
        String b = oqme.a.b(str, "");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        if (!TextUtils.isEmpty(b)) {
            try {
                if (simpleDateFormat.parse(format).compareTo(simpleDateFormat.parse(b)) <= 0) {
                    return false;
                }
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        oqme.a.c(str, format);
        return true;
    }

    public static boolean a(String str) {
        return a(str, false);
    }

    public static boolean a(String str, int i) {
        long c = oqme.a.c(oqme.a.i + str);
        if (c > 0) {
            try {
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(new Date(c));
                calendar.add(5, i);
                calendar.set(11, 0);
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                if (System.currentTimeMillis() < calendar.getTimeInMillis()) {
                    return false;
                }
            } catch (Exception unused) {
            }
        }
        oqme.a.b(oqme.a.i + str, System.currentTimeMillis());
        return true;
    }

    public static String a() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
