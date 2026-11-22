package com.necer.calendar;

import com.necer.enumeration.CheckModel;
import com.necer.enumeration.MultipleCountModel;
import com.necer.listener.OnCalendarChangedListener;
import com.necer.listener.OnCalendarMultipleChangedListener;
import com.necer.listener.OnClickDisableDateListener;
import com.necer.painter.CalendarAdapter;
import com.necer.painter.CalendarBackground;
import com.necer.painter.CalendarPainter;
import com.necer.utils.Attrs;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public interface ICalendar {
    Attrs getAttrs();

    CalendarAdapter getCalendarAdapter();

    CalendarBackground getCalendarBackground() throws IllegalAccessException;

    CalendarPainter getCalendarPainter();

    CheckModel getCheckModel();

    List<LocalDate> getCurrPagerCheckDateList();

    List<LocalDate> getCurrPagerDateList();

    List<LocalDate> getTotalCheckedDateList();

    void jumpDate(int i, int i2, int i3);

    void jumpDate(String str);

    void jumpMonth(int i, int i2);

    void notifyCalendar();

    void setCalendarAdapter(CalendarAdapter calendarAdapter);

    void setCalendarBackground(CalendarBackground calendarBackground) throws IllegalAccessException;

    void setCalendarPainter(CalendarPainter calendarPainter);

    void setCheckMode(CheckModel checkModel);

    void setCheckedDates(List<String> list);

    void setDateInterval(String str, String str2);

    void setDateInterval(String str, String str2, String str3);

    void setDefaultCheckedFirstDate(boolean z);

    void setInitializeDate(String str);

    void setLastNextMonthClickEnable(boolean z);

    void setMultipleCount(int i, MultipleCountModel multipleCountModel);

    void setOnCalendarChangedListener(OnCalendarChangedListener onCalendarChangedListener);

    void setOnCalendarMultipleChangedListener(OnCalendarMultipleChangedListener onCalendarMultipleChangedListener);

    void setOnClickDisableDateListener(OnClickDisableDateListener onClickDisableDateListener);

    void setScrollEnable(boolean z);

    void toLastPager();

    void toNextPager();

    void toToday();

    void updateSlideDistance(int i);
}
