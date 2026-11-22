package com.necer.view;

import com.necer.enumeration.CalendarType;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public interface ICalendarView {
    CalendarType getCalendarType();

    List<LocalDate> getCurrPagerCheckDateList();

    List<LocalDate> getCurrPagerDateList();

    LocalDate getCurrPagerFirstDate();

    int getDistanceFromTop(LocalDate localDate);

    LocalDate getMiddleLocalDate();

    LocalDate getPagerInitialDate();

    LocalDate getPivotDate();

    int getPivotDistanceFromTop();

    void notifyCalendarView();

    void updateSlideDistance(int i);
}
