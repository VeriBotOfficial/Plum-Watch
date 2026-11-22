package com.wakeup.common.utils;

import com.wakeup.common.storage.UserDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthUtils.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0007J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u001a\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0002¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/utils/HealthUtils;", "", "<init>", "()V", "getMoveDistance", "", "stepAll", "", "getStepDistance", "gender", "height", "getBreathe", "heart", "getKcal", "", "step", "isThisDay", "", "time", "", "isThisWeek", "isThisMonth", "isThisYear", "isThisTime", "pattern", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HealthUtils {
    public static final HealthUtils INSTANCE = new HealthUtils();

    public final int getBreathe(int heart) {
        float f = heart / 4.0f;
        int i = (int) f;
        return f - ((float) i) >= 0.5f ? i + 1 : i;
    }

    public final float getStepDistance(int gender, int height) {
        double d;
        double d2;
        if (height == 0) {
            return 0.7f;
        }
        if (gender == 0) {
            d = height;
            d2 = 0.413d;
        } else {
            if (gender != 1) {
                return 0.7f;
            }
            d = height;
            d2 = 0.415d;
        }
        return ((float) (d * d2)) / 100;
    }

    private HealthUtils() {
    }

    public final float getMoveDistance(int stepAll) {
        return (stepAll * getStepDistance(UserDao.getUser().getGender(), UserDao.getHeight())) / 1000;
    }

    public final double getKcal(int step) {
        return (((UserDao.getWeight() < 15.0f ? 0.0f : UserDao.getWeight() - 15.0f) * 6.938E-4d) + 0.005895d) * step;
    }

    public final boolean isThisDay(long time) {
        return isThisTime(time, "yyyy-MM-dd");
    }

    public final boolean isThisWeek(long time) {
        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(3);
        calendar.setTime(new Date(time * 1000));
        return calendar.get(3) == i;
    }

    public final boolean isThisMonth(long time) {
        return isThisTime(time, "yyyy-MM");
    }

    public final boolean isThisYear(long time) {
        return isThisTime(time, "yyyy");
    }

    private final boolean isThisTime(long time, String pattern) {
        Date date = new Date(time * 1000);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String format = simpleDateFormat.format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String format2 = simpleDateFormat.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return Intrinsics.areEqual(format, format2);
    }
}
