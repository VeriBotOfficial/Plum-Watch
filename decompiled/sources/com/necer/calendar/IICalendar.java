package com.necer.calendar;

import com.necer.enumeration.CalendarState;
import com.necer.listener.OnCalendarScrollingListener;
import com.necer.listener.OnCalendarStateChangedListener;
import com.necer.painter.CalendarBackground;

/* loaded from: classes17.dex */
public interface IICalendar extends ICalendar {
    CalendarState getCalendarState();

    void setCalendarState(CalendarState calendarState);

    void setMonthCalendarBackground(CalendarBackground calendarBackground);

    void setOnCalendarScrollingListener(OnCalendarScrollingListener onCalendarScrollingListener);

    void setOnCalendarStateChangedListener(OnCalendarStateChangedListener onCalendarStateChangedListener);

    void setStretchCalendarEnable(boolean z);

    void setWeekCalendarBackground(CalendarBackground calendarBackground);

    void setWeekHoldEnable(boolean z);

    void toMonth();

    void toStretch();

    void toWeek();
}
