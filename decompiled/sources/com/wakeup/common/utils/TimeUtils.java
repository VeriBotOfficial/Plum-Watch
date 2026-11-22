package com.wakeup.common.utils;

import android.gov.nist.core.Separators;
import com.anythink.core.common.e.a;
import com.google.android.material.timepicker.TimeModel;
import com.phancy.mini.core.resource.MiniPack;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: TimeUtils.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\nH\u0007J\u0016\u0010\u000e\u001a\u00020\n*\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\nH\u0007J!\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0012J*\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u0014j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n`\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0018\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\bJ\u000e\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\bJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0005J\u000e\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\b¨\u0006\""}, d2 = {"Lcom/wakeup/common/utils/TimeUtils;", "", "<init>", "()V", "addDay", "", "currentTime", a.C0193a.k, "", "toString", "", "date", "Ljava/util/Date;", "type", "toTimeString", "string2Data", "dateString", "Type", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Long;", "time2MaxUtil", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "timestamp", "formattedMusicDuration", "progress", "isCn", "", "formattedDuration", "addMonth", "monthCount", "formatTime", "time", "formatMinutesToTime", "minutes", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TimeUtils {
    public static final TimeUtils INSTANCE = new TimeUtils();

    private TimeUtils() {
    }

    public final long addDay(long currentTime, int day) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.set(5, calendar.get(5) + day);
        return calendar.getTimeInMillis();
    }

    public static /* synthetic */ String toString$default(TimeUtils timeUtils, Date date, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = MiniPack.BUILD_TIME_FORMAT;
        }
        return timeUtils.toString(date, str);
    }

    public final String toString(Date date, String type) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(type, "type");
        String format = new SimpleDateFormat(type).format(date);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ String toTimeString$default(TimeUtils timeUtils, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = MiniPack.BUILD_TIME_FORMAT;
        }
        return timeUtils.toTimeString(j, str);
    }

    public final String toTimeString(long j, String type) {
        Intrinsics.checkNotNullParameter(type, "type");
        String format = new SimpleDateFormat(type).format(new Date(j));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static /* synthetic */ Long string2Data$default(TimeUtils timeUtils, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = MiniPack.BUILD_TIME_FORMAT;
        }
        return timeUtils.string2Data(str, str2);
    }

    public final Long string2Data(String dateString, String Type) {
        Date date;
        Intrinsics.checkNotNullParameter(dateString, "dateString");
        Intrinsics.checkNotNullParameter(Type, "Type");
        try {
            date = new SimpleDateFormat(Type).parse(dateString);
        } catch (Exception unused) {
            date = null;
        }
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }

    public final HashMap<Integer, String> time2MaxUtil(long timestamp) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        if (timestamp < 1000) {
            hashMap.put(Integer.valueOf((int) timestamp), "MS");
            return hashMap;
        }
        if (timestamp < 60000) {
            hashMap.put(Integer.valueOf((int) (timestamp / 1000)), "S");
            return hashMap;
        }
        if (timestamp < 3600000) {
            hashMap.put(Integer.valueOf((int) ((timestamp / 1000) / 60)), "M");
            return hashMap;
        }
        long j = 60;
        hashMap.put(Integer.valueOf((int) (((timestamp / 1000) / j) / j)), "H");
        return hashMap;
    }

    public static /* synthetic */ String formattedMusicDuration$default(TimeUtils timeUtils, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return timeUtils.formattedMusicDuration(i, z);
    }

    public final String formattedMusicDuration(int progress, boolean isCn) {
        StringBuilder sb = new StringBuilder();
        int i = ((progress % 3600) / 60) + ((progress / 3600) * 60);
        int i2 = progress % 60;
        if (i >= 100) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.getDefault(), "%03d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb.append(format);
            sb.append(isCn ? "分" : ":");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(format2);
            if (isCn) {
                sb.append("秒");
            }
        } else {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            sb.append(format3);
            sb.append(isCn ? "分" : ":");
            StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
            String format4 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
            sb.append(format4);
            if (isCn) {
                sb.append("秒");
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public static /* synthetic */ String formattedDuration$default(TimeUtils timeUtils, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return timeUtils.formattedDuration(i, z);
    }

    public final String formattedDuration(int progress, boolean isCn) {
        String str;
        StringBuilder sb = new StringBuilder();
        int i = progress / 3600;
        int i2 = (progress % 3600) / 60;
        int i3 = progress % 60;
        String str2 = ":";
        if (i > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            sb.append(format);
            if (!isCn) {
                str = ":";
            } else {
                str = "时";
            }
            sb.append(str);
        } else {
            sb.append("00:");
        }
        if (i2 > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(format2);
            if (isCn) {
                str2 = "分";
            }
            sb.append(str2);
        } else {
            sb.append("00:");
        }
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        sb.append(format3);
        if (isCn) {
            sb.append("秒");
        }
        if (i3 == 0) {
            return "00:00:00";
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final long addMonth(long currentTime, int monthCount) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(currentTime);
        calendar.set(2, calendar.get(2) + monthCount);
        return calendar.getTimeInMillis();
    }

    public final String formatTime(int time) {
        int i = time / 60;
        int i2 = time % 60;
        String valueOf = String.valueOf(i2);
        if (i2 < 10) {
            valueOf = "0" + valueOf;
        }
        return i == 0 ? "0'" + valueOf + "\"" : i + Separators.QUOTE + valueOf + "\"";
    }

    public final String formattedDuration(long progress) {
        StringBuilder sb = new StringBuilder(8);
        long j = 3600;
        long j2 = progress / j;
        long j3 = 60;
        long j4 = (progress % j) / j3;
        long j5 = progress % j3;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        sb.append(":");
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        sb.append(format2);
        sb.append(":");
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.getDefault(), TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        sb.append(format3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    public final String formatMinutesToTime(int minutes) {
        String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(minutes / 60), Integer.valueOf(minutes % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
