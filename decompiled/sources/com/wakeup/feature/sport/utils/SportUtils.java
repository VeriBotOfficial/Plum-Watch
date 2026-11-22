package com.wakeup.feature.sport.utils;

import android.content.Context;
import android.gov.nist.core.Separators;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.chart.SportLineChart;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* loaded from: classes3.dex */
public class SportUtils {
    public static int paceConversion(int i, boolean z) {
        float f = z ? 51.0f : 90.0f;
        float f2 = i;
        if (f2 >= f) {
            f = f2;
        }
        return (int) f;
    }

    public static int paceConversion(int i, boolean z, boolean z2) {
        float f = z2 ? 51.0f : 90.0f;
        float f2 = i;
        if (f2 >= f) {
            f = z ? f2 : f2 * 1.609344f;
        } else if (!z) {
            f *= 1.609344f;
        }
        return (int) f;
    }

    public static float paceToSpeed(int i) {
        return 3600.0f / i;
    }

    public static float speedConversion(float f, boolean z, boolean z2) {
        float f2 = f * 3.6f;
        float f3 = z2 ? 70.0f : 40.0f;
        return f2 > f3 ? z ? f3 : f3 / 1.609344f : z ? f2 : f2 / 1.609344f;
    }

    public static int speedToPace(float f) {
        return (int) (1000.0f / f);
    }

    private SportUtils() {
    }

    public static String formatDate(int i) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, i);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String formatDistance(Double d) {
        return NumberUtils.formatNumberToStr(d.doubleValue() / 1000.0d, 2);
    }

    public static String formatPace(int i) {
        int i2 = i / 60;
        int i3 = i % 60;
        String valueOf = String.valueOf(i3);
        if (i3 < 10) {
            valueOf = "0" + valueOf;
        }
        return i2 == 0 ? "0'" + valueOf + "\"" : i2 + Separators.QUOTE + valueOf + "\"";
    }

    public static List<SportLineChart.SportScaleLabel> getXLabel(int i) {
        ArrayList arrayList = new ArrayList();
        int i2 = (i / 60) + (i % 60 > 0 ? 1 : 0);
        if (i2 > 6) {
            int i3 = ((i2 / 30) + (i2 % 30 <= 0 ? 0 : 1)) * 5;
            for (int i4 = 0; i4 < 6; i4++) {
                arrayList.add(new SportLineChart.SportScaleLabel(r1 * 60, String.valueOf(i3 * i4)));
            }
            return arrayList;
        }
        arrayList.add(new SportLineChart.SportScaleLabel(0.0f, "0"));
        arrayList.add(new SportLineChart.SportScaleLabel(60, "1"));
        arrayList.add(new SportLineChart.SportScaleLabel(120, "2"));
        arrayList.add(new SportLineChart.SportScaleLabel(180, "3"));
        arrayList.add(new SportLineChart.SportScaleLabel(240, "4"));
        arrayList.add(new SportLineChart.SportScaleLabel(300, "5"));
        arrayList.add(new SportLineChart.SportScaleLabel(360, "6"));
        return arrayList;
    }

    public static String getDurationDesc(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        int i2 = i / 3600;
        if (i2 > 0) {
            sb.append(i2).append(context.getString(R.string.hour));
        }
        int i3 = i % 3600;
        int i4 = i3 / 60;
        if (i4 > 0) {
            sb.append(i4).append(context.getString(R.string.min));
        }
        int i5 = i3 % 60;
        if (i5 > 0) {
            sb.append(i5).append(context.getString(R.string.second));
        }
        return sb.toString();
    }

    public static String getPaceDesc(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i / 60).append(context.getString(R.string.min));
        sb.append(i % 60).append(context.getString(R.string.second));
        return sb.toString();
    }

    public static List<Integer> getKmList(int i) {
        int i2 = i / 1000;
        ArrayList arrayList = new ArrayList();
        if (i2 <= 10) {
            while (r1 <= i2) {
                arrayList.add(Integer.valueOf(r1));
                r1++;
            }
        } else if (i2 > 10 && i2 <= 20) {
            r1 = i2 % 2 == 0 ? 0 : 1;
            for (int i3 = 2; i3 <= i2; i3 += 2) {
                arrayList.add(Integer.valueOf(i3));
            }
            if (r1 != 0) {
                arrayList.add(Integer.valueOf(i2));
                return arrayList;
            }
        } else if (i2 > 20 && i2 <= 30) {
            r1 = i2 % 3 == 0 ? 0 : 1;
            for (int i4 = 3; i4 <= i2; i4 += 3) {
                arrayList.add(Integer.valueOf(i4));
            }
            if (r1 != 0) {
                arrayList.add(Integer.valueOf(i2));
                return arrayList;
            }
        } else {
            r1 = i2 % 5 == 0 ? 0 : 1;
            for (int i5 = 5; i5 <= i2; i5 += 5) {
                arrayList.add(Integer.valueOf(i5));
            }
            if (r1 != 0) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return arrayList;
    }

    public static float kmSpeedConversion(float f, boolean z) {
        return Math.min(f, z ? 70.0f : 40.0f);
    }
}
