package com.wakeup.commponent.module.sport.util;

import com.wakeup.commponent.module.sport.LocationEntity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class DouglasPeuckerUtil {
    public static List<LocationEntity> douglasPeucker(List<LocationEntity> list, double d) {
        int i;
        int size = list.size();
        double d2 = 0.0d;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            double distance = getDistance(list.get(i2), list.get(0), list.get(i));
            if (distance > d2) {
                i3 = i2;
                d2 = distance;
            }
            i2++;
        }
        ArrayList arrayList = new ArrayList();
        if (d2 > d) {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 <= i3) {
                    arrayList2.add(list.get(i4));
                    if (i4 == i3) {
                        arrayList3.add(list.get(i4));
                    }
                } else {
                    arrayList3.add(list.get(i4));
                }
            }
            List<LocationEntity> douglasPeucker = douglasPeucker(arrayList2, d);
            List<LocationEntity> douglasPeucker2 = douglasPeucker(arrayList3, d);
            douglasPeucker2.remove(0);
            douglasPeucker.addAll(douglasPeucker2);
            return douglasPeucker;
        }
        arrayList.add(list.get(0));
        arrayList.add(list.get(i));
        return arrayList;
    }

    private static double getDistance(LocationEntity locationEntity, LocationEntity locationEntity2, LocationEntity locationEntity3) {
        double distance = LocationUtil.getDistance(locationEntity2, locationEntity3);
        return (helen(LocationUtil.getDistance(locationEntity, locationEntity2), LocationUtil.getDistance(locationEntity, locationEntity3), distance) * 2.0d) / distance;
    }

    private static double helen(double d, double d2, double d3) {
        double d4 = ((d + d2) + d3) / 2.0d;
        return Math.sqrt((d4 - d) * d4 * (d4 - d2) * (d4 - d3));
    }
}
