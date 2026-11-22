package com.wakeup.feature.newsdaily.ui;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: NewsDailyFormat.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012J\u0018\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\f\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/wakeup/feature/newsdaily/ui/NewsDailyFormat;", "", "<init>", "()V", "shanghai", "Ljava/util/TimeZone;", "dayFmt", "Ljava/text/SimpleDateFormat;", "todayDate", "", "isToday", "", "date", "dateLabel", "briefTitle", "toastTitle", "durationMmSs", "durationMs", "", "shiftDate", "deltaDays", "", "parse", "Ljava/util/Calendar;", "feature-newsdaily_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NewsDailyFormat {
    public static final NewsDailyFormat INSTANCE = new NewsDailyFormat();
    private static final SimpleDateFormat dayFmt;
    private static final TimeZone shanghai;

    private NewsDailyFormat() {
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("Asia/Shanghai");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(...)");
        shanghai = timeZone;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(timeZone);
        dayFmt = simpleDateFormat;
    }

    public final String todayDate() {
        String format = dayFmt.format(new Date());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final boolean isToday(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return Intrinsics.areEqual(date, todayDate());
    }

    public final String dateLabel(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar parse = parse(date);
        if (parse == null) {
            return date;
        }
        return (parse.get(2) + 1) + "月" + parse.get(5) + "日";
    }

    public final String briefTitle(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar parse = parse(date);
        if (parse == null) {
            return date;
        }
        return (parse.get(2) + 1) + "月" + parse.get(5) + "日新闻简报";
    }

    public final String toastTitle(String date) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar parse = parse(date);
        if (parse == null) {
            return date;
        }
        return (parse.get(2) + 1) + "月" + parse.get(5) + "日新闻早餐";
    }

    public final String durationMmSs(long durationMs) {
        long coerceAtLeast = RangesKt.coerceAtLeast(durationMs / 1000, 0L);
        long j = 60;
        long j2 = coerceAtLeast / j;
        long j3 = coerceAtLeast % j;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public final String shiftDate(String date, int deltaDays) {
        Intrinsics.checkNotNullParameter(date, "date");
        Calendar parse = parse(date);
        if (parse == null) {
            return null;
        }
        parse.add(5, deltaDays);
        return dayFmt.format(parse.getTime());
    }

    private final Calendar parse(String date) {
        Object m14057constructorimpl;
        Date parse;
        try {
            Result.Companion companion = Result.INSTANCE;
            NewsDailyFormat newsDailyFormat = this;
            parse = dayFmt.parse(date);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (parse == null) {
            return null;
        }
        Calendar calendar = Calendar.getInstance(shanghai);
        calendar.setTime(parse);
        m14057constructorimpl = Result.m14057constructorimpl(calendar);
        return (Calendar) (Result.m14063isFailureimpl(m14057constructorimpl) ? null : m14057constructorimpl);
    }
}
