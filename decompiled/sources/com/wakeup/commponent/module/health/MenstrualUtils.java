package com.wakeup.commponent.module.health;

import com.wakeup.common.storage.model.MenstrualEntity;
import com.wakeup.common.utils.DateUtil;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class MenstrualUtils {
    private MenstrualUtils() {
    }

    public static long getTime(long j) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        calendar.set(11, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis() / 1000;
    }

    public static long calculation(long j, long j2, int i) {
        long j3 = j2 * 1000;
        if (isInCycle(j * 1000, j3, i)) {
            return j2;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j3);
        if (j2 > j) {
            calendar.add(5, -i);
        } else {
            calendar.add(5, i);
        }
        return calculation(j, calendar.getTimeInMillis() / 1000, i);
    }

    public static boolean isSameMonth(long j, long j2) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j2 * 1000);
        return calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2);
    }

    public static long addCycle(long j, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        calendar.set(11, 12);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.add(5, i);
        return calendar.getTimeInMillis() / 1000;
    }

    public static int diffDay(long j, long j2) {
        return Math.abs((int) ((j - j2) / 86400000));
    }

    public static MenstrualType calculationType(long j, MenstrualEntity menstrualEntity) {
        int cycle = menstrualEntity.getCycle();
        long calculation = calculation(j, getTime(menstrualEntity.getStartTime()), menstrualEntity.getCycle()) * 1000;
        long j2 = j * 1000;
        if (isInCycle(j2, calculation, cycle)) {
            return getType(j2, calculation, menstrualEntity);
        }
        long j3 = calculation / 1000;
        long addCycle = addCycle(j3, -cycle) * 1000;
        if (isInCycle(j2, addCycle, cycle)) {
            return getType(j2, addCycle, menstrualEntity);
        }
        long addCycle2 = addCycle(j3, cycle) * 1000;
        if (isInCycle(j2, addCycle2, cycle)) {
            return getType(j2, addCycle2, menstrualEntity);
        }
        int i = cycle * 2;
        long addCycle3 = addCycle(j3, -i) * 1000;
        if (isInCycle(j2, addCycle3, cycle)) {
            return getType(j2, addCycle3, menstrualEntity);
        }
        return getType(j2, addCycle(j3, i) * 1000, menstrualEntity);
    }

    private static boolean isInCycle(long j, long j2, int i) {
        return j >= DateUtil.getDayStartTime(j2 / 1000) * 1000 && j <= DateUtil.getDayEndTime(DateUtil.addDay(j2, i - 1) / 1000) * 1000;
    }

    private static MenstrualType getType(long j, long j2, MenstrualEntity menstrualEntity) {
        int diffDay;
        long addDay = DateUtil.addDay(j2, menstrualEntity.getSeveralDay() - 1);
        if (j >= j2 && j <= addDay) {
            return new MenstrualType(1, diffDay(j2, j) + 1, j / 1000);
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j2);
        calendar.add(5, menstrualEntity.getCycle());
        calendar.add(5, -19);
        long timeInMillis = calendar.getTimeInMillis();
        calendar.add(5, 9);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis < addDay) {
            timeInMillis = DateUtil.addDay(addDay, 1);
        }
        if (j >= timeInMillis && j <= timeInMillis2) {
            return new MenstrualType(2, diffDay(timeInMillis, j) + 1, j / 1000);
        }
        if (j > addDay && j < timeInMillis) {
            diffDay = diffDay(addDay, j);
        } else {
            diffDay = diffDay(timeInMillis2, j);
        }
        return new MenstrualType(3, diffDay, j / 1000);
    }

    public static List<MenstrualBean> createMonth(Long l, MenstrualEntity menstrualEntity) {
        long time = getTime(DateUtil.getFirstDayOfMonth(l.longValue()));
        int month = DateUtil.getMonth(time);
        ArrayList arrayList = new ArrayList();
        while (DateUtil.getMonth(time) == month) {
            arrayList.add(calculationType(time, menstrualEntity));
            time = DateUtil.addDay(time * 1000, 1) / 1000;
        }
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        while (it.hasNext()) {
            MenstrualType menstrualType = (MenstrualType) it.next();
            if (i != menstrualType.getType() || i2 >= menstrualType.getDiffDay()) {
                arrayList3 = new ArrayList();
                arrayList2.add(arrayList3);
            }
            arrayList3.add(menstrualType);
            i = menstrualType.getType();
            i2 = menstrualType.getDiffDay();
        }
        long addDay = DateUtil.addDay(menstrualEntity.getStartTime() * 1000, menstrualEntity.getSeveralDay() - 1) / 1000;
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ArrayList arrayList5 = (ArrayList) it2.next();
            long time2 = ((MenstrualType) arrayList5.get(0)).getTime();
            int size = arrayList5.size();
            int type = ((MenstrualType) arrayList5.get(0)).getType();
            if (type == 1 && time2 > addDay) {
                type = 4;
            }
            arrayList4.add(new MenstrualBean(type, time2, size));
        }
        return arrayList4;
    }
}
