package com.necer.painter;

import android.graphics.Canvas;
import android.graphics.RectF;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public interface CalendarPainter {
    void onDrawCurrentMonthOrWeek(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> list);

    default void onDrawDisableDate(Canvas canvas, RectF rectF, LocalDate localDate) {
    }

    void onDrawLastOrNextMonth(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> list);

    void onDrawToday(Canvas canvas, RectF rectF, LocalDate localDate, List<LocalDate> list);
}
