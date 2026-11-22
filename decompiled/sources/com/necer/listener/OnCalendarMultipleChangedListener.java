package com.necer.listener;

import com.necer.calendar.BaseCalendar;
import com.necer.enumeration.DateChangeBehavior;
import java.util.List;
import org.joda.time.LocalDate;

/* loaded from: classes17.dex */
public interface OnCalendarMultipleChangedListener {
    void onCalendarChange(BaseCalendar baseCalendar, int i, int i2, List<LocalDate> list, List<LocalDate> list2, DateChangeBehavior dateChangeBehavior);
}
