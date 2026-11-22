package com.wakeup.feature.health.bloodGlucose;

import android.content.Context;
import com.wakeup.commonui.R;
import com.wakeup.feature.health.bean.BSTimeTypeBean;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class BSTimeTypeHelp {
    public static List<BSTimeTypeBean> getTimeTypeList(Context context, long j) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(11);
        if (i >= 1 && i <= 4) {
            arrayList.add(createTimeType(context, 2));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        if (i >= 5 && i <= 9) {
            arrayList.add(createTimeType(context, 2));
            arrayList.add(createTimeType(context, 3));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        if (i >= 10 && i <= 11) {
            arrayList.add(createTimeType(context, 3));
            arrayList.add(createTimeType(context, 4));
            arrayList.add(createTimeType(context, 5));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        if (i >= 12 && i <= 15) {
            arrayList.add(createTimeType(context, 4));
            arrayList.add(createTimeType(context, 5));
            arrayList.add(createTimeType(context, 6));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        if (i >= 16 && i <= 17) {
            arrayList.add(createTimeType(context, 5));
            arrayList.add(createTimeType(context, 6));
            arrayList.add(createTimeType(context, 7));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        if (i >= 18 && i <= 23) {
            arrayList.add(createTimeType(context, 6));
            arrayList.add(createTimeType(context, 7));
            arrayList.add(createTimeType(context, 8));
            arrayList.add(createTimeType(context, 1));
            return arrayList;
        }
        arrayList.add(createTimeType(context, 2));
        arrayList.add(createTimeType(context, 1));
        return arrayList;
    }

    private static BSTimeTypeBean createTimeType(Context context, int i) {
        return new BSTimeTypeBean(i, getTimeTypeStr(context, i), i == 1);
    }

    public static String getTimeTypeStr(Context context, int i) {
        switch (i) {
            case 1:
                return context.getString(R.string.tip_21_0427_22);
            case 2:
                return context.getString(R.string.tip_21_0427_23);
            case 3:
                return context.getString(R.string.tip_21_0427_24);
            case 4:
                return context.getString(R.string.tip_21_0427_25);
            case 5:
                return context.getString(R.string.tip_21_0427_26);
            case 6:
                return context.getString(R.string.tip_21_0427_27);
            case 7:
                return context.getString(R.string.tip_21_0427_28);
            case 8:
                return context.getString(R.string.tip_21_0427_29);
            default:
                return "";
        }
    }
}
