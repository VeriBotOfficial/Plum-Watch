package com.necer.painter;

import android.content.Context;
import android.view.View;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public abstract class CalendarAdapter {
    public abstract View getCalendarItemView(Context context);

    public abstract void onBindCurrentMonthOrWeekView(View view, LocalDate localDate, List<LocalDate> list);

    public void onBindDisableDateView(View view, LocalDate localDate) {
    }

    public abstract void onBindLastOrNextMonthView(View view, LocalDate localDate, List<LocalDate> list);

    public abstract void onBindToadyView(View view, LocalDate localDate, List<LocalDate> list);
}
